package com.destiny.angelsquaddatabase.Activity.FormasiArena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.destiny.angelsquaddatabase.Adapter.AdapterAbout;
import com.destiny.angelsquaddatabase.Adapter.AdapterFormation;
import com.destiny.angelsquaddatabase.Model.AboutUsData;
import com.destiny.angelsquaddatabase.Model.FormasiArenaData;
import com.destiny.angelsquaddatabase.Model.Model;
import com.destiny.angelsquaddatabase.R;

import java.util.ArrayList;

public class ListFormasiArenaActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_formasi_arena);
        recyclerView = findViewById(R.id.recycler);
        GetData();
    }

    private void GetData(){
        pList.addAll(FormasiArenaData.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterFormation adapterAngel = new AdapterFormation(this);
        adapterAngel.setList(pList);
        recyclerView.setAdapter(adapterAngel);
    }
}