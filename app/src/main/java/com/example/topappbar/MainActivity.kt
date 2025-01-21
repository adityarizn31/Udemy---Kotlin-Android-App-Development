package com.example.topappbar

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

//   1. Mendefinisikan terlebih dahulu
    lateinit var toolbar : MaterialToolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//    2. Memanggil dan menambahkan findViewById
        toolbar = findViewById(R.id.toolbar)

//    3. Menggunakan OverFlow ikon
        toolbar.overflowIcon = AppCompatResources.getDrawable(this, R.drawable.baseline_more_vert_24)

//    4. Tambahkan Set Navigation
        toolbar.setNavigationOnClickListener {
            Toast.makeText(applicationContext, "Navigation icon is Clicked", Toast.LENGTH_SHORT).show()
        }

//    5. Tambahkan Set Menu Item digunakan pada ikon yang berada disebelah kanan, ketika diklik mereka akan menampilkan pesan dibawah
        toolbar.setOnMenuItemClickListener { item ->
            when(item.itemId) {
                R.id.share -> Toast.makeText(applicationContext, "Share icon is Clicked", Toast.LENGTH_SHORT).show()
                R.id.edit -> Toast.makeText(applicationContext, "Edit icon is Clicked", Toast.LENGTH_SHORT).show()
                R.id.settings -> Toast.makeText(applicationContext, "Settings icon is Clicked", Toast.LENGTH_SHORT).show()
                else -> Toast.makeText(applicationContext, "Sign Out icon is Clicked", Toast.LENGTH_SHORT).show()
            }
            return@setOnMenuItemClickListener true
        }
    }
}