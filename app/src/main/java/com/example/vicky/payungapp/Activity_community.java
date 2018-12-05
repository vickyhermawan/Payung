package com.example.vicky.payungapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity_community extends AppCompatActivity {
    private ArrayList<String> mGambar =  new ArrayList<>();
    private ArrayList<String> mJudul = new ArrayList<>();
    private ArrayList<String> mDeskripsi = new ArrayList<>();
    private ArrayList<String> mTombol = new ArrayList<>();
    private ArrayList<String> mGambar1 =  new ArrayList<>();
    private ArrayList<String> mJudul1 = new ArrayList<>();
    private ArrayList<String> mDeskripsi1 = new ArrayList<>();
    private ArrayList<String> mTombol1 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);



        TextView title= (TextView) findViewById(R.id.community);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.seacrh:
                        Intent intent0 = new Intent(Activity_community.this, MainActivity.class);
                        startActivity(intent0);
                        break;
                    case R.id.chat:
                        Intent intent1 = new Intent(Activity_community.this, activity_chat.class);
                        startActivity(intent1);
                        break;
                    case R.id.timeline:
                        Intent intent2 = new Intent(Activity_community.this, Activity_timeline.class);
                        startActivity(intent2);
                        break;
                    case R.id.community:
                        break;
                    case R.id.profile:
                        Intent intent4 = new Intent(Activity_community.this, Activity_profile.class);
                        startActivity(intent4);
                        break;
                }


                return false;
            }
        });

        getImages();
        getImages1();

    }

    private void getImages(){
        mGambar.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mJudul.add("REHABILITASI");
        mDeskripsi.add("Bantu dan Ringankan");
        mTombol.add("Bantu");


        mGambar.add("https://i.redd.it/tpsnoz5bzo501.jpg");
        mJudul.add("KANKER");
        mDeskripsi.add("Beri dia semangat");
        mTombol.add("Care");

        mGambar.add("https://i.redd.it/qn7f9oqu7o501.jpg");
        mJudul.add("DISABILITAS");
        mDeskripsi.add("Peduli adalah Kunci");
        mTombol.add("Peduli");
        initRecyclerView();
    }
    private void initRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(layoutManager);
        Recyclerviewadaptercommunity recyclerviewadaptercommunity = new Recyclerviewadaptercommunity(this, mGambar, mJudul, mDeskripsi, mTombol);
        recyclerView.setAdapter(recyclerviewadaptercommunity);
    }
    private void getImages1(){
        mGambar1.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mJudul1.add("ANTI KANKER INDONESIA");
        mDeskripsi1.add("Gabung dalam salah satu Komunitas Anti Kanker yang menangani penyakit kanker di Indonesia");
        mTombol1.add("Partisipasi");

        mGambar1.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mJudul1.add("ANTI KANKER INDONESIA");
        mDeskripsi1.add("Gabung dalam salah satu Komunitas Anti Kanker yang menangani penyakit kanker di Indonesia");
        mTombol1.add("Partisipasi");
        initRecyclerView2();
    }
    private void initRecyclerView2(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = findViewById(R.id.recyclerview2);
        recyclerView.setLayoutManager(layoutManager);
        Recyvlerviewadaptercommunity2 recyclerviewadaptercommunity2 = new Recyvlerviewadaptercommunity2(this, mGambar1, mJudul1, mDeskripsi1, mTombol1);
        recyclerView.setAdapter(recyclerviewadaptercommunity2);
    }

}
