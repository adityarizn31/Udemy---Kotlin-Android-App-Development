package com.example.checkbox

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var result : TextView
    lateinit var male : CheckBox
    lateinit var female : CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        result = findViewById(R.id.tvGender)
        male = findViewById(R.id.checkMale)
        female = findViewById(R.id.checkFemale)

        male.setOnClickListener {
            if(male.isChecked) {
                result.text = "Your Gender is Male"
            } else {
                result.text = "What is Your Gender ?"
            }
        }

        female.setOnClickListener {
            if (female.isChecked) {
                result.text = "Your Gender is Female"
            } else {
                result.text = "What is Your Gender ?"
            }
        }

    }
}