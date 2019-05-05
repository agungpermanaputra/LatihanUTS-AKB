package com.example.win10.agungpermanaputra;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class Home extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        loadFragment(new f_home());
        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.home_menu:
                fragment = new f_home();
                break;
            case R.id.activity_menu:
                fragment = new f_daily();
                break;
            case R.id.favorite_menu:
                fragment = new f_favorite();
                break;
            case R.id.gallery_menu:
                fragment = new f_gallery();
                break;
            case R.id.profile_menu:
                fragment = new f_profile();
                break;
        }
        return loadFragment(fragment);
    }
}

