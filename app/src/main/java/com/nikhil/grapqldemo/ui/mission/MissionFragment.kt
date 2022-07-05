package com.nikhil.grapqldemo.ui.mission

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.nikhil.grapqldemo.R
import com.nikhil.grapqldemo.databinding.FragmentMissionBinding
import com.nikhil.grapqldemo.ui.base.BaseFragment

class MissionFragment : BaseFragment() {

    private var binding: FragmentMissionBinding? = null
    private var viewModel: MissionViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = customizeDataBinding(inflater, container, R.layout.fragment_mission)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        showToolbar()
        showBottomNavigation()
        hideBackButton()
        viewModel = ViewModelProvider(this)[MissionViewModel::class.java]
    }
}