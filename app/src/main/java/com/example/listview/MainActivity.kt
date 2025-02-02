package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

//      Langkah 1 membuat variabel
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//      Langkah 2 memanggil variabel
        listView = findViewById(R.id.listView)

//      Langkah 3 memanggil variabel dari xml
        var listNegara = resources.getStringArray(R.array.negara)

//      Langkah 4 membuat Adaptor
        var arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listNegara)
        listView.adapter = arrayAdapter

//      Langkah 5 agar item bisa di klik tambahkan metode setOnItemClick
        listView.setOnItemClickListener {
            parent, view, position, id ->
            val countryName : String = parent.getItemAtPosition(position).toString()
            Toast.makeText(applicationContext, "You Selected The " +  countryName, Toast.LENGTH_LONG).show()
        }
    }
}