package com.destiny.angelsquaddatabase.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.destiny.angelsquaddatabase.Activity.FormasiArena.ListFormasiArenaActivity;
import com.destiny.angelsquaddatabase.Activity.ListAngel.ListFactionActivity;
import com.destiny.angelsquaddatabase.Activity.TipsAndTrick.TipsAndTrickFactionActivity;
import com.destiny.angelsquaddatabase.Adapter.AdapterBerita;
import com.destiny.angelsquaddatabase.Adapter.SliderAdapterBanner;
import com.destiny.angelsquaddatabase.Model.BeritaData;
import com.destiny.angelsquaddatabase.Model.FormasiArenaData;
import com.destiny.angelsquaddatabase.Model.Model;
import com.destiny.angelsquaddatabase.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private SliderAdapterBanner sliderAdapter;
    private TextView[] mDots;
    private int CurrentPage;
    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    CardView listAngel,Formasi,Combo,Tips;
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerBerita);
        mSlideViewPager = view.findViewById(R.id.SlideViewPager);
        mDotLayout = view.findViewById(R.id.dotSlayout);
        listAngel = view.findViewById(R.id.cardListAngel);
        Formasi = view.findViewById(R.id.cardFormasi);
        Combo = view.findViewById(R.id.cardCombo);
        Tips = view.findViewById(R.id.cardTips);
        GetData();
        sliderAdapter = new SliderAdapterBanner(getActivity());
        mSlideViewPager.setAdapter(sliderAdapter);
        addDotsIndicator(0);
        listAngel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListFactionActivity.class);
                startActivity(intent);
            }
        });
        Formasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ListFormasiArenaActivity.class);
                startActivity(intent);
            }
        });
        Combo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Fitur Jadwal World Combo Angel Sedang Dibuat", Toast.LENGTH_SHORT).show();
            }
        });
        Tips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TipsAndTrickFactionActivity.class);
                startActivity(intent);
            }
        });
    }

    private void GetData(){
        pList.addAll(BeritaData.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        AdapterBerita adapterBerita = new AdapterBerita(getActivity());
        adapterBerita.setList(pList);
        recyclerView.setAdapter(adapterBerita);
    }

    ViewPager.OnPageChangeListener viewList = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
            CurrentPage = i;

            if(CurrentPage==0){
//                btnNext.setEnabled(true);
//                btnBack.setEnabled(false);
//                btnBack.setVisibility(View.INVISIBLE);
//                btnNext.setText("Next");
//                btnBack.setText("");
            }else if(i==mDots.length-1){
//                btnNext.setEnabled(true);
//                btnBack.setEnabled(true);
//                btnBack.setVisibility(View.VISIBLE);
//                btnNext.setText("Finish");
//                btnBack.setText("Back");
            }else{
//                btnNext.setEnabled(true);
//                btnBack.setEnabled(true);
//                btnBack.setVisibility(View.VISIBLE);
//                btnNext.setText("Next");
//                btnBack.setText("back");
            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };

    public void addDotsIndicator(int posistion){
        mDots = new TextView[sliderAdapter.slide_nama.length];
        mDotLayout.removeAllViews();
        for (int i = 0;i <mDots.length;i++){
            mDots[i] = new TextView(getActivity());
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorTransparent));

            mDotLayout.addView(mDots[i]);
        }
        if(mDots.length > 0){
            mDots[posistion].setTextColor(getResources().getColor(R.color.colorWhite));
        }
    }
}