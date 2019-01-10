package com.iitb.mems.myapplication;

/**
 * Created by ekalpa on 1/9/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;

public class MainActivity1 extends AppCompatActivity {
    private SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        session = new SessionManager(getApplicationContext());

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        if ((session.getPictureViewMode()==0 && session.getLanguage()==0)){
            viewPager.setAdapter(new CustomPagerAdapter(this));
        }
        else if (session.getPictureViewMode()==0 && session.getLanguage()==1){
            viewPager.setAdapter(new CustomPagerAdapterm(this));
        }
        else if ((session.getPictureViewMode()==1 && session.getLanguage()==0)){
            viewPager.setAdapter(new CustomPagerAdapter1(this));
        }
        else if (session.getPictureViewMode()==1 && session.getLanguage()==1){
            viewPager.setAdapter(new CustomPagerAdapter1m(this));
        }
        else if ((session.getPictureViewMode()==2 && session.getLanguage()==0)){
            viewPager.setAdapter(new CustomPagerAdapter2(this));
        }
        else if (session.getPictureViewMode()==2 && session.getLanguage()==1){
            viewPager.setAdapter(new CustomPagerAdapter2m(this));
        }
        else if ((session.getPictureViewMode()==3 && session.getLanguage()==0)){
            viewPager.setAdapter(new CustomPagerAdapter3(this));
        }
        else if (session.getPictureViewMode()==3 && session.getLanguage()==1){
            viewPager.setAdapter(new CustomPagerAdapter3m(this));
        }
        else if ((session.getPictureViewMode()==4 && session.getLanguage()==0)){
            viewPager.setAdapter(new CustomPagerAdapter4(this));
        }
        else if (session.getPictureViewMode()==4 && session.getLanguage()==1){
            viewPager.setAdapter(new CustomPagerAdapter4m(this));
        }


    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent i = new Intent(MainActivity1.this, MainActivity.class);
            startActivity(i);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
