package com.example.arkh_tyi.concertbuddies.layoutJavaPages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.arkh_tyi.concertbuddies.R;

import java.util.ArrayList;

public class ArtistPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_page);
        Intent intent = getIntent();
        PinnedListAdapter listAdapter = new PinnedListAdapter(this, getEvents());
        ListView listView = findViewById(R.id.event_list);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?>adapter, View v, int position, long id){
                Item item = (Item) adapter.getItemAtPosition(position);

                Intent intent = new Intent(ArtistPageActivity.this, EventPage.class);
                //based on item add info to intent
                intent.putExtra("artist", item.getTitle());
                startActivity(intent);
            }
        });
    }

    private ArrayList<Item> getEvents() {
        ArrayList<Item> list = new ArrayList<>();

        list.add(new SectionHeader("UPCOMING EVENTS"));
        list.add(new Event("Adele in Chicago", "Chicago", "Nov. 5, 2017"));
        list.add(new Event("Adele in Milwaukee", "Milwaukee", "Dec. 17, 2017"));
        return list;
    }
}
