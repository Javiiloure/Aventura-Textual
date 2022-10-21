package com.example.maanadelocos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class Game_over extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        MediaPlayer end = MediaPlayer.create(this, R.raw.end);
        ImageView fin = findViewById(R.id.fin);
        Button continuar = findViewById(R.id.continuar);
        Intent intent = new Intent(Game_over.this, MainActivity.class);
        end.start();
        fin.setOnClickListener(view -> {
            metodoCerrar();
        });
        continuar.setOnClickListener(view -> {
            end.stop();
            startActivity(intent);
        });
    }

    public void metodoCerrar()
    {
        //aquí cerramos el actícity actual
        finish();
        //creamos un nuevo intent de action_main para el cierre de todo lo que esté abierto
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
