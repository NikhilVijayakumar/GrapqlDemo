package com.nikhil.grapqldemo.ui.rocket

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.nikhil.grapqldemo.R
import com.nikhil.grapqldemo.databinding.FragmentRocketBinding
import com.nikhil.grapqldemo.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RocketFragment : BaseFragment() {

    private lateinit var binding: FragmentRocketBinding
    private val viewModel: RocketViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = customizeDataBinding(inflater, container, R.layout.fragment_rocket)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        showToolbar()
        showBottomNavigation()
        hideBackButton()
    }
}