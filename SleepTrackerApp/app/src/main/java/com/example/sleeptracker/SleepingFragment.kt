package com.example.sleeptracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.sleeptracker.databinding.FragmentSleepingBinding
import timber.log.Timber


class SleepingFragment : Fragment() {

    private lateinit var FragmentSleepingbinding: FragmentSleepingBinding
    private lateinit var viewModel: SleepingFragmentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        FragmentSleepingbinding = FragmentSleepingBinding.inflate(layoutInflater)
        val view = FragmentSleepingbinding.root
        setClickListeners()

        // Create and store the viewModel through viewModelProvider
        viewModel = ViewModelProvider(this).get(SleepingFragmentViewModel::class.java)
        return view
    }

    private fun setClickListeners() {
        // TODO: set this up
    }
}