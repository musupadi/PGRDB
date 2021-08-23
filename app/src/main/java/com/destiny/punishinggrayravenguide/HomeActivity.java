package com.destiny.punishinggrayravenguide;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.destiny.punishinggrayravenguide.About.AboutFragment;
import com.destiny.punishinggrayravenguide.Feedback.FeedbackFragment;
import com.destiny.punishinggrayravenguide.Home.HomeFragment;

public class HomeActivity extends AppCompatActivity {
    ImageView imageHome,imageFeedback,imageAbout;
    TextView textHome,textFeedback,textAbout;
    LinearLayout linearHome,linearFeedback,linearAbout;
    Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Declaration();
        Home();
        OnCLick();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private void OnCLick(){
        linearHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Home();
            }
        });
        linearFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Feedback();
            }
        });
        linearAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                About();
            }
        });
    }
    private void Declaration(){
        imageHome = findViewById(R.id.ivHome);
        textHome = findViewById(R.id.tvHome);
        imageFeedback = findViewById(R.id.ivFeedback);
        textFeedback = findViewById(R.id.tvFeedback);
        imageAbout = findViewById(R.id.ivAbout);
        textAbout = findViewById(R.id.tvAbout);
        linearHome = findViewById(R.id.linearHome);
        linearFeedback = findViewById(R.id.linearFeedback);
        linearAbout = findViewById(R.id.linearAbout);
    }

    private void Default(){
        linearHome.setBackgroundResource(R.drawable.rounded);
        linearFeedback.setBackgroundResource(R.drawable.rounded);
        linearAbout.setBackgroundResource(R.drawable.rounded);
        imageHome.setImageResource(R.drawable.home);
        imageAbout.setImageResource(R.drawable.about);
        imageFeedback.setImageResource(R.drawable.feedback);
        textHome.setTextColor(Color.BLACK);
        textAbout.setTextColor(Color.BLACK);
        textFeedback.setTextColor(Color.BLACK);
    }
    private void Home(){
        Default();
        linearHome.setBackgroundResource(R.drawable.rounded_active);
        imageHome.setImageResource(R.drawable.home_active);
        textHome.setTextColor(Color.WHITE);
        fragment = new HomeFragment();
        ChangeFragment(fragment);
    }
    private void About(){
        Default();
        linearAbout.setBackgroundResource(R.drawable.rounded_active);
        imageAbout.setImageResource(R.drawable.about_active);
        textAbout.setTextColor(Color.WHITE);
        fragment = new AboutFragment();
        ChangeFragment(fragment);
    }
    private void Feedback(){
        Default();
        linearFeedback.setBackgroundResource(R.drawable.rounded_active);
        imageFeedback.setImageResource(R.drawable.feedback_active);
        textFeedback.setTextColor(Color.WHITE);
        fragment = new FeedbackFragment();
        ChangeFragment(fragment);
    }
    private void ChangeFragment(Fragment fragment){
        if(fragment != null){
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction ft = fragmentManager.beginTransaction();
            ft.replace(R.id.Container,fragment);
            ft.commit();
        }
    }
}