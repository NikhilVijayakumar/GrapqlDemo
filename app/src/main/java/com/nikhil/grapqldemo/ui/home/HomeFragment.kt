package com.nikhil.grapqldemo.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.nikhil.grapqldemo.R
import com.nikhil.grapqldemo.databinding.FragmentHomeBinding
import com.nikhil.grapqldemo.ui.base.BaseFragment

class HomeFragment : BaseFragment() {

    private var binding: FragmentHomeBinding? = null
    private var viewModel: HomeViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = customizeDataBinding(inflater, container, R.layout.fragment_home)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        showToolbar()
        showBottomNavigation()
        hideBackButton()
        viewModel = ViewModelProvider(this)[HomeViewModel::class.java]
    }
}