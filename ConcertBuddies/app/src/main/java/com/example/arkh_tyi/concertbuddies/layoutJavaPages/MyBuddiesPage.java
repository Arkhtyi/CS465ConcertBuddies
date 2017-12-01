package com.example.arkh_tyi.concertbuddies.layoutJavaPages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.arkh_tyi.concertbuddies.Buddy;
import com.example.arkh_tyi.concertbuddies.Item;
import com.example.arkh_tyi.concertbuddies.PinnedListAdapter;
import com.example.arkh_tyi.concertbuddies.R;
import com.example.arkh_tyi.concertbuddies.SectionHeader;

import java.util.ArrayList;

public class MyBuddiesPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_buddies);
        PinnedListAdapter listAdapter = new PinnedListAdapter(this, getBuddies());
        ListView listView = findViewById(R.id.buddies_list);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?>adapter, View v, int position, long id){
                Item item = (Item) adapter.getItemAtPosition(position);

                Intent intent = new Intent(MyBuddiesPage.this, UserProfileActivity.class);
                //based on item add info to intent
//                intent.putExtra("artist", item.getTitle());
                startActivity(intent);
            }
        });
    }

    private ArrayList<Item> getBuddies() {
        ArrayList<Item> list = new ArrayList<>();

        list.add(new SectionHeader("A"));
        list.add(new Buddy("Aaron", "Chicago, IL"));
        list.add(new Buddy("Aisling", "Chicago, IL"));
        list.add(new Buddy("Abraham", "Chicago, IL"));
        list.add(new Buddy("Alice", "Chicago, IL"));
        list.add(new Buddy("Alissa", "Chicago, IL"));
        list.add(new SectionHeader("B"));
        list.add(new Buddy("Brittany", "Chicago, IL"));
        list.add(new Buddy("Bailey", "Chicago, IL"));
        list.add(new Buddy("Bradley", "Chicago, IL"));
        list.add(new Buddy("Brooke", "Chicago, IL"));
        list.add(new Buddy("Bethany", "Chicago, IL"));
        list.add(new Buddy("Brody", "Chicago, IL"));
        list.add(new SectionHeader("C"));
        list.add(new Buddy("Chloe", "Chicago, IL"));
        list.add(new Buddy("Courtney", "Chicago, IL"));
        list.add(new Buddy("Carly", "Chicago, IL"));
        list.add(new Buddy("Carson", "Chicago, IL"));
        list.add(new Buddy("Chris", "Chicago, IL"));

        return list;
    }
}
