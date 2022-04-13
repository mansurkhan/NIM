package com.example.nim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.nim.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_SCREEN =5000;
    Animation topAnimation,bottomAnimation;
    TextView Heading,SubHeading;
    ImageView Logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation =AnimationUtils.loadAnimation(this,R.anim.bottom_animation);;

        Heading = findViewById(R.id.tvHeading);
        SubHeading = findViewById(R.id.tvSubHeading);
        Logo = findViewById(R.id.iv_logo);

        Logo.setAnimation(topAnimation);
        //Heading.setAnimation(bottomAnimation);
        SubHeading.setAnimation(bottomAnimation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),Dashboard.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}