package com.destiny.angelsquaddatabase.Activity.ListAngel.Wolf;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.angelsquaddatabase.Method.Destiny;
import com.destiny.angelsquaddatabase.R;

public class DetailAngelWolfActivity extends AppCompatActivity {
    String ID,NAMA,GAMBAR,DESKRIPSI,VA,FACTION,REALNAME,WEAPON,RARITY;
    TextView tvNama,tvNamaAsli,tvVA,tvSenjata,tvFaksi,tvDeskripsi,tvRarity;
    ImageView Gambar,GambarFaction;
    RelativeLayout Back;
    TextView tvDetailNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_angel_wolf);

        Destiny destiny = new Destiny();
        Intent intent = getIntent();
        ID = intent.getExtras().getString("ID");
        NAMA = intent.getExtras().getString("NAMA");
        GAMBAR = intent.getExtras().getString("GAMBAR");
        DESKRIPSI = intent.getExtras().getString("DESKRIPSI");
        VA = intent.getExtras().getString("VA");
        FACTION = intent.getExtras().getString("FACTION");
        REALNAME = intent.getExtras().getString("REALNAME");
        WEAPON = intent.getExtras().getString("WEAPON");
        RARITY = intent.getExtras().getString("RARITY");

        Declaration();
        tvNama.setText(NAMA);
        tvDeskripsi.setText(DESKRIPSI);
        tvVA.setText(VA);
        tvFaksi.setText(FACTION);
        tvNamaAsli.setText(REALNAME);
        tvSenjata.setText(WEAPON);
        tvRarity.setText(RARITY);
        tvDetailNama.setText(NAMA+" - "+REALNAME);
        Glide.with(this)
                .load(GAMBAR)
                .apply(new RequestOptions().override(200, 200))
                .into(Gambar);
        Glide.with(this)
                .load(destiny.Checker(FACTION))
                .apply(new RequestOptions().override(200, 200))
                .into(GambarFaction);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    private void Declaration(){
        Back = findViewById(R.id.relativeBack);
        tvDetailNama = findViewById(R.id.tvNamaDetail);
        tvNama = findViewById(R.id.tvNama);
        tvNamaAsli = findViewById(R.id.tvRealName);
        tvVA = findViewById(R.id.tvVA);
        tvSenjata = findViewById(R.id.tvSenjata);
        tvFaksi = findViewById(R.id.tvFaksi);
        tvDeskripsi = findViewById(R.id.tvDeskripsi);
        tvRarity = findViewById(R.id.tvRarity);
        Gambar = findViewById(R.id.ivImage);
        GambarFaction = findViewById(R.id.ivImageFaction);
    }
}