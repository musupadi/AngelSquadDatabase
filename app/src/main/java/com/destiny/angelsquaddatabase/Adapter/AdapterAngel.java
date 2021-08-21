package com.destiny.angelsquaddatabase.Adapter;

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
import com.destiny.angelsquaddatabase.Activity.ListAngel.FLD.DetailAngelFLDActivity;
import com.destiny.angelsquaddatabase.Activity.ListAngel.FlamingVita.DetailAngelFlamingVitaActivity;
import com.destiny.angelsquaddatabase.Activity.ListAngel.Jude.DetailAngelJudeActivity;
import com.destiny.angelsquaddatabase.Activity.ListAngel.SaintMaria.DetailAngelSaintMariaActivity;
import com.destiny.angelsquaddatabase.Activity.ListAngel.Wolf.DetailAngelWolfActivity;
import com.destiny.angelsquaddatabase.Method.Destiny;
import com.destiny.angelsquaddatabase.Model.Model;
import com.destiny.angelsquaddatabase.R;

import java.util.ArrayList;

public class AdapterAngel extends RecyclerView.Adapter<AdapterAngel.CardViewViewHolder> {
    private Context context;
    private ArrayList<Model> list;
    String faction;
    private ArrayList<Model> getList() {
        return list;
    }
    public void setList(ArrayList<Model> list) {
        this.list = list;
    }
    public AdapterAngel(Context context,String faction) {
        this.context = context;
        this.faction = faction;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_angel, viewGroup, false);
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
        Glide.with(context)
                .load(destiny.Checker(p.getFaction()))
                .apply(new RequestOptions().override(200, 200))
                .into(holder.imgFaction);
        holder.tvName.setText(p.getNama()+" - "+p.getRealname());
        holder.tvDeskripsi.setText(destiny.SmallDescription(p.getDeskripsi()));
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (faction.equals("Flaming Vita")){
                    Intent i = new Intent(context, DetailAngelFlamingVitaActivity.class);
                    i.putExtra("ID", p.getId());
                    i.putExtra("NAMA", p.getNama());
                    i.putExtra("GAMBAR",p.getGambar());
                    i.putExtra("DESKRIPSI",p.getDeskripsi());
                    i.putExtra("VA", p.getVa());
                    i.putExtra("FACTION", p.getFaction());
                    i.putExtra("REALNAME", p.getRealname());
                    i.putExtra("WEAPON", p.getWeapon());
                    i.putExtra("RARITY", p.getRarity());
                    context.startActivity(i);
                }else if (faction.equals("Saint Maria")){
                    Intent i = new Intent(context, DetailAngelSaintMariaActivity.class);
                    i.putExtra("ID", p.getId());
                    i.putExtra("NAMA", p.getNama());
                    i.putExtra("GAMBAR",p.getGambar());
                    i.putExtra("DESKRIPSI",p.getDeskripsi());
                    i.putExtra("VA", p.getVa());
                    i.putExtra("FACTION", p.getFaction());
                    i.putExtra("REALNAME", p.getRealname());
                    i.putExtra("WEAPON", p.getWeapon());
                    i.putExtra("RARITY", p.getRarity());
                    context.startActivity(i);
                }else if (faction.equals("WOLF")){
                    Intent i = new Intent(context, DetailAngelWolfActivity.class);
                    i.putExtra("ID", p.getId());
                    i.putExtra("NAMA", p.getNama());
                    i.putExtra("GAMBAR",p.getGambar());
                    i.putExtra("DESKRIPSI",p.getDeskripsi());
                    i.putExtra("VA", p.getVa());
                    i.putExtra("FACTION", p.getFaction());
                    i.putExtra("REALNAME", p.getRealname());
                    i.putExtra("WEAPON", p.getWeapon());
                    i.putExtra("RARITY", p.getRarity());
                    context.startActivity(i);
                }else if (faction.equals("JUDE")){
                    Intent i = new Intent(context, DetailAngelJudeActivity.class);
                    i.putExtra("ID", p.getId());
                    i.putExtra("NAMA", p.getNama());
                    i.putExtra("GAMBAR",p.getGambar());
                    i.putExtra("DESKRIPSI",p.getDeskripsi());
                    i.putExtra("VA", p.getVa());
                    i.putExtra("FACTION", p.getFaction());
                    i.putExtra("REALNAME", p.getRealname());
                    i.putExtra("WEAPON", p.getWeapon());
                    i.putExtra("RARITY", p.getRarity());
                    context.startActivity(i);
                }else if (faction.equals("FLD")){
                    Intent i = new Intent(context, DetailAngelFLDActivity.class);
                    i.putExtra("ID", p.getId());
                    i.putExtra("NAMA", p.getNama());
                    i.putExtra("GAMBAR",p.getGambar());
                    i.putExtra("DESKRIPSI",p.getDeskripsi());
                    i.putExtra("VA", p.getVa());
                    i.putExtra("FACTION", p.getFaction());
                    i.putExtra("REALNAME", p.getRealname());
                    i.putExtra("WEAPON", p.getWeapon());
                    i.putExtra("RARITY", p.getRarity());
                    context.startActivity(i);
                }
            }
        });
    }



    @Override
    public int getItemCount() {
        return getList().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto,imgFaction;
        TextView tvName,tvDeskripsi,tvTanggal;
        CardView card;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.ivImage);
            imgFaction = itemView.findViewById(R.id.ivFaction);
            tvName = itemView.findViewById(R.id.tvNama);
            tvDeskripsi = itemView.findViewById(R.id.tvDeskripsi);
            tvTanggal = itemView.findViewById(R.id.tvTanggal);
            card = itemView.findViewById(R.id.cardAngel);
        }
    }
}
