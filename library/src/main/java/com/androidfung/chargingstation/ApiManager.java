package com.androidfung.chargingstation;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

/**
 * Created by fung on 3/4/2017.
 */

public class ApiManager {


    private static final String API_BASE_URL = "https://opendata.clp.com.hk/";



    public static ClpChargingStationService getService(OkHttpClient okHttpClient){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(SimpleXmlConverterFactory.create())
                .build();
        return retrofit.create(ClpChargingStationService.class);

    }



    public static ClpChargingStationService getService(){

        return getService(new OkHttpClient());

    }


}
