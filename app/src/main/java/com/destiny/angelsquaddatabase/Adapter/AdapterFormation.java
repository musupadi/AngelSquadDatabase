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
import com.destiny.angelsquaddatabase.Activity.FormasiArena.FormationActivity;
import com.destiny.angelsquaddatabase.Activity.ListAngel.FlamingVita.DetailAngelFlamingVitaActivity;
import com.destiny.angelsquaddatabase.Model.Model;
import com.destiny.angelsquaddatabase.R;

import java.util.ArrayList;

public class AdapterFormation extends RecyclerView.Adapter<AdapterFormation.CardViewViewHolder> {
    private Context context;
    private ArrayList<Model> list;
    String faction;
    private ArrayList<Model> getList() {
        return list;
    }
    public void setList(ArrayList<Model> list) {
        this.list = list;
    }
    public AdapterFormation(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_formation, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterFormation.CardViewViewHolder holder, int position) {
        final Model p = getList().get(position);
        if (p.getRole().equals("Developer")){
            holder.imgPhoto.setImageResource(Integer.parseInt(p.getGambar()));
        }else{
            Glide.with(context)
                    .load(p.getGambar())
                    .apply(new RequestOptions().override(200, 200))
                    .into(holder.imgPhoto);
        }
        Glide.with(context)
                .load(p.getCore())
                .apply(new RequestOptions().override(200, 200))
                .into(holder.imgPhoto2);
        holder.tvName.setText(p.getNama());
        holder.tvDeskripsi.setText(p.getUserid());
        holder.tvCore.setText(p.getCoreName());
        holder.tvFormation.setText(p.getFormation());
        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, FormationActivity.class);
                i.putExtra("ID", p.getId());
                i.putExtra("NAMA", p.getNama());
                i.putExtra("USERID",p.getUserid());
                i.putExtra("ROLE",p.getRole());
                i.putExtra("GAMBAR", p.getGambar());
                i.putExtra("IMG1", p.getImage1());
                i.putExtra("TIMG1", p.getName1());
                i.putExtra("IMG2", p.getImage2());
                i.putExtra("TIMG2", p.getName2());
                i.putExtra("IMG3", p.getImage3());
                i.putExtra("TIMG3", p.getName3());
                i.putExtra("IMG4", p.getImage4());
                i.putExtra("TIMG4", p.getName4());
                i.putExtra("IMG5", p.getImage5());
                i.putExtra("TIMG5", p.getName5());
                i.putExtra("IMG6", p.getImage6());
                i.putExtra("TIMG6", p.getName6());
                i.putExtra("IMG7", p.getImage7());
                i.putExtra("TIMG7", p.getName7());
                i.putExtra("IMG8", p.getImage8());
                i.putExtra("TIMG8", p.getName8());
                i.putExtra("IMG9", p.getImage9());
                i.putExtra("TIMG9", p.getName9());
                i.putExtra("IMG10", p.getImage10());
                i.putExtra("TIMG10", p.getName10());
                i.putExtra("IMG11", p.getImage11());
                i.putExtra("TIMG11", p.getName11());
                i.putExtra("IMG12", p.getImage12());
                i.putExtra("TIMG12", p.getName12());
                i.putExtra("CORE", p.getCore());
                i.putExtra("CORENAME", p.getCoreName());
                context.startActivity(i);
            }
        });
    }



    @Override
    public int getItemCount() {
        return getList().size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder{
        ImageView imgPhoto,imgFaction,imgPhoto2;
        TextView tvName,tvDeskripsi,tvCore,tvFormation;
        CardView card;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.ivImage);
            imgPhoto2 = itemView.findViewById(R.id.ivImage2);
            tvName = itemView.findViewById(R.id.tvNama);
            tvCore = itemView.findViewById(R.id.tvCoreName);
            tvDeskripsi = itemView.findViewById(R.id.tvDeskripsi);
            tvFormation = itemView.findViewById(R.id.tvFormation);
            card = itemView.findViewById(R.id.cardAbout);
        }
    }

}
