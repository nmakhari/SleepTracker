package com.example.sleeptracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /* Plant the timber debug tree in the first & only activity to allow for improved logging
        throughout the app, using a debug tree always since this is a personal project */
        Timber.plant(Timber.DebugTree())
        setContentView(R.layout.activity_main)
    }
}