package com.example.reg_r161868;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView text_name,text_mail,text_pass,text_phone,text_roll,text_gender;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        text_name=findViewById(R.id.tv_name);
        text_mail=findViewById(R.id.tv_mail);
        text_pass=findViewById(R.id.tv_password);
        text_phone=findViewById(R.id.tv_phone);
        text_roll=findViewById(R.id.tv_roll);
        text_gender=findViewById(R.id.tv_gender);
        Intent intent=getIntent();
        String na=intent.getStringExtra("name");
        String roll_num=intent.getStringExtra("rollnum");
        String phone_num=intent.getStringExtra("phonenum");
        String mail_id=intent.getStringExtra("email");
        String password=intent.getStringExtra("password");
        String gen_id=intent.getStringExtra("gen");
        text_name.setText(na);
        text_mail.setText(mail_id);
        text_roll.setText(roll_num);
        text_phone.setText(phone_num);
        text_pass.setText(password);
        text_gender.setText(gen_id);

    }
}