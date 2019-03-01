package com.example.projectdesalauwba.ui

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.widget.CardView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.projectdesalauwba.R
import com.example.projectdesalauwba.R.id.toolbar
import android.content.Intent
import android.net.Uri
import android.util.Log


class LainnyaFragment : Fragment() {
    lateinit var cardprofil : CardView
    lateinit var cardlembaga : CardView
    lateinit var carddata : CardView
    lateinit var cardprivacy : CardView



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile,null);

        cardprofil.setOnClickListener { view -> Log.d("cardprofil", "Selected") }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cardprofil = view.findViewById(R.id.cardprofil)
        cardlembaga = view.findViewById(R.id.cardlembaga)
        carddata = view.findViewById(R.id.carddata)
        cardprivacy=view.findViewById(R.id.cardprivacy)



    }

}