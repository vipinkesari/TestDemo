package com.myinfosysprogram.ui.addressList

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.google.android.gms.common.api.Status
import com.google.android.libraries.places.api.Places
import com.google.android.libraries.places.api.model.Place
import com.google.android.libraries.places.widget.AutocompleteSupportFragment
import com.google.android.libraries.places.widget.listener.PlaceSelectionListener
import com.myinfosysprogram.R
import com.myinfosysprogram.base.BaseFragment
import com.myinfosysprogram.viewModel.HomeCommunicatorViewModel

/**
 * A simple [SearchFragment] subclass as the default destination in the navigation.
 */
class SearchFragment : BaseFragment() {

    private lateinit var communicatorViewModel: HomeCommunicatorViewModel

    private fun getLayoutId(): Int {
        return R.layout.fragment_search
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(getLayoutId(), container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    private fun initUI() {
        communicatorViewModel =
            ViewModelProvider(requireActivity()).get(HomeCommunicatorViewModel::class.java)

        communicatorViewModel.updateTitle(getString(R.string.search_page))
        communicatorViewModel.searchHomeUI(false)

        // Initialize the SDK
        Places.initialize(requireContext(), "AIzaSyCDyfBYZfumOMu_zICFmDUkmywY9r3EU-0")

        // Create a new PlacesClient instance
        val placesClient = Places.createClient(requireContext())

        // Initialize the AutocompleteSupportFragment.
        val autocompleteFragment =
            childFragmentManager.findFragmentById(R.id.autocomplete_fragment)
                    as AutocompleteSupportFragment

        // Specify the types of place data to return.
        autocompleteFragment.setPlaceFields(listOf(Place.Field.ID, Place.Field.NAME))

        // Set up a PlaceSelectionListener to handle the response.
        autocompleteFragment.setOnPlaceSelectedListener(object : PlaceSelectionListener {
            override fun onPlaceSelected(place: Place) {
                Toast.makeText(
                    requireContext(),
                    "Place: ${place.name}, ${place.id}",
                    Toast.LENGTH_LONG
                ).show()
            }

            override fun onError(status: Status) {
                Log.i("TAG", "An error occurred: $status")
            }
        })
    }
}
