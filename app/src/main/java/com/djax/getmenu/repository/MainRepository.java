package com.djax.getmenu.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.djax.getmenu.responsebody.ResponseModel;
import com.djax.getmenu.retrofit.ApiRequest;
import com.djax.getmenu.retrofit.RetrofitRequest;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainRepository {

    private final ApiRequest apiRequest;

    public MainRepository() {
       apiRequest = RetrofitRequest.getRetrofitInstance().create(ApiRequest.class);
    }

    public LiveData<ResponseModel> getResponseModelLiveData(){

        MutableLiveData<ResponseModel>  mutableLiveData = new MutableLiveData<>();

        apiRequest.getMenuName(2,62,2).enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                mutableLiveData.setValue( response.body());
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {
                mutableLiveData.setValue(null);

            }
        });
return  mutableLiveData;

    }
}
