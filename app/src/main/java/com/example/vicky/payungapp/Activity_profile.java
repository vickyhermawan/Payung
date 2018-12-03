package com.example.vicky.payungapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Activity_profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        TextView title= (TextView) findViewById(R.id.profile);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(4);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.seacrh:
                        Intent intent0 = new Intent(Activity_profile.this, MainActivity.class);
                        startActivity(intent0);
                        break;
                    case R.id.chat:
                        Intent intent1 = new Intent(Activity_profile.this, activity_chat.class);
                        startActivity(intent1);
                        break;
                    case R.id.timeline:
                        Intent intent2 = new Intent(Activity_profile.this, Activity_timeline.class);
                        startActivity(intent2);
                        break;
                    case R.id.community:
                        Intent intent3 = new Intent(Activity_profile.this, Activity_community.class);
                        startActivity(intent3);
                        break;
                    case R.id.profile:
                        break;
                }


                return false;
            }
        });


    }
}
