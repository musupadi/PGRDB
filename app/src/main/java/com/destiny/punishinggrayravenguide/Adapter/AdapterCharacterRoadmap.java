package com.destiny.punishinggrayravenguide.Adapter;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
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
import com.destiny.punishinggrayravenguide.SharedPreference.DB_Helper;
import com.destiny.punishinggrayravenguide.SharedPreference.LocaleHelper;

import java.util.ArrayList;

import io.paperdb.Paper;

public class AdapterCharacterRoadmap extends RecyclerView.Adapter<AdapterCharacterRoadmap.CardViewViewHolder> {
    private Context context;
    private ArrayList<Model> list;
    private ArrayList<Model> getList() {
        return list;
    }
    public void setList(ArrayList<Model> list) {
        this.list = list;
    }

    DB_Helper dbHelper;
    String Count;
    String Lang;
    String Lang2="English";
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
        dbHelper = new DB_Helper(context);
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
        Context ctx = LocaleHelper.setLocale(context,language);
        Resources resources = ctx.getResources();
        Glide.with(context)
                .load(p.getGambar())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
        holder.tvName.setText(p.getNama());
        //Chara 1
        if (!p.getICharacter1().equals("-")){
            holder.iChara1.setImageResource(Integer.parseInt(p.getICharacter1()));
        }
        holder.Chara1.setText(p.getCharacter1());

        //Chara 2
//        Glide.with(context)
//                .load(p.getICharacter2())
//                .apply(new RequestOptions().override(350, 550))
//                .into(holder.iChara2);
        if (!p.getICharacter2().equals("-")){
            holder.iChara2.setImageResource(Integer.parseInt(p.getICharacter2()));
        }
        holder.Chara2.setText(p.getCharacter2());

        //Chara 3
//        Glide.with(context)
//                .load(p.getICharacter3())
//                .apply(new RequestOptions().override(350, 550))
//                .into(holder.iChara3);
        if (!p.getICharacter3().equals("-")){
            holder.iChara3.setImageResource(Integer.parseInt(p.getICharacter3()));
        }
        holder.Chara3.setText(p.getCharacter3());

        holder.CN.setText("CN "+resources.getString(R.string.relese)+" : "+p.getCNServer());
        if (Integer.parseInt(p.getId()) < 3){
            holder.Global.setText("Global "+resources.getString(R.string.relese)+" : "+p.getGlobalServer());
        }else{
            if (Lang.equals("English")){
                holder.Global.setText("Global "+resources.getString(R.string.relese)+" : "+p.getGlobalServer()+" (Predict)");
            }else{
                holder.Global.setText("Global "+resources.getString(R.string.relese)+" : "+p.getGlobalServer()+" (Prediksi)");
            }
        }
        holder.CharacterRelese.setText(resources.getString(R.string.character_relese));
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
        TextView tvName,Chara1,Chara2,Chara3,CN,Global,CharacterRelese;
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
            CharacterRelese = itemView.findViewById(R.id.characterRelesed);
        }
    }
}
