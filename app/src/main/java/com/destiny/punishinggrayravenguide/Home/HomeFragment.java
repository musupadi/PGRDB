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

import com.destiny.punishinggrayravenguide.Adapter.AdapterBerita;
import com.destiny.punishinggrayravenguide.Home.Construct.ClassConstructActivity;
import com.destiny.punishinggrayravenguide.Model.BeritaData;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    LinearLayout Construct;
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
        Construct = view.findViewById(R.id.linearConstruct);
        GetData();
        OnClick();
    }
    private void OnClick(){
        Construct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ClassConstructActivity.class);
                startActivity(intent);
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