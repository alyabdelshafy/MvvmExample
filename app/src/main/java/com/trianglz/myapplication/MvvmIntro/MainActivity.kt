package com.trianglz.myapplication.MvvmIntro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.trianglz.myapplication.R

class MainViewModel: ViewModel() {


    private val _movieList =  MutableLiveData<String>()
    val moveList : LiveData<String> = _movieList

    fun callApiNetwork(){
        // setting here _movieList
    }


}

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        mainViewModel.moveList.observe(this, Observer {

        })

    }
}
