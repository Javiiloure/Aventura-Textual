
package com.example.maanadelocos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class slapshscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slapshscreen);

        ImageView portada = findViewById(R.id.portada);

        portada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Cuando se pulse, las acciones que realicen se escriben aquí.

                Intent i = new Intent(slapshscreen.this,MainActivity.class);
                startActivity(i);
            }
        });
            }
}