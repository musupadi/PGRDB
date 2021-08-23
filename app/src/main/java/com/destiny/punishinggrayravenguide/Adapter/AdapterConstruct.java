package com.destiny.punishinggrayravenguide.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.punishinggrayravenguide.Home.Construct.DetailConstructActivity;
import com.destiny.punishinggrayravenguide.Method.Destiny;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;


import java.util.ArrayList;

public class AdapterConstruct extends RecyclerView.Adapter<AdapterConstruct.CardViewViewHolder> {
    private Context context;
    private ArrayList<Model> list;
    String faction;
    private ArrayList<Model> getList() {
        return list;
    }
    public void setList(ArrayList<Model> list) {
        this.list = list;
    }
    public AdapterConstruct(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_construct, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        final Model p = getList().get(position);
        Destiny destiny = new Destiny();
        Glide.with(context)
                .load(p.getGambar())
                .apply(new RequestOptions().override(200, 200))
                .into(holder.imgPhoto);
        holder.tvName.setText(p.getName()+" - "+p.getModel());

        holder.Elemental.setText(p.getElement());
        holder.Class.setText(p.getProfessionClass());
        if (p.getProfessionClass().equals("B")){
            holder.iClass.setImageResource(R.drawable.b_class);
        }else if (p.getProfessionClass().equals("A")){
            holder.iClass.setImageResource(R.drawable.a_class);
        }else{
            holder.iClass.setImageResource(R.drawable.s_class);
        }
        //
        holder.Classification.setText(p.getKelas()+" Class");
        if (p.getProfessionClass().equals("Assault")){
            holder.iClassification.setImageResource(R.drawable.attacker);
        }else if (p.getProfessionClass().equals("Support")){
            holder.iClassification.setImageResource(R.drawable.support);
        }else{
            holder.iClassification.setImageResource(R.drawable.tank);
        }
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailConstructActivity.class);
                //1
                i.putExtra("ID", p.getId());
                i.putExtra("GAMBAR", p.getGambar());
                i.putExtra("NAME",p.getName());
                i.putExtra("MODEL",p.getModel());
                i.putExtra("PROFESSION_CLASS", p.getProfessionClass());
                i.putExtra("ELEMENT", p.getElement());
                i.putExtra("CV", p.getCV());
                i.putExtra("SERIAL", p.getSerial());
                i.putExtra("AFFILATION", p.getAffilation());
                i.putExtra("KELAS", p.getKelas());
                i.putExtra("IREDORB", p.getIRedOrb());
                i.putExtra("REDORB", p.getRedOrb());
                i.putExtra("IYELLOWORB", p.getIYellowOrb());
                i.putExtra("YELLOWORB", p.getYellowOrb());
                i.putExtra("IBLUEORB", p.getIBlueOrb());
                i.putExtra("BLUEORB", p.getBlueOrb());
                i.putExtra("QTE", p.getQTE());
                i.putExtra("PROFESSION", p.getProfession());
                i.putExtra("AWAKENING", p.getAwakening());
                i.putExtra("LEADER", p.getLeader());
                i.putExtra("CORE", p.getCore());
                i.putExtra("ULTIMATE", p.getUltimate());
                i.putExtra("SS", p.getSS());
                i.putExtra("SSS", p.getSSS());
                i.putExtra("SSSPLUS", p.getSSPlus());
                i.putExtra("HINT", p.getHint());
                i.putExtra("IBUILD1MEMO1", p.getIBuild1Memo1());
                i.putExtra("BUILD1MEMO1", p.getBuild1Memo2());
                i.putExtra("IBUILD1MEMO2", p.getIBuild1Memo2());
                i.putExtra("BUILD1MEMO2", p.getBuild1Memo2());
                i.putExtra("RESONANCE1_1", p.getResonance1_1());
                i.putExtra("RESONANCE1_2", p.getResonance1_2());
                i.putExtra("REMARKS1", p.getRemarks1());
                i.putExtra("IBUILD2MEMO1", p.getIBuild2Memo1());
                i.putExtra("BUILD2MEMO1", p.getBuild2Memo1());
                i.putExtra("IBUILD2MEMO2", p.getIBuild2Memo1());
                i.putExtra("BUILD2MEMO2", p.getBuild2Memo2());
                i.putExtra("RESONANCE2_1", p.getResonance2_1());
                i.putExtra("RESONANCE2_2", p.getResonance2_2());
                i.putExtra("REMARKS2", p.getRemarks2());
                i.putExtra("IBUILD3MEMO1", p.getIBuild3Memo1());
                i.putExtra("BUILD3MEMO1", p.getBuild3Memo1());
                i.putExtra("IBUILD3MEMO2", p.getIBuild3Memo2());
                i.putExtra("BUILD3MEMO2", p.getBuild3Memo2());
                i.putExtra("RESONANCE3_1", p.getResonance3_1());
                i.putExtra("RESONANCE3_2", p.getResonance3_2());
                i.putExtra("REMARKS3", p.getRemarks3());
                context.startActivity(i);
            }
        });
    }



    @Override
    public int getItemCount() {
        return getList().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto,iClassification,iClass;
        TextView tvName,Classification,Class,Elemental;
        CardView card;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.ivImage);
            tvName = itemView.findViewById(R.id.tvNama);
            Classification = itemView.findViewById(R.id.tvClassification);
            Class = itemView.findViewById(R.id.tvClass);
            Elemental = itemView.findViewById(R.id.tvElement);
            iClassification = itemView.findViewById(R.id.ivClassification);
            iClass = itemView.findViewById(R.id.ivClass);
            card = itemView.findViewById(R.id.cardAngel);
        }
    }
}
