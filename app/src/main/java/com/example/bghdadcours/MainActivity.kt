package com.example.bghdadcours

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buEvent(view:View){
        val yearOfBirth:Int = enternmOfUser.text.toString().toInt()
        val thisYear = Calendar.getInstance().get(Calendar.YEAR)
        var age =  thisYear - yearOfBirth
        rusoltage.text = "Your age Age $age"
    }
}