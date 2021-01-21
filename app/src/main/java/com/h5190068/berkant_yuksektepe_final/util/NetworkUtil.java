package com.h5190068.berkant_yuksektepe_final.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetworkUtil {
    public static boolean netCheck(Context context){

        ConnectivityManager connMng= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo netInfo= connMng.getActiveNetworkInfo();

        if (netInfo!= null && netInfo.isAvailable() && netInfo.isConnected())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
