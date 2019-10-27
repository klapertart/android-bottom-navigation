package com.ostrue.app.bottomtab;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity
        extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener,
        PostFragment.OnFragmentInteractionListener,
        ExploreFragment.OnFragmentInteractionListener,
        UserFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView btNav = findViewById(R.id.bottom_navigation);
        btNav.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        Fragment fragment = null;

        switch (item.getItemId()){
            case R.id.nav_explore :
                fragment = new ExploreFragment();
                break;
            case R.id.nav_post :
                fragment = new PostFragment();
                break;
            case R.id.nav_user :
                fragment = new UserFragment();
                break;
        }

        return loadFragment(fragment);
    }

    private boolean loadFragment(Fragment fragment){
        if(fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container,fragment)
                    .commit();
            return true;
        }
        return false;
    }

    public void onPostFragmentInteraction(Uri uri){}
    public void onExploreFragmentInteraction(Uri uri){}
    public void onUserFragmentInteraction(Uri uri){}
}
