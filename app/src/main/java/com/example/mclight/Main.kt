package com.example.mclight

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation


class Main : Fragment(), View.OnLongClickListener {

    var navController:NavController? = null



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = Navigation.findNavController(view)
        val svetlo = view.findViewById<RelativeLayout>(R.id.svetlo)
        val krevet = view.findViewById<RelativeLayout>(R.id.krevet)
        val radniSto = view.findViewById<RelativeLayout>(R.id.radniSto)

        svetlo.setOnLongClickListener(this)
        krevet.setOnLongClickListener(this)
        radniSto.setOnLongClickListener(this)

    }

    override fun onLongClick(v: View?):Boolean {
        Log.d("Provera","Uspesno")

        when(v!!.id){
            R.id.radniSto -> navController!!.navigate(R.id.action_main_to_radniSto)




        }
return true
    }

}