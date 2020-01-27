package com.trianglz.myapplication.MvvmIntro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.trianglz.myapplication.R

class MainViewModel: ViewModel() {


    private val _movieList =  MutableLiveData<String>()
    private val moveList : LiveData<String> = _movieList
    private var items: LiveData<List<String>>? = null
    

}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
