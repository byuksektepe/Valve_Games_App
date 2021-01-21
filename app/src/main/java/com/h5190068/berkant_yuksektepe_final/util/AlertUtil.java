package com.h5190068.berkant_yuksektepe_final.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.Settings;

import com.h5190068.berkant_yuksektepe_final.R;

public class AlertUtil {
    public static void appAlert(Activity act, String head, String body, boolean checkAlt){
        AlertDialog.Builder bld = new AlertDialog.Builder(act);
        bld.setTitle(head);
        bld.setMessage(body);

        if(checkAlt){
            bld.setPositiveButton(R.string.ayarlara_git, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    Intent intent = new Intent(Settings.ACTION_SETTINGS);
                    act.startActivity(intent);
                    act.finish();
                }
            });
            bld.setNegativeButton(R.string.cikis, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    act.finish();
                }
            });
        }else{
            bld.setPositiveButton(R.string.et, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                    act.finish();
                }
            });
            bld.setNegativeButton(R.string.hy, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
        }
        bld.show();
    }
}
