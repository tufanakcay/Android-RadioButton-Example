package com.tufanakcay.androidradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    RadioButton rdBtn_01, rdBtn_02, rdBtn_03, rdBtn_04;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        init();
        radioBtnSelect();
    }

    private void init() {
        rdBtn_01 = findViewById(R.id.rd_Btn1);
        rdBtn_02 = findViewById(R.id.rd_Btn2);
        rdBtn_03 = findViewById(R.id.rd_Btn3);
        rdBtn_04 = findViewById(R.id.rd_Btn4);
        imageView = findViewById(R.id.imageView);
    }


    private void radioBtnSelect(){

        rdBtn_01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.one);
                Toast.makeText(FirstActivity.this, rdBtn_01.getText() +" selected", Toast.LENGTH_SHORT).show();

            }
        });

        rdBtn_02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.two);
                Toast.makeText(FirstActivity.this, rdBtn_02.getText() +" selected", Toast.LENGTH_SHORT).show();
            }
        });


        rdBtn_03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.four);
                Toast.makeText(FirstActivity.this, rdBtn_03.getText() +" selected", Toast.LENGTH_SHORT).show();
            }
        });

        rdBtn_04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView.setImageResource(R.drawable.five);
                Toast.makeText(FirstActivity.this, rdBtn_04.getText() +" selected", Toast.LENGTH_SHORT).show();
            }
        });

    }
}