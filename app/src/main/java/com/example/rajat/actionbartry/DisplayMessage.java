package com.example.rajat.actionbartry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DisplayMessage extends MainActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        getSupportActionBar().show();

        listView = (ListView) findViewById(R.id.listView);
        String[] values = new String[]{"July 19 2017","July 20 2017" ,"July 21 2017",
                "July 22 2017", "July 23 2017","July 24 2017",
                "July 25 2017", "July 26 2017", "July 27 2017",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), News1Activity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 1) {
                    Toast.makeText(DisplayMessage.this,"No news for this date ",Toast.LENGTH_SHORT).show();
                }

                if (position == 2) {
                    Intent myIntent = new Intent(view.getContext(), News2Activity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 3) {
                    Intent myIntent = new Intent(view.getContext(), News3Activity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 4) {
                    Intent myIntent = new Intent(view.getContext(), News4Activity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 5) {
                    Toast.makeText(DisplayMessage.this,"No news for this date ",Toast.LENGTH_SHORT).show();
                }


                if (position == 6) {
                    Intent myIntent = new Intent(view.getContext(), News5Activity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 7) {
                    Intent myIntent = new Intent(view.getContext(), News6Activity.class);
                    startActivityForResult(myIntent, 0);
                }

                if (position == 8) {
                    Intent myIntent = new Intent(view.getContext(), News7Activity.class);
                    startActivityForResult(myIntent, 0);
                }


            }
        });
    }
}
