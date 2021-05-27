package com.myinfosysprogram.ui.home

import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toolbar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.myinfosysprogram.R
import com.myinfosysprogram.base.BaseActivity
import com.myinfosysprogram.viewModel.HomeCommunicatorViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : BaseActivity() {
    private lateinit var communicatorViewModel: HomeCommunicatorViewModel
    private lateinit var titleObserver: Observer<String>
    private lateinit var menuObserver: Observer<Boolean>
    private var mainMenu: Menu? = null

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

        menuObserver = Observer {
            manageMenu(it)
        }
        communicatorViewModel.searchUIMutableLiveData.observe(this, menuObserver)
    }

    /* this fun is used to update the title of action bar*/
    private fun manageToolbar(title: String) {
        val actionBar = supportActionBar
        actionBar!!.title = title
        cacheDir
    }

    private fun manageMenu(status: Boolean = true) {
        mainMenu?.findItem(R.id.action_settings)?.isVisible = status

        if (status) {
            toolbar.navigationIcon = null
        } else {
            toolbar.setNavigationIcon(R.drawable.back)
        }

        toolbar.setNavigationOnClickListener {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        this.mainMenu = menu
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> {
                openLocationSearch()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    /* move to location search screen */
    private fun openLocationSearch() {
        (supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment).navController.navigate(
            R.id.action_photoFragment_to_searchFragment
        )
    }
}
