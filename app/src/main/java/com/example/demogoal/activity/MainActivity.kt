package com.example.demogoal.activity

import android.os.Bundle
import com.example.demogoal.R
import com.example.demogoal.base.BaseActivity
import com.example.demogoal.databinding.ActivityMainBinding
import com.example.demogoal.fragment.MainFragment

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val navHost: Int
        get() = R.id.login_nav_host

    override fun getViewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        openNewFragment(MainFragment())
    }
}
