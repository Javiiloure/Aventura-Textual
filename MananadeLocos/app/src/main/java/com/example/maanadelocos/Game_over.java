package com.example.maanadelocos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class Game_over extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);


        ImageView fin = findViewById(R.id.fin);
        Button continuar = findViewById(R.id.continuar);
        //Intent in = new Intent(Game_over.this, MainActivity.class);
        finish();

        /*
        if (
                continuar.setOnClickListener(view ->
                        )) {

        }
        else {*/

        }
    }
