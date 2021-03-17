package com.example.mclight.network


import com.example.mclight.jsonStatus.JsonStatus
import retrofit2.Call
import retrofit2.http.GET


interface McLightApi{


@GET("v1/5fdd4041")
fun getStatus(): Call<JsonStatus.Status>



}