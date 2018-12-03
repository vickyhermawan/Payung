package com.example.vicky.payungapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Activity_timeline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timeline);

        TextView title= (TextView) findViewById(R.id.timeline);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.seacrh:
                        Intent intent0 = new Intent(Activity_timeline.this, MainActivity.class);
                        startActivity(intent0);
                        break;
                    case R.id.chat:
                        Intent intent1 = new Intent(Activity_timeline.this, activity_chat.class);
                        startActivity(intent1);
                        break;
                    case R.id.timeline:
                        break;
                    case R.id.community:
                        Intent intent3 = new Intent(Activity_timeline.this, Activity_community.class);
                        startActivity(intent3);
                        break;
                    case R.id.profile:
                        Intent intent4 = new Intent(Activity_timeline.this, Activity_profile.class);
                        startActivity(intent4);
                        break;
                }


                return false;
            }
        });


    }
}
