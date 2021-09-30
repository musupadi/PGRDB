package com.destiny.punishinggrayravenguide.Adapter;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.destiny.punishinggrayravenguide.Home.Construct.DetailConstructActivity;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;
import com.destiny.punishinggrayravenguide.SharedPreference.DB_Helper;

import java.util.ArrayList;

public class AdapterWarzone extends RecyclerView.Adapter<AdapterWarzone.CardViewViewHolder> {
    private Context context;
    private ArrayList<Model> list;
    String faction;
    DB_Helper dbHelper;
    String Lang;
    private ArrayList<Model> getList() {
        return list;
    }
    public void setList(ArrayList<Model> list) {
        this.list = list;
    }
    public AdapterWarzone(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_warzone, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        final Model p = getList().get(position);
        dbHelper = new DB_Helper(context);
        Cursor cursor2 = dbHelper.checkLANG();
        if (cursor2.getCount()>0){
            while (cursor2.moveToNext()){
                Lang = cursor2.getString(0);
            }
        }
        holder.ivSupport.setImageResource(Integer.parseInt(p.getGambarSupport()));
        holder.ivAttacker.setImageResource(Integer.parseInt(p.getGambarAttacker()));
        holder.ivTank.setImageResource(Integer.parseInt(p.getGambarTank()));
        holder.tvSupport.setText(p.getSupport());
        holder.tvAttacker.setText(p.getAttacker());
        holder.tvTank.setText(p.getTank());
        holder.tvTier.setText(p.getTier());
        if (p.getTierVisible().equals("VISIBLE")){
            holder.cardTier.setVisibility(View.VISIBLE);
        }else{
            holder.cardTier.setVisibility(View.GONE);
        }
    }



    @Override
    public int getItemCount() {
        return getList().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView ivSupport,ivAttacker,ivTank;
        TextView tvSupport,tvAttacker,tvTank;
        CardView cardTier;
        TextView tvTier;
        CardViewViewHolder(View itemView) {
            super(itemView);
            ivSupport = itemView.findViewById(R.id.ivSupport);
            ivAttacker = itemView.findViewById(R.id.ivAttacker);
            ivTank = itemView.findViewById(R.id.ivTank);
            tvSupport = itemView.findViewById(R.id.tvSupport);
            tvAttacker = itemView.findViewById(R.id.tvAttacker);
            tvTank = itemView.findViewById(R.id.tvTank);
            cardTier = itemView.findViewById(R.id.cardTier);
            tvTier = itemView.findViewById(R.id.tvTier);
        }
    }
}
