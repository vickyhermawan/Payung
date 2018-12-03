package com.example.vicky.payungapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

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
    }
}
