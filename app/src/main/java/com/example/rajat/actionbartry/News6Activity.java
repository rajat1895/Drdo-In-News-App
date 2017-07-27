package com.example.rajat.actionbartry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class News6Activity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView mobWebView=new WebView(News6Activity.this);
        mobWebView.getSettings().setJavaScriptEnabled(true);
        //mWebView.getSettings().set(true);
        mobWebView.loadUrl("https://docs.google.com/gview?embedded=true&url="+"https://www.drdo.gov.in/drdo/pub/npc/2017/july/din-26July2017.pdf");
        setContentView(mobWebView);
        getSupportActionBar().show();

    }
}
