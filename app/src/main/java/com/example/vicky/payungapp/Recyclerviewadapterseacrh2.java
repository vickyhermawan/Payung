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

public class Recyclerviewadapterseacrh2 extends RecyclerView.Adapter<Recyclerviewadapterseacrh2.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapterCommunity";

    private ArrayList<String> mPicture =  new ArrayList<>();
    private ArrayList<String> mJudulseacrh= new ArrayList<>();
    private ArrayList<String> mKeterangan = new ArrayList<>();
    private Context mContext;

    public Recyclerviewadapterseacrh2(Context mContext, ArrayList<String> mPicture, ArrayList<String> mJudulseacrh, ArrayList<String> mKeterangan) {
        this.mContext = mContext;
        this.mPicture = mPicture;
        this.mJudulseacrh = mJudulseacrh;
        this.mKeterangan = mKeterangan;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.choose_layout_seacrh,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(mPicture.get(position))
                .into(holder.picture);
        holder.judulseacrh.setText(mJudulseacrh.get(position));
        holder.keterangan.setText(mKeterangan.get(position));

        holder.picture.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, mJudulseacrh.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mPicture.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView picture;
        TextView judulseacrh;
        TextView keterangan;


        public ViewHolder(View itemView) {
            super(itemView);
            picture = itemView.findViewById(R.id.picture);
            judulseacrh = itemView.findViewById(R.id.judulseacrh);
            keterangan = itemView.findViewById(R.id.keterangan);

        }
    }
}
