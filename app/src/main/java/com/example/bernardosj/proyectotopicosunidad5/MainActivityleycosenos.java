package com.example.bernardosj.proyectotopicosunidad5;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityleycosenos extends AppCompatActivity {

    EditText ld1,ld2,ld3,an1,an2,an3;
    Button calcu,borrar,regresar2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityleycosenos);
        ld1=(EditText) findViewById(R.id.ld1);
        ld2=(EditText) findViewById(R.id.ld2);
        ld3=(EditText) findViewById(R.id.ld3);

        an1=(EditText) findViewById(R.id.an1);
        an2=(EditText) findViewById(R.id.an2);
        an3=(EditText) findViewById(R.id.an3);

        calcu=(Button) findViewById(R.id.calcular);
        borrar=(Button) findViewById(R.id.borrar);
        regresar2=(Button) findViewById(R.id.regresar);

       borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ld1.setText("");
                ld2.setText("");
                ld3.setText("");
                an1.setText("");
                an2.setText("");
                an3.setText("");
            }
        });

        regresar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar = new Intent(getApplicationContext(), MainActivityleyes.class);
                startActivity(regresar);
            }
        });

        calcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String l1 = "" + ld1.getText();
                String l2 = "" + ld2.getText();
                String l3 = "" + ld3.getText();

                String a1 = "" + an1.getText();
                String a2 = "" + an2.getText();
                String a3 = "" + an3.getText();

                int nl = 0, na = 0;

                float vl1 = 0, vl2 = 0, vl3 = 0, va1 = 0, va2 = 0, va3 = 0, sumang = 0;
                if (l1.equals("")) {

                } else {
                    vl1 = Float.parseFloat(l1);

                    nl++;
                }

                if (l2.equals("")) {

                } else {
                    vl2 = Float.parseFloat(l2);

                    nl++;
                }

                if (l3.equals("")) {

                } else {

                    vl3 = Float.parseFloat(l3);
                    nl++;
                }

                if (a1.equals("")) {

                } else {
                    va1 = Float.parseFloat(a1);
                    sumang += va1;
                    na++;
                }

                if (a2.equals("")) {

                } else {
                    va2 = Float.parseFloat(a2);
                    sumang += va2;
                    na++;
                }

                if (a3.equals("")) {

                } else {
                    va3 = Float.parseFloat(a3);
                    sumang += va3;
                    na++;
                }

                System.out.println(nl);
                System.out.println(na);
                if (sumang >= 180 || l1.equals("90") || l2.equals("90") || l3.equals("90")) {
                    Toast.makeText(MainActivityleycosenos.this, "Ingresaste una expresión invalida en los angulos", Toast.LENGTH_LONG).show();
                } else {
                    if (nl == 3 || (nl >= 2 && na >= 1)) {
                        if ((l1.equals("") && a1.equals("")) || (l2.equals("") && a2.equals("")) || (l3.equals("") && a3.equals(""))) {
                            Toast.makeText(MainActivityleycosenos.this, "Necesitas usar ley de senos", Toast.LENGTH_SHORT).show();
                        } else {
                            if (l1.equals("")) {
                                vl1 = (float) Math.sqrt(Math.pow(vl2, 2) + Math.pow(vl3, 2) - (2 * vl2 * vl3 * Math.cos(Math.toRadians(va1))));
                            } else {
                                vl1 = Float.parseFloat(l1);
                            }

                            if (l2.equals("")) {
                                vl2 = (float) Math.sqrt(Math.pow(vl1, 2) + Math.pow(vl3, 2) - (2 * vl1 * vl3 * Math.cos(Math.toRadians(va2))));
                            } else {
                                vl2 = Float.parseFloat(l2);
                            }

                            if (l3.equals("")) {
                                vl3 = (float) Math.sqrt((Math.pow(vl1, 2) + Math.pow(vl2, 2)) + (-2 * vl1 * vl2 * Math.cos(Math.toRadians(va3))));
                            } else {
                                vl3 = Float.parseFloat(l3);
                            }

                            if (a1.equals("")) {
                                float sus = (float) (Math.pow(vl1, 2) - Math.pow(vl2, 2) - Math.pow(vl3, 2));
                                System.out.println(sus);
                                float prod = (float) (-2 * vl2 * vl3);
                                System.out.println(prod);
                                va1 = (float) Math.toDegrees(Math.acos(sus / prod));
                            } else {
                                va1 = Float.parseFloat(a1);
                            }

                            if (a2.equals("")) {
                                float sus = (float) (Math.pow(vl2, 2) - Math.pow(vl1, 2) - Math.pow(vl3, 2));
                                System.out.println(sus);
                                float prod = (float) (-2 * vl1 * vl3);
                                System.out.println(prod);
                                va2 = (float) Math.toDegrees(Math.acos(sus / prod));
                            } else {
                                va2 = Float.parseFloat(a2);
                            }

                            if (a3.equals("")) {
                                float sus = (float) (Math.pow(vl3, 2) - Math.pow(vl1, 2) - Math.pow(vl2, 2));
                                System.out.println(sus);
                                float prod = (float) (-2 * vl1 * vl2);
                                System.out.println(prod);
                                va3 = (float) Math.toDegrees(Math.acos(sus / prod));
                            } else {
                                va3 = Float.parseFloat(a3);
                            }
                            ld1.setText("" + vl1);
                            ld2.setText("" + vl2);
                            ld3.setText("" + vl3);
                            an1.setText("" + va1);
                            an2.setText("" + va2);
                            an3.setText("" + va3);
                        }
                    } else {
                        Toast.makeText(MainActivityleycosenos.this, "Lo siento necesitas ingresar los tres lados o dos lados y un angulo", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
