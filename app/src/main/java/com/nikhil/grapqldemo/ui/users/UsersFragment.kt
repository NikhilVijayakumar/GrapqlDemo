package com.nikhil.grapqldemo.ui.users

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.nikhil.grapqldemo.R
import com.nikhil.grapqldemo.databinding.FragmentUsersBinding
import com.nikhil.grapqldemo.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UsersFragment : BaseFragment() {

    private lateinit var binding: FragmentUsersBinding
    private val viewModel: UsersViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = customizeDataBinding(inflater, container, R.layout.fragment_users)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        showToolbar()
        showBottomNavigation()
        hideBackButton()
    }
}