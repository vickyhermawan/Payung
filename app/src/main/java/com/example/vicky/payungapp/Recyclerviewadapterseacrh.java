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

import de.hdodenhof.circleimageview.CircleImageView;

public class Recyclerviewadapterseacrh extends RecyclerView.Adapter<Recyclerviewadapterseacrh.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapterCommunity";


    private ArrayList<String> mStory =  new ArrayList<>();
    private ArrayList<String> mOrang = new ArrayList<>();
    private Context mContext;

    public Recyclerviewadapterseacrh(Context mContext, ArrayList<String> mStory, ArrayList<String> mOrang) {
        this.mStory = mStory;
        this.mOrang = mOrang;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_layout_seacrh,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(mContext)
                .asBitmap()
                .load(mStory.get(position))
                .into(holder.story);
        holder.orang.setText(mOrang.get(position));

        holder.story.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, mOrang.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mStory.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView story;
        TextView orang;

        public ViewHolder(View itemView) {
            super(itemView);
            story = itemView.findViewById(R.id.story);
            orang = itemView.findViewById(R.id.orang);
        }
    }
}
