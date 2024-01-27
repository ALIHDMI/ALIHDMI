package com.example.jsonapp;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitInterface {


        @GET("v2/pokemon")
        Call<PokemonResponse> loadRepo();

}
