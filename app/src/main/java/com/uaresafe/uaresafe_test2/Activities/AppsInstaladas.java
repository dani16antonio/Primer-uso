package com.uaresafe.uaresafe_test2.Activities;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.uaresafe.uaresafe_test2.API.API;
import com.uaresafe.uaresafe_test2.Modelo.Peticion;
import com.uaresafe.uaresafe_test2.Modelo.WebServices;
import com.uaresafe.www.uaresafe_test2.R;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AppsInstaladas extends AppCompatActivity {
    private ListView lvApp;
    private EditText etTex;
    private String[] appsName;
    private Peticion peticion;
    private WebServices services;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps_instaladas);

        int ind=0;

        lvApp=findViewById(R.id.lvApp1);
        final PackageManager pm=getPackageManager();
        List<ApplicationInfo> packages=pm.getInstalledApplications(PackageManager.GET_META_DATA);
        appsName=new String[packages.size()];
        for(ApplicationInfo packagesinfo:packages) {
            appsName[ind] = packagesinfo.packageName;
            ind++;
        }

        services = API.getRetrofit().create(WebServices.class);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this,android.R.layout.simple_dropdown_item_1line,appsName);
        lvApp.setAdapter(adapter);
        lvApp.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                intent(i);
            }
        });
    }
    public void presionar(View view){
        Intent i=new Intent(this,Mostrar.class);
        try{
            i.putExtra("Hash",peticion.getCount());
            startActivity(i);
        }catch (NullPointerException e){
            Toast.makeText(this,"Debe seleccionar una aplicación.",Toast.LENGTH_SHORT).show();
        }
    }
    private void intent(final int x){
        String y=String.valueOf(lvApp.getItemAtPosition(x));
        Call<Peticion> peticionCall=services.getPet(y,API.API_KEY);
        peticionCall.enqueue(new Callback<Peticion>() {
            @Override
            public void onResponse(retrofit2.Call<Peticion> call, Response<Peticion> response) {
                peticion = response.body();
                Toast.makeText(AppsInstaladas.this,String.valueOf(peticion.getNext()),Toast.LENGTH_SHORT).show();

            }
            @Override
            public void onFailure (retrofit2.Call < Peticion > call, Throwable t){
                Toast.makeText(getApplicationContext(), "Hubo un error en la petición", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void atras(View view){
        finish();
    }
}
