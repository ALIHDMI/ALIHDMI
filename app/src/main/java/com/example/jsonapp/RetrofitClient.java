package com.example.jsonapp;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static Retrofit retrofit = null;

    static Retrofit getClient() {

        retrofit = new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();



        return retrofit;

    }
}
