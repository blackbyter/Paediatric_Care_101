package com.iitb.mems.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Spinner spinner, spinner1, tutorial;
    ArrayAdapter<CharSequence> adapter, adapter1, adapter2;
    Button button1, button2;
    int l, a, vt;
    String a1, a2, a3;
    TextView videoTutorial, selectLanguage, selectTime, clickme;
    private SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        session = new SessionManager(getApplicationContext());

        videoTutorial = (TextView)findViewById(R.id.video_tutorial);
        selectLanguage = (TextView)findViewById(R.id.selectLang);
        selectTime = (TextView)findViewById(R.id.selectTime);
        clickme = (TextView)findViewById(R.id.clickme);

        spinner = (Spinner) findViewById(R.id.spinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner1 = (Spinner) findViewById(R.id.spinner1);
        adapter1 = ArrayAdapter.createFromResource(this, R.array.timeperiod, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        tutorial = (Spinner) findViewById(R.id.tutorial);
        adapter2 = ArrayAdapter.createFromResource(this, R.array.video_tutorial, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        tutorial.setAdapter(adapter2);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);

        if (session.getLanguage()==1){
            adapter = ArrayAdapter.createFromResource(this, R.array.languages_marathi, android.R.layout.simple_spinner_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);
            adapter1 = ArrayAdapter.createFromResource(this, R.array.timeperiod_marathi, android.R.layout.simple_spinner_item);
            adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner1.setAdapter(adapter1);
            adapter2 = ArrayAdapter.createFromResource(this, R.array.video_tutorial_marathi, android.R.layout.simple_spinner_item);
            adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            tutorial.setAdapter(adapter2);
            button1.setText("वाचण्यासाठी येथे क्लिक करा");
            button2.setText("पाहण्यासाठी येथे क्लिक करा");
            videoTutorial.setText("व्हिडिओ ट्यूटोरियल");
            selectTime.setText("कालावधी निवडा");
            selectLanguage.setText("भाषा निवडा");
        }

        spinner.setSelection(session.getLanguage());
        spinner1.setSelection(session.getPictureViewMode());
        tutorial.setSelection(session.getVideoTutorial());

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("Position:" +position);
                a = position;
                a1 = "" + a;
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("Position:" +position);
                l = position;
                a2 = "" + l;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        tutorial.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("Position:" +position);
                vt = position;
                a3 = "" + vt;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                session.setLanguage(spinner.getSelectedItemPosition());
                session.setPictureViewMode(spinner1.getSelectedItemPosition());
                Intent i = new Intent(MainActivity.this, MainActivity1.class);
                startActivity(i);
                finish();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                session.setLanguage(spinner.getSelectedItemPosition());
                session.setVideoTutorial(tutorial.getSelectedItemPosition());
                Intent i = new Intent(MainActivity.this, MyPlayerActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent i = new Intent(MainActivity.this, MainActivity.class);
            startActivity(i);
            finish();

        } else if (id == R.id.nav_gallery) {
            Intent i = new Intent(MainActivity.this, IntroActivity.class);
            startActivity(i);
            finish();

        } else if (id == R.id.nav_slideshow) {
            Intent i = new Intent(MainActivity.this, MainActivity1.class);
            startActivity(i);
            finish();

        } else if (id == R.id.nav_share) {
            Intent i = new Intent(MainActivity.this, AboutUs.class);
            startActivity(i);
            finish();

        } else if (id == R.id.nav_send) {
            Intent i = new Intent(MainActivity.this, ContactUs.class);
            startActivity(i);
            finish();
        }

        else if (id == R.id.nav_send1) {
            Intent i = new Intent(MainActivity.this, Feedback.class);
            startActivity(i);
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) { // kills the activity on pressing the back button
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
