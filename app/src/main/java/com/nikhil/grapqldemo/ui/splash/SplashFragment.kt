package com.nikhil.grapqldemo.ui.splash

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation.findNavController
import com.nikhil.grapqldemo.R
import com.nikhil.grapqldemo.databinding.FragmentSplashBinding
import com.nikhil.grapqldemo.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashFragment : BaseFragment() {

    private lateinit var binding: FragmentSplashBinding
    private val viewModel: SplashViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = customizeDataBinding(inflater, container, R.layout.fragment_splash)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        gotoHome(view)
    }

    private fun gotoHome(view: View) {
        Handler().postDelayed(
            { findNavController(view).navigate(R.id.action_splashFragment_to_homeFragment) },
            3000
        )
    }
}