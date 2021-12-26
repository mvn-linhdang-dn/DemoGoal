package com.example.demogoal.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.demogoal.base.BaseFragment
import com.example.demogoal.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentMainBinding
        get() = FragmentMainBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            tvMainFragment.text = viewModel.firstFragment
            btnMain.text = viewModel.firstButton
            btnMain.setOnClickListener {
                viewModel.newToastMessage("First fragment has been shown")
                viewModel.toastMessage.observe(viewLifecycleOwner, {
                    Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
                })
                changeFragment()
            }
        }
    }

    private fun changeFragment() {
        openFragmentListener?.openNewFragment(SecondFragment())
    }
}
