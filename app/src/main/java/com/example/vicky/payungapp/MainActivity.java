package com.example.vicky.payungapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> mStory =  new ArrayList<>();
    private ArrayList<String> mOrang = new ArrayList<>();
    private ArrayList<String> mPicture =  new ArrayList<>();
    private ArrayList<String> mJudulseacrh= new ArrayList<>();
    private ArrayList<String> mKeterangan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.seacrh:
                        break;
                    case R.id.chat:
                        Intent intent1 = new Intent(MainActivity.this, activity_chat.class);
                        startActivity(intent1);
                        break;
                    case R.id.timeline:
                        Intent intent2 = new Intent(MainActivity.this, Activity_timeline.class);
                        startActivity(intent2);
                        break;
                    case R.id.community:
                        Intent intent3 = new Intent(MainActivity.this, Activity_community.class);
                        startActivity(intent3);
                        break;
                    case R.id.profile:
                        Intent intent4 = new Intent(MainActivity.this, Activity_profile.class);
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
        mStory.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mOrang.add("Andi");
        mStory.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mOrang.add("Andi");
        mStory.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mOrang.add("Andi");
        mStory.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mOrang.add("Andi");
        mStory.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mOrang.add("Andi");
        mStory.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mOrang.add("Andi");


        initRecyclerView();
    }
    private void initRecyclerView(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.seacrb);
        recyclerView.setLayoutManager(layoutManager);
        Recyclerviewadapterseacrh recyclerviewadapterseacrh = new Recyclerviewadapterseacrh(this, mStory,mOrang);
        recyclerView.setAdapter(recyclerviewadapterseacrh);
    }
    private void getImages1(){
        mPicture.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mJudulseacrh.add("Patient");
        mKeterangan.add("Needs Your Help");

        mPicture.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg");
        mJudulseacrh.add("Patient");
        mKeterangan.add("Needs Your Help");



        initRecyclerView1();
    }
    private void initRecyclerView1(){
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = findViewById(R.id.choosebawah);
        recyclerView.setLayoutManager(layoutManager);
        Recyclerviewadapterseacrh2 recyclerviewadapterseacrh2 = new Recyclerviewadapterseacrh2(this, mPicture,mJudulseacrh,mKeterangan);
        recyclerView.setAdapter(recyclerviewadapterseacrh2);
    }
}
