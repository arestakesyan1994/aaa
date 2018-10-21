package com.example.infinity.aaa;


public class UtilsApi {

    public static final String BASE_URL_API ="http://app.profitdeco.com/mobile/";

    public static ApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(ApiService.class);
    }
}
