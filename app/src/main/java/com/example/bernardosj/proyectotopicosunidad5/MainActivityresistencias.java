package com.example.bernardosj.proyectotopicosunidad5;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivityresistencias extends ListActivity {

    String opciones[]={"Colores a valor","Valor a Colores","Regresar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main_activityresistencias);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opciones));
    }

    public void onListItemClick(ListView padre, View v, int posicion, long id){
        switch(posicion) {
            case 0:
                Intent ctov = new Intent(getApplicationContext(), MainActivityctov.class);
                startActivity(ctov);
                break;
            case 1:
                Intent vtoc = new Intent(getApplicationContext(), MainActivityvtoc.class);
                startActivity(vtoc);
                break;
            case 2:
                Intent regresar = new Intent(getApplicationContext(), MainActivityprincipal.class);
                startActivity(regresar);
                break;
        }
    }
}
