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


//var allByDefault: Int? // error: explicit initializer required, default getter and setter implied
//var initialized = 1 // has type Int, default getter and setter
//    The full syntax of a read-only property declaration differs from a mutable one in two ways:
//    it starts with val instead of var and does not allow a setter:
//    val simple: Int? // has type Int, default getter, must be initialized in constructor
//    val inferredType = 1 // has type Int and a default getter
//    val isEmpty: Boolean
//    get() = this.size == 0
}
