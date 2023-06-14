package com.tufanakcay.androidradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView first_tv, second_tv, third_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setActivity();
    }

    private void init(){
        first_tv = findViewById(R.id.first_textview);
        second_tv = findViewById(R.id.second_textview);
        third_tv = findViewById(R.id.third_textview);

    }

    private void setActivity(){
        first_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_one = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(intent_one);

            }
        });

        second_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_two = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent_two);

            }
        });

        third_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_three = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent_three);

            }
        });

    }



}