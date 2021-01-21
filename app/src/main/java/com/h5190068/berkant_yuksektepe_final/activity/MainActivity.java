package com.h5190068.berkant_yuksektepe_final.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

import androidx.appcompat.app.AppCompatActivity;

import com.h5190068.berkant_yuksektepe_final.R;
import com.h5190068.berkant_yuksektepe_final.util.AlertUtil;
import com.h5190068.berkant_yuksektepe_final.util.Const;
import com.h5190068.berkant_yuksektepe_final.util.NetworkUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startTimer();
    }

    private void startTimer(){
        CountDownTimer timer = new CountDownTimer(Const.TIMER_MS, Const.TIMER_INTERVAL) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                openScreen();

            }
        };
        timer.start();
    }

    private void openScreen() {
        if(NetworkUtil.netCheck(getApplicationContext())){
            Intent intent = new Intent(getApplicationContext(), ListActivity.class);
            startActivity(intent);
            finish();
        }else{
            AlertUtil.appAlert(this, getString(R.string.no_connection), getString(R.string.sure_for_connect), true);
        }
    }

}