package com.example.rajat.actionbartry;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends MainActivity {

    EditText firstname,lastname,designation,email,lab,password,username;
    String str_firstname,str_lastname,str_designation,str_email,str_lab,str_password,str_username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        firstname= (EditText)findViewById(R.id.et_firstname);
        lastname= (EditText)findViewById(R.id.et_lastname);
        designation= (EditText)findViewById(R.id.et_designation);
        email= (EditText)findViewById(R.id.et_email);
        lab=(EditText)findViewById(R.id.et_lab);
        password= (EditText)findViewById(R.id.et_password);
        username= (EditText)findViewById(R.id.et_username);
        getSupportActionBar().show();

    }
    public void OnRegister(View view){
        String str_firstname=firstname.getText().toString();
        String str_lastname=lastname.getText().toString();
        String str_designation=designation.getText().toString();

        String str_email=email.getText().toString();
        String str_lab=lab.getText().toString();
        String str_password=password.getText().toString();
        String str_username=username.getText().toString();
        String type="register";

        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type,str_firstname,str_lastname,str_designation,str_email,str_lab,str_password,str_username );



    }

}
