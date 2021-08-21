package com.destiny.angelsquaddatabase.Activity.FLD;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.destiny.angelsquaddatabase.Adapter.AdapterAngel;
import com.destiny.angelsquaddatabase.Model.AngelDataFLD;
import com.destiny.angelsquaddatabase.Model.AngelDataFlamingVita;
import com.destiny.angelsquaddatabase.Model.Model;
import com.destiny.angelsquaddatabase.R;

import java.util.ArrayList;

public class ListAngelFLDActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_angel_f_l_d);
        recyclerView = findViewById(R.id.recycler);
        GetData();
    }
    private void GetData(){
        pList.addAll(AngelDataFLD.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterAngel adapterAngel = new AdapterAngel(this,"FLD");
        adapterAngel.setList(pList);
        recyclerView.setAdapter(adapterAngel);
    }
}