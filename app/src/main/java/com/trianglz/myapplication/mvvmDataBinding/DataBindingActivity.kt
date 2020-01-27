package com.trianglz.myapplication.mvvmDataBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.trianglz.myapplication.R
import com.trianglz.myapplication.databinding.ActivityDataBindingBinding

class DataBindingActivity : AppCompatActivity() {

    lateinit var bindingActivity: ActivityDataBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingActivity = DataBindingUtil.setContentView(this,R.layout.activity_data_binding)
        val activityMovie = Movie("test",10)
        bindingActivity.movie = activityMovie

    }
}

// note package name should not start with capital
