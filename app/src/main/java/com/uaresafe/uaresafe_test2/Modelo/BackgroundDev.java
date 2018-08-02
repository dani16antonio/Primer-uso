package com.uaresafe.uaresafe_test2.Modelo;

import android.os.AsyncTask;
import android.util.Log;

import com.uaresafe.uaresafe_test2.API.API;
import com.uaresafe.uaresafe_test2.Activities._3Apps;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

public class BackgroundDev extends AsyncTask<Void, Void, Void> {

    @Override
    protected Void doInBackground(Void... voids) {
//        WebServices services = API.getRetrofit().create(WebServices.class);
//        for (String hash: _3Apps.hash) {
//            Call<DatoAPI> response=services.getTask(hash,API.API_KEY);
//            try {
//                //_3Apps.apkN.add(response.execute().body().getPackageName());
//                Log.i("RESPUESTA", response.execute().body().getPackageName());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        return null;
    }
}
