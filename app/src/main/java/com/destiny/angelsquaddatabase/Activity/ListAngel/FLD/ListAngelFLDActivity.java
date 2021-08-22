package com.destiny.angelsquaddatabase.Activity.ListAngel.FLD;

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
import com.destiny.angelsquaddatabase.Model.AngelDataFLD;
import com.destiny.angelsquaddatabase.Model.Model;
import com.destiny.angelsquaddatabase.R;

import java.util.ArrayList;

public class ListAngelFLDActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    ImageView Faction;
    RelativeLayout Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_angel_f_l_d);
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
                .load(destiny.Checker("FLD"))
                .apply(new RequestOptions().override(200, 200))
                .into(Faction);
        pList.addAll(AngelDataFLD.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterAngel adapterAngel = new AdapterAngel(this,"FLD");
        adapterAngel.setList(pList);
        recyclerView.setAdapter(adapterAngel);
    }
}