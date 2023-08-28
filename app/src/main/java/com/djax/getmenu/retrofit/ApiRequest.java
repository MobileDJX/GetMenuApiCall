package com.djax.getmenu.retrofit;

import com.djax.getmenu.responsebody.ResponseModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiRequest {

    @FormUrlEncoded
    @POST("getmenuname")
    Call<ResponseModel> getMenuName(@Field("levelid") int levelId, @Field("userid") int userId, @Field("projectId") int projectId);

}
