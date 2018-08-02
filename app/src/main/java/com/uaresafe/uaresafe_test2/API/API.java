package com.uaresafe.uaresafe_test2.API;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API {
    public static final String BASE_URL="https://api.koodous.com/";
    public static final String API_KEY="b873189f66e5734115313e5928a3960f6b799330";
    public static Retrofit retrofit=null;
    public static Retrofit getRetrofit(){
        if (retrofit==null)

        {
            HttpLoggingInterceptor httpLoggingInterceptor=new HttpLoggingInterceptor();
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient okHttpClient =new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();
            retrofit= new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(okHttpClient)
                    .build();
        }
        return retrofit;
    }
}
