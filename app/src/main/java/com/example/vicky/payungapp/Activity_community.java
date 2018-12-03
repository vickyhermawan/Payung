package com.example.vicky.payungapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Activity_community extends AppCompatActivity {

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

    }
}
