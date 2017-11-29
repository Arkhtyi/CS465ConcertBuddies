package com.example.arkh_tyi.concertbuddies.layoutJavaPages;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.arkh_tyi.concertbuddies.R;

public class Settings extends AppCompatActivity {

    private Button bioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        bioButton = (Button) findViewById(R.id.editBioButton);

        bioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Settings.this, Bio.class));
            }
        });


    }

}
