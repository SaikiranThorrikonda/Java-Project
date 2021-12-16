package com.example.fp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class UserDetailActivity extends AppCompatActivity {

    TextView textName,textEmail,textPhone;
    ImageView  userImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_detail);
        textName = findViewById(R.id.tv_uName);
        textEmail = findViewById(R.id.tv_uEmail);
        textPhone = findViewById(R.id.tv_uPhone);
        userImage = findViewById(R.id.userImage);
        int pos = getIntent().getIntExtra("pos", 0);

        textName.setText(getIntent().getStringExtra("name"));
        textEmail.setText(getIntent().getStringExtra("email"));
        textPhone.setText(getIntent().getStringExtra("phone"));
        if (pos == 0){
            userImage.setImageResource(R.drawable.icon01_01);
        }else  if (pos == 1){
            userImage.setImageResource(R.drawable.icon01_02);
        }else  if (pos == 2){
            userImage.setImageResource(R.drawable.icon01_03);
        }else  if (pos == 4){
            userImage.setImageResource(R.drawable.icon01_04);
        }else  if (pos == 5){
            userImage.setImageResource(R.drawable.icon01_05);
        }else  if (pos == 6){
            userImage.setImageResource(R.drawable.icon01_06);
        }else  if (pos == 7){
            userImage.setImageResource(R.drawable.icon01_07);
        }else  if (pos == 8){
            userImage.setImageResource(R.drawable.icon01_08);
        }else  if (pos == 9){
            userImage.setImageResource(R.drawable.icon01_09);
        }


    }
}