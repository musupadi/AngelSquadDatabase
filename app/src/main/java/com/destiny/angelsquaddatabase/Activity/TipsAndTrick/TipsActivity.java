package com.destiny.angelsquaddatabase.Activity.TipsAndTrick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.angelsquaddatabase.Adapter.AdapterTipsAndTrick;
import com.destiny.angelsquaddatabase.Method.Destiny;
import com.destiny.angelsquaddatabase.Model.Model;
import com.destiny.angelsquaddatabase.Model.TipsAndTrick.AngelDataTipsArgentWing;
import com.destiny.angelsquaddatabase.R;

import java.util.ArrayList;

public class TipsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    ImageView Faction;
    RelativeLayout Back;
    String FACTION;
    TextView tvNamaList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        recyclerView = findViewById(R.id.recycler);
        tvNamaList = findViewById(R.id.tvNamaList);
        GetData();
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    private void GetData(){
        Intent intent = getIntent();
        FACTION = intent.getExtras().getString("FACTION");
        tvNamaList.setText("Tips & Trick Angel "+FACTION);
        Destiny destiny = new Destiny();
        Back = findViewById(R.id.relativeBack);
        Faction = findViewById(R.id.ivFaction);
        Glide.with(this)
                .load(destiny.Checker(FACTION))
                .apply(new RequestOptions().override(200, 200))
                .into(Faction);
        if (FACTION.equals("Argent Wing")){
            pList.addAll(AngelDataTipsArgentWing.getListData());
        }else{
            pList.addAll(AngelDataTipsArgentWing.getListData());
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterTipsAndTrick adapterAngel = new AdapterTipsAndTrick(this,"Argent Wing");
        adapterAngel.setList(pList);
        recyclerView.setAdapter(adapterAngel);
    }
}