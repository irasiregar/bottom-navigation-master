package com.example.projectdesalauwba.ui

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.projectdesalauwba.R
import kotlinx.android.synthetic.main.item_pengumuman.view.*

class AdapterPengumuman(private  val list:MutableList<PengumumanModel>,private val context: Context):
        RecyclerView.Adapter<AdapterPengumuman.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.item_pengumuman,p0,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
      val item=list[p1]
        p0.judul.text=item.judul
        p0.tanggal.text=item.tanggal
        p0.btnread.setOnClickListener{

        }

    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val image:ImageView=itemView.image
        val judul:TextView=itemView.judul
        val tanggal:TextView=itemView.tanggal
        val btnread:Button=itemView.btnread

    }
}