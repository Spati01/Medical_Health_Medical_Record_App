package com.example.medicalhistory;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.medicalhistory.Adapters.ViewPagerAdapter;
import com.example.medicalhistory.Fragments.RecorderFragment;
import com.example.medicalhistory.Fragments.RecordingsFragment;
import com.google.android.material.tabs.TabLayout;

public class RecordActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        toolbar =findViewById(R.id.toolbar);
        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);

     //   setSupportActionBar(toolbar);

        setupViewpager(viewPager);
        tabLayout.setupWithViewPager(viewPager);

    }
    private void setupViewpager(ViewPager viewPager){
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
         viewPagerAdapter.addFragment(new RecorderFragment(),"Recorder");
         viewPagerAdapter.addFragment(new RecordingsFragment(),"Recording");
         viewPager.setAdapter(viewPagerAdapter);
    }
}