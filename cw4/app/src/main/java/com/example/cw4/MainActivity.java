package com.example.cw4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // connect xml components to the activity
        ViewPager vp = findViewById(R.id.vp);
        TabLayout tab = findViewById(R.id.tab);
        // connect tablayout to viewPager
        tab.setupWithViewPager(vp);
        FragAdapter f = new FragAdapter(getSupportFragmentManager());
        vp.setAdapter(f);

        // to set icons
        tab.getTabAt(0).setIcon(R.drawable.ic_baseline_brightness_1_24);
        tab.getTabAt(1).setIcon(R.drawable.ic_baseline_brightness_2_24);
        tab.getTabAt(2).setIcon(R.drawable.ic_baseline_brightness_3_24);
        // introduce adapter

    }
}