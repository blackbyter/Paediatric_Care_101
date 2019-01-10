package com.iitb.mems.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;

import com.github.paolorotolo.appintro.AppIntro;

/**
 * Created by ekalpa on 1/7/2017.
 */

public class IntroActivity extends AppIntro {

    private SessionManager session;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        session = new SessionManager(getApplicationContext());

        if (session.getLanguage()==1){
            addSlide(SampleSlide.newInstance(R.layout.intro0m));
            addSlide(SampleSlide.newInstance(R.layout.introm));
            addSlide(SampleSlide.newInstance(R.layout.intro2m));
            addSlide(SampleSlide.newInstance(R.layout.intro1m));
            addSlide(SampleSlide.newInstance(R.layout.intro3m));
        }
        else {
            addSlide(SampleSlide.newInstance(R.layout.intro0));
            addSlide(SampleSlide.newInstance(R.layout.intro));
            addSlide(SampleSlide.newInstance(R.layout.intro2));
            addSlide(SampleSlide.newInstance(R.layout.intro1));
            addSlide(SampleSlide.newInstance(R.layout.intro3));
        }
        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));

        showSkipButton(true);
        setProgressButtonEnabled(true);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent = new Intent(IntroActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent = new Intent(IntroActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent i = new Intent(IntroActivity.this, MainActivity.class);
            startActivity(i);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
