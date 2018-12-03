package com.example.vicky.payungapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class activity_chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        TextView title= (TextView) findViewById(R.id.chat);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.seacrh:
                        Intent intent0 = new Intent(activity_chat.this, MainActivity.class);
                        startActivity(intent0);
                        break;
                    case R.id.chat:
                        break;
                    case R.id.timeline:
                        Intent intent2 = new Intent(activity_chat.this, Activity_timeline.class);
                        startActivity(intent2);
                        break;
                    case R.id.community:
                        Intent intent3 = new Intent(activity_chat.this, Activity_community.class);
                        startActivity(intent3);
                        break;
                    case R.id.profile:
                        Intent intent4 = new Intent(activity_chat.this, Activity_profile.class);
                        startActivity(intent4);
                        break;
                }


                return false;
            }
        });

    }
}
