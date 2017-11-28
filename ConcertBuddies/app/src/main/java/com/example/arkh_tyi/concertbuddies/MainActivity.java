package com.example.arkh_tyi.concertbuddies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button MyBuddies;
    private Button RecommendBuddies;
    private Button MyEvents;
    private Button RecommendEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_screen);

        MyBuddies = (Button) findViewById(R.id.MyBuddiesButton);
        RecommendBuddies = (Button) findViewById(R.id.RecommendedBuddiesButton);
        MyEvents = (Button) findViewById(R.id.MyEventsButton);
        RecommendEvents = (Button) findViewById(R.id.RecommendedEventsButton);



        MyBuddies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ));
            }
        });

        RecommendBuddies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ));
            }
        });

        MyEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ));
            }
        });

        RecommendEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ));
            }
        });


    }


}
