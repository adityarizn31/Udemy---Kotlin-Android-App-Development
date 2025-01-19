package com.example.radiobutton

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

//    Langkah pertama mendefinisikan variabel terlebih dahulu
    lateinit var linearLayout: LinearLayout
    lateinit var btnoke : Button
    lateinit var greenRB : RadioButton
    lateinit var yellowRB : RadioButton
    lateinit var redRB : RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        Langkah kedua memanggil variabel tersebut dan tambahkan id yang sudah dibuat di activitu_main.xml
        linearLayout = findViewById(R.id.main)
        btnoke = findViewById(R.id.okBtn)
        greenRB = findViewById(R.id.greenRB)
        yellowRB = findViewById(R.id.yellowRB)
        redRB = findViewById(R.id.redRB)

//        Langkah ketiga menggunakan metode setOnClickListener
        btnoke.setOnClickListener {
            if(greenRB.isChecked) {
                linearLayout.setBackgroundColor(Color.GREEN)
            } else if(yellowRB.isChecked) {
                linearLayout.setBackgroundColor(Color.YELLOW)
            } else if (redRB.isChecked) {
                linearLayout.setBackgroundColor(Color.RED)
            }
        }

    }
}