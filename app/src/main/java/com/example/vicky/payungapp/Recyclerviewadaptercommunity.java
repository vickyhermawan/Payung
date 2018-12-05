package com.example.vicky.payungapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Recyclerviewadaptercommunity extends RecyclerView.Adapter<Recyclerviewadaptercommunity.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapterCommunity";

    private ArrayList<String> mGambar =  new ArrayList<>();
    private ArrayList<String> mJudul = new ArrayList<>();
    private ArrayList<String> mDeskripsi = new ArrayList<>();
    private ArrayList<String> mTombol = new ArrayList<>();
    private Context mContext;

    public Recyclerviewadaptercommunity(Context mContext, ArrayList<String> mGambar, ArrayList<String> mJudul, ArrayList<String> mDeskripsi, ArrayList<String> mTombol) {
        this.mContext = mContext;
        this.mGambar = mGambar;
        this.mJudul = mJudul;
        this.mDeskripsi = mDeskripsi;
        this.mTombol = mTombol;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout_community,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(mGambar.get(position))
                .into(holder.gambar);
        holder.judul.setText(mJudul.get(position));
        holder.deskripsi.setText(mDeskripsi.get(position));
        holder.tombol.setText(mTombol.get(position));

        holder.gambar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, mJudul.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mGambar.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView gambar;
        TextView judul;
        TextView deskripsi;
        TextView tombol;

        public ViewHolder(View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.gambar);
            judul = itemView.findViewById(R.id.judul);
            deskripsi = itemView.findViewById(R.id.deskripsi);
            tombol = itemView.findViewById(R.id.tombol);
        }
    }
}
