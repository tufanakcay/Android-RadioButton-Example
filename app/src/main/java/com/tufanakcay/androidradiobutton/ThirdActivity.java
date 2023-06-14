package com.tufanakcay.androidradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    RadioButton rdBtn_01, rdBtn_02, rdBtn_03, rdBtn_04;
    RadioGroup radioGroup;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        init();
        imgSelect();
    }

    private void init() {
        rdBtn_01 = findViewById(R.id.rd_Btn1);
        rdBtn_02 = findViewById(R.id.rd_Btn2);
        rdBtn_03 = findViewById(R.id.rd_Btn3);
        rdBtn_04 = findViewById(R.id.rd_Btn4);
        radioGroup = findViewById(R.id.radioGroup);
        imageView = findViewById(R.id.imageView);

    }

    private  void imgSelect(){
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                int getID =checkedId;
                selectImage(getID);
            }
        });


    }

    private void selectImage(int id) {
        if (id == R.id.rd_Btn1) {
            imageView.setImageResource(R.drawable.one);
            Toast.makeText(this, rdBtn_01.getText() + " selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.rd_Btn2) {
            imageView.setImageResource(R.drawable.two);
            Toast.makeText(this, rdBtn_02.getText() + " selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.rd_Btn3) {
            imageView.setImageResource(R.drawable.three);
            Toast.makeText(this, rdBtn_03.getText() + " selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.rd_Btn4) {
            imageView.setImageResource(R.drawable.four);
            Toast.makeText(this, rdBtn_04.getText() + " selected", Toast.LENGTH_SHORT).show();
        }

    }
}