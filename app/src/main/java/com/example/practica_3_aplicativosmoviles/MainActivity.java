package com.example.practica_3_aplicativosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMostrarPokemones = findViewById(R.id.btnVerPokemones);
        Button btnCrearPokemon = findViewById(R.id.btnCrearPokemones);

        btnMostrarPokemones.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent muestraPokemones = new Intent(getApplicationContext(),Activity_Resultados.class);
                startActivity(muestraPokemones);
            }
        });

        btnCrearPokemon.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        });
    }


}