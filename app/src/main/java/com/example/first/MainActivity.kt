package com.example.first

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.first.RandomActivity.Companion.TOTAL_RAND
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView?.text = "0"

    }
    private fun ShowToast(view:View){
        val myToast = Toast.makeText(this,"Hello Toast",Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun ClickButton(view: View) {
        ShowToast(view)
    }
    fun Counter(view:View){
        var count:Int = Integer.parseInt(textView.text.toString())
        count++
        textView.text = count.toString()
    }
    fun ShowRandom(view:View){
        var intentRandom = Intent(this,RandomActivity::class.java)
        val count:Int = Integer.parseInt(textView.text.toString())
        intentRandom.putExtra(TOTAL_RAND,count)
        startActivity(intentRandom)
    }
}