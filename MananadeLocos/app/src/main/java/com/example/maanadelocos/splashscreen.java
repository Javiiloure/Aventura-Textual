
package com.example.maanadelocos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slapshscreen);

        ImageView portada = findViewById(R.id.portada);
        MediaPlayer inicio = MediaPlayer.create(this, R.raw.inicio);
        inicio.start();
        portada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cuando se pulse la pantalla saltará al MainActivity con la primera escena.
                Intent i = new Intent(splashscreen.this,MainActivity.class);
                inicio.stop();
                startActivity(i);
            }
        });

    }
}