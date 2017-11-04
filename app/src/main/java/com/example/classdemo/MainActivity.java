package com.example.classdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private int mState = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView cookieImg = (ImageView) findViewById(R.id.cookieImg);
        final Button cookieBtn = (Button) findViewById(R.id.cookieBtn);

        cookieBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.v("MainActivity","Somebody clicked me!");
                if (mState == 0) {
                    cookieImg.setImageResource(R.drawable.after_cookie);
                    cookieBtn.setText("I am Full");
                    mState = 1;
                } else {
                    cookieImg.setImageResource(R.drawable.before_cookie);
                    cookieBtn.setText("I am Hungry");
                    mState = 0;
                }

            }
        });

        /*
        cookieBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.v("MainActivity","Btn clicked");
                if (mState == 0) {
                    cookieImg.setImageResource(R.drawable.after_cookie);
                    cookieBtn.setText("I am Full");
                    mState = 1;
                } else {
                    cookieImg.setImageResource(R.drawable.before_cookie);
                    cookieBtn.setText("I am Hungry");
                    mState = 0;
                }

            }
        });
        */
    }
}
