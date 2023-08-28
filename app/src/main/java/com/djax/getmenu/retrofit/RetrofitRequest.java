package com.djax.getmenu.retrofit;

import com.djax.getmenu.appconstant.AppConstant;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitRequest {

    public static Retrofit retrofit;

    public static Retrofit getRetrofitInstance(){

        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(AppConstant.BaseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

}
