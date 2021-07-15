package com.osmansekman.andorid_viewpager_osmnskman.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.osmansekman.andorid_viewpager_osmnskman.databinding.FragmentOnboarding2Binding

class onboardingSecondFragment : Fragment() {
    private lateinit var binding: FragmentOnboarding2Binding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboarding2Binding.inflate(layoutInflater,container,false)
        val view = binding.root
        return view}
}