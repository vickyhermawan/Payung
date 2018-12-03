package com.example.vicky.payungapp;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Flash extends AppCompatActivity {

    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;

    private TextView[] mDots;

    private SliderAdapter sliderAdapter;

    private Button mBtnNext;
    private Button mBtnBack;

    private int mCurrentPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash);

    mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager);
    mDotLayout = (LinearLayout) findViewById(R.id.dotsLayout);

    mBtnNext = (Button) findViewById(R.id.nextbtn);
    mBtnBack = (Button) findViewById(R.id.prevBtn);

    sliderAdapter = new SliderAdapter(this);
    mSlideViewPager.setAdapter(sliderAdapter);

    addDotsIndicator(0);

    mSlideViewPager.addOnPageChangeListener(viewListener);

    mBtnNext.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            mSlideViewPager.setCurrentItem(mCurrentPage + 1);
        }
    });

    mBtnBack.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            mSlideViewPager.setCurrentItem(mCurrentPage - 1);
        }
    });
    }

    public void addDotsIndicator(int position){
        mDots = new TextView[3];
        mDotLayout.removeAllViews();

        for (int i=0; i < mDots.length; i++){
            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.colorWhiteTransparent));

            mDotLayout.addView(mDots[i]);
        }
        if(mDots.length > 0){
            mDots[position].setTextColor(getResources().getColor(R.color.colorWhite));
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
            mCurrentPage=i;

            if (i == 0){
                mBtnNext.setEnabled(true);
                mBtnBack.setEnabled(false);
                mBtnBack.setVisibility(View.INVISIBLE);

                mBtnNext.setText("Next");
                mBtnBack.setText("");
            }else if(i == mDots.length - 1){
                mBtnNext.setEnabled(true);
                mBtnBack.setEnabled(true);
                mBtnBack.setVisibility(View.VISIBLE);

                mBtnNext.setText("Finish");
                mBtnNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openLogin();
                    }
                });
                mBtnBack.setText("Back");
            }else{
                mBtnNext.setEnabled(true);
                mBtnBack.setEnabled(true);
                mBtnBack.setVisibility(View.VISIBLE);

                mBtnNext.setText("Next");
                mBtnBack.setText("Back");
            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };

    private void openLogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

}
