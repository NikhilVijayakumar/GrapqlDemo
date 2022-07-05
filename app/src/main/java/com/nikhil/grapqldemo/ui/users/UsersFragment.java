package com.nikhil.grapqldemo.ui.users;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import com.nikhil.grapqldemo.R;
import com.nikhil.grapqldemo.databinding.FragmentUsersBinding;
import com.nikhil.grapqldemo.ui.base.BaseFragment;


public class UsersFragment extends BaseFragment {

    private FragmentUsersBinding binding;
    private UsersViewModel viewModel;

    public UsersFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = customizeDataBinding(inflater, container, R.layout.fragment_users);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        showToolbar();
        showBottomNavigation();
        hideBackButton();
        viewModel = new ViewModelProvider(this).get(UsersViewModel.class);
    }
}