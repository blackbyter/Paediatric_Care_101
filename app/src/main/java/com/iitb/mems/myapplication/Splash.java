package com.iitb.mems.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.KeyEvent;

/**
 * Created by ekalpa on 7/12/2016.
 */

public class Splash extends Activity {
    private SessionManager session;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        session = new SessionManager(getApplicationContext());

        if (session.getLanguage()==2){
            setContentView(R.layout.splashm);
        }
        else
            setContentView(R.layout.splash);

        new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                Intent intent = new Intent(Splash.this, IntroActivity.class);
                startActivity(intent);
            }
        }.start();
    }

    @Override
    protected void onPause() {
        finish();
        super.onPause();
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent i = new Intent(Splash.this, MainActivity.class);
            startActivity(i);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
