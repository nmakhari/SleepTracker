package com.example.sleeptracker

import androidx.lifecycle.ViewModel
import timber.log.Timber

class SleepingFragmentViewModel: ViewModel() {

    init {
        Timber.d("SleepingFragmentViewModel created")
    }

    override fun onCleared() {
        super.onCleared()
        // TODO: clean up the viewModels resources here, before they're gone for good
        Timber.d("SleepingFragmentViewModel destroyed")
    }
}