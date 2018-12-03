package com.example.vicky.payungapp;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){
        this.context = context;
    }

    public int[] slide_images ={
        R.drawable.nav_pasien,
        R.drawable.nav_pasienan,
        R.drawable.nav_pasienani
    };

    public String[] slide_headlings = {
            "Help people",
            "Protect people",
            "Support people"
    };

    public String[] slide_desc = {
            "Payung App membantu\n" +
                    "penderita agar tidak merasa\n" +
                    "sendirian dalam menderita\n" +
                    "penyakit",
            "Payung App mewadahi\n" +
                    "para penderita masalah\n" +
                    "psikologis untuk melakukan\n" +
                    " interaksi dengan pasien maupun \n" +
                    "orang yang bukan penderita lainnya.",
            "Payung App Membantu Para\n" +
                    "Penderita untuk merasakan\n" +
                    "semangat lagi dalam hidupnya.\n" +
                    "Juga membantu orang yang akan\n" +
                    "memberi dukungan \n" +
                    "kebaikan kepada penderita"
    };

    public int getCount(){
        return slide_headlings.length;
    }




    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (ConstraintLayout) o;
    }

    public Object instantiateItem(ViewGroup container, int position){
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container,false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.flash);
        TextView slideDecription = (TextView) view.findViewById(R.id.slide_dsc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headlings[position]);
        slideDecription.setText(slide_desc[position]);

        container.addView(view);
        return view;
    }

    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((ConstraintLayout)object);
    }


}
