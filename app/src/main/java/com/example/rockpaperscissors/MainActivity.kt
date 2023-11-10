package com.example.rockpaperscissors

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val restartbtn = findViewById<Button>(R.id.restart_btn)
        val scissorsbtn = findViewById<ImageView>(R.id.scissors_btn)
        val paperbtn = findViewById<ImageView>(R.id.paper_btn)
        val rockbtn = findViewById<ImageView>(R.id.rock_btn)
        val usermoveimg = findViewById<ImageView>(R.id.user_move_img)
        val computermoveimg = findViewById<ImageView>(R.id.computer_move_img)
        val winnertv = findViewById<TextView>(R.id.winner_tv)
        val playerscore = findViewById<TextView>(R.id.player_score)
        val computerscore = findViewById<TextView>(R.id.computer_score)

        restartbtn.setOnClickListener {
            computerscore.text = "0"
            playerscore.text = "0"
            winnertv.text = ""

            usermoveimg.setImageDrawable(getDrawable(R.drawable.question_mark))
            computermoveimg.setImageDrawable(getDrawable(R.drawable.question_mark))
        }

        scissorsbtn.setOnClickListener {
            usermoveimg.setImageDrawable(getDrawable(R.drawable.scissors_icons))

            val computermove = (1..3).random()

            when (computermove) {
                1 -> {
                    computermoveimg.setImageDrawable(getDrawable(R.drawable.stone_icons))

                    winnertv.text = "Computer has won"

                    val pscore = computerscore.text.toString().toInt() + 1
                    computerscore.text = pscore.toString()
                }
                2 -> {
                    computermoveimg.setImageDrawable(getDrawable(R.drawable.paper_icons))
                    winnertv.text = "Player has won"

                    val pscore = playerscore.text.toString().toInt() + 1
                    playerscore.text = pscore.toString()
                }
                else -> {
                    computermoveimg.setImageDrawable(getDrawable(R.drawable.scissors_icons))
                    winnertv.text = "Draw"
                }
            }
        }

        paperbtn.setOnClickListener {

            usermoveimg.setImageDrawable(getDrawable(R.drawable.paper_icons))

            val computermove = (1..3).random()

            when (computermove) {
                1 -> {

                    computermoveimg.setImageDrawable(getDrawable(R.drawable.stone_icons))

                    winnertv.text = "Player has won"

                    val pscore: Int = playerscore.text.toString().toInt() + 1
                    playerscore.text = pscore.toString()
                }
                2 -> {

                    computermoveimg.setImageDrawable(getDrawable(R.drawable.paper_icons))

                    winnertv.text = "Draw"
                }
                else -> {

                    computermoveimg.setImageDrawable(getDrawable(R.drawable.scissors_icons))
                    winnertv.text = "Computer has won"

                    val cscore: Int = computerscore.text.toString().toInt() + 1
                    computerscore.text = cscore.toString()
                }
            }

        }

        rockbtn.setOnClickListener {

            usermoveimg.setImageDrawable(getDrawable(R.drawable.stone_icons))


            val computermove = (1..3).random()

            when (computermove) {
                1 -> {
                    computermoveimg.setImageDrawable(getDrawable(R.drawable.stone_icons))

                    winnertv.text = "Draw"

                }
                2 -> {

                    computermoveimg.setImageDrawable(getDrawable(R.drawable.paper_icons))

                    winnertv.text = "Computer has won"

                    val cscore: Int = computerscore.text.toString().toInt() + 1
                    computerscore.text = cscore.toString()


                }
                else -> {
                    computermoveimg.setImageDrawable(getDrawable(R.drawable.scissors_icons))

                    winnertv.text = "Player has won"

                    val pscore: Int = playerscore.text.toString().toInt() + 1
                    playerscore.text = pscore.toString()
                }
            }
        }
    }
}