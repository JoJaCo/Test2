package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //whatWeChose, whatTheyChose, winLoseView
    //use a random number generator to generate a random vaule for the opponent
    //0 = paper 1 = rock 2 = scissors
    fun paperButtonPressed(view:View){
        val opponentChoice = Random.nextInt(2)
        when (opponentChoice){
            0 -> whatTheyChose.text = "They picked Paper"
            1 -> whatTheyChose.text = "They picked Rock"
            2 -> whatTheyChose.text = "They picked Scissors"
        }
        whatWeChose.text = "we picked paper"

        //win conditions here
        when(opponentChoice){
            0 -> winLoseView.text = "It's a draw"
            1 -> winLoseView.text = "We won"
            2 -> winLoseView.text = "We Lost :("
        }

    }
    fun rockButtonPressed(view:View){
        val opponentChoice = Random.nextInt(2)
        when (opponentChoice){
            0 -> whatTheyChose.text = "They picked Paper"
            1 -> whatTheyChose.text = "They picked Rock"
            2 -> whatTheyChose.text = "They picked Scissors"
        }
        whatWeChose.text = "we picked Rock"

        //win conditions here
        when(opponentChoice){
            0 -> winLoseView.text = "We Lost :("
            1 -> winLoseView.text = "It's a draw"
            2 -> winLoseView.text = "We Lost :("
        }

    }
    fun scissorsButtonPressed(view:View){
        val opponentChoice = Random.nextInt(2)
         when (opponentChoice){
            0 -> whatTheyChose.text = "They picked Paper"
            1 -> whatTheyChose.text = "They picked Rock"
            2 -> whatTheyChose.text = "They picked Scissors"
        }
        whatWeChose.text = "we picked Scissors"

        //win conditions here
        when(opponentChoice){
            0 -> winLoseView.text = "We won"
            1 -> winLoseView.text = "We Lost :("
            2 -> winLoseView.text = "It is a draw"
        }

    }

}
