package com.destiny.punishinggrayravenguide.Home.FutureContent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.destiny.punishinggrayravenguide.Adapter.AdapterFutureContent;
import com.destiny.punishinggrayravenguide.Method.Destiny;
import com.destiny.punishinggrayravenguide.Model.FutureContentData;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class ListFutureContentActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    ImageView Faction;
    RelativeLayout Back;
    TextView tvNamaList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_future_content);
        recyclerView = findViewById(R.id.recycler);
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
        Destiny destiny = new Destiny();
        Back = findViewById(R.id.relativeBack);
        pList.addAll(FutureContentData.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        AdapterFutureContent futureContent = new AdapterFutureContent(this);
        futureContent.setList(pList);
        recyclerView.setAdapter(futureContent);
    }
}