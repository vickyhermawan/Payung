package com.example.vicky.payungapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Recyvlerviewadaptercommunity2 extends RecyclerView.Adapter<Recyvlerviewadaptercommunity2.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapterCommunity";

    private ArrayList<String> mGambar1 =  new ArrayList<>();
    private ArrayList<String> mJudul1 = new ArrayList<>();
    private ArrayList<String> mDeskripsi1 = new ArrayList<>();
    private ArrayList<String> mTombol1 = new ArrayList<>();
    private Context mContext;

    public Recyvlerviewadaptercommunity2(Context mContext, ArrayList<String> mGambar1, ArrayList<String> mJudul1, ArrayList<String> mDeskripsi1, ArrayList<String> mTombol1) {
        this.mContext = mContext;
        this.mGambar1 = mGambar1;
        this.mJudul1 = mJudul1;
        this.mDeskripsi1 = mDeskripsi1;
        this.mTombol1 = mTombol1;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout_community2,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(mGambar1.get(position))
                .into(holder.gambar1);
        holder.judul1.setText(mJudul1.get(position));
        holder.deskripsi1.setText(mDeskripsi1.get(position));
        holder.tombol1.setText(mTombol1.get(position));

        holder.gambar1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, mJudul1.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mGambar1.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView gambar1;
        TextView judul1;
        TextView deskripsi1;
        TextView tombol1;

        public ViewHolder(View itemView) {
            super(itemView);
            gambar1 = itemView.findViewById(R.id.gambar1);
            judul1 = itemView.findViewById(R.id.judul1);
            deskripsi1 = itemView.findViewById(R.id.deskripsi1);
            tombol1 = itemView.findViewById(R.id.tombol1);
        }
    }
}
