package com.example.bernardosj.proyectotopicosunidad5;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivityctov extends AppCompatActivity {

    Button calcular,reiniciar,regresar;
    TextView b,b2,b3,b4,resu;
    Spinner s1,s2,s3,s4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityctov);
        calcular = (Button) findViewById(R.id.calcular);
        reiniciar = (Button) findViewById(R.id.reiniciar);
        regresar = (Button) findViewById(R.id.regresar);

        b = (TextView) findViewById(R.id.b1);
        b2 = (TextView) findViewById(R.id.b2);
        b3 = (TextView) findViewById(R.id.b3);
        b4 = (TextView) findViewById(R.id.b4);
        resu = (TextView) findViewById(R.id.resultados);

        s1 = (Spinner) findViewById(R.id.spinner1);
        s2 = (Spinner) findViewById(R.id.spinner2);
        s3 = (Spinner) findViewById(R.id.spinner3);
        s4 = (Spinner) findViewById(R.id.spinner4);

        String cbarra1[] = {"", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris","Blanco"};
        String cbarra2[] = {"", "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris","Blanco"};
        String cbarra3[] = {"", "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris","Blanco", "Dorado", "Plateado"};
        String cbarra4[] = {"", "Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris","Blanco", "Dorado", "Plateado"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cbarra1);
        s1.setAdapter(adapter);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cbarra2);
        s2.setAdapter(adapter1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cbarra3);
        s3.setAdapter(adapter2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, cbarra4);
        s4.setAdapter(adapter3);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(s1.getSelectedItem().toString()){
                    case "":
                        b.setBackgroundColor(Color.BLACK);
                        break;
                    case "Cafe":
                        b.setBackgroundColor(Color.rgb(147,81,22));
                        break;
                    case "Rojo":
                        b.setBackgroundColor(Color.RED);
                        break;
                    case "Naranja":
                        b.setBackgroundColor(Color.rgb(230,126,34));
                        break;
                    case "Amarillo":
                        b.setBackgroundColor(Color.YELLOW);
                        break;
                    case "Verde":
                        b.setBackgroundColor(Color.GREEN);
                        break;
                    case "Azul":
                        b.setBackgroundColor(Color.BLUE);
                        break;
                    case "Violeta":
                        b.setBackgroundColor(Color.rgb(165,105,189));
                        break;
                    case "Gris":
                        b.setBackgroundColor(Color.GRAY);
                    case "Blanco":
                        b.setBackgroundColor(Color.WHITE);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(s2.getSelectedItem().toString()){
                    case "":
                    case "Negro":
                        b2.setBackgroundColor(Color.BLACK);
                        break;
                    case "Cafe":
                        b2.setBackgroundColor(Color.rgb(147,81,22));
                        break;
                    case "Rojo":
                        b2.setBackgroundColor(Color.RED);
                        break;
                    case "Naranja":
                        b2.setBackgroundColor(Color.rgb(230,126,34));
                        break;
                    case "Amarillo":
                        b2.setBackgroundColor(Color.YELLOW);
                        break;
                    case "Verde":
                        b2.setBackgroundColor(Color.GREEN);
                        break;
                    case "Azul":
                        b2.setBackgroundColor(Color.BLUE);
                        break;
                    case "Violeta":
                        b2.setBackgroundColor(Color.rgb(165,105,189));
                        break;
                    case "Gris":
                        b2.setBackgroundColor(Color.GRAY);
                    case "Blanco":
                        b2.setBackgroundColor(Color.WHITE);
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(s3.getSelectedItem().toString()){
                    case "":
                    case "Negro":
                        b3.setBackgroundColor(Color.BLACK);
                        break;
                    case "Cafe":
                        b3.setBackgroundColor(Color.rgb(147,81,22));
                        break;
                    case "Rojo":
                        b3.setBackgroundColor(Color.RED);
                        break;
                    case "Naranja":
                        b3.setBackgroundColor(Color.rgb(230,126,34));
                        break;
                    case "Amarillo":
                        b3.setBackgroundColor(Color.YELLOW);
                        break;
                    case "Verde":
                        b3.setBackgroundColor(Color.GREEN);
                        break;
                    case "Azul":
                        b3.setBackgroundColor(Color.BLUE);
                        break;
                    case "Violeta":
                        b3.setBackgroundColor(Color.rgb(165,105,189));
                        break;
                    case "Gris":
                        b3.setBackgroundColor(Color.GRAY);
                    case "Blanco":
                        b3.setBackgroundColor(Color.WHITE);
                        break;
                    case "Dorado":
                        b3.setBackgroundColor(Color.rgb(212,172,13));
                        break;
                    case "Plateado":
                        b3.setBackgroundColor(Color.rgb(149,165,166));
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        s4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(s4.getSelectedItem().toString()){
                    case "":
                    case "Negro":
                        b4.setBackgroundColor(Color.BLACK);
                        break;
                    case "Cafe":
                        b4.setBackgroundColor(Color.rgb(147,81,22));
                        break;
                    case "Rojo":
                        b4.setBackgroundColor(Color.RED);
                        break;
                    case "Naranja":
                        b4.setBackgroundColor(Color.rgb(230,126,34));
                        break;
                    case "Amarillo":
                        b4.setBackgroundColor(Color.YELLOW);
                        break;
                    case "Verde":
                        b4.setBackgroundColor(Color.GREEN);
                        break;
                    case "Azul":
                        b4.setBackgroundColor(Color.BLUE);
                        break;
                    case "Violeta":
                        b4.setBackgroundColor(Color.rgb(165,105,189));
                        break;
                    case "Gris":
                        b4.setBackgroundColor(Color.GRAY);
                    case "Blanco":
                        b4.setBackgroundColor(Color.WHITE);
                        break;
                    case "Dorado":
                        b4.setBackgroundColor(Color.rgb(212,172,13));
                        break;
                    case "Plateado":
                        b4.setBackgroundColor(Color.rgb(149,165,166));
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resistencia = new Intent(getApplicationContext(), MainActivityresistencias.class);
                startActivity(resistencia);
            }
        });

        reiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctov = new Intent(getApplicationContext(), MainActivityctov.class);
                startActivity(ctov);
            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s1.getSelectedItem().toString().equals("") || s2.getSelectedItem().toString().equals("") || s3.getSelectedItem().toString().equals("") || s4.getSelectedItem().toString().equals("")) {
                    Toast.makeText(MainActivityctov.this, "Asegurate de haber elegido un color en cad una de las bandas", Toast.LENGTH_SHORT);
                } else {
                    String v1 = "";
                    switch (s1.getSelectedItem().toString()) {
                        case "Negro":
                            v1 = "0";
                            break;
                        case "Cafe":
                            v1 = "1";
                            break;
                        case "Rojo":
                            v1 = "2";
                            break;
                        case "Naranja":
                            v1 = "3";
                            break;
                        case "Amarillo":
                            v1 = "4";
                            break;
                        case "Verde":
                            v1 = "5";
                            break;
                        case "Azul":
                            v1 = "6";
                            break;
                        case "Violeta":
                            v1 = "7";
                            break;
                        case "Gris":
                            v1 = "8";
                            break;
                        case "Blanco":
                            v1 = "9";
                            break;
                        case "Dorado":
                            break;
                        case "Plateado":
                            break;
                    }

                    String v2="";

                    switch(s2.getSelectedItem().toString()){
                        case "Negro":
                            v2 = "0";
                            break;
                        case "Cafe":
                            v2 = "1";
                            break;
                        case "Rojo":
                            v2 = "2";
                            break;
                        case "Naranja":
                            v2 = "3";
                            break;
                        case "Amarillo":
                            v2 = "4";
                            break;
                        case "Verde":
                            v2 = "5";
                            break;
                        case "Azul":
                            v2 = "6";
                            break;
                        case "Violeta":
                            v2 = "7";
                            break;
                        case "Gris":
                            v2 = "8";
                            break;
                        case "Blanco":
                            v2 = "9";
                            break;
                        case "Dorado":
                            break;
                        case "Plateado":
                            break;
                    }

                    int numeroformado=Integer.parseInt(""+(v1+v2));
                    float resultado=0;
                    switch(s3.getSelectedItem().toString()){
                        case "Negro":
                            resultado=numeroformado*1;
                            break;
                        case "Cafe":
                            resultado=numeroformado*10;
                            break;
                        case "Rojo":
                            resultado=numeroformado*100;
                            break;
                        case "Naranja":
                            resultado=numeroformado*1000;
                            break;
                        case "Amarillo":
                            resultado=numeroformado*10000;
                            break;
                        case "Verde":
                            resultado=numeroformado*100000;
                            break;
                        case "Azul":
                            resultado=numeroformado*1000000;
                            break;
                        case "Violeta":
                            resultado=numeroformado*10000000;
                            break;
                        case "Gris":
                            resultado=numeroformado*100000000;
                            break;
                        case "Blanco":
                            resultado=numeroformado*1000000000;
                            break;
                        case "Dorado":
                            resultado= (float) (numeroformado*0.1);
                            break;
                        case "Plateado":
                            resultado=(float) (numeroformado*0.01);
                            break;
                    }

                    String to="";

                    switch(s4.getSelectedItem().toString()){
                        case "Negro":
                            to="";
                            break;
                        case "Cafe":
                            to=" - 1%";
                            break;
                        case "Rojo":
                            to=" - 2%";
                            break;
                        case "Naranja":
                            to="";
                            break;
                        case "Amarillo":
                            to="";
                            break;
                        case "Verde":
                            to=" - 0.5%";
                            break;
                        case "Azul":
                            to=" - 0.25%";
                            break;
                        case "Violeta":
                            to=" - 0.1%";
                            break;
                        case "Gris":
                            to=" - 0.05%";
                            break;
                        case "Blanco":
                            to="";
                            break;
                        case "Dorado":
                            to=" - 5%";
                            break;
                        case "Plateado":
                            to=" - 10%";
                            break;
                    }
                    resu.setText("Resultados:\n "+resultado+" Ω "+to+"\n"+(resultado/1000)+" kΩ");
                }
            }
        });
    }
}
