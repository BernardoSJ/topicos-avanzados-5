package com.example.bernardosj.proyectotopicosunidad5;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivityvtoc extends AppCompatActivity {

    EditText valor,tolerancia;
    Spinner unidades;
    Button calcular,regresar,borrar;
    TextView b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityvtoc);
        valor=(EditText) findViewById(R.id.valor);
        tolerancia=(EditText) findViewById(R.id.tolerancia);
        b1 = (TextView) findViewById(R.id.b1);
        b2 = (TextView) findViewById(R.id.b2);
        b3 = (TextView) findViewById(R.id.b3);
        b4 = (TextView) findViewById(R.id.b4);
        calcular=(Button) findViewById(R.id.calcular);
        regresar=(Button) findViewById(R.id.regresar);
        borrar=(Button) findViewById(R.id.borrar);
        unidades=(Spinner) findViewById(R.id.spinner);

        String unid[]={"Ω","kΩ"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,unid);
        unidades.setAdapter(adapter);

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resistencia = new Intent(getApplicationContext(), MainActivityresistencias.class);
                startActivity(resistencia);
            }
        });

        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctov = new Intent(getApplicationContext(), MainActivityvtoc.class);
                startActivity(ctov);
            }
        });

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float valora=Float.parseFloat(""+valor.getText());

                if(unidades.getSelectedItem().toString().equals("kΩ")){
                    valora=valora*1000;
                }else{
                    valora=valora;
                }

                String nValor=Integer.toString((int) valora);
                String color1="",color2="",color3="",color4="";
                switch(nValor.charAt(0)){

                    case '0':
                        b1.setBackgroundColor(Color.BLACK);
                        break;
                    case '1':
                        b1.setBackgroundColor(Color.rgb(147,81,22));
                        break;
                    case '2':
                        b1.setBackgroundColor(Color.RED);
                        break;
                    case '3':
                        b1.setBackgroundColor(Color.rgb(230,126,34));
                        break;
                    case '4':
                        b1.setBackgroundColor(Color.YELLOW);
                        break;
                    case  '5':
                        b1.setBackgroundColor(Color.GREEN);
                        break;
                    case '6':
                        b1.setBackgroundColor(Color.BLUE);
                        break;
                    case '7':
                        b1.setBackgroundColor(Color.rgb(165,105,189));
                        break;
                    case '8':
                        b1.setBackgroundColor(Color.GRAY);
                    case '9':
                        b1.setBackgroundColor(Color.WHITE);
                        break;
                    case 'a':
                        b1.setBackgroundColor(Color.rgb(212,172,13));
                        break;
                    case 'b':
                        b1.setBackgroundColor(Color.rgb(149,165,166));
                        break;
                }

                switch(nValor.charAt(1)){
                    case '0':
                        b2.setBackgroundColor(Color.BLACK);
                        break;
                    case '1':
                        b2.setBackgroundColor(Color.rgb(147,81,22));
                        break;
                    case '2':
                        b2.setBackgroundColor(Color.RED);
                        break;
                    case '3':
                        b2.setBackgroundColor(Color.rgb(230,126,34));
                        break;
                    case '4':
                        b2.setBackgroundColor(Color.YELLOW);
                        break;
                    case  '5':
                        b2.setBackgroundColor(Color.GREEN);
                        break;
                    case '6':
                        b2.setBackgroundColor(Color.BLUE);
                        break;
                    case '7':
                        b2.setBackgroundColor(Color.rgb(165,105,189));
                        break;
                    case '8':
                        b2.setBackgroundColor(Color.GRAY);
                    case '9':
                        b2.setBackgroundColor(Color.WHITE);
                        break;
                    case 'a':
                        b2.setBackgroundColor(Color.rgb(212,172,13));
                        break;
                    case 'b':
                        b2.setBackgroundColor(Color.rgb(149,165,166));
                        break;
                }
                System.out.println(nValor.substring(2,nValor.length()));
                switch(nValor.substring(2,nValor.length())){

                    case "0":
                        b3.setBackgroundColor(Color.rgb(147,81,22));

                        break;
                    case "00":
                        b3.setBackgroundColor(Color.RED);
                        break;
                    case "000":
                        b3.setBackgroundColor(Color.rgb(230,126,34));
                        break;
                    case "0000":
                        b3.setBackgroundColor(Color.YELLOW);
                        break;
                    case "00000":
                        b3.setBackgroundColor(Color.GREEN);
                        break;
                    case "000000":
                        b3.setBackgroundColor(Color.BLUE);
                        break;
                    case "0000000":
                        b3.setBackgroundColor(Color.rgb(165,105,189));
                        break;
                    case "00000000":
                        b3.setBackgroundColor(Color.GRAY);
                        break;
                    case "000000000":
                        b3.setBackgroundColor(Color.WHITE);
                        break;
                    case "0.1":
                        b3.setBackgroundColor(Color.rgb(212,172,13));
                        break;
                    case "0.01":
                        b3.setBackgroundColor(Color.rgb(149,165,166));
                        break;
                    default:
                        b3.setBackgroundColor(Color.BLACK);
                }

                switch(""+tolerancia.getText()){
                    case "2":
                        color4="Rojo";
                        b4.setBackgroundColor(Color.RED);
                        break;
                    case "5":
                        color4="Dorado";
                        b4.setBackgroundColor(Color.rgb(212,172,13));
                        break;
                    case "10":
                        color4="Plata";
                        b4.setBackgroundColor(Color.rgb(149,165,166));
                        break;
                    case "1":
                        b4.setBackgroundColor(Color.rgb(147,81,22));
                        break;
                    case "0.5":
                        b4.setBackgroundColor(Color.GREEN);

                        break;
                    case "0.1":
                        b4.setBackgroundColor(Color.rgb(165,105,189));
                        break;
                    case "0.25":
                        b4.setBackgroundColor(Color.BLUE);
                        break;
                    case "0.05":
                        b4.setBackgroundColor(Color.GRAY);
                        break;
                    default:
                        color4="Cafe";
                        b4.setBackgroundColor(Color.BLACK);
                }
            }
        });

}
}