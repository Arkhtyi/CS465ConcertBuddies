package com.example.arkh_tyi.concertbuddies.layoutJavaPages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

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

        ImageView plus1 = (ImageView) findViewById(R.id.plus1);
        ImageView plus2 = (ImageView) findViewById(R.id.plus2);
        ImageView plus3 = (ImageView) findViewById(R.id.plus3);
        ImageView plus4 = (ImageView) findViewById(R.id.plus4);
        ImageView plus5 = (ImageView) findViewById(R.id.plus5);
        ImageView plus6 = (ImageView) findViewById(R.id.plus6);
        ImageView plus7 = (ImageView) findViewById(R.id.plus7);
        ImageView plus8 = (ImageView) findViewById(R.id.plus8);


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

        plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) view).setImageResource(R.drawable.check_purple);
            }
        });
        plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) view).setImageResource(R.drawable.check_purple);
            }
        });
        plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) view).setImageResource(R.drawable.check_purple);
            }
        });
        plus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) view).setImageResource(R.drawable.check_purple);
            }
        });
        plus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) view).setImageResource(R.drawable.check_purple);
            }
        });
        plus6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) view).setImageResource(R.drawable.check_purple);
            }
        });
        plus7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) view).setImageResource(R.drawable.check_purple);
            }
        });
        plus8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((ImageView) view).setImageResource(R.drawable.check_purple);
            }
        });
    }
}
