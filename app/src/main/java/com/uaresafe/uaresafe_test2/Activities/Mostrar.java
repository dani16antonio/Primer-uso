package com.uaresafe.uaresafe_test2.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.uaresafe.www.uaresafe_test2.R;

import java.util.List;

public class Mostrar extends AppCompatActivity {
    public TextView tvMos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        Bundle bund=getIntent().getExtras();
        tvMos=findViewById(R.id.tvMos);
        String apps= String.valueOf(bund.getInt("Hash"));

        tvMos.setText(apps);
    }
    public void regresar(View view){
        finish();
    }
}
