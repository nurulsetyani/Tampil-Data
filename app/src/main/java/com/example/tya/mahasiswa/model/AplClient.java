package com.example.tya.mahasiswa.model;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AplClient {
    public static final String BASE_URL = "http://192.168.43.168/laraku/public/";

    private static Retrofit mRetrofit;

    public static Retrofit getRetrofit() {
        if (mRetrofit==null){
            mRetrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return mRetrofit;
    }
}
