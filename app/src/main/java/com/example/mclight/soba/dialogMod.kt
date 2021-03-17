package com.example.mclight.soba

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mclight.R
import com.example.mclight.adapter.ModAdapter


class dialogMod : DialogFragment() {



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment



        return inflater.inflate(R.layout.fragment_dialog_mod, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.listaModova)

        recyclerView.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)

        val adapter = ModAdapter()
        recyclerView.adapter = adapter

    }




}