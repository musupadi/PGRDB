package com.destiny.punishinggrayravenguide.Home.Construct;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.destiny.punishinggrayravenguide.Adapter.AdapterConstruct;
import com.destiny.punishinggrayravenguide.Method.Destiny;
import com.destiny.punishinggrayravenguide.Model.English.AClassConstructEN;
import com.destiny.punishinggrayravenguide.Model.English.AllConstructEN;
import com.destiny.punishinggrayravenguide.Model.English.BClassConstructEN;
import com.destiny.punishinggrayravenguide.Model.Indonesia.AClassConstructID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.AllConstructID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.BClassConstructID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.SClassConstructID;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.Model.English.SClassConstructEN;
import com.destiny.punishinggrayravenguide.R;
import com.destiny.punishinggrayravenguide.SharedPreference.DB_Helper;
import com.destiny.punishinggrayravenguide.SharedPreference.LocaleHelper;
//import com.google.android.gms.ads.MobileAds;
//import com.google.android.gms.ads.initialization.InitializationStatus;
//import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;

import io.paperdb.Paper;

public class ListConstructActivity extends AppCompatActivity {
    String CLASS;
    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    ImageView Faction;
    RelativeLayout Back;
    TextView tvNamaList;

    DB_Helper dbHelper;
    String Count;
    String Lang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_construct);

        recyclerView = findViewById(R.id.recycler);
        tvNamaList = findViewById(R.id.tvNamaList);
        dbHelper = new DB_Helper(this);

        Paper.init(this);


        Cursor cursor = dbHelper.checkADS();
        if (cursor.getCount()>0){
            while (cursor.moveToNext()){
                Count = cursor.getString(0);
            }
        }
        Cursor cursor2 = dbHelper.checkLANG();
        if (cursor2.getCount()>0){
            while (cursor2.moveToNext()){
                Lang = cursor2.getString(0);
            }
        }
        GetData();
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    private void GetData(){
        Intent intent = getIntent();
        CLASS = intent.getExtras().getString("CLASS");
        String language = Paper.book().read("language");
        if(language == null)
            Paper.book().write("language","en");
        Context context = LocaleHelper.setLocale(this,language);
        Resources resources = context.getResources();
        Back = findViewById(R.id.relativeBack);
       if (CLASS.equals("All")){
           tvNamaList.setText(resources.getString(R.string.kelas)+" "+resources.getString(R.string.construct)+" : "+resources.getString(R.string.all));
       }else{
           tvNamaList.setText(resources.getString(R.string.kelas)+" "+resources.getString(R.string.construct)+" : "+CLASS);
       }
        Destiny destiny = new Destiny();
        Back = findViewById(R.id.relativeBack);

        if (Lang!=null){
            if (Lang.equals("English")){
                if (CLASS.equals("All")){
                    pList.addAll(AllConstructEN.getListData());
                }else if (CLASS.equals("B")){
                    pList.addAll(BClassConstructEN.getListData());
                }else if (CLASS.equals("A")){
                    pList.addAll(AClassConstructEN.getListData());
                }else if (CLASS.equals("S")){
                    pList.addAll(SClassConstructEN.getListData());
                }
            }else{
                if (CLASS.equals("All")){
                    pList.addAll(AllConstructID.getListData());
                }else if (CLASS.equals("B")){
                    pList.addAll(BClassConstructID.getListData());
                }else if (CLASS.equals("A")){
                    pList.addAll(AClassConstructID.getListData());
                }else if (CLASS.equals("S")){
                    pList.addAll(SClassConstructID.getListData());
                }
            }
        }else{
            if (CLASS.equals("All")){
                pList.addAll(AllConstructEN.getListData());
            }else if (CLASS.equals("B")){
                pList.addAll(BClassConstructEN.getListData());
            }else if (CLASS.equals("A")){
                pList.addAll(AClassConstructEN.getListData());
            }else if (CLASS.equals("S")){
                pList.addAll(SClassConstructEN.getListData());
            }
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterConstruct adapterConstruct = new AdapterConstruct(this);
        adapterConstruct.setList(pList);
        recyclerView.setAdapter(adapterConstruct);
    }
}