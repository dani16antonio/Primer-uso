package com.uaresafe.uaresafe_test2.Design;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.uaresafe.uaresafe_test2.Modelo.DatoAPI;
import com.uaresafe.www.uaresafe_test2.R;

import java.util.List;

public class ShowAppAdapter extends ArrayAdapter<DatoAPI> {
    //Esta clase hereda de la clase ArrayAdapter con los datos de la clase DatoAPI
    private Context context;
    private List<DatoAPI> apiList;
    //Creamos los elementos de la clase, el contexto y lo que vamos a mostar, yo agregué la posición


    public ShowAppAdapter(@NonNull Context context, List<DatoAPI> apiList) {
        super(context, R.layout.show_app_layout,apiList);
        //Llamaos al constructor pasandole el contexto, el layout que creamos y el arreglo de elementos
        this.context = context;
        this.apiList = apiList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        //Creamos nuestro layoutInflater inicializandolo con el contexto en el que se va a mostrar
        DatoAPI datoAPI= apiList.get(position);
        //Creamos un objeto datoAPI que contiene toda la información de todos los request y lo inicializamos con un en específico
        convertView = layoutInflater.inflate(R.layout.show_app_layout,parent,false);
        //Configuramos nuestro View añadiendole el layout que va a mostar, el grupo al que pertenecerá y si seerá "attachaToRoot" o no
        TextView tvAppName= convertView.findViewById(R.id.tvSAName);
        //Del View que recibimos podemos encontrar el View, TextView, que queremos llenar con dato
        tvAppName.setText(datoAPI.getPackageName());
        //Le ponemos texto al view
        //Los últimos 2 procesos lo podemos repetir tantas veces como views tenemos
        return  convertView;
    }
    //Implementamos el método getView


}
