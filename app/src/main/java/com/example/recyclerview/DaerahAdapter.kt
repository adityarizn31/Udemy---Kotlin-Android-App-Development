package com.example.recyclerview

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

// Langkah ke tujuh mengubah menjadi Primary Constructor
class DaerahAdapter(
//    Langkah ke lima memanggil tiga variabel yg telah dibuat
    var listDaerah: ArrayList<String>,
    var listDetail: ArrayList<String>,
    var listimageDaerah: ArrayList<Int>,
//    Langkah ke enam membuat variabel konteks untuk clickable
//    Langkah ke sembilan menambahkan adaptor RecyclerView
    var context: Context) : RecyclerView.Adapter<DaerahAdapter.DaerahViewHolder>() {

//    Langkah ke tujuh membuat inner class
    class DaerahViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

//        Langkah ke delapan menambahkan variabel baru
    var tvNama : TextView = itemView.findViewById(R.id.titleTextView)
    var tvDetailNama : TextView = itemView.findViewById(R.id.detailTextView)
    var imageNama : CircleImageView = itemView.findViewById(R.id.profile_image)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DaerahViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        return DaerahViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listDaerah.size
    }

    override fun onBindViewHolder(holder: DaerahViewHolder, position: Int) {
        holder.tvNama.text = listDaerah.get(position)
        holder.tvDetailNama.text = listDetail.get(position)
        holder.imageNama.setImageResource(listimageDaerah.get(position))
    }
}