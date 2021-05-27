package com.myinfosysprogram.ui.home

import android.content.Intent
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.annotation.Nullable
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.gms.common.api.Status
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.Autocomplete
import com.google.android.libraries.places.widget.AutocompleteActivity
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode
import com.myinfosysprogram.R
import com.myinfosysprogram.base.BaseActivity
import com.myinfosysprogram.viewModel.HomeCommunicatorViewModel
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : BaseActivity() {
    private lateinit var communicatorViewModel: HomeCommunicatorViewModel
    private lateinit var titleObserver: Observer<String>
    private lateinit var menuObserver: Observer<Boolean>
    private var mainMenu: Menu? = null
    private val AUTOCOMPLETE_REQUEST_CODE = 9001

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
        /*(supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment).navController.navigate(
            R.id.action_photoFragment_to_searchFragment
        )*/

        val fields: List<Place.Field> = Arrays.asList(
            Place.Field.ID,
            Place.Field.NAME,
            Place.Field.ADDRESS,
            Place.Field.LAT_LNG
        )

        val intent = Autocomplete.IntentBuilder(
            AutocompleteActivityMode.FULLSCREEN, fields
        ).setCountry("NG") //NIGERIA
            .build(this)
        this.startActivityForResult(intent, AUTOCOMPLETE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, @Nullable data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == AUTOCOMPLETE_REQUEST_CODE) {
            if (resultCode == RESULT_OK) {
                val place = Autocomplete.getPlaceFromIntent(data!!)
                Log.i("TAG", "Place: " + place.name + ", " + place.id + ", " + place.address)
                Toast.makeText(
                    this,
                    "ID: " + place.id + "address:" + place.address + "Name:" + place.name + " latlong: " + place.latLng,
                    Toast.LENGTH_LONG
                ).show()
                val address = place.address
                // do query with address
            } else if (resultCode == AutocompleteActivity.RESULT_ERROR) {
                // TODO: Handle the error.
                val status: Status = Autocomplete.getStatusFromIntent(data!!)
                Toast.makeText(
                    this,
                    "Error: " + status.getStatusMessage(),
                    Toast.LENGTH_LONG
                ).show()
                Log.i("TAG", status.getStatusMessage())
            }
        }
    }
}
