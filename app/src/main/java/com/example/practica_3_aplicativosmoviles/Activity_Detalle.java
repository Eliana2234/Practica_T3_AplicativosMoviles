package com.example.practica_3_aplicativosmoviles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class Activity_Detalle extends AppCompatActivity {

    private TextView txtNombre;
    private TextView txtTipo;
    private ImageView txtImage;
    private double txtLatitud;
    private double txtLongitud;

    private Button btnUbicacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Intent intent = getIntent();

        String nombre = intent.getStringExtra("Nombre");
        String tipo = intent.getStringExtra("Tipo");
        String image = intent.getStringExtra("Imagen");
        String latitud = intent.getStringExtra("Latitud");
        String longitud = intent.getStringExtra("Longitud");

        txtNombre = findViewById(R.id.tvNombrePokemon);
        txtTipo = findViewById(R.id.tvTipoPokemon);
        btnUbicacion = findViewById(R.id.btnUbicacion);
        txtImage = findViewById(R.id.imagen);

        txtNombre.setText("Nombre: " + nombre);
        txtTipo.setText("Tipo: " + tipo);
        Picasso.get().load(image).resize (250, 250).into(txtImage);

        btnUbicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ubicacion = new Intent(getApplicationContext(),MapsActivity.class);
                ubicacion.putExtra("Latitud",latitud);
                ubicacion.putExtra("Longitud",longitud);

                startActivity(ubicacion);
            }
        });


    }
}