package com.iitb.mems.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Feedback extends AppCompatActivity {

    private Button bSubmit;
    EditText comments;

    TextView tv5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);

        tv5= (TextView)findViewById(R.id.tv5) ;
        bSubmit=(Button)findViewById(R.id.bSubmit);

        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        comments= (EditText)findViewById(R.id.comments);
        bSubmit = (Button) findViewById(R.id.bSubmit);
        bSubmit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                String cs  = comments.getText().toString();
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"shrutygupta0297@gmail.com"});
                email.putExtra(Intent.EXTRA_SUBJECT, "Jellow Feedback");
                email.putExtra(Intent.EXTRA_TEXT, "Comments and Suggestions:-\n"+cs);
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Choose an Email client :"));
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent i = new Intent(Feedback.this, MainActivity.class);
            startActivity(i);
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
