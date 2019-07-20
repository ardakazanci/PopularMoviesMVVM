package com.ardakazanci.popularmoviesmvvm.common

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders


/**
 * DataBinding ' e ihtiyaç duymayan
 */

abstract class BaseVMFragment<VM : ViewModel> : Fragment() {

    lateinit var viewModel: VM


    abstract fun getViewModel(): Class<VM>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(getViewModel())
    }

}