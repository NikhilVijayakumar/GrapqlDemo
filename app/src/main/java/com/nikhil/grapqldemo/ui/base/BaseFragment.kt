package com.nikhil.grapqldemo.ui.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.nikhil.grapqldemo.ui.main.MainActivity

open class BaseFragment : Fragment() {

    private val baseActivity: BaseActivity?
        get() = activity as BaseActivity?
    private val isEnableBaseActivity: Boolean
        get() = baseActivity != null

    protected fun hideToolbar() {
        if (isEnableBaseActivity) {
            baseActivity!!.hideToolbar()
        }
    }

    protected fun showToolbar() {
        if (isEnableBaseActivity) {
            baseActivity?.showToolbar()
        }
    }

    protected fun hideBottomNavigation() {
        if (isEnableBaseActivity) {
            (baseActivity as MainActivity?)?.hideBottomNavigation()
        }
    }

    protected fun showBottomNavigation() {
        if (isEnableBaseActivity) {
            (baseActivity as MainActivity?)?.showBottomNavigation()
        }
    }

    protected fun hideBackButton() {
        if (isEnableBaseActivity) {
            baseActivity?.hideBackButton()
        }
    }

    protected fun showBackButton() {
        if (isEnableBaseActivity) {
            baseActivity?.showBackButton()
        }
    }

    protected fun <T : ViewDataBinding> customizeDataBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
        layoutId: Int
    ): T {
        val binding = DataBindingUtil.inflate<T>(inflater, layoutId, container, false)
        binding.lifecycleOwner = viewLifecycleOwner
        return binding
    }
}