package com.uaresafe.uaresafe_test2.Activities;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v4.net.ConnectivityManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.uaresafe.uaresafe_test2.API.API;

import com.uaresafe.uaresafe_test2.Design.ShowAppAdapter;
import com.uaresafe.uaresafe_test2.Modelo.BackgroundDev;
import com.uaresafe.uaresafe_test2.Modelo.DatoAPI;
import com.uaresafe.uaresafe_test2.Modelo.WebServices;
import com.uaresafe.www.uaresafe_test2.R;

import java.io.IOException;
import java.util.List;
import java.util.TooManyListenersException;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class _3Apps extends AppCompatActivity {
    public static String[] hash;
    public static List<String> apkN;
    private WebServices services;
    private ListView lvIte;
    public DatoAPI peticion;
    private Call<DatoAPI> peticionCall;

    private Call hola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__3_apps);

        lvIte=findViewById(R.id.lvIte);
        hash= new String[]{"421f8951ca1be595348e9b79b75bb7cf6a5f4b5d42d5ec7b58088b0a7bfcbca7", "2e5f04ddb5d34ae1a3d65e161660d0683bb69a96ea837dff15ca02227b95f73f", "2dc5464c3725c536188b07cf157f826b50ee37464ebca614efb3965753b78f43"};
        for (int i=0; i<hash.length;i++)
            pedir(hash[i]);
        ArrayAdapter arrayAdapter= new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_2,hash);
        lvIte.setAdapter(arrayAdapter);
    }
    public void salir(View view){
        finish();
    }

    public String pedir(String y){
        WebServices services = API.getRetrofit().create(WebServices.class);
        peticionCall=services.getPet2(y,API.API_KEY);
        peticionCall.enqueue(new Callback<DatoAPI>() {
            @Override
            public void onResponse(retrofit2.Call<DatoAPI> call, Response<DatoAPI> response) {
                peticion=response.body();
                Toast.makeText(getApplicationContext(),peticion.getPackageName(),Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onFailure (retrofit2.Call <DatoAPI> call, Throwable t){
                Toast.makeText(getApplicationContext(), "Hubo un error en la petición", Toast.LENGTH_LONG).show();
            }
        });
        return "2";
    }

}
