package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

//    Langkah pertama membuat variabel untuk memanggil Recycler View
    lateinit var recyclerView : RecyclerView

//    Langkah ketiga membuat variabel untuk arraylist country & variabel detail & variabel gambar
    var listDaerah = ArrayList<String>()
    var listDetail = ArrayList<String>()
    var listimageDaerah = ArrayList<Int>()

//    Langkah ke sebelas menambahkan variabel untuk memanggil adapter RecyclerView
    lateinit var adapter : DaerahAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//      Langkah kedua memanggil variabel recycler view dan id nya & layout yang akan digunakannya
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

//       Langkah keempat membuat kelas baru bernama DaerahAdapter

//       Langkah dibawah ini adalah tambahan jika ingin menambahkan data pada array
//        listDaerah.add("Heleut")
//        listDetail.add("Indonesia")
//        imageDaerah.add(R.drawable.Salsa1)


//        Langkah terakhir
        adapter = DaerahAdapter(listDaerah, listDetail, listimageDaerah, this@MainActivity)
        recyclerView.adapter = adapter

    }
}