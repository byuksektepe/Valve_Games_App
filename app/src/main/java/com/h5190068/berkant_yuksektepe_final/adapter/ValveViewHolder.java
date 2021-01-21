package com.h5190068.berkant_yuksektepe_final.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.h5190068.berkant_yuksektepe_final.R;

public class ValveViewHolder extends RecyclerView.ViewHolder {
    ImageView imgGameCover;
    TextView txtGameTitle, txtGameGenre, txtGameDate;

    public ValveViewHolder(@NonNull View cardView, ValveAdapter.OnItemClickListener onItemClickListener) {
        super(cardView);
        imgGameCover = cardView.findViewById(R.id.imgValve);
        txtGameTitle = cardView.findViewById(R.id.txtGameTitle);
        txtGameGenre = cardView.findViewById(R.id.txtGameGenre);
        txtGameDate = cardView.findViewById(R.id.txtReleaseDate);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onClick(getAdapterPosition());
            }
        });
    }
}
