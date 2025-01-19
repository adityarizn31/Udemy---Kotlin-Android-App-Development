package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

//    Langkah 1 Mendefinisikan komponen
    lateinit var name : EditText
    lateinit var ok : Button
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        Langkah 2 Memanggil variabel yang sebelumnya sudah di definisikan
        name = findViewById(R.id.editTextText)
        ok = findViewById(R.id.button12)
        result = findViewById(R.id.textView)

//        Langkah 3 Menambahkan method setOnlick pada button OK
        ok.setOnClickListener{
            var username  : String = name.text.toString()
            result.setText(username)
        }

    }
}