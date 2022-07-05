package com.nikhil.grapqldemo.ui.users

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.nikhil.grapqldemo.R
import com.nikhil.grapqldemo.databinding.FragmentUsersBinding
import com.nikhil.grapqldemo.ui.base.BaseFragment

class UsersFragment : BaseFragment() {

    private var binding: FragmentUsersBinding? = null
    private var viewModel: UsersViewModel? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = customizeDataBinding(inflater, container, R.layout.fragment_users)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        showToolbar()
        showBottomNavigation()
        hideBackButton()
        viewModel = ViewModelProvider(this)[UsersViewModel::class.java]
    }
}