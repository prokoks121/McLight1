package com.example.mclight.soba

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mclight.jsonStatus.JsonStatus
import com.example.mclight.resource.Repozitori

class RadniStoViewModel(): ViewModel() {

     val status:MutableLiveData<JsonStatus.Status> by lazy {

         Repozitori.getInstance().status

     }



    fun loadStatus(){

        Repozitori.getInstance().getStatus()
    }





}

