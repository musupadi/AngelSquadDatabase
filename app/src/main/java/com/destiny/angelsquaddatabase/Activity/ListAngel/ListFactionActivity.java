package com.destiny.angelsquaddatabase.Activity.ListAngel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.angelsquaddatabase.Activity.ListAngel.ArgentWing.ListAngelArgentWingActivity;
import com.destiny.angelsquaddatabase.Activity.ListAngel.FLD.ListAngelFLDActivity;
import com.destiny.angelsquaddatabase.Activity.ListAngel.FlamingVita.ListAngelFlamingVitaActivity;
import com.destiny.angelsquaddatabase.Activity.ListAngel.Jude.ListAngelJudeActivity;
import com.destiny.angelsquaddatabase.Activity.ListAngel.SaintMaria.ListAngelSaintMariaActivity;
import com.destiny.angelsquaddatabase.Activity.ListAngel.Wolf.ListAngelWolfActivity;
import com.destiny.angelsquaddatabase.R;

public class ListFactionActivity extends AppCompatActivity {
    CardView cSaintMaria,cFlamingVita,cWOLF,cJude,cArgentWing,cFLD;
    ImageView iSaintMaria,iFlamingVita,iWOLF,iJude,iArgentWing,iFLD;
    RelativeLayout Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_faction);
        Declaration();
        GetImage();
        OnClick();
    }
    private void OnClick(){
        cSaintMaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListFactionActivity.this, ListAngelSaintMariaActivity.class);
                startActivity(intent);
            }
        });
        cFlamingVita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListFactionActivity.this, ListAngelFlamingVitaActivity.class);
                startActivity(intent);
            }
        });
        cWOLF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListFactionActivity.this, ListAngelWolfActivity.class);
                startActivity(intent);
            }
        });
        cJude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListFactionActivity.this, ListAngelJudeActivity.class);
                startActivity(intent);
            }
        });
        cArgentWing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListFactionActivity.this, ListAngelArgentWingActivity.class);
                startActivity(intent);
            }
        });
        cFLD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListFactionActivity.this, ListAngelFLDActivity.class);
                startActivity(intent);
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    private void Declaration(){
        Back = findViewById(R.id.relativeBack);
        cSaintMaria = findViewById(R.id.cardSaintMaria);
        cFlamingVita = findViewById(R.id.cardFlamingVita);
        cWOLF = findViewById(R.id.cardWolf);
        cJude = findViewById(R.id.cardJude);
        cArgentWing = findViewById(R.id.cardArgentWing);
        cFLD = findViewById(R.id.cardFLD);

        iSaintMaria = findViewById(R.id.srcLogoSaintMaria);
        iFlamingVita = findViewById(R.id.srcLogoFlamingVita);
        iWOLF = findViewById(R.id.srcLogoWolf);
        iJude = findViewById(R.id.srcLogoJude);
        iArgentWing = findViewById(R.id.srcArgentWing);
        iFLD = findViewById(R.id.srcFLD);
    }
    private void GetImage(){
        Glide.with(this)
                .load("https://angelsquad.lytogame.com/karakter/assets/images/detail/saint/default-character.png")
                .apply(new RequestOptions().override(200, 200))
                .into(iSaintMaria);
        Glide.with(this)
                .load("https://angelsquad.lytogame.com/karakter/assets/images/detail/flaming/default-character.png")
                .apply(new RequestOptions().override(200, 200))
                .into(iFlamingVita);
        Glide.with(this)
                .load("https://angelsquad.lytogame.com/karakter/assets/images/detail/wolf/default-character.png")
                .apply(new RequestOptions().override(200, 200))
                .into(iWOLF);
        Glide.with(this)
                .load("https://angelsquad.lytogame.com/karakter/assets/images/detail/jude/default-character.png")
                .apply(new RequestOptions().override(200, 200))
                .into(iJude);
        Glide.with(this)
                .load("https://angelsquad.lytogame.com/karakter/assets/images/detail/argent/default-character.png")
                .apply(new RequestOptions().override(200, 200))
                .into(iArgentWing);
        Glide.with(this)
                .load("https://angelsquad.lytogame.com/karakter/assets/images/detail/fld/default-character.png")
                .apply(new RequestOptions().override(200, 200))
                .into(iFLD);
    }
}