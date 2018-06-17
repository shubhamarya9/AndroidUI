package com.example.ivanrichard.condoelibrary;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1000;

    //the method is the first to be execute when the application runs
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Accessing the image on the main page
        ImageView image = (ImageView)findViewById(R.id.animation_image);

        //create animation object and specify the animation directory
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotate);

        //start the animation by specifying the object that needs animation start
        image.startAnimation(animation);

        //creating a delay before the next screen is open.
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent = new Intent(MainActivity.this,
                        HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
