package com.example.bernardosj.proyectotopicosunidad5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityleysenos extends AppCompatActivity {
    EditText ld1,ld2,ld3,an1,an2,an3;
    Button calcu,borrar,regresar2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityleysenos);
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
                    Toast.makeText(MainActivityleysenos.this, "Ingresaste una expresión incorrecta en los angulos", Toast.LENGTH_LONG).show();
                } else {
                    if (nl == 3) {
                        Toast.makeText(MainActivityleysenos.this, "Este es un caso para la ley de cosenos", Toast.LENGTH_SHORT).show();
                    } else {
                        if (na == 2 && nl == 1) {

                            if (a1.equals("")) {
                                va1 = 180 - va2 - va3;
                            }

                            if (a2.equals("")) {
                                va2 = 180 - va1 - va3;
                            }

                            if (a3.equals("")) {
                                va3 = 180 - va1 - va2;
                            }

                            if (l1.equals("") && l2.equals("") == false) {
                                vl1 = (float) ((vl2 * Math.sin(Math.toRadians(va1))) / (Math.sin(Math.toRadians(va2))));
                            } else {
                                if (l1.equals("") && l3.equals("") == false) {
                                    vl1 = (float) ((vl3 * Math.sin(Math.toRadians(va1))) / (Math.sin(Math.toRadians(va3))));
                                }
                            }


                            if (l2.equals("") && l1.equals("") == false) {
                                vl2 = (float) ((vl1 * Math.sin(Math.toRadians(va2))) / (Math.sin(Math.toRadians(va1))));
                            } else {
                                if (l2.equals("") && l3.equals("") == false) {
                                    vl2 = (float) ((vl3 * Math.sin(Math.toRadians(va2))) / (Math.sin(Math.toRadians(va3))));
                                }
                            }

                            if (l3.equals("") && l1.equals("") == false) {
                                vl3 = (float) ((vl1 * Math.sin(Math.toRadians(va3))) / (Math.sin(Math.toRadians(va1))));
                            } else {
                                if (l3.equals("") && l2.equals("") == false) {
                                    vl3 = (float) ((vl2 * Math.sin(Math.toRadians(va3))) / (Math.sin(Math.toRadians(va2))));
                                }
                            }
                            ld1.setText("" + vl1);
                            ld2.setText("" + vl2);
                            ld3.setText("" + vl3);
                            an1.setText("" + va1);
                            an2.setText("" + va2);
                            an3.setText("" + va3);
                        } else {
                            if (na == 1 && nl == 2) {
                                if (l1.equals("") == false && l2.equals("") == false && a1.equals("") == false) {
                                    if ((va1 < 90 && (vl1 < (vl2 * Math.sin(Math.toRadians(va1))))) || (va1 > 90 && vl1 <= vl2)) {
                                        Toast.makeText(MainActivityleysenos.this, "El triangulo que ingresaste no puede exixtir", Toast.LENGTH_SHORT).show();
                                    } else {
                                        va2 = (float) Math.toDegrees(Math.asin((vl2 * Math.sin(Math.toRadians(va1))) / (vl1)));
                                        va3 = 180 - va1 - va2;
                                        vl3 = (float) ((float) (vl1 * Math.sin(Math.toRadians(va3))) / (Math.sin(Math.toRadians(va1))));
                                        ld1.setText("" + vl1);
                                        ld2.setText("" + vl2);
                                        ld3.setText("" + vl3);
                                        an1.setText("" + va1);
                                        an2.setText("" + va2);
                                        an3.setText("" + va3);
                                    }
                                } else {
                                    Toast.makeText(MainActivityleysenos.this, "Asegurate de haber ingresado los lados a y b y el angulo de A", Toast.LENGTH_SHORT).show();
                                }

                            } else {
                                Toast.makeText(MainActivityleysenos.this, "Faltan datos o debes de aplicar ley de cosenos", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }
            }


        });
    }
}
