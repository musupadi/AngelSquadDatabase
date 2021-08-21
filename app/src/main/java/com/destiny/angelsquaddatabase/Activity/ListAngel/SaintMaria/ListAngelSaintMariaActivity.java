package com.destiny.angelsquaddatabase.Activity.ListAngel.SaintMaria;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.destiny.angelsquaddatabase.Adapter.AdapterAngel;
import com.destiny.angelsquaddatabase.Model.AngelDataSaintMaria;
import com.destiny.angelsquaddatabase.Model.Model;
import com.destiny.angelsquaddatabase.R;

import java.util.ArrayList;

public class ListAngelSaintMariaActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_angel_saint_maria);
        recyclerView = findViewById(R.id.recycler);
        GetData();
    }
    private void GetData(){
        pList.addAll(AngelDataSaintMaria.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterAngel adapterAngel = new AdapterAngel(this,"Saint Maria");
        adapterAngel.setList(pList);
        recyclerView.setAdapter(adapterAngel);
    }
}