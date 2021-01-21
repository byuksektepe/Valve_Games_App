package com.h5190068.berkant_yuksektepe_final.network;

import com.h5190068.berkant_yuksektepe_final.models.ValveModel;

import java.util.List;


import io.reactivex.Observable;
import retrofit2.http.GET;

public interface ServiceApi {

    @GET("valvegames.json")
    Observable<List<ValveModel>> getValveGames();

}
