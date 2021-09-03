package com.destiny.punishinggrayravenguide.Home;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.destiny.punishinggrayravenguide.Adapter.AdapterBerita;
import com.destiny.punishinggrayravenguide.Home.Construct.ClassConstructActivity;
import com.destiny.punishinggrayravenguide.Home.Roadmap.CharacterRoadmapActivity;
import com.destiny.punishinggrayravenguide.Home.TipsAndTrick.TipsAndTrickActivity;
import com.destiny.punishinggrayravenguide.Home.Weapon.ClassWeaponActivity;
import com.destiny.punishinggrayravenguide.HomeActivity;
import com.destiny.punishinggrayravenguide.Model.English.BeritaDataEN;
import com.destiny.punishinggrayravenguide.Model.Indonesia.BeritaDataID;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;
import com.destiny.punishinggrayravenguide.SharedPreference.DB_Helper;
import com.destiny.punishinggrayravenguide.SharedPreference.LocaleHelper;

import java.util.ArrayList;

import io.paperdb.Paper;


public class HomeFragment extends Fragment {
    Dialog dialog;
    Button Submit,Close;
    Spinner spLang;
    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    LinearLayout Story,Construct,Weapon,Memory,FutureContent,UnlockRoadmap,Artwork,Meme;
    TextView tvStory,tvConstruct,tvWeapon,tvMemory,tvFutureContent,tvUnlockRoadMap,tvArtwork;
    DB_Helper dbHelper;
    String Count;
    String Lang;
    String Lang2="English";

    TextView LogUpdate,tvLang,tvShowAll;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        dialog = new Dialog(getActivity());
        dialog.setContentView(R.layout.dialog_setting);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        Submit = dialog.findViewById(R.id.btnSubmit);
        Close = dialog.findViewById(R.id.btnClose);
        spLang = dialog.findViewById(R.id.spinnerLang);
        tvLang = dialog.findViewById(R.id.tvLang);
        recyclerView = view.findViewById(R.id.recyclerBerita);
        Story = view.findViewById(R.id.linearStory);
        tvStory = view.findViewById(R.id.tvStory);
        Construct = view.findViewById(R.id.linearConstruct);
        tvConstruct = view.findViewById(R.id.tvConstruct);
        Weapon = view.findViewById(R.id.linearWeapon);
        tvWeapon = view.findViewById(R.id.tvWeapon);
        Memory = view.findViewById(R.id.linearMemory);
        tvMemory = view.findViewById(R.id.tvMemory);
        FutureContent = view.findViewById(R.id.linearFutureContent);
        tvFutureContent = view.findViewById(R.id.tvFutureContent);
        UnlockRoadmap = view.findViewById(R.id.linearUnlockRoadmap);
        tvUnlockRoadMap = view.findViewById(R.id.tvUnlockRoadmap);
        Artwork = view.findViewById(R.id.linearArtwork);
        tvArtwork = view.findViewById(R.id.tvArtwork);
        Meme = view.findViewById(R.id.linearMeme);
        LogUpdate = view.findViewById(R.id.tvLogUpdate);
        tvShowAll = view.findViewById(R.id.tvShowAll);
        dbHelper = new DB_Helper(getActivity());

        Paper.init(getActivity());


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
        String language = Paper.book().read("language");
        if(language == null)
            Paper.book().write("language","en");
        updateView((String)Paper.book().read("language"));
        if (Lang!=null){
            if (Lang.equals("English")){
                spLang.setSelection(0);
            }else{
                spLang.setSelection(1);
            }
        }
//        GetData();
        OnClick();
    }
    private void OnClick(){
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (spLang.getSelectedItem().toString().equals("English")){
                    Lang2 = "English";
                    Paper.book().write("language","en");
                    updateView((String)Paper.book().read("language"));
                    dbHelper.ResetLang();
                    dbHelper.SaveLang("English");
                    Intent intent = new Intent(getActivity(), HomeActivity.class);
                    startActivity(intent);
                }else{
                    Lang2 = "Indonesia";
                    Paper.book().write("language","in");
                    updateView((String)Paper.book().read("language"));
                    dbHelper.ResetLang();
                    dbHelper.SaveLang("Indonesia");
                    Intent intent = new Intent(getActivity(), HomeActivity.class);
                    startActivity(intent);
                }
            }
        });
        Close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.hide();
            }
        });
        Story.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Sorry Story Feature under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        Construct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int COUNT = Integer.parseInt(Count)+1;
                    dbHelper.SaveCountADS(String.valueOf(COUNT));
                }catch (Exception e){
                    dbHelper.SaveCountADS(String.valueOf(1));
                }
                Intent intent = new Intent(getActivity(), ClassConstructActivity.class);
                startActivity(intent);
            }
        });
        Weapon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int COUNT = Integer.parseInt(Count)+1;
                    dbHelper.SaveCountADS(String.valueOf(COUNT));
                }catch (Exception e){
                    dbHelper.SaveCountADS(String.valueOf(1));
                }
                Intent intent = new Intent(getActivity(), ClassWeaponActivity.class);
                startActivity(intent);
            }
        });
        Memory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Sorry Memory Feature under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        FutureContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int COUNT = Integer.parseInt(Count)+1;
                    dbHelper.SaveCountADS(String.valueOf(COUNT));
                }catch (Exception e){
                    dbHelper.SaveCountADS(String.valueOf(1));
                }
                Intent intent = new Intent(getActivity(), TipsAndTrickActivity.class);
                startActivity(intent);
            }
        });
        UnlockRoadmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int COUNT = Integer.parseInt(Count)+1;
                    dbHelper.SaveCountADS(String.valueOf(COUNT));
                }catch (Exception e){
                    dbHelper.SaveCountADS(String.valueOf(1));
                }
                Intent intent = new Intent(getActivity(), CharacterRoadmapActivity.class);
                startActivity(intent);
            }
        });
        Artwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });
        Meme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Sorry Meme Feature under Construction", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void updateView(String language) {
        Context context = LocaleHelper.setLocale(getActivity(),language);
        Resources resources = context.getResources();

        LogUpdate.setText(resources.getString(R.string.update_log));
        tvStory.setText(resources.getString(R.string.story));
        tvConstruct.setText(resources.getString(R.string.construct));
        tvWeapon.setText(resources.getString(R.string.weapon));
        tvMemory.setText(resources.getString(R.string.memory));
        tvFutureContent.setText(resources.getString(R.string.future_content));
        tvUnlockRoadMap.setText(resources.getString(R.string.unlock_roadmap));
        tvArtwork.setText(resources.getString(R.string.setting));
        Close.setText(resources.getString(R.string.close));
        Submit.setText(resources.getString(R.string.submit));
        tvShowAll.setText(resources.getString(R.string.show_all));
        tvLang.setText(resources.getString(R.string.language));
        GetData();
    }

    private void GetData(){
        if (Lang!=null){
            if (Lang.equals("English")){
                pList.addAll(BeritaDataEN.getListData());
            }else{
                pList.addAll(BeritaDataID.getListData());
            }
        }

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        AdapterBerita adapterBerita = new AdapterBerita(getActivity());
        adapterBerita.setList(pList);
        recyclerView.setAdapter(adapterBerita);
    }
}