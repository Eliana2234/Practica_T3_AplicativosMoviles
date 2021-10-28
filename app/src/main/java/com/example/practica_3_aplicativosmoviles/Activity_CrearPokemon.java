package com.example.practica_3_aplicativosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.practica_3_aplicativosmoviles.Entities.Pokemones;

public class Activity_CrearPokemon extends AppCompatActivity {

    private EditText etNombre;
    private EditText etTipo;
    private EditText etImagen;
    private EditText etLatitud;
    private EditText etLongitud;

    Button crear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_pokemon);

        etNombre = findViewById(R.id.etNombre);
        etTipo = findViewById(R.id.etTipo);
        etImagen = findViewById(R.id.etImagen);

        etLatitud = findViewById(R.id.etLatitud);
        etLongitud = findViewById(R.id.etLongitud);

        crear = findViewById(R.id.btnCrear);

        crear.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String nombre = etNombre.getText().toString();
                String tipo = etTipo.getText().toString();
                String imagen = etImagen.getText().toString();
                String latitud = etLatitud.getText().toString();
                String longitud = etLongitud.getText().toString();

                Pokemones pokemon = new Pokemones();
                pokemon.setNombre(nombre);
                pokemon.setTipo(tipo);
                pokemon.setImagen(imagen);
                pokemon.setLatitud(Double.parseDouble(latitud));
                pokemon.setLongitud(Double.parseDouble(longitud));
            }
        });
    }
}