package com.destiny.punishinggrayravenguide.Home.TipsAndTrick.Tips.Warzone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.destiny.punishinggrayravenguide.Adapter.AdapterCategoryWarzone;
import com.destiny.punishinggrayravenguide.Model.English.TipsAndTrick.Warzone.WarzoneElementEN;
import com.destiny.punishinggrayravenguide.Model.Indonesia.TipsAndTrick.Warzone.WarzoneElementID;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;
import com.destiny.punishinggrayravenguide.SharedPreference.DB_Helper;
import com.destiny.punishinggrayravenguide.SharedPreference.LocaleHelper;

import java.util.ArrayList;

import io.paperdb.Paper;

public class WarzoneActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    RelativeLayout Back;
    TextView tvNamaList;
    DB_Helper dbHelper;
    String Lang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warzone);
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
        tvNamaList.setText(resources.getString(R.string.warzone_team));
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
            pList.addAll(WarzoneElementEN.getListData());
        }else{
            pList.addAll(WarzoneElementID.getListData());
        }
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        AdapterCategoryWarzone futureContent = new AdapterCategoryWarzone(this);
        futureContent.setList(pList);
        recyclerView.setAdapter(futureContent);
    }
}