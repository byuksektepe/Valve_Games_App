package com.h5190068.berkant_yuksektepe_final.activity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.h5190068.berkant_yuksektepe_final.R;
import com.h5190068.berkant_yuksektepe_final.models.ValveModel;
import com.h5190068.berkant_yuksektepe_final.util.Const;
import com.h5190068.berkant_yuksektepe_final.util.GlideUtil;
import com.h5190068.berkant_yuksektepe_final.util.NesneUtil;

public class GameDetailActivity extends AppCompatActivity {

    ImageView topGameCover;
    TextView gameTitle;
    TextView gameDesc;
    TextView gameOp1;
    TextView gameOp2;
    TextView gameOp3;
    TextView gameOp4;
    TextView gameOp5;
    TextView gameOp6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_detail);
        initialize();
    }

    private void initialize() {

        topGameCover = findViewById(R.id.topGameCover);
        gameTitle = findViewById(R.id.gameTitle);
        gameDesc = findViewById(R.id.gameDesc);
        gameOp1 = findViewById(R.id.gameOp1);
        gameOp2 = findViewById(R.id.gameOp2);
        gameOp3 = findViewById(R.id.gameOp3);
        gameOp4 = findViewById(R.id.gameOp4);
        gameOp5 = findViewById(R.id.gameOp5);
        gameOp6 = findViewById(R.id.gameOp6);

        String movedGameStr = getIntent().getStringExtra(Const.CLICK_GAME_TITLE);
        ValveModel valveModel = NesneUtil.jsonStrToValveModel(movedGameStr);

        GlideUtil.hiddenImage(getApplicationContext(), valveModel.getGovdeURL(), topGameCover);

        gameTitle.setText(valveModel.getOyunAdi());
        gameDesc.setText(valveModel.getOyunAciklamasi());
        gameOp1.setText(valveModel.getCikisTarihi());
        gameOp2.setText(valveModel.getYayimlayan());
        gameOp3.setText(valveModel.getOyunTuru());
        gameOp4.setText(valveModel.getOyunModu());
        gameOp5.setText(valveModel.getOyunMotoru());
        gameOp6.setText(valveModel.getOyunPlatform());

    }
}