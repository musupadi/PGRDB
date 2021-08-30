package com.destiny.punishinggrayravenguide.Adapter;

import android.content.Context;
import android.content.res.Resources;
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
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;
import com.destiny.punishinggrayravenguide.SharedPreference.LocaleHelper;

import java.util.ArrayList;

import io.paperdb.Paper;

public class AdapterWeapon extends RecyclerView.Adapter<AdapterWeapon.CardViewViewHolder> {
    private Context context;
    private ArrayList<Model> list;
    String faction;
    private ArrayList<Model> getList() {
        return list;
    }
    public void setList(ArrayList<Model> list) {
        this.list = list;
    }
    public AdapterWeapon(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_weapon, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        final Model p = getList().get(position);
        String language = Paper.book().read("language");
        if(language == null)
            Paper.book().write("language","en");
        Context ctx = LocaleHelper.setLocale(context,language);
        Resources resources = ctx.getResources();

        holder.tvName.setText(p.getNama());
        holder.imgPhoto.setImageResource(Integer.parseInt(p.getGambar()));
        holder.minAttack.setText(p.getMinAtk());
        holder.maxAttack.setText(p.getMaxAtk());
        holder.minCrit.setText(p.getMinCrit());
        holder.maxCrit.setText(p.getMaxCrit());
        holder.MaxLevel.setText(p.getMaxLevel());
        holder.Ability.setText(p.getAbility());
        holder.tvAbility.setText(resources.getString(R.string.ability));
        holder.Attack.setText(resources.getString(R.string.attack));
        holder.Critical.setText(resources.getString(R.string.crit));
        if (p.getStar().equals("6")){
            holder.Background.setBackgroundResource(R.color.color6Star);
            holder.sixStar.setVisibility(View.VISIBLE);
        }else if (p.getStar().equals("5")){
            holder.Background.setBackgroundResource(R.color.color5Star);
            holder.fiveStar.setVisibility(View.VISIBLE);
        }else if (p.getStar().equals("4")){
            holder.Background.setBackgroundResource(R.color.color4Star);
            holder.fourStar.setVisibility(View.VISIBLE);
        }else if (p.getStar().equals("3")){
            holder.Background.setBackgroundResource(R.color.color3Star);
            holder.threeStar.setVisibility(View.VISIBLE);
        }else{
            holder.Background.setBackgroundResource(R.color.color2Star);
            holder.twoStar.setVisibility(View.VISIBLE);
        }
        if (!p.getConstructName().equals("-")){
            holder.Signature.setText(resources.getString(R.string.signature_construct));
            holder.signature.setVisibility(View.VISIBLE);
            holder.ConstructName.setText(p.getConstructName());
            holder.PhotoConstruct.setImageResource(Integer.parseInt(p.getConstructImage()));
        }
    }



    @Override
    public int getItemCount() {
        return getList().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto,PhotoConstruct;
        TextView tvName,ConstructName;
        LinearLayout Background,twoStar,threeStar,fourStar,fiveStar,sixStar,signature;
        TextView Attack,maxAttack,minAttack;
        TextView Critical,maxCrit,minCrit;
        TextView MaxLevel,Stars,Signature,Ability,tvAbility;
        CardView card;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.ivGambar);
            tvName = itemView.findViewById(R.id.tvCategoryWeapon);
            Background = itemView.findViewById(R.id.linearBackground);
            twoStar = itemView.findViewById(R.id.linearTwoStar);
            threeStar = itemView.findViewById(R.id.linearThreeStar);
            fourStar = itemView.findViewById(R.id.linearFourStar);
            fiveStar = itemView.findViewById(R.id.linearFiveStar);
            sixStar = itemView.findViewById(R.id.linearSixStar);
            signature = itemView.findViewById(R.id.linearSignature);
            PhotoConstruct = itemView.findViewById(R.id.ivGambarSignature);
            ConstructName = itemView.findViewById(R.id.tvSignatureConstruct);
            tvAbility = itemView.findViewById(R.id.tvAbility);
            Ability = itemView.findViewById(R.id.Ability);
            Signature = itemView.findViewById(R.id.tvSignature);
            Stars = itemView.findViewById(R.id.tvStar);
            MaxLevel = itemView.findViewById(R.id.tvMaxLevel);
            Critical = itemView.findViewById(R.id.tvCritical);
            maxCrit = itemView.findViewById(R.id.tvMaxCrit);
            minCrit = itemView.findViewById(R.id.tvMinCrit);
            Attack = itemView.findViewById(R.id.tvAttack);
            maxAttack = itemView.findViewById(R.id.tvMaxAttack);
            minAttack = itemView.findViewById(R.id.tvMinAttack);
            card = itemView.findViewById(R.id.card);
        }
    }
}
