package com.example.practica_3_aplicativosmoviles.Services;

import com.example.practica_3_aplicativosmoviles.Entities.Pokemones;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Pokemon_Service {

    @GET("pokemones/N00038949")
    Call<List<Pokemones>> allPokemones();

    @POST("")
    Call<Pokemones> create(@Body Pokemones pokemones);


}
