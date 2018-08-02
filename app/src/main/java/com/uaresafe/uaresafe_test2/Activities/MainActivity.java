package com.uaresafe.uaresafe_test2.Activities;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import com.uaresafe.www.uaresafe_test2.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void todApps(View view){
        Intent i=new Intent(this,AppsInstaladas.class);
        startActivity(i);
    }
    public void _3App(View view){
        Intent i=new Intent(this,_3Apps.class);
        startActivity(i);
    }
}
