package com.destiny.punishinggrayravenguide.Home;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.destiny.punishinggrayravenguide.Adapter.AdapterBerita;
import com.destiny.punishinggrayravenguide.Home.Construct.ClassConstructActivity;
import com.destiny.punishinggrayravenguide.Home.FutureContent.ListFutureContentActivity;
import com.destiny.punishinggrayravenguide.Home.Roadmap.CharacterRoadmapActivity;
import com.destiny.punishinggrayravenguide.Model.BeritaData;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    LinearLayout Story,Construct,Weapon,Memory,FutureContent,UnlockRoadmap,Artwork,Meme;
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
        recyclerView = view.findViewById(R.id.recyclerBerita);
        Story = view.findViewById(R.id.linearStory);
        Construct = view.findViewById(R.id.linearConstruct);
        Weapon = view.findViewById(R.id.linearWeapon);
        Memory = view.findViewById(R.id.linearMemory);
        FutureContent = view.findViewById(R.id.linearFutureContent);
        UnlockRoadmap = view.findViewById(R.id.linearUnlockRoadmap);
        Artwork = view.findViewById(R.id.linearArtwork);
        Meme = view.findViewById(R.id.linearMeme);
        GetData();
        OnClick();
    }
    private void OnClick(){
        Story.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Sorry Story Feature under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        Construct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ClassConstructActivity.class);
                startActivity(intent);
            }
        });
        Weapon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Sorry Weapon Feature under Construction", Toast.LENGTH_SHORT).show();
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
                Intent intent = new Intent(getActivity(), ListFutureContentActivity.class);
                startActivity(intent);
            }
        });
        UnlockRoadmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CharacterRoadmapActivity.class);
                startActivity(intent);
            }
        });
        Artwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Sorry Artwork Feature under Construction", Toast.LENGTH_SHORT).show();
            }
        });
        Meme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Sorry Meme Feature under Construction", Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void GetData(){
        pList.addAll(BeritaData.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        AdapterBerita adapterBerita = new AdapterBerita(getActivity());
        adapterBerita.setList(pList);
        recyclerView.setAdapter(adapterBerita);
    }
}