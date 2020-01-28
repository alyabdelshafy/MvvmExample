package com.trianglz.myapplication.game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.android.guesstheword.screens.game.GameViewModel
import com.trianglz.myapplication.R
import com.trianglz.myapplication.databinding.ActivityGameBinding

class GameActivity : AppCompatActivity() {

    private lateinit var viewModel: GameViewModel

    private lateinit var binding: ActivityGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)


        // Inflate view and obtain an instance of the binding class
        binding = DataBindingUtil.setContentView(this,R.layout.activity_game)

        viewModel = ViewModelProviders.of(this).get(GameViewModel::class.java)

        // Set the viewmodel for databinding - this allows the bound layout access to all of the
        // data in the VieWModel
        binding.gameViewModel = viewModel

        // Specify the current activity as the lifecycle owner of the binding. This is used so that
        // the binding can observe LiveData updates
//        binding.lifecycleOwner = this


        // Sets up event listening to navigate the player when the game is finished
        viewModel.eventGameFinish.observe(this, Observer { isFinished ->
            if (isFinished) {
                Log.v("Debug","TEST_WE_SHOULD_NAVIGATE")
                viewModel.onGameFinishComplete()
            }
        })

    }
}
