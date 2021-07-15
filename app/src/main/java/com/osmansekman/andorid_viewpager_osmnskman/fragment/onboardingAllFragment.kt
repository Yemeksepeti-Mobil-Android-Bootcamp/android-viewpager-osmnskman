package com.osmansekman.andorid_viewpager_osmnskman.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.osmansekman.andorid_viewpager_osmnskman.R
import com.osmansekman.andorid_viewpager_osmnskman.databinding.FragmentOnboardingBinding
import com.osmansekman.andorid_viewpager_osmnskman.utils.ViewPagerAdapter
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class onboardingAllFragment: Fragment() {
    private lateinit var binding: FragmentOnboardingBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardingBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        initViewPager()
        return view
    }
    private fun initViewPager() {
        val adapter = ViewPagerAdapter(requireActivity())
        binding.viewPager.adapter = adapter
        binding.dotsIndicator.setViewPager2(binding.viewPager)

    }

}