package com.example.projectdesalauwba.config

object Config {

    private const val Host="http://192.168.0.102/desalauwba/" //yang bakal berganti
    const val url_pengumuman= Host+"index.php/Pengumuman/select"
    const val url_gambar= Host+"assets/upload_pengumuman/"
    const val id="id"
    const val url_detail_pengumuman= Host+"index.php/Pengumuman/select_by_get/"
}