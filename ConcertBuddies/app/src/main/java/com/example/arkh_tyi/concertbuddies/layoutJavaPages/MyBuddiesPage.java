package com.example.arkh_tyi.concertbuddies.layoutJavaPages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.arkh_tyi.concertbuddies.R;

public class MyBuddiesPage extends AppCompatActivity {

    private TextView name1;
    private TextView name2;
    private TextView name3;
    private TextView name4;
    private TextView name5;
    private TextView name6;
    private TextView name7;
    private TextView name8;
    private TextView name9;
    private TextView name10;
    private TextView name11;
    private TextView name12;
    private TextView name13;
    private TextView name14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_buddies);

        name1 = (TextView) findViewById(R.id.name1);
        name2 = (TextView) findViewById(R.id.name2);
        name3 = (TextView) findViewById(R.id.name3);
        name4 = (TextView) findViewById(R.id.name4);
        name5 = (TextView) findViewById(R.id.name5);
        name6 = (TextView) findViewById(R.id.name6);
        name7 = (TextView) findViewById(R.id.name7);
        name8 = (TextView) findViewById(R.id.name8);
        name9 = (TextView) findViewById(R.id.name9);
        name10 = (TextView) findViewById(R.id.name10);
        name11 = (TextView) findViewById(R.id.name11);
        name12 = (TextView) findViewById(R.id.name12);
        name13 = (TextView) findViewById(R.id.name13);
        name14 = (TextView) findViewById(R.id.name14);


        name1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBuddiesPage.this, UserProfileActivity.class));
            }
        });
        name2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBuddiesPage.this, UserProfileActivity.class));
            }
        });
        name3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBuddiesPage.this, UserProfileActivity.class));
            }
        });
        name4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBuddiesPage.this, UserProfileActivity.class));
            }
        });
        name5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBuddiesPage.this, UserProfileActivity.class));
            }
        });
        name6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBuddiesPage.this, UserProfileActivity.class));
            }
        });
        name7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBuddiesPage.this, UserProfileActivity.class));
            }
        });
        name8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBuddiesPage.this, UserProfileActivity.class));
            }
        });
        name9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBuddiesPage.this, UserProfileActivity.class));
            }
        });
        name10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBuddiesPage.this, UserProfileActivity.class));
            }
        });
        name11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBuddiesPage.this, UserProfileActivity.class));
            }
        });
        name12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBuddiesPage.this, UserProfileActivity.class));
            }
        });
        name13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBuddiesPage.this, UserProfileActivity.class));
            }
        });
        name14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MyBuddiesPage.this, UserProfileActivity.class));
            }
        });

    }
}
