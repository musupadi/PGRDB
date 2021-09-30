package com.destiny.punishinggrayravenguide.Home.TipsAndTrick.Tips.Warzone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.destiny.punishinggrayravenguide.Adapter.AdapterWarzone;
import com.destiny.punishinggrayravenguide.Model.English.TipsAndTrick.Warzone.WarzoneElementEN;
import com.destiny.punishinggrayravenguide.Model.Indonesia.TipsAndTrick.Warzone.WarzoneDark;
import com.destiny.punishinggrayravenguide.Model.Indonesia.TipsAndTrick.Warzone.WarzoneElementID;
import com.destiny.punishinggrayravenguide.Model.Indonesia.TipsAndTrick.Warzone.WarzoneFire;
import com.destiny.punishinggrayravenguide.Model.Indonesia.TipsAndTrick.Warzone.WarzoneIce;
import com.destiny.punishinggrayravenguide.Model.Indonesia.TipsAndTrick.Warzone.WarzoneLightning;
import com.destiny.punishinggrayravenguide.Model.Indonesia.TipsAndTrick.Warzone.WarzonePhysical;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;
import com.destiny.punishinggrayravenguide.SharedPreference.DB_Helper;
import com.destiny.punishinggrayravenguide.SharedPreference.LocaleHelper;

import java.util.ArrayList;

import io.paperdb.Paper;

public class DetailWarzoneActivity extends AppCompatActivity {
    String ELEMENT;
    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    RelativeLayout Back;
    TextView tvNamaList;
    DB_Helper dbHelper;
    String Lang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_warzone);

        Intent intent = getIntent();
        ELEMENT = intent.getExtras().getString("ELEMENT");

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
        tvNamaList.setText("Warzone "+ELEMENT);
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
        if (ELEMENT.equals("Physical") || ELEMENT.equals("Fisik")){
            pList.addAll(WarzonePhysical.getListData());
        }else if (ELEMENT.equals("Ice") || ELEMENT.equals("Es")){
            pList.addAll(WarzoneIce.getListData());
        }else if (ELEMENT.equals("Lightning") || ELEMENT.equals("Listrik")){
            pList.addAll(WarzoneLightning.getListData());
        }else if (ELEMENT.equals("Fire") || ELEMENT.equals("Api")){
            pList.addAll(WarzoneFire.getListData());
        }if (ELEMENT.equals("Dark") || ELEMENT.equals("Gelap")){
            pList.addAll(WarzoneDark.getListData());
        }
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));
        AdapterWarzone futureContent = new AdapterWarzone(this);
        futureContent.setList(pList);
        recyclerView.setAdapter(futureContent);
    }
}