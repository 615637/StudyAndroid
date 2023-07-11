package com.example.project02_lastproject.common;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface RetrofitInterface {

    @FormUrlEncoded
    @POST
    Call<String> clientPostMethod(@Url String url, @FieldMap HashMap<String, Object> paramMap);
}
