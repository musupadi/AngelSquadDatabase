package com.destiny.angelsquaddatabase.Activity.ListAngel.Jude;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.angelsquaddatabase.Adapter.AdapterAngel;
import com.destiny.angelsquaddatabase.Method.Destiny;
import com.destiny.angelsquaddatabase.Model.ListAngel.AngelDataJude;
import com.destiny.angelsquaddatabase.Model.Model;
import com.destiny.angelsquaddatabase.R;

import java.util.ArrayList;

public class ListAngelJudeActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    ImageView Faction;
    RelativeLayout Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_angel_jude);
        recyclerView = findViewById(R.id.recycler);
        GetData();
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    private void GetData(){
        Destiny destiny = new Destiny();
        Back = findViewById(R.id.relativeBack);
        Faction = findViewById(R.id.ivFaction);
        Glide.with(this)
                .load(destiny.Checker("JUDE"))
                .apply(new RequestOptions().override(200, 200))
                .into(Faction);
        pList.addAll(AngelDataJude.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterAngel adapterAngel = new AdapterAngel(this,"JUDE");
        adapterAngel.setList(pList);
        recyclerView.setAdapter(adapterAngel);
    }
}