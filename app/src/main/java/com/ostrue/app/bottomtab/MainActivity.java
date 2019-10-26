package com.ostrue.app.bottomtab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView btNav = findViewById(R.id.bottom_navigation);
        btNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.nav_explore :
                        Toast.makeText(MainActivity.this, "Explore", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_post :
                        Toast.makeText(MainActivity.this, "Post", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_user :
                        Toast.makeText(MainActivity.this, "User", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });
    }
}
