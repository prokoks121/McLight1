package com.example.mclight.soba

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mclight.R
import com.sdsmdg.harjot.crollerTest.Croller
import com.sdsmdg.harjot.crollerTest.OnCrollerChangeListener
import top.defaults.colorpicker.ColorObserver
import top.defaults.colorpicker.ColorPickerView


class RadniSto : Fragment() {

    var radniStoViewModel:RadniStoViewModel?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_radni_sto, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        radniStoViewModel = ViewModelProvider(this).get(RadniStoViewModel::class.java)

        radniStoViewModel!!.status.observe(viewLifecycleOwner, Observer {
           Log.d("Brigness", "jacina je ${it.brightness.toString()}")

        })















                // OVAJ DEO KODA JE NEBITAN
        val colorPickerView = view.findViewById<ColorPickerView>(R.id.colorPicker)
        val brzina = view.findViewById<Croller>(R.id.brzina)
        val jacina = view.findViewById<Croller>(R.id.jacina)
        colorPickerView.setOnlyUpdateOnTouchEventUp(true)
        colorPickerView.subscribe(ColorObserver { color, fromUser, shouldPropagate ->

        })



        brzina.setOnCrollerChangeListener(object : OnCrollerChangeListener {
            override fun onProgressChanged(croller: Croller, progress: Int) {
                brzina.label = (croller.progress*100 / 255).toString() + " %"

            }

            override fun onStartTrackingTouch(croller: Croller) {
                // tracking started
            }

            override fun onStopTrackingTouch(croller: Croller) {
            }
        })

        jacina.setOnCrollerChangeListener(object : OnCrollerChangeListener {
            override fun onProgressChanged(croller: Croller, progress: Int) {
                jacina.label = (croller.progress*100 / 255).toString() + " %"

            }

            override fun onStartTrackingTouch(croller: Croller) {
                // tracking started
            }

            override fun onStopTrackingTouch(croller: Croller) {



            }
        })


        view.findViewById<RelativeLayout>(R.id.radniStoOff).setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {

            }

        })

        view.findViewById<ImageView>(R.id.dialogMod).setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
               // modoviDialog()
                radniStoViewModel!!.loadStatus()
            }

        })





    }

    private fun modoviDialog(){
        val dialog = dialogMod()
        dialog.show(parentFragmentManager,"dialogMod")
    }
}