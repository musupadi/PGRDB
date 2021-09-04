package com.destiny.punishinggrayravenguide.Home.TipsAndTrick.Tips.BossPatern;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.destiny.punishinggrayravenguide.Adapter.AdapterBossPatern;
import com.destiny.punishinggrayravenguide.Adapter.AdapterCategoryTips;
import com.destiny.punishinggrayravenguide.Home.TipsAndTrick.TipsAndTrickActivity;
import com.destiny.punishinggrayravenguide.HomeActivity;
import com.destiny.punishinggrayravenguide.Method.Destiny;
import com.destiny.punishinggrayravenguide.Model.Indonesia.TipsAndTrick.BossPaternID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.TipsAndTrickCategoryID;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;
import com.destiny.punishinggrayravenguide.SharedPreference.DB_Helper;
import com.destiny.punishinggrayravenguide.SharedPreference.LocaleHelper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import java.util.ArrayList;

import io.paperdb.Paper;

public class BossPaternActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    ImageView Faction;
    RelativeLayout Back;
    TextView tvNamaList;
    DB_Helper dbHelper;
    String Lang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss_patern);
        recyclerView = findViewById(R.id.recycler);
        Back = findViewById(R.id.relativeBack);
        tvNamaList = findViewById(R.id.tvNamaList);
        dbHelper = new DB_Helper(this);
        Cursor cursor2 = dbHelper.checkLANG();
        if (cursor2.getCount()>0){
            while (cursor2.moveToNext()){
                Lang = cursor2.getString(0);
            }
        }
        String language = Paper.book().read("language");
        if(language == null)
            Paper.book().write("language","en");
        Context context = LocaleHelper.setLocale(this,language);
        Resources resources = context.getResources();
        tvNamaList.setText(resources.getString(R.string.patern_boss));
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        GetData();
    }
    private void GetData(){
        Back = findViewById(R.id.relativeBack);
        if (Lang.equals("English")){
            pList.addAll(BossPaternID.getListData());
        }else{
            pList.addAll(BossPaternID.getListData());
        }
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        AdapterBossPatern futureContent = new AdapterBossPatern(this);
        futureContent.setList(pList);
        recyclerView.setAdapter(futureContent);
    }
}