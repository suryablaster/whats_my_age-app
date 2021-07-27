package com.example.whatsmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            val userDOB:Int = Integer.parseInt(dob.text.toString())
            val cuYear = Calendar.getInstance().get(Calendar.YEAR)
            val age = cuYear - userDOB
            textView2.text = "your age is $age "



        }

        
    }






}