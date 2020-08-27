package com.example.sleeptracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.sleeptracker.databinding.FragmentLandingBinding
import timber.log.Timber


class LandingFragment : Fragment() {

    private lateinit var FragmentLandingbinding: FragmentLandingBinding
    private lateinit var viewModel: LandingFragmentViewModel

    companion object {
        // TODO: Create new instance with factory method
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // TODO: if this method of fetching the layout works, delete the commented line below
        // val view = inflater.inflate(R.layout.fragment_landing, container, false)

        // Fetch the binding then use the root element of said binding to return the required view
        FragmentLandingbinding = FragmentLandingBinding.inflate(layoutInflater)
        val view = FragmentLandingbinding.root
        setButtonClickListeners()

        // Create and store the viewModel through viewModelProvider
        viewModel = ViewModelProvider(this).get(LandingFragmentViewModel::class.java)
        return view
    }

    private fun setButtonClickListeners() {
        FragmentLandingbinding.sleepButton.setOnClickListener {
            // TODO: add navigation action here
            Timber.d("Sleep button clicked")
        }


        FragmentLandingbinding.recordsButton.setOnClickListener {
            // TODO: add navigation action here
            Timber.d("Records button clicked")
        }
    }
}