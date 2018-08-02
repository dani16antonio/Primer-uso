package com.uaresafe.uaresafe_test2.Modelo;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WebServices {
    @GET("apks")
        //https://api.koodous.com/apks?=b873189f66e5734115313e5928a3960f6b799330
    Call<Peticion> getPet(@Query("search")String app, @Query("Authorization") String key);
    @GET("apks/{sha256}")
    Call<DatoAPI> getPet2(@Path("sha256") String hash, @Query("Authorization") String key);
    @GET("apks")
    Call<List<DatoAPI>> getTask(@Query("search")String[] app, @Query("Authorization") String key);
}