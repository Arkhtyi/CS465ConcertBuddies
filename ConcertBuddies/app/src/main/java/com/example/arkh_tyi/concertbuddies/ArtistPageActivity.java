package com.example.arkh_tyi.concertbuddies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_page);
        Intent intent = getIntent();
        String artist = intent.getStringExtra("artist");
        PinnedListAdapter listAdapter = new PinnedListAdapter(this, getEvents());
        ListView listView = findViewById(R.id.event_list);
        listView.setAdapter(listAdapter);
    }

    private ArrayList<Item> getEvents() {
        ArrayList<Item> list = new ArrayList<>();

        list.add(new SectionHeader("UPCOMING EVENTS"));
        list.add(new Event("Adele in Chicago", "Chicago", "Nov. 5, 2017"));
        list.add(new Event("Adele in Milwaukee", "Milwaukee", "Dec. 17, 2017"));
        return list;
    }
}
