package com.destiny.angelsquaddatabase.Activity.TipsAndTrick;

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
import com.destiny.angelsquaddatabase.R;

public class TipsAndTrickFactionActivity extends AppCompatActivity {
    CardView cSaintMaria,cFlamingVita,cWOLF,cJude,cArgentWing,cFLD;
    ImageView iSaintMaria,iFlamingVita,iWOLF,iJude,iArgentWing,iFLD;
    RelativeLayout Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips_and_trick_faction);
        Declaration();
        GetImage();
        OnClick();
    }
    private void OnClick(){
        cSaintMaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TipsAndTrickFactionActivity.this, "Tips And Trick untuk Saint Maria sedang Dibuat", Toast.LENGTH_SHORT).show();
            }
        });
        cFlamingVita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TipsAndTrickFactionActivity.this, "Tips And Trick untuk Flaming Vita sedang Dibuat", Toast.LENGTH_SHORT).show();
            }
        });
        cWOLF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TipsAndTrickFactionActivity.this, "Tips And Trick untuk WOLF sedang Dibuat", Toast.LENGTH_SHORT).show();
            }
        });
        cJude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TipsAndTrickFactionActivity.this, "Tips And Trick untuk JUDE sedang Dibuat", Toast.LENGTH_SHORT).show();
            }
        });
        cArgentWing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TipsAndTrickFactionActivity.this, TipsActivity.class);
                i.putExtra("FACTION", "Argent Wing");
                startActivity(i);
            }
        });
        cFLD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TipsAndTrickFactionActivity.this, "Tips And Trick untuk FLD sedang Dibuat", Toast.LENGTH_SHORT).show();
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