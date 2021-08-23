package com.destiny.angelsquaddatabase.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.destiny.angelsquaddatabase.R;

public class SliderAdapterTips extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    String INTRO = "-";
    String KELEBIHAN = "-";
    String KEKURANGAN = "-";
    String TIPS = "-";
    String COUNTER = "-";
    public SliderAdapterTips(Context context,String INTRO,String KELEBIHAN,String KEKURANGAN,String TIPS,String COUNTER){
        this.context = context;
        this.INTRO = INTRO;
        this.KELEBIHAN = KELEBIHAN;
        this.KEKURANGAN = KEKURANGAN;
        this.TIPS= TIPS;
        this.COUNTER= COUNTER;
    }

    public int[] id ={
            0,
    };

    public int[] slide_image ={
            R.drawable.banner,
    };

    public String[] slide_nama ={
            "Introduksi",
            "Kelebihan",
            "Kekurangan",
            "Tips",
            "Counter"
    };

    public String[] slide_isi ={
            INTRO,
            KELEBIHAN,
            KEKURANGAN,
            TIPS,
            COUNTER
    };


    @Override
    public int getCount() {
        return slide_nama.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (LinearLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_tips,container,false);

        TextView Title = view.findViewById(R.id.tvTitle);
        TextView Text = view.findViewById(R.id.tvIsi);

        Title.setText(slide_nama[position]);
        Text.setText(slide_isi[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}
