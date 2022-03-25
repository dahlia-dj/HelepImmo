package com.djoumessi.progmobile.helepimmo.common.remote;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
//import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit = null;



    public static Retrofit getClient(String url){
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

    public static Retrofit getLateClient(String url){
        OkHttpClient httpClient = new OkHttpClient().newBuilder()
                .retryOnConnectionFailure(true)
                .connectTimeout(2, TimeUnit.MINUTES)
                .readTimeout(60,TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .build();
        if(retrofit == null){
            retrofit = new Retrofit.Builder().baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient)
                    .build();
        }

        return retrofit;
    }

    public static Retrofit getRetrofit(String url){
        //if(retrofit == null){
        retrofit = new Retrofit.Builder().baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .build();
        //}

        return retrofit;
    }

}