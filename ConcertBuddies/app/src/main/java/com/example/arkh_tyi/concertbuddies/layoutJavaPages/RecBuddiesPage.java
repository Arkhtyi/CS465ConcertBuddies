package com.example.arkh_tyi.concertbuddies.layoutJavaPages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.arkh_tyi.concertbuddies.R;

public class RecBuddiesPage extends AppCompatActivity {

    private ImageButton person1;
    private ImageButton person2;
    private ImageButton person3;
    private ImageButton person4;
    private ImageButton person5;
    private ImageButton person6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rec_buddies);

        person1 = (ImageButton) findViewById(R.id.image1);
        person2 = (ImageButton) findViewById(R.id.image2);
        person3 = (ImageButton) findViewById(R.id.image3);
        person4 = (ImageButton) findViewById(R.id.image4);
        person5 = (ImageButton) findViewById(R.id.image5);
        person6 = (ImageButton) findViewById(R.id.image6);


        person1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RecBuddiesPage.this, UserProfileActivity.class));
            }
        });
        person2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RecBuddiesPage.this, UserProfileActivity.class));
            }
        });
        person3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RecBuddiesPage.this, UserProfileActivity.class));
            }
        });
        person4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RecBuddiesPage.this, UserProfileActivity.class));
            }
        });
        person5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RecBuddiesPage.this, UserProfileActivity.class));
            }
        });
        person6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RecBuddiesPage.this, UserProfileActivity.class));
            }
        });


    }
}
