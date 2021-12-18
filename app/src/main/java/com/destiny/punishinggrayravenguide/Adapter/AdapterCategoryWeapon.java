package com.destiny.punishinggrayravenguide.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.punishinggrayravenguide.Home.Construct.ClassConstructActivity;
import com.destiny.punishinggrayravenguide.Home.Construct.ListConstructActivity;
import com.destiny.punishinggrayravenguide.Home.Weapon.WeaponActivity;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class AdapterCategoryWeapon extends RecyclerView.Adapter<AdapterCategoryWeapon.CardViewViewHolder> {
    private Context context;
    private ArrayList<Model> list;
    String faction;
    private ArrayList<Model> getList() {
        return list;
    }
    public void setList(ArrayList<Model> list) {
        this.list = list;
    }
    public AdapterCategoryWeapon(Context context) {
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
        holder.imgPhoto.setImageResource(Integer.parseInt(p.getGambar()));
        holder.tvName.setText(p.getCategoryWeapon());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, WeaponActivity.class);
                i.putExtra("CLASS", p.getCategoryWeapon());
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
        LinearLayout  card;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.ivGambar);
            tvName = itemView.findViewById(R.id.tvCategoryWeapon);
            card = itemView.findViewById(R.id.card);
        }
    }
}
