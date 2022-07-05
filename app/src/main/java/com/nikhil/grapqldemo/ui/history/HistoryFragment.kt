package com.nikhil.grapqldemo.ui.history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.nikhil.grapqldemo.R
import com.nikhil.grapqldemo.databinding.FragmentHistoryBinding
import com.nikhil.grapqldemo.ui.base.BaseFragment

class HistoryFragment : BaseFragment() {

    private lateinit var binding: FragmentHistoryBinding
    private var viewModel: HistoryViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = customizeDataBinding(
            inflater,
            container,
            R.layout.fragment_history
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        showToolbar()
        showBottomNavigation()
        hideBackButton()
        viewModel = ViewModelProvider(this)[HistoryViewModel::class.java]
    }
}