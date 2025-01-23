package com.example.toastmessage

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var btnToast : Button

    lateinit var btnSnackBar : Button
    lateinit var myLayout : ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnToast = findViewById(R.id.btnToast)

        btnSnackBar = findViewById(R.id.btnSnackBar)
        myLayout = findViewById(R.id.main)

        btnToast.setOnClickListener {
            Toast.makeText(applicationContext, "Button Toast is Clicked",Toast.LENGTH_LONG).show()
        }

        btnSnackBar.setOnClickListener {
            Snackbar.make(myLayout, "SnackBar is CLicked", Toast.LENGTH_LONG).show()
        }
    }
}