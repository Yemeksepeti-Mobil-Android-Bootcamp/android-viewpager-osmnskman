package com.osmansekman.andorid_viewpager_osmnskman.fragment

import android.animation.Animator
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.osmansekman.andorid_viewpager_osmnskman.R
import com.osmansekman.andorid_viewpager_osmnskman.databinding.SplashLottieBinding

class splashFragment : Fragment() {
    private lateinit var binding: SplashLottieBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SplashLottieBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        initViews()
        return view
    }
    private fun initViews (){
        binding.animationView.addAnimatorListener(object: Animator.AnimatorListener{
            override fun onAnimationStart(animation: Animator?) {
                Log.v("Animation","Started")
            }

            override fun onAnimationEnd(animation: Animator?) {
                findNavController().navigate(R.id.action_splashFragment_to_onboardingAllFragment3)
            }

            override fun onAnimationCancel(animation: Animator?) {
                Log.v("Animation","Canceled")
            }

            override fun onAnimationRepeat(animation: Animator?) {
                Log.v("Animation","Repeated")
            }
        })
    }
}