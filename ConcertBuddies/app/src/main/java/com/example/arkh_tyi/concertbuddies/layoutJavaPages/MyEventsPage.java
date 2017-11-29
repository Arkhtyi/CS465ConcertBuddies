package com.example.arkh_tyi.concertbuddies.layoutJavaPages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.arkh_tyi.concertbuddies.R;

public class MyEventsPage extends AppCompatActivity {

    private RelativeLayout layout1;
    private RelativeLayout layout2;
    private RelativeLayout layout3;
    private RelativeLayout layout4;
    private RelativeLayout layout5;
    private RelativeLayout layout6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_events);

        layout1 = (RelativeLayout) findViewById(R.id.rel);
        layout2 = (RelativeLayout) findViewById(R.id.rel1);
        layout3 = (RelativeLayout) findViewById(R.id.rel2);
        layout4 = (RelativeLayout) findViewById(R.id.rel3);
        layout5 = (RelativeLayout) findViewById(R.id.rel4);
        layout6 = (RelativeLayout) findViewById(R.id.rel5);


        layout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyEventsPage.this, EventPage.class));
            }
        });
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyEventsPage.this, EventPage.class));
            }
        });
        layout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyEventsPage.this, EventPage.class));
            }
        });
        layout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyEventsPage.this, EventPage.class));
            }
        });
        layout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyEventsPage.this, EventPage.class));
            }
        });
        layout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyEventsPage.this, EventPage.class));
            }
        });

    }
}
