package com.destiny.angelsquaddatabase.Adapter;

import android.content.Context;
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
import com.destiny.angelsquaddatabase.Model.Model;
import com.destiny.angelsquaddatabase.R;

import java.util.ArrayList;

public class AdapterAbout extends RecyclerView.Adapter<AdapterAbout.CardViewViewHolder> {
    private Context context;
    private ArrayList<Model> list;
    String faction;
    private ArrayList<Model> getList() {
        return list;
    }
    public void setList(ArrayList<Model> list) {
        this.list = list;
    }
    public AdapterAbout(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_about, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int position) {
        final Model p = getList().get(position);
        if (p.getRole().equals("Developer")){
            holder.imgPhoto.setImageResource(Integer.parseInt(p.getGambar()));
        }else{
            Glide.with(context)
                    .load(p.getGambar())
                    .apply(new RequestOptions().override(200, 200))
                    .into(holder.imgPhoto);
        }
        holder.tvName.setText(p.getNama());
        holder.tvDeskripsi.setText(p.getUserid());
        holder.tvRole.setText(p.getRole());
    }



    @Override
    public int getItemCount() {
        return getList().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto,imgFaction;
        TextView tvName,tvDeskripsi,tvRole;
        CardView card;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.ivImage);
            tvName = itemView.findViewById(R.id.tvNama);
            tvDeskripsi = itemView.findViewById(R.id.tvDeskripsi);
            tvRole = itemView.findViewById(R.id.tvRole);
            card = itemView.findViewById(R.id.cardAngel);
        }
    }
}
