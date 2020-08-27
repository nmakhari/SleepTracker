package com.example.sleeptracker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sleeptracker.databinding.FragmentWelcomeBinding
import timber.log.Timber

class WelcomeFragment : Fragment() {

    private lateinit var FragmentWelcomebinding: FragmentWelcomeBinding

    companion object {
        // TODO: Create an instance here
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View? {
        // Fetch the binding for this view and return it's root element as the inflated view
        FragmentWelcomebinding = FragmentWelcomeBinding.inflate(inflater)
        setClickListener()
        return FragmentWelcomebinding.root
    }

    private fun setClickListener() {
        FragmentWelcomebinding.weclomeButton.setOnClickListener {
            Timber.d("Let's Sleep button clicked")
            this.findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToLandingFragment())
        }
    }
}