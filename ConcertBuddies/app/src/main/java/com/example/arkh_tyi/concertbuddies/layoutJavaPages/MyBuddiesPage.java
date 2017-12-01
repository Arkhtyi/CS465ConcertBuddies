package com.example.arkh_tyi.concertbuddies.layoutJavaPages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.arkh_tyi.concertbuddies.R;

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
        list.add(new Buddy("Aaron", "Chicago, IL", R.drawable.hipster1));
        list.add(new Buddy("Aisling", "Chicago, IL", R.drawable.hipster2));
        list.add(new Buddy("Abraham", "Chicago, IL", R.drawable.hipster3));
        list.add(new Buddy("Alice", "Chicago, IL", R.drawable.hipster4));
        list.add(new Buddy("Alissa", "Chicago, IL", R.drawable.hipster12));
        list.add(new SectionHeader("B"));
        list.add(new Buddy("Brittany", "Chicago, IL", R.drawable.hipster14));
        list.add(new Buddy("Bailey", "Chicago, IL", R.drawable.hipster7));
        list.add(new Buddy("Bradley", "Chicago, IL", R.drawable.hipster9));
        list.add(new Buddy("Bethany", "Chicago, IL", R.drawable.hipster10));
        list.add(new Buddy("Brody", "Chicago, IL", R.drawable.hipster11));
        list.add(new SectionHeader("C"));
        list.add(new Buddy("Chloe", "Chicago, IL", R.drawable.hipster12));
        list.add(new Buddy("Carson", "Chicago, IL", R.drawable.hipster15));

        return list;
    }
}
