package com.h5190068.berkant_yuksektepe_final.util;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.h5190068.berkant_yuksektepe_final.R;

public class GlideUtil {

    public  static  void hiddenImage(Context context, String url, ImageView image)
    {
        Glide.with(context)
                .load(url)
                .error(R.drawable.hidden_image)
                .centerCrop()
                .into(image);
    }
}
