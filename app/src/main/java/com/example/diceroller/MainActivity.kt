package com.example.diceroller

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.diceroller.R.id.rollBtn
import kotlin.random.Random


private const val TAG = "Button clicked"

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(rollBtn)
        rollButton.setOnClickListener {
            // Toast.makeText(this, TAG, Toast.LENGTH_SHORT).show()
            //toast help you if you wanna check button is working
            rollDice()
        }
        diceImage = findViewById<ImageView>(R.id.dice_Image)
    }

    fun rollDice() {

        val randomInt = Random.nextInt(1, 17)
        val drawableRes = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableRes)

    }


}