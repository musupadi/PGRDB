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

import com.destiny.punishinggrayravenguide.Adapter.AdapterWeapon;
import com.destiny.punishinggrayravenguide.Method.Destiny;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.AmplifierEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.BannerSpearEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.BowEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.CanonEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.ChainsawEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.ColaborativeBotEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.CompositerCelloBladeEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.CompositerChainswordEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.CompositerDragonSpearEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.CompositerGreatswordEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.DaggersEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.GauntletEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.GreatswordEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.GunbladeEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.HoveringCanonEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.LongswordEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.NierAutomataEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.PistolEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.RifleSetEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.ScytheEN;
import com.destiny.punishinggrayravenguide.Model.English.Weapon.SpearAndShieldEN;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.AmplifierID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.BannerSpearID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.BowID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.CanonID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.ChainsawID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.ColaborativeBotID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.CompositerCelloBladeID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.CompositerChainswordID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.CompositerDragonSpearID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.CompositerGreatswordID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.DaggersID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.GauntletID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.GreatswordID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.GunbladeID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.HoveringCanonID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.LongswordID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.NierAutomataID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.PistolID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.RifleSetID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.ScytheID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.Weapon.SpearAndShieldID;
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
                    pList.addAll(CanonEN.getListData());
                }else if (CLASS.equals("Daggers")){
                    pList.addAll(DaggersEN.getListData());
                }else if (CLASS.equals("Scythe")){
                    pList.addAll(ScytheEN.getListData());
                }else if (CLASS.equals("Spear & Shield")){
                    pList.addAll(SpearAndShieldEN.getListData());
                }else if (CLASS.equals("Gauntlet")){
                    pList.addAll(GauntletEN.getListData());
                }else if (CLASS.equals("Amplifier")){
                    pList.addAll(AmplifierEN.getListData());
                }else if (CLASS.equals("Rifle Set")){
                    pList.addAll(RifleSetEN.getListData());
                }else if (CLASS.equals("Gunblade")){
                    pList.addAll(GunbladeEN.getListData());
                }else if (CLASS.equals("Compositer - Greatsword")){
                    pList.addAll(CompositerGreatswordEN.getListData());
                }else if (CLASS.equals("Compositer - Dragon Spear")){
                    pList.addAll(CompositerDragonSpearEN.getListData());
                }else if(CLASS.equals("Compositer - Cello Blade")){
                    pList.addAll(CompositerCelloBladeEN.getListData());
                }else if (CLASS.equals("Nier:Automata Weapon")){
                    pList.addAll(NierAutomataEN.getListData());
                }else if (CLASS.equals("Collaborative Bot")){
                    pList.addAll(ColaborativeBotEN.getListData());
                }else if (CLASS.equals("Banner Spear")){
                    pList.addAll(BannerSpearEN.getListData());
                }else if (CLASS.equals("Compositer - Chain Sword")){
                    pList.addAll(CompositerChainswordEN.getListData());
                }
            }else{
                if (CLASS.equals("Pistol Ganda")){
                    pList.addAll(PistolID.getListData());
                }else if (CLASS.equals("Pedang Panjang")){
                    pList.addAll(LongswordID.getListData());
                }else if (CLASS.equals("Canon Melayang")){
                    pList.addAll(HoveringCanonID.getListData());
                }else if (CLASS.equals("Busur")){
                    pList.addAll(BowID.getListData());
                }else if (CLASS.equals("Gergaji Mesin")){
                    pList.addAll(ChainsawID.getListData());
                }else if (CLASS.equals("Pedang Besar")){
                    pList.addAll(GreatswordID.getListData());
                }else if (CLASS.equals("Canon")){
                    pList.addAll(CanonID.getListData());
                }else if (CLASS.equals("Pisau")){
                    pList.addAll(DaggersID.getListData());
                }else if (CLASS.equals("Sabit")){
                    pList.addAll(ScytheID.getListData());
                }else if (CLASS.equals("Tombak & Perisai")){
                    pList.addAll(SpearAndShieldID.getListData());
                }else if (CLASS.equals("Sarung Tangan")){
                    pList.addAll(GauntletID.getListData());
                }else if (CLASS.equals("Penguat")){
                    pList.addAll(AmplifierID.getListData());
                }else if (CLASS.equals("Set Senapan")){
                    pList.addAll(RifleSetID.getListData());
                }else if (CLASS.equals("Gunblade")){
                    pList.addAll(GunbladeID.getListData());
                }else if (CLASS.equals("Compositer - Pedang Besar")){
                    pList.addAll(CompositerGreatswordID.getListData());
                }else if (CLASS.equals("Compositer - Tombak Naga")){
                    pList.addAll(CompositerDragonSpearID.getListData());
                }else if(CLASS.equals("Compositer - Pedang Cello")){
                    pList.addAll(CompositerCelloBladeID.getListData());
                }else if (CLASS.equals("Senjata Nier:Automata")){
                    pList.addAll(NierAutomataID.getListData());
                }else if (CLASS.equals("Bot kolaboratif")){
                    pList.addAll(ColaborativeBotID.getListData());
                }else if (CLASS.equals("Tombak Bendera")){
                    pList.addAll(BannerSpearID.getListData());
                }else if (CLASS.equals("Compositer - Pedang Rantai")){
                    pList.addAll(CompositerChainswordID.getListData());
                }
            }
        }else{
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
                    pList.addAll(CanonEN.getListData());
                }else if (CLASS.equals("Daggers")){
                    pList.addAll(DaggersEN.getListData());
                }else if (CLASS.equals("Scythe")){
                    pList.addAll(ScytheEN.getListData());
                }else if (CLASS.equals("Spear & Shield")){
                    pList.addAll(SpearAndShieldEN.getListData());
                }else if (CLASS.equals("Gauntlet")){
                    pList.addAll(GauntletEN.getListData());
                }else if (CLASS.equals("Amplifier")){
                    pList.addAll(AmplifierEN.getListData());
                }else if (CLASS.equals("Rifle Set")){
                    pList.addAll(RifleSetEN.getListData());
                }else if (CLASS.equals("Gunblade")){
                    pList.addAll(GunbladeEN.getListData());
                }else if (CLASS.equals("Compositer - Greatsword")){
                    pList.addAll(GreatswordEN.getListData());
                }else if (CLASS.equals("Compositer - Dragon Spear")){
                    pList.addAll(CompositerDragonSpearEN.getListData());
                }else if(CLASS.equals("Compositer - Cello Blade")){
                    pList.addAll(CompositerCelloBladeEN.getListData());
                }else if (CLASS.equals("Nier:Automata Weapon")){
                    pList.addAll(NierAutomataEN.getListData());
                }else if (CLASS.equals("Colaborative Bot")){
                    pList.addAll(ColaborativeBotEN.getListData());
                }else if (CLASS.equals("Banner Spear")){
                    pList.addAll(CompositerCelloBladeEN.getListData());
                }else if (CLASS.equals("Compositer - Chainsword")){
                    pList.addAll(CompositerChainswordEN.getListData());
                }
            }else{
                if (CLASS.equals("Pistol Ganda")){
                    pList.addAll(PistolID.getListData());
                }else if (CLASS.equals("Pedang Panjang")){
                    pList.addAll(LongswordID.getListData());
                }else if (CLASS.equals("Canon Melayang")){
                    pList.addAll(HoveringCanonID.getListData());
                }else if (CLASS.equals("Busur")){
                    pList.addAll(BowID.getListData());
                }else if (CLASS.equals("Gergaji Mesin")){
                    pList.addAll(ChainsawID.getListData());
                }else if (CLASS.equals("Pedang Besar")){
                    pList.addAll(GreatswordID.getListData());
                }else if (CLASS.equals("Kanon")){
                    pList.addAll(CanonID.getListData());
                }else if (CLASS.equals("Pisau")){
                    pList.addAll(DaggersID.getListData());
                }else if (CLASS.equals("Sabit")){
                    pList.addAll(ScytheID.getListData());
                }else if (CLASS.equals("Tombak & Prisai")){
                    pList.addAll(SpearAndShieldID.getListData());
                }else if (CLASS.equals("Sarung Tangan")){
                    pList.addAll(GauntletID.getListData());
                }else if (CLASS.equals("Penguat")){
                    pList.addAll(AmplifierID.getListData());
                }else if (CLASS.equals("Set Senapan")){
                    pList.addAll(RifleSetID.getListData());
                }else if (CLASS.equals("Gunblade")){
                    pList.addAll(GunbladeID.getListData());
                }else if (CLASS.equals("Compositer - Pedang Besar")){
                    pList.addAll(GreatswordID.getListData());
                }else if (CLASS.equals("Compositer - Tombak Naga")){
                    pList.addAll(CompositerDragonSpearID.getListData());
                }else if(CLASS.equals("Compositer - Pedang Cello")){
                    pList.addAll(CompositerCelloBladeID.getListData());
                }else if (CLASS.equals("Senjata Nier:Automata")){
                    pList.addAll(NierAutomataID.getListData());
                }else if (CLASS.equals("Bot kolaboratif")){
                    pList.addAll(ColaborativeBotID.getListData());
                }else if (CLASS.equals("Tombak Bendera")){
                    pList.addAll(CompositerCelloBladeID.getListData());
                }else if (CLASS.equals("Compositer - Pedang Rantai")){
                    pList.addAll(CompositerChainswordID.getListData());
                }
            }
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterWeapon adapterConstruct = new AdapterWeapon(this);
        adapterConstruct.setList(pList);
        recyclerView.setAdapter(adapterConstruct);
    }
}