package com.example.rajat.actionbartry;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class RateActivity extends MainActivity {
    private static Button buttn_sbm;
    private static TextView t_v;
    private static RatingBar do_rate;
    String mystring="thank you for rating";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        getSupportActionBar().show();
        listnerRatingBar();
        onButtonClickListner();


    }


    public void listnerRatingBar(){

        t_v=(TextView)findViewById(R.id.rateText);
        do_rate=(RatingBar)findViewById(R.id.ratingBar);
        do_rate.setOnRatingBarChangeListener(
                new RatingBar.OnRatingBarChangeListener() {
                    @Override
                    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                        t_v.setText(String.valueOf(rating));
                    }
                }
        );


    }
    public void onButtonClickListner(){
        do_rate=(RatingBar)findViewById(R.id.ratingBar);
        buttn_sbm=(Button)findViewById(R.id.sub);
        buttn_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(RateActivity.this,"thankyou for rating ",Toast.LENGTH_SHORT).show();
                        //String.valueOf(do_rate.getRating())
                    }
                }
        );

    }

}
