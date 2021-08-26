package com.destiny.punishinggrayravenguide.Home.Roadmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.destiny.punishinggrayravenguide.Adapter.AdapterCharacterRoadmap;
import com.destiny.punishinggrayravenguide.Adapter.AdapterFutureContent;
import com.destiny.punishinggrayravenguide.Home.Construct.ClassConstructActivity;
import com.destiny.punishinggrayravenguide.Method.Destiny;
import com.destiny.punishinggrayravenguide.Model.FutureContentData;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.Model.RoadmapData;
import com.destiny.punishinggrayravenguide.R;
import com.destiny.punishinggrayravenguide.SharedPreference.DB_Helper;
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

public class CharacterRoadmapActivity extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    DB_Helper dbHelper;
    String Count;
    LinearLayout Whole,Loading;
    Destiny destiny;

    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    ImageView Faction;
    RelativeLayout Back;
    TextView tvNamaList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_roadmap);
        recyclerView = findViewById(R.id.recycler);
        Back = findViewById(R.id.relativeBack);

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

        InterstitialAd.load(this,destiny.DestinyADIntersential(), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;
                Log.i("<ADMOB>", "onAdLoaded");
                Loading.setVisibility(View.GONE);
                Whole.setAlpha(1.0f);
                if (mInterstitialAd !=null){

                    mInterstitialAd.show(CharacterRoadmapActivity.this);
                }else{
                    GetData();
                }
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        Log.d("TAG", "The ad was dismissed.");
                        GetData();
                        dbHelper.ResetADS();
//                        Intent intent = new Intent(MainActivity.this,HomeActivity.class);
//                        startActivity(intent);
//                        finishAffinity();
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        // Called when fullscreen content failed to show.
                        Log.d("AD Error : ", adError.toString());
                        GetData();
                    }

                    @Override
                    public void onAdShowedFullScreenContent() {
                        // Called when fullscreen content is shown.
                        // Make sure to set your reference to null so you don't
                        // show it a second time.
                        mInterstitialAd = null;
                        Log.d("TAG", "The ad was shown.");
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
        Intent intent = getIntent();
        Destiny destiny = new Destiny();
        Back = findViewById(R.id.relativeBack);
        pList.addAll(RoadmapData.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterCharacterRoadmap roadmap = new AdapterCharacterRoadmap(this);
        roadmap.setList(pList);
        recyclerView.setAdapter(roadmap);
    }
}