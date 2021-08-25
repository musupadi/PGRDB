package com.destiny.punishinggrayravenguide.Home.Construct;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.punishinggrayravenguide.Adapter.AdapterConstruct;
import com.destiny.punishinggrayravenguide.Method.Destiny;
import com.destiny.punishinggrayravenguide.Model.AClassConstruct;
import com.destiny.punishinggrayravenguide.Model.AllConstruct;
import com.destiny.punishinggrayravenguide.Model.BClassConstruct;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.Model.SClassConstruct;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class ListConstructActivity extends AppCompatActivity {
    String CLASS;
    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    ImageView Faction;
    RelativeLayout Back;
    TextView tvNamaList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_construct);
        recyclerView = findViewById(R.id.recycler);
        tvNamaList = findViewById(R.id.tvNamaList);
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
        tvNamaList.setText("Class Construct : "+CLASS);
        Destiny destiny = new Destiny();
        Back = findViewById(R.id.relativeBack);

        if (CLASS.equals("All")){
            pList.addAll(AllConstruct.getListData());
        }else if (CLASS.equals("B")){
            pList.addAll(BClassConstruct.getListData());
        }else if (CLASS.equals("A")){
            pList.addAll(AClassConstruct.getListData());
        }else if (CLASS.equals("S")){
            pList.addAll(SClassConstruct.getListData());
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterConstruct adapterConstruct = new AdapterConstruct(this);
        adapterConstruct.setList(pList);
        recyclerView.setAdapter(adapterConstruct);
    }
}