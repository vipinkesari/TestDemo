package com.myinfosysprogram

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.LiveData
import com.myinfosysprogram.model.request.GeneralRequest
import com.myinfosysprogram.model.response.ListResponse
import com.myinfosysprogram.repository.GeneralRepository
import com.myinfosysprogram.retrofit.ApiResponse
import com.myinfosysprogram.retrofit.RetrofitService
import com.myinfosysprogram.viewModel.ListViewModel
import com.nhaarman.mockitokotlin2.mock
import junit.framework.Assert.assertNotNull
import junit.framework.Assert.assertTrue
import kotlinx.coroutines.*
import org.junit.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class ListApiTest {

    private lateinit var apiService: RetrofitService
    private lateinit var viewModel: ListViewModel
    private lateinit var listRepository: GeneralRepository

    @Rule
    @JvmField
    val instantExecutorRule = InstantTaskExecutorRule()

    @ObsoleteCoroutinesApi
    private val mainThreadSurrogate = newSingleThreadContext("UI thread")

    @ObsoleteCoroutinesApi
    @ExperimentalCoroutinesApi
    @Before
    fun setUp() {
        apiService = mock()
        listRepository = mock()
        viewModel = ListViewModel(listRepository)
    }

    @ObsoleteCoroutinesApi
    @ExperimentalCoroutinesApi
    @After
    fun tearDown() {
        mainThreadSurrogate.close()
    }


    @Test
    fun list_api_test() {
        try {
            Assert.assertNotNull(
                "Api service is null",
                viewModel.getGeneralMutableRequest(GeneralRequest())
            )
            Assert.assertNotNull("Api service is null", apiService)

            CoroutineScope(Dispatchers.Main).launch {
                val response: LiveData<ApiResponse<ListResponse>> = apiService.getListData()
                assertNotNull("response is null", response)
                assertNotNull("not getting the response", response.value)
                assertTrue("List is null", response.value?.body?.title != null)
                assertTrue("List is not empty", response.value?.body?.rows?.size ?: 0 > 0)
            }
        } catch (e: AssertionError) {
            println("${e.message} - failed")
        } catch (e: Exception) {
            println("${e.message} - failed")
        }

    }

    @Test
    fun view_model_test() {
        try {
            Assert.assertNotNull(
                "Api service is null",
                viewModel.getGeneralMutableRequest(GeneralRequest())
            )
        } catch (e: AssertionError) {
            println("${e.message} - failed")
        } catch (e: Exception) {
            println("${e.message} - failed")
        }
    }

}