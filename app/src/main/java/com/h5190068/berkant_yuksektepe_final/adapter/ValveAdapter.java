package com.h5190068.berkant_yuksektepe_final.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.h5190068.berkant_yuksektepe_final.R;
import com.h5190068.berkant_yuksektepe_final.models.ValveModel;
import com.h5190068.berkant_yuksektepe_final.util.GlideUtil;

import java.util.List;

public class ValveAdapter extends RecyclerView.Adapter<ValveViewHolder> {
    List<ValveModel> valveModels;
    Context context;
    OnItemClickListener onItemClickListener;

    @NonNull
    @Override
    public ValveViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_app, parent, false);
        return new ValveViewHolder(itemView, onItemClickListener);

    }

    @Override
    public void onBindViewHolder(@NonNull ValveViewHolder holder, int position) {
        GlideUtil.hiddenImage(context, valveModels.get(position).getKapakURL(), holder.imgGameCover);
        holder.txtGameTitle.setText(valveModels.get(position).getOyunAdi());
        holder.txtGameGenre.setText(valveModels.get(position).getOyunModu());
        holder.txtGameDate.setText(valveModels.get(position).getCikisTarihi());
    }

    @Override
    public int getItemCount() {
        return valveModels.size();
    }

    public interface OnItemClickListener{
        void onClick(int position);
    }

    public ValveAdapter(List<ValveModel> valveModels, Context context, OnItemClickListener onItemClickListener) {
        this.valveModels = valveModels;
        this.context = context;
        this.onItemClickListener = onItemClickListener;
    }
}
