package com.example.bernardosj.proyectotopicosunidad5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivityenseniar extends AppCompatActivity {

    Button boton1,boton2,boton3;
    TextView vocal;
    ImageView imagen1,imagen2,imagen3,imagenmen;
    String vocales[]={"A","E","I","O","U"};
    ArrayList<String> cVocales=new ArrayList();
    ArrayList<animales> animales=new ArrayList();
    int conteo=0;
    public static int puntuacion=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityenseniar);
        boton1=(Button) findViewById(R.id.boton1);
        boton2=(Button) findViewById(R.id.boton2);
        boton3=(Button) findViewById(R.id.boton3);
        imagen1=(ImageView) findViewById(R.id.imagen1);
        imagen2=(ImageView) findViewById(R.id.imagen2);
        imagen3=(ImageView) findViewById(R.id.imagen3);
        imagenmen=(ImageView) findViewById(R.id.imagenmen);
        vocal=(TextView) findViewById(R.id.vocal);
        animales obj=new animales();
        animales obj1=new animales();
        animales obj2=new animales();
        animales obj3=new animales();
        animales obj4=new animales();
        animales obj5=new animales();
        animales obj6=new animales();
        animales obj7=new animales();
        animales obj8=new animales();
        animales obj9=new animales();
        obj.imagen=R.drawable.ardillacaricatura;
        obj.nombre="Ardilla";
        animales.add(obj);
        obj1.imagen=R.drawable.elefantecaricatura;
        obj1.nombre="Elefante";
        animales.add(obj1);

        obj2.imagen=R.drawable.hipopotamo;
        obj2.nombre="Hipopotamo";
        animales.add(obj2);

        obj3.imagen=R.drawable.iguanacaricarura;
        obj3.nombre="Iguana";
        animales.add(obj3);

        obj4.imagen=R.drawable.jirafa;
        obj4.nombre="Jirafa";
        animales.add(obj4);

        obj5.imagen=R.drawable.leoncaricarura;
        obj5.nombre="Leon";
        animales.add(obj5);

        obj6.imagen=R.drawable.osocaricatura;
        obj6.nombre="Oso";
        animales.add(obj6);

        obj7.imagen=R.drawable.tigre;
        obj7.nombre="Tigre";
        animales.add(obj7);

        obj8.imagen=R.drawable.unicorniocaricatura;
        obj8.nombre="Unicornio";
        animales.add(obj8);

        obj9.imagen=R.drawable.zebra;
        obj9.nombre="Zebra";
        animales.add(obj9);
        imagenmen.setEnabled(false);
        Random rnd=new Random();
        while(cVocales.size()!=5){
            int ran=rnd.nextInt(5);
            if(cVocales.isEmpty()){
                cVocales.add(vocales[ran]);
            }else{
                if(esta(cVocales,vocales[ran])==false){
                    cVocales.add(vocales[ran]);
                }
            }
        }

        vocal.setText(""+cVocales.get(conteo));
        asignarimagen(""+vocal.getText());
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(vocal.getText().equals("A") && boton1.getText().equals("Ardilla")){
                   puntuacion++;
                   imagenmen.setImageResource(R.drawable.bienhecho);
               }else{
                   if(vocal.getText().equals("E") && boton1.getText().equals("Elefante")){
                       puntuacion++;
                       imagenmen.setImageResource(R.drawable.bienhecho);
                   }else{
                       if(vocal.getText().equals("I") && boton1.getText().equals("Iguana")){
                           puntuacion++;
                           imagenmen.setImageResource(R.drawable.bienhecho);
                       }else{
                           if(vocal.getText().equals("O") && boton1.getText().equals("Oso")){
                               puntuacion++;
                               imagenmen.setImageResource(R.drawable.bienhecho);
                           }else{
                               if(vocal.getText().equals("U") && boton1.getText().equals("Unicornio")){
                                   puntuacion++;
                                   imagenmen.setImageResource(R.drawable.bienhecho);
                               }else{
                                   imagenmen.setImageResource(R.drawable.equivocado);
                                   if(vocal.getText().equals("A")){
                                       Toast.makeText(MainActivityenseniar.this,"Lo siento la respuesta era Ardilla",Toast.LENGTH_LONG).show();
                                   }

                                   if(vocal.getText().equals("E")){
                                       Toast.makeText(MainActivityenseniar.this,"Lo siento la respuesta era Elefante",Toast.LENGTH_LONG).show();
                                   }

                                   if(vocal.getText().equals("I")){
                                       Toast.makeText(MainActivityenseniar.this,"Lo siento la respuesta era Iguana",Toast.LENGTH_LONG).show();
                                   }

                                   if(vocal.getText().equals("O")){
                                       Toast.makeText(MainActivityenseniar.this,"Lo siento la respuesta era Oso",Toast.LENGTH_LONG).show();
                                   }

                                   if(vocal.getText().equals("U")){
                                       Toast.makeText(MainActivityenseniar.this,"Lo siento la respuesta era Unicornio",Toast.LENGTH_LONG).show();
                                   }
                               }
                           }

                       }
                   }
               }
               boton1.setEnabled(false);
               boton2.setEnabled(false);
               boton3.setEnabled(false);
               imagenmen.setEnabled(true);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(vocal.getText().equals("A") && boton2.getText().equals("Ardilla")){
                    puntuacion++;
                    imagenmen.setImageResource(R.drawable.bienhecho);
                }else{
                    if(vocal.getText().equals("E") && boton2.getText().equals("Elefante")){
                        puntuacion++;
                        imagenmen.setImageResource(R.drawable.bienhecho);
                    }else{
                        if(vocal.getText().equals("I") && boton2.getText().equals("Iguana")){
                            puntuacion++;
                            imagenmen.setImageResource(R.drawable.bienhecho);
                        }else{
                            if(vocal.getText().equals("O") && boton2.getText().equals("Oso")){
                                puntuacion++;
                                imagenmen.setImageResource(R.drawable.bienhecho);
                            }else{
                                if(vocal.getText().equals("U") && boton2.getText().equals("Unicornio")){
                                    puntuacion++;
                                    imagenmen.setImageResource(R.drawable.bienhecho);
                                }else{
                                    imagenmen.setImageResource(R.drawable.equivocado);
                                    if(vocal.getText().equals("A")){
                                        Toast.makeText(MainActivityenseniar.this,"Lo siento la respuesta era Ardilla",Toast.LENGTH_LONG).show();
                                    }

                                    if(vocal.getText().equals("E")){
                                        Toast.makeText(MainActivityenseniar.this,"Lo siento la respuesta era Elefante",Toast.LENGTH_LONG).show();
                                    }

                                    if(vocal.getText().equals("I")){
                                        Toast.makeText(MainActivityenseniar.this,"Lo siento la respuesta era Iguana",Toast.LENGTH_LONG).show();
                                    }

                                    if(vocal.getText().equals("O")){
                                        Toast.makeText(MainActivityenseniar.this,"Lo siento la respuesta era Oso",Toast.LENGTH_LONG).show();
                                    }

                                    if(vocal.getText().equals("U")){
                                        Toast.makeText(MainActivityenseniar.this,"Lo siento la respuesta era Unicornio",Toast.LENGTH_LONG).show();
                                    }
                                }
                            }

                        }
                    }
                }
                boton1.setEnabled(false);
                boton2.setEnabled(false);
                boton3.setEnabled(false);
                imagenmen.setEnabled(true);
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(vocal.getText().equals("A") && boton3.getText().equals("Ardilla")){
                    puntuacion++;
                    imagenmen.setImageResource(R.drawable.bienhecho);
                }else{
                    if(vocal.getText().equals("E") && boton3.getText().equals("Elefante")){
                        puntuacion++;
                        imagenmen.setImageResource(R.drawable.bienhecho);
                    }else{
                        if(vocal.getText().equals("I") && boton3.getText().equals("Iguana")){
                            puntuacion++;
                            imagenmen.setImageResource(R.drawable.bienhecho);
                        }else{
                            if(vocal.getText().equals("O") && boton3.getText().equals("Oso")){
                                puntuacion++;
                                imagenmen.setImageResource(R.drawable.bienhecho);
                            }else{
                                if(vocal.getText().equals("U") && boton3.getText().equals("Unicornio")){
                                    puntuacion++;
                                    imagenmen.setImageResource(R.drawable.bienhecho);
                                }else{
                                    imagenmen.setImageResource(R.drawable.equivocado);
                                    if(vocal.getText().equals("A")){
                                        Toast.makeText(MainActivityenseniar.this,"Lo siento la respuesta era Ardilla",Toast.LENGTH_LONG).show();
                                    }

                                    if(vocal.getText().equals("E")){
                                        Toast.makeText(MainActivityenseniar.this,"Lo siento la respuesta era Elefante",Toast.LENGTH_LONG).show();
                                    }

                                    if(vocal.getText().equals("I")){
                                        Toast.makeText(MainActivityenseniar.this,"Lo siento la respuesta era Iguana",Toast.LENGTH_LONG).show();
                                    }

                                    if(vocal.getText().equals("O")){
                                        Toast.makeText(MainActivityenseniar.this,"Lo siento la respuesta era Oso",Toast.LENGTH_LONG).show();
                                    }

                                    if(vocal.getText().equals("U")){
                                        Toast.makeText(MainActivityenseniar.this,"Lo siento la respuesta era Unicornio",Toast.LENGTH_LONG).show();
                                    }
                                }
                            }

                        }
                    }
                }
                boton1.setEnabled(false);
                boton2.setEnabled(false);
                boton3.setEnabled(false);
                imagenmen.setEnabled(true);
            }
        });

        imagenmen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (conteo < 5) {
                        conteo++;
                        vocal.setText(cVocales.get(conteo));
                        asignarimagen("" + vocal.getText());
                        boton1.setEnabled(true);
                        boton2.setEnabled(true);
                        boton3.setEnabled(true);
                        imagenmen.setEnabled(false);
                    }
                }catch (Exception e){
                    Intent mensaje = new Intent(getApplicationContext(), MainActivitymensaje.class);
                    startActivity(mensaje);
                }
            }
        });
    }

    public static boolean esta(ArrayList vec,String elemento){
        boolean esta=false;
        for(int i=0;i<vec.size();i++){
            if(vec.get(i).equals(elemento)){
                esta=true;
                break;
            }
        }
        return esta;
    }

    public void asignarimagen(String v){
        Random rnd=new Random();
        int num=rnd.nextInt(3);
        switch(num){
            case 0:
                if(v.equals("A")){
                    boton1.setText("Ardilla");
                    imagen1.setImageResource(R.drawable.ardillacaricatura);
                    do{
                        int random=rnd.nextInt(10);
                        boton2.setText(""+animales.get(random).nombre);
                        imagen2.setImageResource(animales.get(random).imagen);
                        Random rnd2=new Random();
                        int random2=rnd2.nextInt(10);
                        boton3.setText(""+animales.get(random2).nombre);
                        imagen3.setImageResource(animales.get(random2).imagen);
                    }while(boton1.getText().equals(boton2.getText())==true || boton1.getText().equals(boton3.getText())==true || boton2.getText().equals(boton3.getText())==true|| boton3.getText().equals(boton2.getText())==true);
                }

                if(v.equals("E")){
                    boton1.setText("Elefante");
                    imagen1.setImageResource(R.drawable.elefantecaricatura);
                    do{
                        int random=rnd.nextInt(10);
                        boton2.setText(""+animales.get(random).nombre);
                        imagen2.setImageResource(animales.get(random).imagen);
                        Random rnd2=new Random();
                        int random2=rnd2.nextInt(10);
                        boton3.setText(""+animales.get(random2).nombre);
                        imagen3.setImageResource(animales.get(random2).imagen);
                    }while(boton1.getText().equals(boton2.getText())==true || boton1.getText().equals(boton3.getText())==true || boton2.getText().equals(boton3.getText())==true|| boton3.getText().equals(boton2.getText())==true);
                }

                if(v.equals("I")){
                    boton1.setText("Iguana");
                    imagen1.setImageResource(R.drawable.iguanacaricarura);
                    do{
                        int random=rnd.nextInt(10);
                        boton2.setText(""+animales.get(random).nombre);
                        imagen2.setImageResource(animales.get(random).imagen);
                        Random rnd2=new Random();
                        int random2=rnd2.nextInt(10);
                        boton3.setText(""+animales.get(random2).nombre);
                        imagen3.setImageResource(animales.get(random2).imagen);
                    }while(boton1.getText().equals(boton2.getText())==true || boton1.getText().equals(boton3.getText())==true || boton2.getText().equals(boton3.getText())==true|| boton3.getText().equals(boton2.getText())==true);
                }

                if(v.equals("O")){
                    boton1.setText("Oso");
                    imagen1.setImageResource(R.drawable.osocaricatura);
                    do{
                        int random=rnd.nextInt(10);
                        boton2.setText(""+animales.get(random).nombre);
                        imagen2.setImageResource(animales.get(random).imagen);
                        Random rnd2=new Random();
                        int random2=rnd2.nextInt(10);
                        boton3.setText(""+animales.get(random2).nombre);
                        imagen3.setImageResource(animales.get(random2).imagen);
                    }while(boton1.getText().equals(boton2.getText())==true || boton1.getText().equals(boton3.getText())==true || boton2.getText().equals(boton3.getText())==true|| boton3.getText().equals(boton2.getText())==true);
                }

                if(v.equals("U")){
                    boton1.setText("Unicornio");
                    imagen1.setImageResource(R.drawable.unicorniocaricatura);
                    do{
                        int random=rnd.nextInt(10);
                        boton2.setText(""+animales.get(random).nombre);
                        imagen2.setImageResource(animales.get(random).imagen);
                        Random rnd2=new Random();
                        int random2=rnd2.nextInt(10);
                        boton3.setText(""+animales.get(random2).nombre);
                        imagen3.setImageResource(animales.get(random2).imagen);
                    }while(boton1.getText().equals(boton2.getText())==true || boton1.getText().equals(boton3.getText())==true|| boton2.getText().equals(boton3.getText())==true|| boton3.getText().equals(boton2.getText())==true);
                }
                break;
            case 1:
                if(v.equals("A")){
                    boton2.setText("Ardilla");
                    imagen2.setImageResource(R.drawable.ardillacaricatura);
                    do{
                        int random=rnd.nextInt(10);
                        boton1.setText(""+animales.get(random).nombre);
                        imagen1.setImageResource(animales.get(random).imagen);
                        Random rnd2=new Random();
                        int random2=rnd2.nextInt(10);
                        boton3.setText(""+animales.get(random2).nombre);
                        imagen3.setImageResource(animales.get(random2).imagen);
                    }while(boton2.getText().equals(boton1.getText())==true || boton2.getText().equals(boton3.getText())==true || boton1.getText().equals(boton3.getText())==true|| boton3.getText().equals(boton1.getText())==true);
                }

                if(v.equals("E")){
                    boton2.setText("Elefante");
                    imagen2.setImageResource(R.drawable.elefantecaricatura);
                    do{
                        int random=rnd.nextInt(10);
                        boton1.setText(""+animales.get(random).nombre);
                        imagen1.setImageResource(animales.get(random).imagen);
                        Random rnd2=new Random();
                        int random2=rnd2.nextInt(10);
                        boton3.setText(""+animales.get(random2).nombre);
                        imagen3.setImageResource(animales.get(random2).imagen);
                    }while(boton2.getText().equals(boton1.getText())==true || boton2.getText().equals(boton3.getText())==true || boton1.getText().equals(boton3.getText())==true|| boton3.getText().equals(boton1.getText())==true);
                }

                if(v.equals("I")){
                    boton2.setText("Iguana");
                    imagen2.setImageResource(R.drawable.iguanacaricarura);
                    do{
                        int random=rnd.nextInt(10);
                        boton1.setText(""+animales.get(random).nombre);
                        imagen1.setImageResource(animales.get(random).imagen);
                        Random rnd2=new Random();
                        int random2=rnd2.nextInt(10);
                        boton3.setText(""+animales.get(random2).nombre);
                        imagen3.setImageResource(animales.get(random2).imagen);
                    }while(boton2.getText().equals(boton1.getText())==true || boton2.getText().equals(boton3.getText())==true || boton1.getText().equals(boton3.getText())==true|| boton3.getText().equals(boton1.getText())==true);
                }

                if(v.equals("O")){
                    boton2.setText("Oso");
                    imagen2.setImageResource(R.drawable.osocaricatura);
                    do{
                        int random=rnd.nextInt(10);
                        boton1.setText(""+animales.get(random).nombre);
                        imagen1.setImageResource(animales.get(random).imagen);
                        Random rnd2=new Random();
                        int random2=rnd2.nextInt(10);
                        boton3.setText(""+animales.get(random2).nombre);
                        imagen3.setImageResource(animales.get(random2).imagen);
                    }while(boton2.getText().equals(boton1.getText())==true || boton2.getText().equals(boton3.getText())==true || boton1.getText().equals(boton3.getText())==true|| boton3.getText().equals(boton1.getText())==true);
                }

                if(v.equals("U")){
                    boton2.setText("Unicornio");
                    imagen2.setImageResource(R.drawable.unicorniocaricatura);
                    do{
                        int random=rnd.nextInt(10);
                        boton1.setText(""+animales.get(random).nombre);
                        imagen1.setImageResource(animales.get(random).imagen);
                        Random rnd2=new Random();
                        int random2=rnd2.nextInt(10);
                        boton3.setText(""+animales.get(random2).nombre);
                        imagen3.setImageResource(animales.get(random2).imagen);
                    }while(boton2.getText().equals(boton1.getText())==true || boton2.getText().equals(boton3.getText())==true || boton1.getText().equals(boton3.getText())==true|| boton3.getText().equals(boton1.getText())==true);
                }
                break;
            case 2:
                if(v.equals("A")){
                    boton3.setText("Ardilla");
                    imagen3.setImageResource(R.drawable.ardillacaricatura);
                    do{
                        int random=rnd.nextInt(10);
                        boton1.setText(""+animales.get(random).nombre);
                        imagen1.setImageResource(animales.get(random).imagen);
                        Random rnd2=new Random();
                        int random2=rnd2.nextInt(10);
                        boton2.setText(""+animales.get(random2).nombre);
                        imagen2.setImageResource(animales.get(random2).imagen);
                    }while(boton3.getText().equals(boton1.getText())==true || boton3.getText().equals(boton2.getText())==true || boton1.getText().equals(boton2.getText())==true|| boton2.getText().equals(boton1.getText())==true);
                }

                if(v.equals("E")){
                    boton3.setText("Elefante");
                    imagen3.setImageResource(R.drawable.elefantecaricatura);
                    do{
                        int random=rnd.nextInt(10);
                        boton1.setText(""+animales.get(random).nombre);
                        imagen1.setImageResource(animales.get(random).imagen);
                        Random rnd2=new Random();
                        int random2=rnd2.nextInt(10);
                        boton2.setText(""+animales.get(random2).nombre);
                        imagen2.setImageResource(animales.get(random2).imagen);
                    }while(boton3.getText().equals(boton1.getText())==true || boton3.getText().equals(boton2.getText())==true || boton1.getText().equals(boton2.getText())==true|| boton2.getText().equals(boton1.getText())==true);
                }

                if(v.equals("I")){
                    boton3.setText("Iguana");
                    imagen3.setImageResource(R.drawable.iguanacaricarura);
                    do{
                        int random=rnd.nextInt(10);
                        boton1.setText(""+animales.get(random).nombre);
                        imagen1.setImageResource(animales.get(random).imagen);
                        Random rnd2=new Random();
                        int random2=rnd2.nextInt(10);
                        boton2.setText(""+animales.get(random2).nombre);
                        imagen2.setImageResource(animales.get(random2).imagen);
                    }while(boton3.getText().equals(boton1.getText())==true || boton3.getText().equals(boton2.getText())==true || boton1.getText().equals(boton2.getText())==true|| boton2.getText().equals(boton1.getText())==true);
                }

                if(v.equals("O")){
                    boton3.setText("Oso");
                    imagen3.setImageResource(R.drawable.osocaricatura);
                    do{
                        int random=rnd.nextInt(10);
                        boton1.setText(""+animales.get(random).nombre);
                        imagen1.setImageResource(animales.get(random).imagen);
                        Random rnd2=new Random();
                        int random2=rnd2.nextInt(10);
                        boton2.setText(""+animales.get(random2).nombre);
                        imagen2.setImageResource(animales.get(random2).imagen);
                    }while(boton3.getText().equals(boton1.getText())==true || boton3.getText().equals(boton2.getText())==true || boton1.getText().equals(boton2.getText())==true|| boton2.getText().equals(boton1.getText())==true);
                }

                if(v.equals("U")){
                    boton3.setText("Unicornio");
                    imagen3.setImageResource(R.drawable.unicorniocaricatura);
                    do{
                        int random=rnd.nextInt(10);
                        boton1.setText(""+animales.get(random).nombre);
                        imagen1.setImageResource(animales.get(random).imagen);
                        Random rnd2=new Random();
                        int random2=rnd2.nextInt(10);
                        boton2.setText(""+animales.get(random2).nombre);
                        imagen2.setImageResource(animales.get(random2).imagen);
                    }while(boton3.getText().equals(boton1.getText())==true || boton3.getText().equals(boton2.getText())==true || boton1.getText().equals(boton2.getText())==true|| boton2.getText().equals(boton1.getText())==true);
                }
                break;
        }
        int i = 0;
        imagenmen.setImageResource(i);
    }
}

class animales{
    String nombre;
    int imagen;
}
