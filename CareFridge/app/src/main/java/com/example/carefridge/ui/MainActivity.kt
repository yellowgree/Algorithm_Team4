package com.example.carefridge.ui

import android.os.Bundle
import com.example.carefridge.R
import com.example.carefridge.databinding.ActivityMainBinding
import com.quintable.jpower.config.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}