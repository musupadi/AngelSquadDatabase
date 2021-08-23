package com.destiny.angelsquaddatabase.Activity.TipsAndTrick;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.angelsquaddatabase.Activity.TipsAndTrick.Tabbed.TabCounterFragment;
import com.destiny.angelsquaddatabase.Activity.TipsAndTrick.Tabbed.TabIntroFragment;
import com.destiny.angelsquaddatabase.Activity.TipsAndTrick.Tabbed.TabKekuranganFragment;
import com.destiny.angelsquaddatabase.Activity.TipsAndTrick.Tabbed.TabKelebihanFragment;
import com.destiny.angelsquaddatabase.Activity.TipsAndTrick.Tabbed.TabTipsFragment;
import com.destiny.angelsquaddatabase.Adapter.SliderAdapterBanner;
import com.destiny.angelsquaddatabase.Adapter.SliderAdapterTips;
import com.destiny.angelsquaddatabase.Adapter.TabPagerAdapter;
import com.destiny.angelsquaddatabase.Method.Destiny;
import com.destiny.angelsquaddatabase.R;
import com.google.android.material.tabs.TabLayout;

public class DetailTipsAngelActivity extends AppCompatActivity {
    String ID, NAMA, GAMBAR, DESKRIPSI, VA, FACTION, REALNAME, WEAPON, RARITY,INTRO,KELEBIHAN,KEKURANGAN,TIPS,COUNTER,AUTHOR;
    TextView tvNama, tvNamaAsli, tvVA, tvSenjata, tvFaksi, tvRarity;
    ImageView Gambar, GambarFaction;
    RelativeLayout Back;
    TextView tvDetailNama;
    TextView Author,Kelebihan,Kekurangan,Intro,Counter,Tips;
//    private ViewPager mSlideViewPager;
//    private LinearLayout mDotLayout;
//    private SliderAdapterTips sliderAdapter;
//    private TextView[] mDots;
//    private int CurrentPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tips_angel);

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
        REALNAME = intent.getExtras().getString("REALNAME");
        WEAPON = intent.getExtras().getString("WEAPON");
        RARITY = intent.getExtras().getString("RARITY");
        REALNAME = intent.getExtras().getString("REALNAME");
        WEAPON = intent.getExtras().getString("WEAPON");
        RARITY = intent.getExtras().getString("RARITY");
        WEAPON = intent.getExtras().getString("WEAPON");
        RARITY = intent.getExtras().getString("RARITY");
        WEAPON = intent.getExtras().getString("WEAPON");
        RARITY = intent.getExtras().getString("RARITY");
        WEAPON = intent.getExtras().getString("WEAPON");
        RARITY = intent.getExtras().getString("RARITY");
        INTRO = intent.getExtras().getString("INTRO");
        KELEBIHAN = intent.getExtras().getString("KELEBIHAN");
        KEKURANGAN = intent.getExtras().getString("KEKURANGAN");
        TIPS = intent.getExtras().getString("TIPS");
        COUNTER = intent.getExtras().getString("COUNTER");
        AUTHOR = intent.getExtras().getString("AUTHOR");
        Declaration();
        tvNama.setText(NAMA);
        tvVA.setText(VA);
        tvFaksi.setText(FACTION);
        tvNamaAsli.setText(REALNAME);
        tvSenjata.setText(WEAPON);
        tvRarity.setText(RARITY);
        tvDetailNama.setText(NAMA + " - " + REALNAME);
        Author.setText(AUTHOR);
        Intro.setText(INTRO);
        Kelebihan.setText(KELEBIHAN);
        Kekurangan.setText(KEKURANGAN);
        Counter.setText(COUNTER);
        Tips.setText(TIPS);
        if (AUTHOR.equals("halibel")){
            Author.setText("Author : Anonim");
        }else{
            Author.setText("Author : "+AUTHOR);
        }
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

    private void Declaration() {
        Back = findViewById(R.id.relativeBack);
        tvDetailNama = findViewById(R.id.tvNamaDetail);
        tvNama = findViewById(R.id.tvNama);
        tvNamaAsli = findViewById(R.id.tvRealName);
        tvVA = findViewById(R.id.tvVA);
        tvSenjata = findViewById(R.id.tvSenjata);
        tvFaksi = findViewById(R.id.tvFaksi);
        tvRarity = findViewById(R.id.tvRarity);
        Gambar = findViewById(R.id.ivImage);
        GambarFaction = findViewById(R.id.ivImageFaction);
        Author = findViewById(R.id.tvAuthor);
        Kelebihan = findViewById(R.id.tvKelebihan);
        Kekurangan = findViewById(R.id.tvKekurangan);
        Intro = findViewById(R.id.tvPengenalan);
        Counter = findViewById(R.id.tvCounter);
        Tips = findViewById(R.id.tvTips);
    }
}