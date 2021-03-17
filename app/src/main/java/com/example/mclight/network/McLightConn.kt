package com.example.mclight.network

import android.util.Log
import com.example.mclight.jsonStatus.JsonStatus
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class McLightConn {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.mocki.io/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val service = retrofit.create(McLightApi::class.java)






}