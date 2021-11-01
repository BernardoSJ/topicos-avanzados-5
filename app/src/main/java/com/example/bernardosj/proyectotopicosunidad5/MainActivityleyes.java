package com.example.bernardosj.proyectotopicosunidad5;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivityleyes extends ListActivity {
    String opciones[]={"Ley de senos","Ley de cosenos","Regresar"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opciones));
    }

    public void onListItemClick(ListView padre, View v, int posicion, long id){
        switch(posicion) {
            case 0:
                Intent leysen = new Intent(getApplicationContext(), MainActivityleysenos.class);
                startActivity(leysen);
                break;
            case 1:
                Intent leycos = new Intent(getApplicationContext(), MainActivityleycosenos.class);
                startActivity(leycos);
                break;
            case 2:
                Intent regresar = new Intent(getApplicationContext(), MainActivityprincipal.class);
                startActivity(regresar);
                break;
        }
    }
}
