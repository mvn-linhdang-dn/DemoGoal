package com.example.demogoal.listener

import androidx.fragment.app.Fragment

interface OpenFragment {
    fun openNewFragment(fragment: Fragment, toBackStack: Boolean = true)
}

