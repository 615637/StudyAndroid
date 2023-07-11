package com.example.project02_lastproject.common;

import retrofit2.Retrofit;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {

    public Retrofit postRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.0.119:8080/middle/")
                .addConverterFactory(ScalarsConverterFactory.create())
                .build();
        return retrofit;
    }
}
