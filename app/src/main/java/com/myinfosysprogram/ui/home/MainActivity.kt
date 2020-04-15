package com.myinfosysprogram.ui.home

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.myinfosysprogram.R
import com.myinfosysprogram.base.BaseActivity
import com.myinfosysprogram.viewModel.HomeCommunicatorViewModel
import com.myinfosysprogram.viewModel.ListViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity() {

    lateinit var communicatorViewModel: HomeCommunicatorViewModel

    val listViewModel: ListViewModel by viewModel()
    lateinit var titleObserver: Observer<String>

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initUI() {
        communicatorViewModel = ViewModelProvider(this).get(HomeCommunicatorViewModel::class.java)

        setSupportActionBar(toolbar)
        manageToolbar(this.resources.getString(R.string.app_name))
        initObserver()
    }

    private fun initObserver() {
        titleObserver = Observer {
            if (it != null)
                manageToolbar(it)
        }

        communicatorViewModel.titleUpdateMutableLiveData.observe(this, titleObserver)
    }

    /* this fun is used to update the title of action bar*/
    private fun manageToolbar(title: String) {
        val actionBar = supportActionBar
        actionBar!!.title = title
        cacheDir
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> {
                refreshHomeScreen()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    /* update the fragment which observe of view model is in active state */
    private fun refreshHomeScreen() {
        communicatorViewModel.refreshHomeUI()
    }

}
