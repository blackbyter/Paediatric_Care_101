package com.iitb.mems.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;

import com.afollestad.easyvideoplayer.EasyVideoCallback;
import com.afollestad.easyvideoplayer.EasyVideoPlayer;

public class MyPlayerActivity extends AppCompatActivity implements EasyVideoCallback {

    // private static final String TEST_URL = "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4";

    public EasyVideoPlayer player;

    private SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myplayer);

        session = new SessionManager(getApplicationContext());

        // Grabs a reference to the player view
        player = (EasyVideoPlayer) findViewById(R.id.player);

        // Sets the callback to this Activity, since it inherits EasyVideoCallback
        player.setCallback(this);

        // Sets the source to the HTTP URL held in the TEST_URL variable.
        // To play files, you can use Uri.fromFile(new File("..."))


        if (session.getVideoTutorial()==5) {
            String path = "android.resource://" + getPackageName() + "/" + R.raw.bestbreastfeedingposition;
            player.setSource(Uri.parse(path));
        }
        if (session.getVideoTutorial()==1) {
            String path = "android.resource://" + getPackageName() + "/" + R.raw.breastcrawl;
            player.setSource(Uri.parse(path));
        }
        if (session.getVideoTutorial()==4) {
            String path = "android.resource://" + getPackageName() + "/" + R.raw.breastfeeding;
            player.setSource(Uri.parse(path));
        }
       /* if (session.getVideoTutorial()==2) {
            String path = "android.resource://" + getPackageName() + "/" + R.raw.breastmilk;
            player.setSource(Uri.parse(path));
        }*/
        if (session.getVideoTutorial()==6) {
            String path = "android.resource://" + getPackageName() + "/" + R.raw.burpbaby;
            player.setSource(Uri.parse(path));
        }
        if (session.getVideoTutorial()==3) {
            String path = "android.resource://" + getPackageName() + "/" + R.raw.latchon;
            player.setSource(Uri.parse(path));
        }
        if (session.getVideoTutorial()==0) {
            String path = "android.resource://" + getPackageName() + "/" + R.raw.makingofbreastmilk;
            player.setSource(Uri.parse(path));
        }
        if (session.getVideoTutorial()==2) {
            String path = "android.resource://" + getPackageName() + "/" + R.raw.agoodlatch;
            player.setSource(Uri.parse(path));
        }

        // From here, the player view will show a progress indicator until the player is prepared.
        // Once it's prepared, the progress indicator goes away and the controls become enabled for the user to begin playback.
    }

    @Override
    public void onPause() {
        super.onPause();
        // Make sure the player stops playing if the user presses the home button.
        player.pause();
    }

    // Methods for the implemented EasyVideoCallback

    @Override
    public void onPreparing(EasyVideoPlayer player) {
        // TODO handle if needed
    }

    @Override
    public void onPrepared(EasyVideoPlayer player) {
        // TODO handle
    }

    @Override
    public void onBuffering(int percent) {
        // TODO handle if needed
    }

    @Override
    public void onError(EasyVideoPlayer player, Exception e) {
        // TODO handle
    }

    @Override
    public void onCompletion(EasyVideoPlayer player) {
        // TODO handle if needed
    }

    @Override
    public void onRetry(EasyVideoPlayer player, Uri source) {
        // TODO handle if used
    }

    @Override
    public void onSubmit(EasyVideoPlayer player, Uri source) {
        // TODO handle if used
    }

    @Override
    public void onStarted(EasyVideoPlayer player) {
        // TODO handle if needed
    }

    @Override
    public void onPaused(EasyVideoPlayer player) {
        // TODO handle if needed
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent i = new Intent(MyPlayerActivity.this, MainActivity.class);
            startActivity(i);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
