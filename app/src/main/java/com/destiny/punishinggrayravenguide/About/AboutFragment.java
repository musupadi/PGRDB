package com.destiny.punishinggrayravenguide.About;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.destiny.punishinggrayravenguide.Adapter.AdapterAbout;
import com.destiny.punishinggrayravenguide.Model.AboutUsData;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class AboutFragment extends Fragment {

    RecyclerView recyclerView;
    private ArrayList<Model> pList = new ArrayList<>();
    public AboutFragment() {
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
        return inflater.inflate(R.layout.fragment_about, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler);
        GetData();
    }

    private void GetData(){
        pList.addAll(AboutUsData.getListData());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        AdapterAbout adapterAngel = new AdapterAbout(getActivity());
        adapterAngel.setList(pList);
        recyclerView.setAdapter(adapterAngel);
    }
}