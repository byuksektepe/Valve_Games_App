package com.h5190068.berkant_yuksektepe_final.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.h5190068.berkant_yuksektepe_final.R;
import com.h5190068.berkant_yuksektepe_final.adapter.ValveAdapter;
import com.h5190068.berkant_yuksektepe_final.models.ValveModel;
import com.h5190068.berkant_yuksektepe_final.network.Service;
import com.h5190068.berkant_yuksektepe_final.util.AlertUtil;
import com.h5190068.berkant_yuksektepe_final.util.Const;
import com.h5190068.berkant_yuksektepe_final.util.NesneUtil;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ListActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        init();
    }

    private void init() {
        getValveGames();
    }

    @Override
    public void onBackPressed() {
        AlertUtil.appAlert(this, getString(R.string.are_you_sure), getString(R.string.exit_message), false);
    }

    private void initRecycleView(List<ValveModel> valveModelList) {
        recyclerView = findViewById(R.id.rcvGames);
        ValveAdapter valveAdapter = new ValveAdapter(valveModelList, getApplicationContext(), new ValveAdapter.OnItemClickListener() {
            @Override
            public void onClick(int position) {

                ValveModel clickValveModel = valveModelList.get(position);
                openDetails(clickValveModel);

            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(valveAdapter);
    }

    private void openDetails(ValveModel valveModel) {
            String clickedGameStr = NesneUtil.valveModelToJsonStr(valveModel);
            Intent intent = new Intent(getApplicationContext(), GameDetailActivity.class);
            intent.putExtra(Const.CLICK_GAME_TITLE, clickedGameStr);
            startActivity(intent);
    }

    void getValveGames(){
        ProgressDialog progressDialog = new ProgressDialog(ListActivity.this);
        new Service().getServiceApi().getValveGames()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<ValveModel>>() {
                    List<ValveModel> valveModels = new ArrayList<>();
                    @Override
                    public void onSubscribe(Disposable d) {
                        Log.e("RETROFIT", "onSubscribe : ");

                        progressDialog.setMessage(getString(R.string.loader));
                        progressDialog.show();

                    }


                    @Override
                    public void onNext(List<ValveModel> valveModelList) {
                        Log.e("RETROFIT", "onNext : ");
                        valveModels = valveModelList;

                    }

                    @Override
                    public void onError(Throwable e) {

                        Log.e("RETROFIT", "onError : " + e.getLocalizedMessage());

                    }

                    @Override
                    public void onComplete() {
                        Log.e("RETROFIT", "onComplete : ");

                        progressDialog.dismiss();

                        if (valveModels.size() > 0) {
                            initRecycleView(valveModels);
                        }
                    }
                });

    }
}