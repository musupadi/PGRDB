package com.destiny.punishinggrayravenguide.Home.Weapon;

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
import com.destiny.punishinggrayravenguide.Adapter.AdapterWeapon;
import com.destiny.punishinggrayravenguide.Method.Destiny;
import com.destiny.punishinggrayravenguide.Model.English.AClassConstructEN;
import com.destiny.punishinggrayravenguide.Model.English.AllConstructEN;
import com.destiny.punishinggrayravenguide.Model.English.BClassConstructEN;
import com.destiny.punishinggrayravenguide.Model.English.SClassConstructEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.BowEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.ChainsawEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.GreatswordEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.HoveringCanonEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.LongswordEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.PistolEN;
import com.destiny.punishinggrayravenguide.Model.Indonesia.AClassConstructID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.AllConstructID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.BClassConstructID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.SClassConstructID;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;
import com.destiny.punishinggrayravenguide.SharedPreference.DB_Helper;
import com.destiny.punishinggrayravenguide.SharedPreference.LocaleHelper;

import java.util.ArrayList;

import io.paperdb.Paper;

public class WeaponActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_weapon);
        recyclerView = findViewById(R.id.recycler);
        tvNamaList = findViewById(R.id.tvNamaList);
        dbHelper = new DB_Helper(this);
        Intent intent = getIntent();
        CLASS = intent.getExtras().getString("CLASS");
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
        String language = Paper.book().read("language");
        if(language == null)
            Paper.book().write("language","en");
        Context context = LocaleHelper.setLocale(this,language);
        Resources resources = context.getResources();
        Back = findViewById(R.id.relativeBack);
        tvNamaList.setText(CLASS);
        Destiny destiny = new Destiny();
        Back = findViewById(R.id.relativeBack);

        if (Lang!=null){
            if (Lang.equals("English")){
                if (CLASS.equals("Dual Pistol")){
                    pList.addAll(PistolEN.getListData());
                }else if (CLASS.equals("Longsword")){
                    pList.addAll(LongswordEN.getListData());
                }else if (CLASS.equals("Hovering Canons")){
                    pList.addAll(HoveringCanonEN.getListData());
                }else if (CLASS.equals("Bow")){
                    pList.addAll(BowEN.getListData());
                }else if (CLASS.equals("Chainsaw")){
                    pList.addAll(ChainsawEN.getListData());
                }else if (CLASS.equals("Greatsword")){
                    pList.addAll(GreatswordEN.getListData());
                }else if (CLASS.equals("Cannon")){

                }
            }else{
                if (CLASS.equals("Pistol Ganda")){
                    pList.addAll(PistolEN.getListData());
                }else if (CLASS.equals("Pedang Panjang")){
                    pList.addAll(LongswordEN.getListData());
                }else if (CLASS.equals("Canon Melayang")){
                    pList.addAll(HoveringCanonEN.getListData());
                }else if (CLASS.equals("Busur")){
                    pList.addAll(BowEN.getListData());
                }else if (CLASS.equals("Gergaji Mesin")){
                    pList.addAll(ChainsawEN.getListData());
                }
            }
        }else{
            if (Lang.equals("English")){
                if (CLASS.equals("Dual Pistol")){
                    pList.addAll(PistolEN.getListData());
                }
            }else{
                if (CLASS.equals("Dual Pistol")){
                    pList.addAll(PistolEN.getListData());
                }
            }
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterWeapon adapterConstruct = new AdapterWeapon(this);
        adapterConstruct.setList(pList);
        recyclerView.setAdapter(adapterConstruct);
    }
}