package com.example.maanadelocos;

import static android.view.View.INVISIBLE;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView cajatexto = findViewById(R.id.cajatexto1);
        TextView dialogo = (TextView) findViewById(R.id.dialogo);
        ImageView maki = findViewById(R.id.maki);
        ImageView pixies = findViewById(R.id.pixies);
        Button boton1 = findViewById(R.id.boton1);
        Button boton2 = findViewById(R.id.boton2);
        ConstraintLayout fondo = findViewById(R.id.fondo);
        ImageView inu = findViewById(R.id.inu);

        pixies.setVisibility(INVISIBLE);
        inu.setVisibility(INVISIBLE);
        boton2.setOnClickListener(view -> {
            cajatexto.setText("Maki se está apunto de dormir, otra vez, cuando escucha unos ruidos extraños procedentes de su armario.");
            dialogo.setText("- ¿Qué serán esos ruidos? - piensa.\n" + "- ¿Debería ir a echar un vistazo al armario?");
            boton1.setText("Abrir el armario");
            boton2.setText("No abrir el armario");
            boton1.setOnClickListener(view1 -> {
                boton1.setVisibility(view.INVISIBLE);
                boton2.setVisibility(view.INVISIBLE);
                cajatexto.setText("Maki, todavía no muy convencida, se levanta y va a revisar su armario, encontrandose, en su interior, algo que nunca se podría haber imaginado.");
                pixies.setVisibility(view.VISIBLE);
                maki.setVisibility(view.INVISIBLE);
                dialogo.setText("Ya iba siendo hora de que me abrieras, ¿No crees?\n" + "¿Te haces una ligera de lo que es dormir sobre zapatos con olor a pie durante años?");
                fondo.setOnClickListener(view2 -> {
                    cajatexto.setText("Un hombrecillo muy bajito, con orejas puntiagudas y pelo verde, aparece ante ella con los brazos cruzados y mirada de desaprobación.");
                    dialogo.setText("¿Pero qué...? ¡¿Quién narices eres tú y qué haces en mi armario?!");
                    pixies.setVisibility(view.INVISIBLE);
                    maki.setVisibility(view.VISIBLE);
                    fondo.setOnClickListener(view3 -> {
                        pixies.setVisibility(view.VISIBLE);
                        maki.setVisibility(view.INVISIBLE);
                        dialogo.setText("Cierto, no me he presentado, me llamo Pixies y soy tu duende conciencia. Un placer");
                        cajatexto.setText("Pixies hace una reverencia, se engancha con un vestido y se enrrosca con él, quedando atrapado\nMaki no puede evitar reirse ante la torpeza del peliverde.");
                        fondo.setOnClickListener(view4 -> {
                            cajatexto.setText("");
                            dialogo.setText("-Que por cierto, he de decirte que estoy muy decepcionado contigo señorita, que es eso de faltas a clase porque estás cansada?");
                            fondo.setOnClickListener(view5 -> {
                                maki.setVisibility(view.VISIBLE);
                                pixies.setVisibility(view.INVISIBLE);
                                dialogo.setText("-¿Duende de conciencia?");
                                fondo.setOnClickListener(view6 -> {
                                    boton1.setText("Seguir escuchando");
                                    boton2.setText("Dar portazo");
                                    pixies.setVisibility(view.VISIBLE);
                                    maki.setVisibility(view.INVISIBLE);
                                    dialogo.setText("*Suspira*\n -Mira que eres lentita, si soy un duende de conciencia, mi misión es...");
                                    boton1.setVisibility(view.VISIBLE);
                                    boton2.setVisibility(view.VISIBLE);
                                    boton2.setOnClickListener(view7 -> {
                                        pixies.setVisibility(view.INVISIBLE);
                                        maki.setVisibility(view.VISIBLE);
                                        boton1.setVisibility(view.INVISIBLE);
                                        boton2.setVisibility(view.INVISIBLE);
                                        cajatexto.setText("Maki le cierra la puerta del armario en la cara.");
                                        dialogo.setText("-¿Que acaba de pasar?\n *Suenan las tripas* \n -Bueno, se lo que sea se queda ahí, voy a bajar a desayunar.");

                                        fondo.setOnClickListener(view8 -> {
                                            fondo.setBackgroundResource(R.drawable.casa);
                                            inu.setVisibility(view.VISIBLE);
                                            cajatexto.setText("Maki baja a la cocina, donde ve a su mascota Inu soltado junto a la puerta, y este le lloriquea para sallir.");
                                            dialogo.setText("-Buenos dias Inu, primero voy a desayunar y luego vemos si vamos a pasear");
                                            fondo.setOnClickListener(view9 -> {
                                                cajatexto.setText("(Maki termina de desayunar)");
                                                dialogo.setText("-En realidad estoy muy cansada Inu, no se si tumbarme un rato antes de salir");
                                                boton1.setText("Sacar perro");
                                                boton2.setText("Tumbarse en el sofa");
                                                boton1.setVisibility(view.VISIBLE);
                                                boton1.setVisibility(view.VISIBLE);
                                            });
                                        });
                                    });
                                    //boton1.setOnClickListener(); Sigue escuchando


                                });
                            });
                        });
                    });
                });
            });
            //boton2.setOnClickListener(); Maki no abre el armario
        });

        boton1.setOnClickListener(view -> {
            // System.out.println("Maki ha ido a clase");
        });

    }
}