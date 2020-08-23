package com.example.reg_r161868;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    TextView text_name,text_mail,text_pass,text_phone,text_roll,text_gender,text_branch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        text_name=findViewById(R.id.tv_name);
        text_mail=findViewById(R.id.tv_mail);
        text_pass=findViewById(R.id.tv_password);
        text_phone=findViewById(R.id.tv_phone);
        text_roll=findViewById(R.id.tv_roll);
        text_gender=findViewById(R.id.tv_gender);
        text_branch=findViewById(R.id.tv_branch);
        Intent intent=getIntent();
        String na=intent.getStringExtra("name");
        String roll_num=intent.getStringExtra("rollnum");
        String phone_num=intent.getStringExtra("phonenum");
        String mail_id=intent.getStringExtra("email");
        String password=intent.getStringExtra("password");
        String gen_id=intent.getStringExtra("i_gender");
        String regi_branch=intent.getStringExtra("branches");
        text_name.setText(na);
        text_mail.setText(mail_id);
        text_roll.setText(roll_num);
        text_phone.setText(phone_num);
        text_pass.setText(password);
        text_gender.setText(gen_id);
        text_branch.setText(regi_branch);

    }
}