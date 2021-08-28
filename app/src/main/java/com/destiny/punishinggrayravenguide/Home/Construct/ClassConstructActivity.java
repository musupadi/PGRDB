package com.destiny.punishinggrayravenguide.Home.Construct;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

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
import android.widget.Toast;

import com.destiny.punishinggrayravenguide.Method.Destiny;
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

import io.paperdb.Paper;

public class ClassConstructActivity extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    DB_Helper dbHelper;
    String Count;

    LinearLayout Whole,Loading;
    Destiny destiny;

    CardView All,B,A,S;
    TextView tvAll,tvB,tvA,tvS,tvName;
    RelativeLayout Back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_construct);
        All = findViewById(R.id.cardAll);
        B = findViewById(R.id.cardB);
        A = findViewById(R.id.cardA);
        S = findViewById(R.id.cardS);
        tvAll = findViewById(R.id.tvAllConstruct);
        tvB = findViewById(R.id.tvBConstruct);
        tvA = findViewById(R.id.tvAConstruct);
        tvS = findViewById(R.id.tvSConstruct);
        tvName = findViewById(R.id.tvNama);
        String language = Paper.book().read("language");
        if(language == null)
            Paper.book().write("language","en");
        Context context = LocaleHelper.setLocale(this,language);
        Resources resources = context.getResources();
        Back = findViewById(R.id.relativeBack);

        tvAll.setText(resources.getString(R.string.all)+" "+resources.getString(R.string.construct));
        tvB.setText("B "+resources.getString(R.string.construct));
        tvA.setText("A "+resources.getString(R.string.construct));
        tvS.setText("S "+resources.getString(R.string.construct));
        tvName.setText(resources.getString(R.string.kelas)+" "+resources.getString(R.string.construct));
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
            OnClick();
        }
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
                    mInterstitialAd.show(ClassConstructActivity.this);
                }else{
                    OnClick();
                }
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        Log.d("TAG", "The ad was dismissed.");
                        OnClick();
                        dbHelper.ResetADS();
//                        Intent intent = new Intent(MainActivity.this,HomeActivity.class);
//                        startActivity(intent);
//                        finishAffinity();
                    }

                    @Override
                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                        // Called when fullscreen content failed to show.
                        Log.d("AD Error : ", adError.toString());
                        dbHelper.ResetADS();
                        OnClick();
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
                OnClick();
            }
        });

    }
    private void OnClick(){
        All.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ClassConstructActivity.this, ListConstructActivity.class);
                i.putExtra("CLASS", "All");
                startActivity(i);
            }
        });
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ClassConstructActivity.this, ListConstructActivity.class);
                i.putExtra("CLASS", "B");
                startActivity(i);
            }
        });
        A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ClassConstructActivity.this, ListConstructActivity.class);
                i.putExtra("CLASS", "A");
                startActivity(i);
            }
        });
        S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ClassConstructActivity.this, ListConstructActivity.class);
                i.putExtra("CLASS", "S");
                startActivity(i);
            }
        });
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}