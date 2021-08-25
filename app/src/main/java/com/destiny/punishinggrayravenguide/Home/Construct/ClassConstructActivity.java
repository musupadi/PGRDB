package com.destiny.punishinggrayravenguide.Home.Construct;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.destiny.punishinggrayravenguide.R;

public class ClassConstructActivity extends AppCompatActivity {
    CardView All,B,A,S;
    RelativeLayout Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_construct);
        All = findViewById(R.id.cardAll);
        B = findViewById(R.id.cardB);
        A = findViewById(R.id.cardA);
        S = findViewById(R.id.cardS);
        Back = findViewById(R.id.relativeBack);
        OnClick();
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
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}