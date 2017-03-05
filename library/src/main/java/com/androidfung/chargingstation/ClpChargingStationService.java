package com.androidfung.chargingstation;

import android.support.annotation.StringDef;

import com.androidfung.chargingstation.model.ChargingStationData;

import java.lang.annotation.Retention;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Created by fung on 3/4/2017.
 */

public interface ClpChargingStationService {
    @Retention(SOURCE)
    @StringDef({
            LANG_CHINESE,
            LANG_ENGLISH,
    })

    public @interface Language {
    }
    public static final String LANG_CHINESE = "TC";
    public static final String LANG_ENGLISH = "EN";



    @GET("GetChargingSectionXML.aspx")
    Call<ChargingStationData> getEtaList(@Query("lang") @Language String language);

}
