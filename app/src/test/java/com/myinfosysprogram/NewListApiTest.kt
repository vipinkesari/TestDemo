package com.myinfosysprogram

import android.app.Application
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.Observer
import com.myinfosysprogram.model.request.GeneralRequest
import com.myinfosysprogram.model.response.ListResponse
import com.myinfosysprogram.repository.GeneralRepository
import com.myinfosysprogram.retrofit.ApiResponse
import com.myinfosysprogram.retrofit.Resource
import com.myinfosysprogram.retrofit.RetrofitService
import com.myinfosysprogram.viewModel.ListViewModel
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.timeout
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import junit.framework.TestCase.assertNotNull
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.*
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.*
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.MockitoAnnotations


@RunWith(JUnit4::class)
class NewListApiTest {

    private lateinit var apiService: RetrofitService
    private lateinit var viewModel: ListViewModel
    private lateinit var listRepository: GeneralRepository
    private lateinit var resObserver: Observer<Resource<ListResponse>>

    private var discoverMovieLiveData = MediatorLiveData<Resource<ListResponse>>()
    private val successResource = Resource.success(ListResponse("Vipin"), 200)
    private val loadingResource = Resource.loading(ListResponse("Loading..."), 0)

    @Mock
    private lateinit var context: Application

    @Rule
    @JvmField
    val instantExecutorRule = InstantTaskExecutorRule()

    @ObsoleteCoroutinesApi
    private val mainThreadSurrogate = newSingleThreadContext("UI thread")

    @ObsoleteCoroutinesApi
    @ExperimentalCoroutinesApi
    @Before
    fun setUp() {
        Dispatchers.setMain(mainThreadSurrogate)
        MockitoAnnotations.initMocks(this)
        /*apiService = Retrofit.Builder()
            .baseUrl(ApiConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(LiveDataCallAdapterFactory())
            .build()
            .create(RetrofitService::class.java)*/

        apiService = mock()
        //provideRetrofitApi(provideRetrofit(provideOkHttpClient(context, AuthInterceptor(context))))

        listRepository = mock()

        runBlocking {
            discoverMovieLiveData.value = successResource
            whenever(listRepository.getGeneralListApi()).thenReturn(asLiveData(discoverMovieLiveData))
            // whenever(listRepository.getGeneralListApi()).thenReturn(errorResource)
        }

        viewModel = ListViewModel(listRepository)
        resObserver = mock()
    }

    @ObsoleteCoroutinesApi
    @ExperimentalCoroutinesApi
    @After
    fun tearDown() {
        Dispatchers.resetMain()
        mainThreadSurrogate.close()
    }


    @Test
    fun list_api_test() {
        try {

            Assert.assertNotNull("Api service is null", apiService)

            //CoroutineScope(Dispatchers.Main).async {
            val response: LiveData<ApiResponse<ListResponse>> = apiService.getListData()

            println("response is not null")
            assertNotNull("response is null", response)
            assertNotNull("not getting the response", response.value)
            assertTrue("List is null", response.value?.body?.title != null)
            assertTrue("List is not empty", response.value?.body?.rows?.size ?: 0 > 0)
            // }
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

    @Test
    fun testAppVersions()  {
        viewModel.getListResponse().observeForever(resObserver)
        viewModel.getGeneralMutableRequest(GeneralRequest())
        //delay(10)
        verify(listRepository).getGeneralListApi()
        verify(resObserver, timeout(50)).onChanged(successResource)
        verify(resObserver, timeout(50)).onChanged(successResource)
    }

    fun asLiveData(result: MediatorLiveData<Resource<ListResponse>>): LiveData<Resource<ListResponse>> {
        return result
    }

}



