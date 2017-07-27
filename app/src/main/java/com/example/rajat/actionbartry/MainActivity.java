package com.example.rajat.actionbartry;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText UsernameEt, PasswordEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UsernameEt = (EditText)findViewById(R.id.etUserName);
        PasswordEt = (EditText)findViewById(R.id.etPassword);
        ActionBar ab=getSupportActionBar();
        ab.setLogo(R.drawable.images);
        ab.setDisplayUseLogoEnabled(true);
        ab.setDisplayHomeAsUpEnabled(true);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater= getMenuInflater();
        menuInflater.inflate(R.menu.menu_activity,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
            if(id==R.id.info_id)
            {
                Intent infoAct = new Intent(this, InfoActivity.class);
                //Start Contact Intent
                startActivity(infoAct);
                return true;
            }
            else if(id== R.id.guest_id){

                Intent guestU = new Intent(this, DisplayMessage.class);
        //Start Contact Intent
        startActivity(guestU);
                Toast.makeText(getApplicationContext(),"welcome guest",Toast.LENGTH_SHORT).show();
        return true;}
            else if (id==  R.id.rate_id) {
                Intent rateIntent = new Intent(this, RateActivity.class);
                //Start Contact Intent
                startActivity(rateIntent);
                return true;
            }

            else if(id== R.id.logout)
            {
                Intent logIntent=new Intent(this,MainActivity.class);
                startActivity(logIntent);

                Toast.makeText(getApplicationContext(),"you have been logged out",Toast.LENGTH_SHORT).show();
                return true;
            }
            else if(id==R.id.home){
                NavUtils.navigateUpFromSameTask(this);
                return true;
            }



        return super.onOptionsItemSelected(item);


        }
    public void OnLogin(View view) {
        String username = UsernameEt.getText().toString();
        String password = PasswordEt.getText().toString();
        String type = "login";
        BackgroundWorker backgroundWorker = new BackgroundWorker(this);
        backgroundWorker.execute(type, username, password);
    }
    public void OpenReg(View view)
    {
        startActivity(new Intent(this,Register.class));


    }


}

