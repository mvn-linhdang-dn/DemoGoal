package com.example.demogoal.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.demogoal.base.BaseFragment
import com.example.demogoal.databinding.SecondFragmentBinding

class SecondFragment : BaseFragment<SecondFragmentBinding>() {

    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> SecondFragmentBinding
        get() = SecondFragmentBinding::inflate

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            tvSecondFragment.text = viewModel.secondFragment
            btnSecond.text = viewModel.secondButton
            btnSecond.setOnClickListener {
                viewModel.newToastMessage("Second fragment has been shown")
                viewModel.toastMessage.observe(viewLifecycleOwner, {
                    Toast.makeText(requireContext(), it, Toast.LENGTH_SHORT).show()
                })
                openFragmentListener?.openNewFragment(MainFragment())
            }
        }

    }
}
