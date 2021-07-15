package com.osmansekman.andorid_viewpager_osmnskman.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.osmansekman.andorid_viewpager_osmnskman.fragment.onboardingFirstFragment
import com.osmansekman.andorid_viewpager_osmnskman.fragment.onboardingSecondFragment
import com.osmansekman.andorid_viewpager_osmnskman.fragment.onboardingThirdFragment

private const val FRAGMENT_COUNT = 3
class ViewPagerAdapter (activity: FragmentActivity): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = FRAGMENT_COUNT

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> onboardingFirstFragment()
            1 -> onboardingSecondFragment()
            2 -> onboardingThirdFragment()
            else -> onboardingFirstFragment()
        }
    }
}