package com.osmansekman.andorid_viewpager_osmnskman.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.osmansekman.andorid_viewpager_osmnskman.databinding.FragmentOnboardingBinding
import com.osmansekman.andorid_viewpager_osmnskman.utils.ViewPagerAdapter

class onboardingAllFragment: Fragment() {
    private lateinit var binding: FragmentOnboardingBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnboardingBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        initViewPager()
        return view
    }

    private fun initViewPager() {
        val adapter = ViewPagerAdapter(requireActivity())
        binding.viewPager.adapter = adapter
        binding.dotsIndicator.setViewPager2(binding.viewPager)

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
               if (position == 2) {
                   binding.skipButton.setOnClickListener{
                       binding.viewPager.currentItem = 0
                   }
                   }
                else
               {
                   binding.skipButton.setOnClickListener{
                       binding.viewPager.currentItem = binding.viewPager.currentItem +1
                   }
               }
            }

        })
    }


}
