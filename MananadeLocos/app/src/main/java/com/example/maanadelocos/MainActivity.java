package com.example.maanadelocos;
import static android.view.View.INVISIBLE;

import android.annotation.SuppressLint;
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

        pixies.setVisibility(INVISIBLE);
        boton2.setOnClickListener(view -> {
            cajatexto.setText("Maki se está apunto de dormir, otra vez, cuando escucha unos ruidos extraños procedentes de su armario.");
            dialogo.setText("- ¿Qué serán esos ruidos? - piensa.\n"+"- ¿Debería ir a echar un vistazo al armario?");
            boton1.setText("Abrir el armario");
            boton2.setText("No abrir el armario");
            boton1.setOnClickListener(view1 -> {
                cajatexto.setText("Maki, todavía no muy convencida, se levanta y va a revisar su armario, encontrandose, en su interior, algo que nunca se podría haber imaginado.");
                pixies.setVisibility(view.VISIBLE);
                maki.setVisibility(view.INVISIBLE);
                dialogo.setText("Ya iba siendo hora de que me abrieras, ¿No crees?\n" + "¿Te haces una ligera de lo que es dormir sobre zapatos con olor a pie durante años?");
            });
            fondo.setOnClickListener(view2 -> {
                cajatexto.setText("Un hombrecillo muy bajito, con orejas puntiagudas y pelo verde, aparece ante ella con los brazos cruzados y mirada de desaprobación.");
                dialogo.setText("¿Pero qué...? ¡¿Quién narices eres tú y qué haces en mi armario?!");
                pixies.setVisibility(view.INVISIBLE);
                maki.setVisibility(view.VISIBLE);
                dialogo.setText("Cierto, no me he presentado, me llamo Pixies y soy tu duende conciencia. Un placer");
                cajatexto.setText("Pixies hace una reverencia, se engancha con un vestido y se enrrosca con él, quedando atrapado.");
                cajatexto.setText("Maki no puede evitar reirse ante la torpeza del peliverde.");
            });

        });

        boton1.setOnClickListener( view -> {
           // System.out.println("Maki ha ido a clase");
        });

    }
}