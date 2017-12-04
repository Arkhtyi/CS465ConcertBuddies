package com.example.arkh_tyi.concertbuddies.layoutJavaPages;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.arkh_tyi.concertbuddies.R;

/**
 * Created by Stan on 2017-11-29.
 */

public class EventPage extends AppCompatActivity {

    private Button makePlan;
    private boolean saved = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eventpage);

        makePlan = (Button) findViewById(R.id.makePlanButton);

        makePlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(EventPage.this, MakePlan.class));
            }
        });

        ImageButton saveButton = (ImageButton) findViewById(R.id.save);
        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!saved) {
                    ((ImageButton) view).setImageResource(R.drawable.check_white);
                    saved = true;
                    Toast.makeText(EventPage.this, "Event saved!", Toast.LENGTH_SHORT).show();
                } else {
                    ((ImageButton) view).setImageResource(R.drawable.plus_white);
                    saved = false;
                }
            }
        });
    }
}
