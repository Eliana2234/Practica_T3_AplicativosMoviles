package com.example.practica_3_aplicativosmoviles;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.practica_3_aplicativosmoviles.Adapters.Pokemon_Adapter;
import com.example.practica_3_aplicativosmoviles.Entities.Pokemones;
import com.example.practica_3_aplicativosmoviles.Services.Pokemon_Service;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Activity_Resultados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        RecyclerView rvPokemones = findViewById(R.id.rvResultados);
        rvPokemones.setHasFixedSize(true);
        rvPokemones.setLayoutManager(new LinearLayoutManager(this));

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://upn.lumenes.tk/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        List<Pokemones> pokemonesList = new ArrayList<>();
        Pokemones picachu = new Pokemones();
        picachu.setNombre("Pikachu");
        picachu.setTipo("Electrico");
        picachu.setImagen("https://pngimg.com/uploads/pokemon/pokemon_PNG9.png");
        picachu.setLatitud(0);
        picachu.setLongitud(0);
        pokemonesList.add(picachu);

        Pokemones charmander = new Pokemones();
        charmander.setNombre("Charmander");
        charmander.setTipo("Fuego");
        charmander.setImagen("https://images.wikidexcdn.net/mwuploads/wikidex/5/56/latest/20190805232004/Charmander.png");
        charmander.setLatitud(0);
        charmander.setLongitud(0);
        pokemonesList.add(charmander);

        Pokemones bulbasour = new Pokemones();
        bulbasour.setNombre("bulbasour");
        bulbasour.setTipo("Agua");
        bulbasour.setImagen("https://i.pinimg.com/originals/d6/61/96/d66196beb60d306a966ea39ed11c2b3d.png");
        bulbasour.setLatitud(0);
        bulbasour.setLongitud(0);
        pokemonesList.add(bulbasour);

        Pokemones eevie = new Pokemones();
        eevie.setNombre("Eevie");
        eevie.setTipo("TIerra");
        eevie.setImagen("https://p1.hiclipart.com/preview/860/19/709/eevee-sitting-pokemon-eevee-png-clipart.jpg");
        eevie.setLatitud(0);
        eevie.setLongitud(0);
        pokemonesList.add(eevie);

        Pokemones Pidget = new Pokemones();
        Pidget.setNombre("Pidget");
        Pidget.setTipo("Aire");
        Pidget.setImagen("https://static.pokemonpets.com/images/monsters-images-800-800/16-Pidgey.png");
        Pidget.setLatitud(0);
        Pidget.setLongitud(0);
        pokemonesList.add(Pidget);

        Pokemones psyduck = new Pokemones();
        psyduck.setNombre("psyduck");
        psyduck.setTipo("Agua");
        psyduck.setImagen("https://w0.pngwave.com/png/274/360/psyduck-pokemon-go-pokemon-x-and-y-pikachu-pokemon-go-png-clip-art.png");
        psyduck.setLatitud(0);
        psyduck.setLongitud(0);
        pokemonesList.add(psyduck);


        Pokemon_Adapter adapter = new Pokemon_Adapter(pokemonesList);
        rvPokemones.setAdapter(adapter);

        /*Pokemon_Service services = retrofit.create(Pokemon_Service.class);
        services.allPokemones().enqueue(new Callback<List<Pokemones>>() {
            @Override
            public void onResponse(Call<List<Pokemones>> call, Response<List<Pokemones>> response) {
                Pokemon_Adapter adapter = new Pokemon_Adapter(response.body());
                rvPokemones.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Pokemones>> call, Throwable t) {
            }
        });*/
    }
}