package com.destiny.punishinggrayravenguide.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.punishinggrayravenguide.Method.Destiny;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class AdapterCharacterRoadmap extends RecyclerView.Adapter<AdapterCharacterRoadmap.CardViewViewHolder> {
    private Context context;
    private ArrayList<Model> list;
    private ArrayList<Model> getList() {
        return list;
    }
    public void setList(ArrayList<Model> list) {
        this.list = list;
    }
    public AdapterCharacterRoadmap(Context context) {
        this.context = context;
    }
    Boolean upDown = false;
    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_character_roadmap, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        final Model p = getList().get(position);
        Destiny destiny = new Destiny();
        Glide.with(context)
                .load(p.getGambar())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvName.setText(p.getNama());
        //Chara 1
        Glide.with(context)
                .load(p.getICharacter1())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.iChara1);
        holder.Chara1.setText(p.getCharacter1());

        //Chara 2
        Glide.with(context)
                .load(p.getICharacter2())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.iChara2);
        holder.Chara2.setText(p.getCharacter2());

        //Chara 3
        Glide.with(context)
                .load(p.getICharacter3())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.iChara3);
        holder.Chara3.setText(p.getCharacter3());

        holder.CN.setText("CN Relese : "+p.getCNServer());
        holder.Global.setText("Global Relese : "+p.getGlobalServer());

        holder.linearRoadmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (upDown){
                    holder.upDown.setImageResource(R.drawable.down_primary);
                    holder.wholelinearoadMap.setVisibility(View.GONE);
                    upDown = false;
                }else{
                    holder.upDown.setImageResource(R.drawable.up_primary);
                    holder.wholelinearoadMap.setVisibility(View.VISIBLE);
                    upDown = true;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return getList().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto,upDown,iChara1,iChara2,iChara3;
        TextView tvName,Chara1,Chara2,Chara3,CN,Global;
        LinearLayout wholelinearoadMap,linearRoadmap;
        CardViewViewHolder(View itemView) {
            super(itemView);
            upDown = itemView.findViewById(R.id.ivUpDownRoadmap);
            imgPhoto = itemView.findViewById(R.id.ivImage);
            tvName = itemView.findViewById(R.id.tvNama);
            wholelinearoadMap = itemView.findViewById(R.id.WholelinearRoadmap);
            linearRoadmap = itemView.findViewById(R.id.LinearRoadmap);
            iChara1 = itemView.findViewById(R.id.ivCharacter1);
            Chara1 = itemView.findViewById(R.id.tvCharacter1);
            iChara2 = itemView.findViewById(R.id.ivCharacter2);
            Chara2 = itemView.findViewById(R.id.tvCharacter2);
            iChara3 = itemView.findViewById(R.id.ivCharacter3);
            Chara3 = itemView.findViewById(R.id.tvCharacter3);
            CN = itemView.findViewById(R.id.tvCNRelese);
            Global = itemView.findViewById(R.id.tvGlobalRelese);
        }
    }
}
