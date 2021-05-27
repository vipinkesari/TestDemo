package com.myinfosysprogram.ui.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions
import com.myinfosysprogram.R
import com.myinfosysprogram.base.BaseFragment
import com.myinfosysprogram.viewModel.HomeCommunicatorViewModel
import kotlinx.android.synthetic.main.fragment_home.*


/**
 * A simple [MapFragment] subclass as the default destination in the navigation.
 */
class MapFragment : BaseFragment(), OnMapReadyCallback {

    private lateinit var communicatorViewModel: HomeCommunicatorViewModel

    private fun getLayoutId(): Int {
        return R.layout.fragment_map
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

        communicatorViewModel.updateTitle(getString(R.string.map_page))
        communicatorViewModel.searchHomeUI(false)

        // Get the SupportMapFragment and request notification when the map is ready to be used.
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as? SupportMapFragment
        mapFragment?.getMapAsync(this)

    }

    override fun onMapReady(googleMap: GoogleMap?) {
        communicatorViewModel.mapLocation?.run {
            val latLong = LatLng(this.lat?.toDouble() ?: 0.0, this.lng?.toDouble() ?: 0.0)
            val marker = googleMap?.addMarker(
                MarkerOptions()
                    .position(latLong)
                    .title(communicatorViewModel.placeName)
            )

            googleMap?.animateCamera(CameraUpdateFactory.newLatLngZoom(marker?.position, 1F));
        }
    }
}
