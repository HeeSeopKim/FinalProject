package com.nepplus.finalproject.view

import android.os.Bundle
import com.nepplus.finalproject.R
import com.nepplus.finalproject.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun setEvents() {
    }

    override fun setValues() {
    }
}