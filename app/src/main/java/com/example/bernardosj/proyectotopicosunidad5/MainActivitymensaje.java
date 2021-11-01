package com.example.bernardosj.proyectotopicosunidad5;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivitymensaje extends AppCompatActivity {

    Button botonj,botonr;
    TextView puntuacion;
    ImageView imagen;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitymensaje);
        puntuacion=(TextView) findViewById(R.id.pun);
        botonj=(Button) findViewById(R.id.botonj);
        botonr=(Button) findViewById(R.id.botonr);
        imagen=(ImageView) findViewById(R.id.imagenm);

        puntuacion.setText("Obtuviste "+MainActivityenseniar.puntuacion+" puntos de 5 puntos");

        if(MainActivityenseniar.puntuacion==5){
            imagen.setImageResource(R.drawable.maxima);
            Toast.makeText(MainActivitymensaje.this,"Excelente desempeño Felicidades!!!",Toast.LENGTH_LONG).show();
        }
        if(MainActivityenseniar.puntuacion==4){
            imagen.setImageResource(R.drawable.mediana);
            Toast.makeText(MainActivitymensaje.this,"Muy buen desempeño Felicidades!!!",Toast.LENGTH_LONG).show();
        }
        if(MainActivityenseniar.puntuacion==3){
            imagen.setImageResource(R.drawable.medianam);
            Toast.makeText(MainActivitymensaje.this,"Buen desempeño Felicidades!!!",Toast.LENGTH_LONG).show();
        }
        if(MainActivityenseniar.puntuacion<3){
            imagen.setImageResource(R.drawable.esfuerzarte);
            Toast.makeText(MainActivitymensaje.this,"Necesitas seguir practicando esfuerzate y suerte",Toast.LENGTH_LONG).show();
        }
        botonj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jugar = new Intent(getApplicationContext(), MainActivityenseniar.class);
                startActivity(jugar);
                MainActivityenseniar.puntuacion=0;
            }
        });

        botonr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar = new Intent(getApplicationContext(), MainActivityprincipal.class);
                startActivity(regresar);
                MainActivityenseniar.puntuacion=0;
            }
        });
    }
}
