package com.example.projectdesalauwba.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.projectdesalauwba.R


class PengaduanFragment : Fragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        activity?.title = getString(R.string.title_pengaduan)
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)
        return view
    }

}