package com.myinfosysprogram.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.myinfosysprogram.model.request.GeneralRequest
import com.myinfosysprogram.model.response.UserRows
import com.myinfosysprogram.repository.UserRepository
import com.myinfosysprogram.retrofit.Resource
import org.koin.dsl.module

val userViewModelModule = module {
    factory { UserViewModel(get()) }
}

class UserViewModel(private val userRepository: UserRepository) : ViewModel() {
    private var generalRequestMutableLiveData = MutableLiveData<GeneralRequest>()
    private var userListResponseLiveData: LiveData<Resource<List<UserRows>>>
    private var userListUpdateMutableLiveData = MutableLiveData<List<UserRows>>()

    init {
        userListResponseLiveData = Transformations.switchMap(generalRequestMutableLiveData) { input ->
            if (input == null) {
                return@switchMap null //AbsentLiveData.create()
            } else
                return@switchMap userRepository.getUserListApi()
        }
    }

    fun updateUserDatabase(list: ArrayList<UserRows>) {
        userRepository.saveUserData(list)
    }

    fun getUserRowsData() {
        val list = userRepository.getUserRowsListFromDb()
        userListUpdateMutableLiveData.value = list
    }

    fun getGeneralMutableRequest(request: GeneralRequest) {
        generalRequestMutableLiveData.value = (request)
    }

    fun getUserListResponse() = userListResponseLiveData

    fun updateUserListFromDBResponse() = userListUpdateMutableLiveData
}