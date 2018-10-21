package com.example.infinity.aaa;


import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {
    @FormUrlEncoded
    @POST("get") //POJO
    Call<StItem> loginRequest(@Field("login") String login,
                              @Field("password") String password);

//    @Headers({"Content-Type:text/html/charset=UTF-8"})
//    @GET("get")
//    Call<RequestBody> response(@Query("login") String  login,
//                               @Query("password") String password);

}
