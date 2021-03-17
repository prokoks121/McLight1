package com.example.mclight.resource;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.mclight.jsonStatus.JsonStatus;
import com.example.mclight.network.McLightApi;
import com.example.mclight.network.McLightConn;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repozitori {
    private static Repozitori instance = null;
    private static McLightApi api = null;
    private MutableLiveData<JsonStatus.Status> status;

    private Repozitori(){


        api = new McLightConn().getService();
        status = new MutableLiveData();
        List<Integer> color = new ArrayList<>();
        color.add(0);
        color.add(0);
        color.add(0);

        status.setValue(new JsonStatus.Status(0, color,0,0));
    }

    public static Repozitori getInstance(){
        if (instance == null)
            instance = new Repozitori();
        return instance;
    }



    public MutableLiveData<JsonStatus.Status> getStatus(){

        api.getStatus().enqueue(new Callback<JsonStatus.Status>() {
            @Override
            public void onResponse(Call<JsonStatus.Status> call, Response<JsonStatus.Status> response) {
                Log.d("rezultat", "Uspesno");
                Log.d("rezultat", String.valueOf(response.body()));

                status.setValue(response.body());

            }

            @Override
            public void onFailure(Call<JsonStatus.Status> call, Throwable t) {

                Log.d("rezultat", "Neuspesno");

            }
        });
        return status;

    }



}
