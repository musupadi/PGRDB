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
import com.destiny.punishinggrayravenguide.Home.TipsAndTrick.Tips.Warzone.DetailWarzoneActivity;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;
import com.destiny.punishinggrayravenguide.SharedPreference.DB_Helper;

import java.util.ArrayList;

public class AdapterCategoryWarzone extends RecyclerView.Adapter<AdapterCategoryWarzone.CardViewViewHolder> {
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
    public AdapterCategoryWarzone(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_category_weapon, viewGroup, false);
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
        holder.imgPhoto.setImageResource(Integer.parseInt(p.getGambar()));
        holder.tvName.setText(p.getCategoryWeapon());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailWarzoneActivity.class);
                i.putExtra("ELEMENT", p.getCategoryWeapon());
                context.startActivity(i);
            }
        });
    }



    @Override
    public int getItemCount() {
        return getList().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName;
        CardView card;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.ivGambar);
            tvName = itemView.findViewById(R.id.tvCategoryWeapon);
            card = itemView.findViewById(R.id.card);
        }
    }
}
