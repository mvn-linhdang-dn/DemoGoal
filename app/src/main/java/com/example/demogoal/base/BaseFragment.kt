package com.example.demogoal.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding
import com.example.demogoal.listener.OpenFragment
import com.example.demogoal.viewModel.MainViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

abstract class BaseFragment<VB : ViewBinding> : Fragment() {

    private var viewBinding: VB? = null

    abstract val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> VB

    protected val binding: VB
        get() = viewBinding as VB

    protected val viewModel: MainViewModel by viewModel()

    protected var openFragmentListener: OpenFragment? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        openFragmentListener = context as? OpenFragment
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewBinding = bindingInflater.invoke(inflater, container, false)
        return viewBinding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewBinding = null
    }

    override fun onDetach() {
        super.onDetach()
        openFragmentListener = null
    }
}
