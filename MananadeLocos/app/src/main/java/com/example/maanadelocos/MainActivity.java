package com.example.maanadelocos;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;

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
        ImageView imagen = findViewById(R.id.imagen);

        Button boton1 = findViewById(R.id.boton1);
        Button boton2 = findViewById(R.id.boton2);
        ConstraintLayout fondo = findViewById(R.id.fondo);

        MediaPlayer calle = MediaPlayer.create(this, R.raw.sound_street);
        MediaPlayer abre = MediaPlayer.create(this, R.raw.abrir);
        MediaPlayer cierra = MediaPlayer.create(this, R.raw.cerrar);


        //Cuando se termine la historia saltará a la pantalla de fin.
        Intent intent = new Intent(MainActivity.this, Game_over.class);

        imagen.setVisibility(View.INVISIBLE);

        // Avanzar
        boton2.setOnClickListener(view -> {
            cajatexto.setText("Maki se está apunto de dormir, otra vez, cuando escucha unos ruidos extraños procedentes de su armario.");
            dialogo.setText("- ¿Qué serán esos ruidos? - piensa.\n" + "- ¿Debería ir a echar un vistazo al armario?");
            boton1.setText("Abrir el armario");
            boton2.setText("No abrir el armario");

            // Maki abre el armario
            boton1.setOnClickListener(view1 -> {
                boton1.setVisibility(view.INVISIBLE);
                boton2.setVisibility(view.INVISIBLE);
                cajatexto.setText("Maki, todavía no muy convencida, se levanta y va a revisar su armario, encontrandose, en su interior, algo que nunca se podría haber imaginado.");
                abre.start();
                imagen.setVisibility(view.VISIBLE);
                maki.setVisibility(view.INVISIBLE);
                //abre.stop();
                dialogo.setText("Ya iba siendo hora de que me abrieras, ¿No crees?\n" + "¿Te haces una ligera de lo que es dormir sobre zapatos con olor a pie durante años?");

                // Avanzar
                fondo.setOnClickListener(view2 -> {
                    cajatexto.setText("Un hombrecillo muy bajito, con orejas puntiagudas y pelo verde, aparece ante ella con los brazos cruzados y mirada de desaprobación.");
                    dialogo.setText("¿Pero qué...? ¡¿Quién narices eres tú y qué haces en mi armario?!");
                    imagen.setVisibility(view.INVISIBLE);
                    maki.setVisibility(view.VISIBLE);

                    // Avanzar
                    fondo.setOnClickListener(view3 -> {
                        imagen.setVisibility(view.VISIBLE);
                        maki.setVisibility(view.INVISIBLE);
                        dialogo.setText("Cierto, no me he presentado, me llamo Pixies y soy tu duende conciencia. Un placer");
                        cajatexto.setText("Pixies hace una reverencia, se engancha con un vestido y se enrrosca con él, quedando atrapado\nMaki no puede evitar reirse ante la torpeza del peliverde.");

                        // Avanzar
                        fondo.setOnClickListener(view4 -> {
                            cajatexto.setText("");
                            dialogo.setText("-Que por cierto, he de decirte que estoy muy decepcionado contigo señorita, que es eso de faltas a clase porque estás cansada?");
                            fondo.setOnClickListener(view5 -> {
                                maki.setVisibility(view.VISIBLE);
                                imagen.setVisibility(view.INVISIBLE);
                                dialogo.setText("-¿Duende de conciencia?");

                                // Avanzar
                                fondo.setOnClickListener(view6 -> {
                                    boton1.setText("Seguir escuchando");
                                    boton2.setText("Dar portazo");
                                    imagen.setVisibility(view.VISIBLE);
                                    maki.setVisibility(view.INVISIBLE);
                                    dialogo.setText("*Suspira*\n -Mira que eres lentita, si soy un duende de conciencia, mi misión es...");
                                    boton1.setVisibility(view.VISIBLE);
                                    boton2.setVisibility(view.VISIBLE);

                                    // Maki le da un portazo a pixies
                                    boton2.setOnClickListener(view7 -> {
                                        imagen.setVisibility(view.INVISIBLE);
                                        maki.setVisibility(view.VISIBLE);
                                        boton1.setVisibility(view.INVISIBLE);
                                        boton2.setVisibility(view.INVISIBLE);
                                        cajatexto.setText("Maki le cierra la puerta del armario en la cara.");
                                        cierra.start();
                                        dialogo.setText("-¿Que acaba de pasar?\n *Suenan las tripas* \n -Bueno, se lo que sea se queda ahí, voy a bajar a desayunar.");

                                        //Avanzar
                                        fondo.setOnClickListener(view8 -> {
                                            fondo.setBackgroundResource(R.drawable.casa);
                                            imagen.setImageResource(R.drawable.inu);
                                            imagen.setVisibility(view.VISIBLE);
                                            cajatexto.setText("Maki baja a la cocina, donde ve a su mascota Inu soltado junto a la puerta, y este le lloriquea para sallir.");
                                            dialogo.setText("-Buenos dias Inu, primero voy a desayunar y luego vemos si vamos a pasear");
                                            fondo.setOnClickListener(view9 -> {
                                                cajatexto.setText("(Maki termina de desayunar)");
                                                dialogo.setText("-En realidad estoy muy cansada Inu, no se si tumbarme un rato antes de salir");
                                                boton1.setText("Sacar perro");
                                                boton2.setText("Tumbarse en el sofa");
                                                boton1.setVisibility(view.VISIBLE);
                                                boton2.setVisibility(view.VISIBLE);

                                                // Maki saca a pasear a Inu
                                                boton1.setOnClickListener(view10 -> {
                                                    cajatexto.setText("Maki le pone la correa a Inu y salen a dar un paseo a la calle.");
                                                    dialogo.setText("-Inu traeme la correa que vamos a salir a la calle.");
                                                    boton1.setVisibility(view.INVISIBLE);
                                                    boton2.setVisibility(view.INVISIBLE);

                                                    // Avanzar
                                                    fondo.setOnClickListener(view11 -> {
                                                        fondo.setBackgroundResource(R.drawable.parada);
                                                        calle.start();
                                                        dialogo.setVisibility(view.INVISIBLE);
                                                        cajatexto.setText("Despues de un rato paseando, Maki escucha que alguien la llama a lo lejos  y se voltea para ver quien es.");

                                                        // Avanzar
                                                        fondo.setOnClickListener(view12 -> {
                                                            calle.stop();
                                                            dialogo.setVisibility(view.VISIBLE);
                                                            maki.setVisibility(view.INVISIBLE);
                                                            imagen.setImageResource(R.drawable.miss_aoi);
                                                            imagen.setVisibility(view.VISIBLE);
                                                            dialogo.setText("-Señorita Kanroji, Por qué no ha asistido a clase?");

                                                            // Avanzar
                                                            fondo.setOnClickListener(view13 -> {
                                                                imagen.setVisibility(view.INVISIBLE);
                                                                maki.setVisibility(view.VISIBLE);
                                                                dialogo.setText("-Esque tenía que llevar a mi perro al veterinario y estamos de camino.");
                                                                fondo.setOnClickListener(view14 -> {
                                                                    maki.setVisibility(view.INVISIBLE);
                                                                    imagen.setVisibility(view.VISIBLE);
                                                                    dialogo.setText("-¿Que perro? Yo aqui solo veo a su hermano.");

                                                                    // Avanzar
                                                                    fondo.setOnClickListener(view15 -> {
                                                                        cajatexto.setText("Maki recuerda que no tiene perro y shockeada mira hacia Inu.");
                                                                        imagen.setImageResource(R.drawable.makoto);
                                                                        maki.setVisibility(view.VISIBLE);
                                                                        dialogo.setText("-¡¿MAKOTO?!");

                                                                        // Avanzar
                                                                        fondo.setOnClickListener(view16 -> {
                                                                            cajatexto.setText("Maki comienza a escuchar como la llaman en su cabeza y se despierta en su habitación.");
                                                                            fondo.setOnClickListener(view17 -> {
                                                                                startActivity(intent);
                                                                            });
                                                                        });
                                                                    });
                                                                });
                                                            });
                                                        });
                                                    });
                                                });

                                                //Maki no saca a inu a pasear
                                                boton2.setOnClickListener(view10 -> {
                                                    imagen.setVisibility(view.INVISIBLE);
                                                    boton1.setVisibility(view.INVISIBLE);
                                                    boton2.setVisibility(view.INVISIBLE);
                                                    dialogo.setText("-Lo siento Inu, hoy estoy realmente cansada y necesito tumbarme un poco, más tarde de saco de paseo.");
                                                    cajatexto.setText("Maki se tumba en el sofa a ver la television y se queda dormida hasta que una voz la despierta de su sueño.");

                                                    // Avanzar
                                                    fondo.setOnClickListener(view11 -> {
                                                        startActivity(intent);
                                                    });
                                                });
                                            });
                                        });
                                    });

                                    //Maki sigue escuchando a pixies
                                    boton1.setOnClickListener(view7 -> {
                                        boton1.setVisibility(view.INVISIBLE);
                                        boton2.setVisibility(view.INVISIBLE);
                                        cajatexto.setText("Maki sigue escuchando a pixies pero le aburre tanto qu se queda dormida, hasta que una voz la despierta de su sueño.");
                                        dialogo.setText("-Guiarte por el buen camino, enseñarte a ser responsable...");

                                        // Avanzar
                                        fondo.setOnClickListener(view8 -> {
                                            startActivity(intent);
                                        });
                                    });
                                });
                            });
                        });
                    });
                });
            });

            // Maki no abre el armario
            boton2.setOnClickListener(view1 -> {
                boton1.setVisibility(view.INVISIBLE);
                boton2.setVisibility(view.INVISIBLE);
                dialogo.setVisibility(view.INVISIBLE);
                cajatexto.setText("Maki ignora el sonido y sigue durmiendo hasta que una voz la despierta.");

                // Avanzar
                fondo.setOnClickListener(view2 -> {
                    startActivity(intent);
                });
            });
        });

        // Maki va a clase
        boton1.setOnClickListener(view -> {
            cajatexto.setText("Maki se prepara para ir a clase y sale de su casa hacia la parada de bus.");
            dialogo.setVisibility(view.INVISIBLE);
            boton1.setVisibility(view.INVISIBLE);
            boton2.setVisibility(view.INVISIBLE);

            // Avanzar
            fondo.setOnClickListener(view1 -> {
                fondo.setBackgroundResource(R.drawable.parada);
                cajatexto.setText("Maki llega a la parada y revisa la hora en su reloj.");
                dialogo.setText("-¡M*****!¡He perdido el bus!¿Y ahora que?");
                dialogo.setVisibility(view.VISIBLE);
                boton1.setText("Ir andando a clase");
                boton2.setText("Volver a casa");
                boton1.setVisibility(view.VISIBLE);
                boton2.setVisibility(view.VISIBLE);

                // Maki va andando a clase
                boton1.setOnClickListener(view2 -> {
                    boton1.setVisibility(view.INVISIBLE);
                    boton2.setVisibility(view.INVISIBLE);
                    fondo.setBackgroundResource(R.drawable.instituto);
                    imagen.setImageResource(R.drawable.miss_aoi);
                    cajatexto.setText("Maki va andando pero llega tarde, aun así, se dispone a entrar en el instituto cuando la subdirectora la ve y la llama.");
                    dialogo.setVisibility(view.INVISIBLE);

                    // Avanzar
                    fondo.setOnClickListener(view3 -> {
                        maki.setVisibility(view.INVISIBLE);
                        imagen.setVisibility(view.VISIBLE);
                        dialogo.setText("-Señorita Kanroji, ¿Le parecen estas horas para llegar?");
                        dialogo.setVisibility(view.VISIBLE);

                        // Avanzar
                        fondo.setOnClickListener(view4 -> {
                            imagen.setVisibility(view.INVISIBLE);
                            maki.setVisibility(view.VISIBLE);
                            dialogo.setText("-Lo siento Miss Aoi, es que he perdido el autobus por lo que he tenido que venir andando desde mi casa...");

                            // Avanzar
                            fondo.setOnClickListener(view5 -> {
                                maki.setVisibility(view.INVISIBLE);
                                imagen.setVisibility(view.VISIBLE);
                                dialogo.setText("-Eso no es mi problema, la falta de asistencia ya está puesta, la proxima vez levantese antes.");

                               // Avanzar
                                fondo.setOnClickListener(view6 -> {
                                    maki.setVisibility(view.VISIBLE);
                                    imagen.setVisibility(view.INVISIBLE);
                                    dialogo.setText("-¿Puedo ir entrar a clase?");

                                    //Avanzar
                                    fondo.setOnClickListener(view7 -> {
                                        imagen.setVisibility(view.VISIBLE);
                                        maki.setVisibility(view.INVISIBLE);
                                        dialogo.setText("-No, ahora debe esperar a que empiece la siguiente clase.");

                                        // Avanzar
                                        fondo.setOnClickListener(view8 -> {
                                            boton1.setText("Irse a casa");
                                            boton2.setText("Esperar");
                                            boton1.setVisibility(view.VISIBLE);
                                            boton2.setVisibility(view.VISIBLE);

                                            // Maki se va a casa
                                            boton1.setOnClickListener(view9 -> {
                                                boton1.setVisibility(view.INVISIBLE);
                                                boton2.setVisibility(view.INVISIBLE);
                                                imagen.setVisibility(view.INVISIBLE);
                                                maki.setVisibility(view.VISIBLE);
                                                fondo.setBackgroundResource(R.drawable.casa);
                                                dialogo.setVisibility(view.INVISIBLE);
                                                cajatexto.setText("Maki se va a casa y como tiene que esperar a que vuelva su hermano del colegio, se tumba en el sofa y se queda dormida.");

                                                // Avanzar
                                                fondo.setOnClickListener(view10 -> {
                                                    startActivity(intent);
                                                });
                                            });

                                            // Maki espera a la siguiente clase
                                            boton2.setOnClickListener(view9 -> {
                                                imagen.setVisibility(view.INVISIBLE);
                                                maki.setVisibility(view.VISIBLE);
                                                boton1.setVisibility(view.INVISIBLE);
                                                boton2.setVisibility(view.INVISIBLE);
                                                dialogo.setVisibility(view.INVISIBLE);
                                                cajatexto.setText("Maki espera 50min sentad fuera eschuchando música hasta que empieza la siguiente clase y entra.");

                                                // Avanzar
                                                fondo.setOnClickListener(view10 -> {
                                                    startActivity(intent);
                                                });
                                            });
                                        });
                                    });
                                });
                            });
                        });
                    });
                });

                // Maki vuelve a casa
                boton2.setOnClickListener(view2 -> {
                    boton1.setVisibility(view.INVISIBLE);
                    boton2.setVisibility(view.INVISIBLE);
                    fondo.setBackgroundResource(R.drawable.casa);
                    dialogo.setVisibility(view.INVISIBLE);
                    cajatexto.setText("Maki se va a casa y como tiene que esperar a que vuelva su hermano del colegio, se tumba en el sofa y se queda dormida.");

                    // Avanzar
                    fondo.setOnClickListener(view10 -> {
                        startActivity(intent);
                    });
                });
            });
        });

    }
}