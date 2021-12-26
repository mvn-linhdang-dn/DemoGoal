package com.example.demogoal.activity

import android.os.Bundle
import com.example.demogoal.R
import com.example.demogoal.base.BaseActivity
import com.example.demogoal.databinding.SecondActivityBinding
import com.example.demogoal.fragment.SecondFragment

class SecondActivity : BaseActivity<SecondActivityBinding>() {

    override val navHost: Int
        get() = R.id.login_nav_host

    override fun getViewBinding(): SecondActivityBinding {
        return SecondActivityBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        openNewFragment(SecondFragment())
    }
}
