package com.example.sleeptracker

import androidx.lifecycle.ViewModel
import timber.log.Timber

class LandingFragmentViewModel: ViewModel() {

    init {
        Timber.d("LandingFragmentViewModel created")
    }

    override fun onCleared() {
        super.onCleared()
        // TODO: clean up the viewModels resources here, before they're gone for good
        Timber.d("LandingFragmentViewModel destroyed")
    }
}