package com.nikhil.grapqldemo.ui.rocket;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import com.nikhil.grapqldemo.R;
import com.nikhil.grapqldemo.databinding.FragmentRocketBinding;
import com.nikhil.grapqldemo.ui.base.BaseFragment;



public class RocketFragment extends BaseFragment {

    private FragmentRocketBinding binding;
    private RocketViewModel viewModel;

    public RocketFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = customizeDataBinding(inflater, container, R.layout.fragment_rocket);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        showToolbar();
        showBottomNavigation();
        hideBackButton();
        viewModel = new ViewModelProvider(this).get(RocketViewModel.class);
    }
}