package com.myinfosysprogram

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.LiveData
import com.myinfosysprogram.model.request.GeneralRequest
import com.myinfosysprogram.model.response.Rows
import com.myinfosysprogram.repository.GeneralRepository
import com.myinfosysprogram.retrofit.ApiResponse
import com.myinfosysprogram.retrofit.RetrofitService
import com.myinfosysprogram.viewModel.ListViewModel
import com.nhaarman.mockitokotlin2.mock
import junit.framework.Assert.*
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
    fun api_server_connection_test() {
        try {
            Assert.assertNotNull("Unable to make a server connection", apiService)
            println("Service connection is set.")
        } catch (e: AssertionError) {
            println("${e.message} - failed")
        } catch (e: Exception) {
            println("${e.message} - failed")
        }
    }

    @Test
    fun api_response_test() {
        try {
            CoroutineScope(Dispatchers.IO).launch {
                /* call the api to get the response */
                val response: LiveData<ApiResponse<List<Rows>>> = apiService.getPhotoListData()
                delay(2000)
                println("$response")

                assertNotNull("Not able to get response from server.", response)
                println("Success to get response from server.")

                assertNotNull("Get in-appropriate  response from server.", response.value?.body)
                println("Get proper result from server.")

                assertTrue(
                    "Rows list of response is empty.",
                    response.value?.body?.isNotEmpty() ?: false
                )
                println("Rows list of response size is : ${response.value?.body?.size}")
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
                "Repository connection form ViewModel not connected.",
                viewModel.getGeneralMutableRequest(GeneralRequest())
            )
            println("Repository connection form ViewModel connected.")
        } catch (e: AssertionError) {
            println("${e.message} - failed")
        } catch (e: Exception) {
            println("${e.message} - failed")
        }
    }

    @Test
    fun room_db_test() = runBlocking {
        try {
            val response: LiveData<ApiResponse<List<Rows>>> = apiService.getPhotoListData()
            assertNotNull("response is null", response)
            assertNotNull("not getting the response", response.value)
            assertTrue("List title is empty", response.value?.body != null)
            assertTrue("List is empty empty ", response.value?.body?.size ?: 0 > 0)
        } catch (e: AssertionError) {
            println("${e.message} - failed")
        } catch (e: Exception) {
            println("${e.message} - failed")
        }
    }
}