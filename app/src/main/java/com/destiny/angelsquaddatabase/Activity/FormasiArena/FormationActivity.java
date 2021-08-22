package com.destiny.angelsquaddatabase.Activity.FormasiArena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.angelsquaddatabase.R;

public class FormationActivity extends AppCompatActivity {
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12;
    TextView text1,text2,text3,text4,text6,text7,text8,text9,text10,text11,text12;
    ImageView Gambar,Core;
    TextView Nama,Username,CoreName;
    TextView tvForward,tvMiddle,tvBack;
    TextView FSendiri,FTeam;
    TextView MSendiri,MTeam;
    TextView BSendiri,BTeam;
    LinearLayout LF,LM,LB;

    String IMG1,IMG2,IMG3,IMG4,IMG5,IMG6,IMG7,IMG8,IMG9,IMG10,IMG11,IMG12;
    String TIMG1,TIMG2,TIMG3,TIMG4,TIMG5,TIMG6,TIMG7,TIMG8,TIMG9,TIMG10,TIMG11,TIMG12;
    String ROLE,NAME,USER,CORE,CORENAME,GAMBAR;

    Integer FORWARD = 0;
    Integer MIDDLE = 0;
    Integer BACK = 0;

    RelativeLayout Back;
    TextView tvDetailNama;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formation);
        Declaration();
        GetData();
        Logic();
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    private void Checker(ImageView img,String name){
        if (!name.equals(".")){
            Glide.with(this)
                    .load(name)
                    .apply(new RequestOptions().override(200, 200))
                    .into(img);
        }
    }
    private void Logic(){
        if (ROLE.equals("Developer")){
            Gambar.setImageResource(Integer.parseInt(GAMBAR));
        }else{
            Glide.with(this)
                    .load(GAMBAR)
                    .apply(new RequestOptions().override(200, 200))
                    .into(Gambar);
        }
        Glide.with(this)
                .load(CORE)
                .apply(new RequestOptions().override(200, 200))
                .into(Core);
        Nama.setText(NAME);
        Username.setText(USER);
        CoreName.setText(CORENAME);
        Checker(img1,IMG1);
        HitunganFront(IMG1);
        Checker(img2,IMG2);
        HitunganFront(IMG2);
        Checker(img3,IMG3);
        HitunganFront(IMG3);
        Checker(img4,IMG4);
        HitunganFront(IMG4);
        Checker(img5,IMG5);
        HitunganMiddle(IMG5);
        Checker(img6,IMG6);
        HitunganMiddle(IMG6);
        Checker(img7,IMG7);
        HitunganMiddle(IMG7);
        Checker(img8,IMG8);
        HitunganMiddle(IMG8);
        Checker(img9,IMG9);
        HitunganBack(IMG9);
        Checker(img10,IMG10);
        HitunganBack(IMG10);
        Checker(img11,IMG11);
        HitunganBack(IMG11);
        Checker(img12,IMG12);
        HitunganBack(IMG12);

        LogicForward();
        LogicMiddle();
        LogicBack();

    }
    private void HitunganFront(String img){
        if (img.equals(".")){
            FORWARD=FORWARD+0;
        }else{
            FORWARD=FORWARD+1;
        }
    }
    private void HitunganMiddle(String img){
        if (img.equals(".")){
            MIDDLE=MIDDLE+0;
        }else{
            MIDDLE=MIDDLE+1;
        }
    }
    private void HitunganBack(String img){
        if (img.equals(".")){
            BACK=BACK+0;
        }else{
            BACK=BACK+1;
        }
    }
    private void GetData(){
//        i.putExtra("ID", p.getId());
        Intent intent = getIntent();
        ROLE = intent.getExtras().getString("ROLE");
        NAME = intent.getExtras().getString("NAMA");
        USER = intent.getExtras().getString("USERID");
        CORE = intent.getExtras().getString("CORE");
        CORENAME = intent.getExtras().getString("CORENAME");
        GAMBAR = intent.getExtras().getString("GAMBAR");

        //Formation
        //1
        IMG1 = intent.getExtras().getString("IMG1");
        TIMG1 = intent.getExtras().getString("TIMG1");
        //2
        IMG2 = intent.getExtras().getString("IMG2");
        TIMG2 = intent.getExtras().getString("TIMG2");
        //3
        IMG3 = intent.getExtras().getString("IMG3");
        TIMG3 = intent.getExtras().getString("TIMG3");
        //4
        IMG4 = intent.getExtras().getString("IMG4");
        TIMG4 = intent.getExtras().getString("TIMG4");
        //5
        IMG5 = intent.getExtras().getString("IMG5");
        TIMG5 = intent.getExtras().getString("TIMG5");
        //6
        IMG6 = intent.getExtras().getString("IMG6");
        TIMG6 = intent.getExtras().getString("TIMG6");
        //7
        IMG7 = intent.getExtras().getString("IMG7");
        TIMG7 = intent.getExtras().getString("TIMG7");
        //8
        IMG8 = intent.getExtras().getString("IMG8");
        TIMG8 = intent.getExtras().getString("TIMG8");
        //9
        IMG9 = intent.getExtras().getString("IMG9");
        TIMG9 = intent.getExtras().getString("TIMG9");
        //10
        IMG10 = intent.getExtras().getString("IMG10");
        TIMG10 = intent.getExtras().getString("TIMG10");
        //11
        IMG11 = intent.getExtras().getString("IMG11");
        TIMG11 = intent.getExtras().getString("TIMG11");
        //8
        IMG12 = intent.getExtras().getString("IMG12");
        TIMG12 = intent.getExtras().getString("TIMG12");
        tvDetailNama.setText("Formasi "+USER);
    }
    private void LogicForward(){
        LF.setVisibility(View.VISIBLE);
        if (FORWARD==4){
            tvForward.setText("Depan : "+String.valueOf(FORWARD));
            FSendiri.setText("HP +45%");
            FTeam.setText("Pengurangan FInal Damage +10%");
        }else if (FORWARD==3){
            tvForward.setText("Depan : "+String.valueOf(FORWARD));
            FSendiri.setText("HP +30%");
            FTeam.setText("Pengurangan FInal Damage +6%");
        }else if (FORWARD==2){
            tvForward.setText("Depan : "+String.valueOf(FORWARD));
            FSendiri.setText("HP +15%");
            FTeam.setText("Pengurangan FInal Damage +3%");
        }else{
            LF.setVisibility(View.GONE);
        }
    }
    private void LogicMiddle(){
        LM.setVisibility(View.VISIBLE);
        if (MIDDLE == 4){
            tvMiddle.setText("Tengah : "+String.valueOf(MIDDLE));
            MSendiri.setText("Shield +56%\nMeningkatkan Final Damage +7.5%");
            MTeam.setText("Kecepetan Pemulihan Shield +48%");
        }else if (MIDDLE==3){
            tvMiddle.setText("Tengah : "+String.valueOf(MIDDLE));
            MSendiri.setText("Shield +37.5%\nMeningkatkan Final Damage +5%");
            MTeam.setText("Kecepetan Pemulihan Shield +32%");
        }else if (MIDDLE==2){
            tvMiddle.setText("Tengah : "+String.valueOf(MIDDLE));
            MSendiri.setText("Shield +18%\nMeningkatkan Final Damage +2.5%");
            MTeam.setText("Kecepetan Pemulihan Shield +16%");
        }else{
            LM.setVisibility(View.GONE);
        }
    }
    private void LogicBack(){
        LB.setVisibility(View.VISIBLE);
        if (BACK==4){
            tvBack.setText("Belakang : "+String.valueOf(BACK));
            BSendiri.setText("Meningkatkan Final Damage 15%");
            BTeam.setText("Meningkatkan Final Damage +11%");
        }else if (BACK==3){
            tvBack.setText("Belakang : "+String.valueOf(BACK));
            BSendiri.setText("Meningkatkan Final Damage 10%");
            BTeam.setText("Meningkatkan Final Damage +7%");
        }else if (BACK==2){
            tvBack.setText("Belakang : "+String.valueOf(BACK));
            BSendiri.setText("Meningkatkan Final Damage 5%");
            BTeam.setText("Meningkatkan Final Damage +3.5%");
        }else{
            LB.setVisibility(View.GONE);
        }
    }
    private void Declaration(){
        Back = findViewById(R.id.relativeBack);
        tvDetailNama = findViewById(R.id.tvNamaDetail);
        img1 = findViewById(R.id.ivImage1);
        img2 = findViewById(R.id.ivImage2);
        img3 = findViewById(R.id.ivImage3);
        img4 = findViewById(R.id.ivImage4);
        img5 = findViewById(R.id.ivImage5);
        img6 = findViewById(R.id.ivImage6);
        img7 = findViewById(R.id.ivImage7);
        img8 = findViewById(R.id.ivImage8);
        img9 = findViewById(R.id.ivImage9);
        img10 = findViewById(R.id.ivImage10);
        img11 = findViewById(R.id.ivImage11);
        img12 = findViewById(R.id.ivImage12);
        Gambar = findViewById(R.id.ivImage);
        Core = findViewById(R.id.ivImageTwo);
        Nama = findViewById(R.id.tvNama);
        Username = findViewById(R.id.tvDeskripsi);
        CoreName = findViewById(R.id.tvCoreName);
        tvForward = findViewById(R.id.tvForward);
        tvMiddle = findViewById(R.id.tvMiddle);
        tvBack = findViewById(R.id.tvBack);
        FSendiri = findViewById(R.id.tvBonusBarisan);
        FTeam = findViewById(R.id.tvBonusTeam);
        MSendiri = findViewById(R.id.tvBonusBarisanMiddle);
        MTeam = findViewById(R.id.tvBonusTeamMiddle);
        BSendiri = findViewById(R.id.tvBonusBarisanBack);
        BTeam = findViewById(R.id.tvBonusTeamBack);
        LF = findViewById(R.id.linearForward);
        LM = findViewById(R.id.linearMiddle);
        LB = findViewById(R.id.linearBack);
    }
}