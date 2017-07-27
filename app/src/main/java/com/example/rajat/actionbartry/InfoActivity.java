package com.example.rajat.actionbartry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InfoActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        getSupportActionBar().show();
    }
}
