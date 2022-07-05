package com.nikhil.grapqldemo.ui.main;

import android.os.Bundle;
import android.view.View;

import com.nikhil.grapqldemo.ui.base.BaseActivity;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        customizeDataBinding();
        hideToolbar();
        hideBottomNavigation();
    }

    public void hideBottomNavigation() {
        if (binding != null) {
            binding.bottomNavigation.setVisibility(View.GONE);
        }
    }

    public void showBottomNavigation() {
        if (binding != null) {
            binding.bottomNavigation.setVisibility(View.VISIBLE);
        }
    }

}