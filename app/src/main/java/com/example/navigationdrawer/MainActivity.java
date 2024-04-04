package com.example.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.navigationdrawer.Fragment.MakananFavorit;
import com.example.navigationdrawer.Fragment.MakananKhas;
import com.example.navigationdrawer.Fragment.MinumanKhas;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout = findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navView = findViewById(R.id.navi_view);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.MakKhas) {
                    showHomePage();
                }else if (itemId == R.id.MinKhas){
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content_frame, new MinumanKhas())
                            .commit();
                    getSupportActionBar().setTitle("Minuman Khas");
                }else {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.content_frame, new MakananFavorit())
                            .commit();
                    getSupportActionBar().setTitle("Makanan Favorit");
                }

                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });

        showHomePage();
    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }
    private void showHomePage() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_frame, new MakananKhas())
                .commit();

        getSupportActionBar().setTitle("Makanan Khas");
    }
}