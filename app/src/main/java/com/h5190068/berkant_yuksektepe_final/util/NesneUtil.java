package com.h5190068.berkant_yuksektepe_final.util;

import com.google.gson.Gson;
import com.h5190068.berkant_yuksektepe_final.models.ValveModel;

public class NesneUtil {

    public static String valveModelToJsonStr(ValveModel valveModel){

        Gson gson = new Gson();
        return gson.toJson(valveModel);

    }

    public static ValveModel jsonStrToValveModel(String jsonString){

        Gson gson = new Gson();

        return gson.fromJson(jsonString , ValveModel.class);
    }
}
