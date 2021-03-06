package com.example.reg_r161868;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {


    EditText et1_name, et2_roll, et3_mail, et4_phone, et5_password;
    RadioGroup rg;
    Spinner sp_branch;
    String[] branches = {"CSE", "ECE", "Civil", "Mechanical"};
    String reg_name,reg_roll,reg_mail,reg_phone,reg_password,gen;
    String br;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1_name = findViewById(R.id.name);
        et2_roll = findViewById(R.id.roll);
        et3_mail = findViewById(R.id.mail);
        et4_phone = findViewById(R.id.phone);
        et5_password = findViewById(R.id.password);
        sp_branch = findViewById(R.id.spin);
//        btn=findViewById(R.id.submit);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, branches);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        sp_branch.setAdapter(arrayAdapter);
//        btn.setOnClickListener(this);
        sp_branch.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                br=branches[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }



    public void register(View view) {
        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
        reg_name= String.valueOf(et1_name.getText());
        reg_mail=String.valueOf(et3_mail.getText());
        reg_password=String.valueOf(et5_password.getText());
        reg_phone=String.valueOf(et4_phone.getText());
        reg_roll=String.valueOf(et2_roll.getText());
        intent.putExtra("name",reg_name);
        intent.putExtra("rollnum",reg_roll);
        intent.putExtra("email",reg_mail);
        intent.putExtra("phonenum",reg_phone);
        intent.putExtra("password",reg_password);
        intent.putExtra("i_gender",gen);
        intent.putExtra("branches",br);
        startActivity(intent);
    }


    public void genderselected(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.rb1:
                if (checked)
                    gen="male";
                    break;
            case R.id.rb2:
                if (checked)
                    gen="female";
                    break;
        }
    }
}