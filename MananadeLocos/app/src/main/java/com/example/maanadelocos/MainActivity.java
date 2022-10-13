package com.example.maanadelocos;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView cajatexto = (TextView) findViewById(R.id.cajatexto1);
        TextView dialogo = (TextView) findViewById(R.id.dialogo);
        ImageView maki = (ImageView) findViewById(R.id.maki);
        Button boton1 = (Button) findViewById(R.id.boton1);
        Button boton2 = (Button) findViewById(R.id.boton2);

        boton2.setOnClickListener(view -> {
            cajatexto.setText("Maki se acuesta en cama otra vwz y al rato empieza a escuchar unos ruidos extraños quesalen de su armario.");
            dialogo.setText("¿Qué será ese ruido?¿Debería ver que hay dentro del armario?");
            boton1.setText("Abrir el armario");
            boton2.setText("No abrir el armario.");
            boton1.setOnClickListener(view1 -> {
                cajatexto.setText("Maki se levanta y abre el armario para encontrarse con algo que nunca se imaginaría.");
            });
        });

        boton1.setOnClickListener( view -> {
            System.out.println("Maki ha ido a clase");
        });

    }
}