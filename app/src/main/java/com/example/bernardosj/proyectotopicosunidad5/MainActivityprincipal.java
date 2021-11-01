package com.example.bernardosj.proyectotopicosunidad5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityprincipal extends AppCompatActivity {
    Button resistentecias,leyes,opcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityprincipal);
        resistentecias=(Button) findViewById(R.id.rsistencias);
        leyes=(Button) findViewById(R.id.triangulos);
        opcion=(Button) findViewById(R.id.opcion);

        resistentecias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resistencias = new Intent(getApplicationContext(), MainActivityresistencias.class);
                startActivity(resistencias);
            }
        });
        leyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent leyes = new Intent(getApplicationContext(), MainActivityleyes.class);
                startActivity(leyes);
            }
        });
        opcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent opcion = new Intent(getApplicationContext(), MainActivityenseniar.class);
                startActivity(opcion);
            }
        });
    }
}
