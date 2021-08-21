package com.destiny.angelsquaddatabase.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.destiny.angelsquaddatabase.R;

public class SliderAdapterBanner extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapterBanner(Context context){
        this.context = context;
    }
    public int[] id ={
            0,
    };

    public int[] slide_image ={
            R.drawable.banner,
    };

    public String[] slide_nama ={
            "Welcome to Angel Squad DB",
    };


    @Override
    public int getCount() {
        return slide_nama.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_banner,container,false);

        ImageView Gambar = (ImageView)view.findViewById(R.id.ivBanner);
        TextView Text = (TextView)view.findViewById(R.id.tvText);

        Gambar.setImageResource(slide_image[position]);
        Text.setText(slide_nama[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);
    }
}
