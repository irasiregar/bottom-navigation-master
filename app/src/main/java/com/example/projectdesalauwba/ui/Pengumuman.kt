package com.example.projectdesalauwba.ui

import android.app.ProgressDialog
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.projectdesalauwba.R
import com.example.projectdesalauwba.config.Config
import kotlinx.android.synthetic.main.activity_pengumuman.*
import org.json.JSONObject

class Pengumuman : AppCompatActivity() {

    private var list:MutableList<PengumumanModel>?=null
    private var pd:ProgressDialog?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pengumuman)
        list= mutableListOf()
        get_data_pengumuman().execute()
    }

    inner class get_data_pengumuman : AsyncTask<String,Void,String>(){
        override fun onPreExecute() {
            super.onPreExecute()
            pd= ProgressDialog.show(this@Pengumuman,"","Wait",true,false)
        }

        override fun doInBackground(vararg params: String?): String {

            val handler=RequestHandler()
            val result=handler.sendGetRequest(Config.url_pengumuman)
            return result
        }

        override fun onPostExecute(result: String?) {
            super.onPostExecute(result)
            val objek=JSONObject(result)
            val array=objek.getJSONArray("data")
            for (i in 0 until array.length()){
                val data=array.getJSONObject(i)
                val model=PengumumanModel()
                model.gambar=data.getString("gambar")
                model.judul=data.getString("judul")
                model.tanggal=data.getString("tanggal")
                list?.add(model)
                val adapter= list?.let { AdapterPengumuman(it,this@Pengumuman) }
                rc.layoutManager=LinearLayoutManager(this@Pengumuman)
                rc.adapter=adapter
            }
        }

    }
}
