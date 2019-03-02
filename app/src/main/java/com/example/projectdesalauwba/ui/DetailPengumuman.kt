package com.example.projectdesalauwba.ui

import android.app.ProgressDialog
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.projectdesalauwba.R
import com.example.projectdesalauwba.config.Config
import kotlinx.android.synthetic.main.activity_detail_pengumuman.*
import kotlinx.android.synthetic.main.activity_pengumuman.*
import org.json.JSONObject

class DetailPengumuman : AppCompatActivity() {
    private var id:String?=null
    private var pd:ProgressDialog?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pengumuman)
        id=intent.getStringExtra(Config.id)

        getdetail().execute()
    }
    inner class getdetail :AsyncTask<String,Void,String>(){
        override fun doInBackground(vararg params: String?): String {
            val request=RequestHandler()
            return request.sendGetRequest(Config.url_detail_pengumuman+id)

        }

        override fun onPreExecute() {
            super.onPreExecute()
            pd= ProgressDialog.show(this@DetailPengumuman,"","Wait...",false,true)
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            pd?.dismiss()
            val objek= JSONObject(result)
            val array=objek.getJSONArray("data")
            for (i in 0 until array.length()){
                val data=array.getJSONObject(i)
                judul.text=data.getString("judul")
                isi.text=data.getString("isi")
                tanggal.text=data.getString("tanggal")
                Glide.with(this@DetailPengumuman)
                        .load(Config.url_gambar+data.getString("gambar")).into(gambarpengumuman)
            }
        }

    }
}
