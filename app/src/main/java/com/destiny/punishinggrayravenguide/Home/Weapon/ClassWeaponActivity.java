package com.destiny.punishinggrayravenguide.Home.Weapon;

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
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.destiny.punishinggrayravenguide.Adapter.AdapterCategoryWeapon;
import com.destiny.punishinggrayravenguide.HomeActivity;
import com.destiny.punishinggrayravenguide.Method.Destiny;
import com.destiny.punishinggrayravenguide.Model.Indonesia.WeaponCategoryDataID;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.Model.English.WeaponCategoryDataEN;
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

public class ClassWeaponActivity extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    DB_Helper dbHelper;
    String Count;
    String Lang;


    LinearLayout Whole,Loading;
    Destiny destiny;
    TextView tvNamaList;
    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    RelativeLayout Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_weapon);
        recyclerView = findViewById(R.id.recycler);
        tvNamaList = findViewById(R.id.tvNamaList);
        Back = findViewById(R.id.relativeBack);

        dbHelper = new DB_Helper(this);
        Paper.init(this);


        Cursor cursor2 = dbHelper.checkLANG();
        if (cursor2.getCount()>0){
            while (cursor2.moveToNext()){
                Lang = cursor2.getString(0);
            }
        }
        destiny= new Destiny();
        Whole = findViewById(R.id.linearWhole);
        Loading = findViewById(R.id.linearLoading);
        Loading.setVisibility(View.GONE);
        dbHelper = new DB_Helper(this);
        Cursor cursor = dbHelper.checkADS();
        if (cursor.getCount()>0){
            while (cursor.moveToNext()){
                Count = cursor.getString(0);
            }
        }
        if (Integer.parseInt(Count)>=destiny.CountADS()){
            Whole.setAlpha(0.3f);
            Loading.setVisibility(View.VISIBLE);
            MobileAds.initialize(this, new OnInitializationCompleteListener() {
                @Override
                public void onInitializationComplete(InitializationStatus initializationStatus) {
                    AD();
                }
            });
        }else{
            Loading.setVisibility(View.GONE);
            Whole.setAlpha(1.0f);
            GetData();
        }
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    private void AD(){
        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(this,destiny.DestinyADIntersentialWeapon(), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;
                Log.i("<ADMOB>", "onAdLoaded");
                Loading.setVisibility(View.GONE);
                Whole.setAlpha(1.0f);
                if (mInterstitialAd !=null){
                    mInterstitialAd.show(ClassWeaponActivity.this);
                }else{
                    GetData();
                }
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        Log.d("TAG", "The ad was dismissed.");
                        dbHelper.ResetADS();
                        Refresh();
//                        Intent intent = new Intent(MainActivity.this,HomeActivity.class);
//                        startActivity(intent);
//                        finishAffinity();
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        // Called when fullscreen content failed to show.
                        Log.d("AD Error : ", adError.toString());
                        dbHelper.ResetADS();
                    }

                    @Override
                    public void onAdShowedFullScreenContent() {
                        // Called when fullscreen content is shown.
                        // Make sure to set your reference to null so you don't
                        // show it a second time.
                        mInterstitialAd = null;
                        Log.d("TAG", "The ad was shown.");
                        dbHelper.ResetADS();
                    }
                });
            }

            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
//                Toast.makeText(MainActivity.this, "AD ERROR ?", Toast.LENGTH_SHORT).show();
                Loading.setVisibility(View.GONE);
                Whole.setAlpha(1.0f);
                Log.i("TAG", loadAdError.getMessage());
                mInterstitialAd = null;
                GetData();
            }
        });

    }
    private void GetData(){
        String language = Paper.book().read("language");
        if(language == null)
            Paper.book().write("language","en");
        Context context = LocaleHelper.setLocale(this,language);
        Resources resources = context.getResources();
        Back = findViewById(R.id.relativeBack);
        tvNamaList.setText(resources.getString(R.string.category_weapon));
        Back = findViewById(R.id.relativeBack);
        if (Lang.equals("English")){
            pList.addAll(WeaponCategoryDataEN.getListData());
        }else{
            pList.addAll(WeaponCategoryDataID.getListData());
        }
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        AdapterCategoryWeapon adapterConstruct = new AdapterCategoryWeapon(this);
        adapterConstruct.setList(pList);
        recyclerView.setAdapter(adapterConstruct);
    }

    private void Refresh(){
        dbHelper.SaveCountADS("0");
        Intent intent = new Intent(ClassWeaponActivity.this,ClassWeaponActivity.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(ClassWeaponActivity.this,HomeActivity.class);
        startActivity(intent);
    }
}