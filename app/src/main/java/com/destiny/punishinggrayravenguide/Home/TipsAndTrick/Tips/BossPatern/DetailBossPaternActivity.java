package com.destiny.punishinggrayravenguide.Home.TipsAndTrick.Tips.BossPatern;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.destiny.punishinggrayravenguide.R;
import com.destiny.punishinggrayravenguide.SharedPreference.DB_Helper;
import com.google.android.gms.ads.interstitial.InterstitialAd;

import io.paperdb.Paper;

public class DetailBossPaternActivity extends AppCompatActivity {
    DB_Helper dbHelper;
    String Lang;
    TextView tvNamaList,tvName,tvTips,Tips;
    ImageView Gambar;
    String GAMBAR,NAME,DESKRIPSI;
    RelativeLayout Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_boss_patern);
        tvNamaList  = findViewById(R.id.tvNamaList);
        tvName = findViewById(R.id.tvName);
        tvTips = findViewById(R.id.tvTips);
        Tips = findViewById(R.id.Tips);
        Gambar = findViewById(R.id.ivImage);
        Back = findViewById(R.id.relativeBack);
        Intent intent = getIntent();
        GAMBAR = intent.getExtras().getString("GAMBAR");
        NAME = intent.getExtras().getString("NAME");
        DESKRIPSI = intent.getExtras().getString("DESKRIPSI");
        Paper.init(this);
        dbHelper = new DB_Helper(this);
        Cursor cursor2 = dbHelper.checkLANG();
        if (cursor2.getCount()>0){
            while (cursor2.moveToNext()){
                Lang = cursor2.getString(0);
            }
        }
        Gambar.setImageResource(Integer.parseInt(GAMBAR));
        tvNamaList.setText(NAME);
        tvName.setText(NAME);
        if (Lang.equals("English")){
            tvTips.setText("Tips & Trick");
        }else{
            tvTips.setText("Tips & Trik");
        }
        Tips.setText(DESKRIPSI);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}