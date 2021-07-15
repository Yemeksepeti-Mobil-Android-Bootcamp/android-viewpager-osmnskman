package com.osmansekman.andorid_viewpager_osmnskman.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.osmansekman.andorid_viewpager_osmnskman.databinding.FragmentOnboarding1Binding


class onboardingFirstFragment: Fragment() {
    private lateinit var binding: FragmentOnboarding1Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboarding1Binding.inflate(layoutInflater,container,false)
        val view = binding.root
        return view
    }

}