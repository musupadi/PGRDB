package com.destiny.punishinggrayravenguide.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.destiny.punishinggrayravenguide.Method.Destiny;
import com.destiny.punishinggrayravenguide.Model.Model;
import com.destiny.punishinggrayravenguide.R;

import java.util.ArrayList;

public class AdapterFutureContent extends RecyclerView.Adapter<AdapterFutureContent.CardViewViewHolder> {
    private Context context;
    private ArrayList<Model> list;
    private ArrayList<Model> getList() {
        return list;
    }
    public void setList(ArrayList<Model> list) {
        this.list = list;
    }
    public AdapterFutureContent(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_berita, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        final Model p = getList().get(position);
        Destiny destiny = new Destiny();
        holder.imgPhoto.setImageResource(Integer.parseInt(p.getGambar()));
        holder.tvName.setText(p.getNama());
        holder.tvDeskripsi.setText(destiny.SmallDescription(p.getDeskripsi()));
        holder.tvTanggal.setText(p.getTanggal());
    }

    @Override
    public int getItemCount() {
        return getList().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto;
        TextView tvName,tvDeskripsi,tvTanggal;

        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.ivImage);
            tvName = itemView.findViewById(R.id.tvNamaBerita);
            tvDeskripsi = itemView.findViewById(R.id.tvDeskripsi);
            tvTanggal = itemView.findViewById(R.id.tvTanggal);
        }
    }
}
