package com.nikhil.grapqldemo.ui.mission

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.nikhil.grapqldemo.R
import com.nikhil.grapqldemo.databinding.FragmentMissionBinding
import com.nikhil.grapqldemo.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MissionFragment : BaseFragment() {

    private lateinit var binding: FragmentMissionBinding
    private val viewModel: MissionViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = customizeDataBinding(inflater, container, R.layout.fragment_mission)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        showToolbar()
        showBottomNavigation()
        hideBackButton()
    }
}