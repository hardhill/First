package com.example.first

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_random.*
import java.util.*

class RandomActivity : AppCompatActivity() {
    companion object{
        const val TOTAL_RAND = "total_rand"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        showRandomNumber()
    }
    fun showRandomNumber(){
        val count = intent.getIntExtra(TOTAL_RAND,0)
        val rand = Random()
        var randomInt = 0
        if(count>0){
            randomInt = rand.nextInt(count+1)
        }
        textViewRandom.text = randomInt.toString()
        textInfo.text = getString(R.string.random_heading,count)

    }
}