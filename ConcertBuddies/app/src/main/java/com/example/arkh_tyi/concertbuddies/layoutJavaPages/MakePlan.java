package com.example.arkh_tyi.concertbuddies.layoutJavaPages;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import com.example.arkh_tyi.concertbuddies.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Stan on 2017-11-29.
 */

public class MakePlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_plan);

        ImageButton sendButton = (ImageButton) findViewById(R.id.send);
        PinnedListAdapter listAdapter = new PinnedListAdapter(this, getBuddies());
        ListView listView = findViewById(R.id.invite_list);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long id) {
//                v.setBackgroundColor(getResources().getColor(R.color.violetAccent1));
                Item item = (Item) adapter.getItemAtPosition(position);
                item.setChecked(!item.getChecked());
                ((BaseAdapter) adapter.getAdapter()).notifyDataSetChanged();
            }
        });
        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                startActivity(new Intent(MainActivity.this, MyBuddiesPage.class));
                ListView listView = ((Activity) view.getContext()).findViewById(R.id.invite_list);
                for(int i = 0; i < listView.getAdapter().getCount(); ++i) {
                    if (listView.getAdapter().getItem(i) instanceof Buddy) {
                        ((Buddy) listView.getAdapter().getItem(i)).setChecked(false);
                    }
                }
                ((BaseAdapter) listView.getAdapter()).notifyDataSetChanged();

                Toast.makeText(getBaseContext(), R.string.send_invitation, Toast.LENGTH_SHORT).show();
            }
        });
    }


        private ArrayList<Item> getBuddies () {
            ArrayList<Item> list = new ArrayList<>();

            list.add(new SectionHeader("Going"));
            list.add(new Buddy("Aaron", "Chicago, IL", R.drawable.hipster1));
            list.add(new Buddy("Bailey", "Chicago, IL", R.drawable.hipster2));
            list.add(new SectionHeader("Interested"));
            list.add(new Buddy("Chloe", "Chicago, IL", R.drawable.hipster12));
            list.add(new Buddy("Abraham", "Chicago, IL", R.drawable.hipster3));
            list.add(new SectionHeader("Recommend"));
            list.add(new Buddy("Alice", "Chicago, IL", R.drawable.hipster4));
            list.add(new Buddy("Alissa", "Chicago, IL", R.drawable.hipster12));
            list.add(new Buddy("Brittany", "Chicago, IL", R.drawable.hipster14));
            list.add(new Buddy("Bailey", "Chicago, IL", R.drawable.hipster7));
            list.add(new Buddy("Bradley", "Chicago, IL", R.drawable.hipster9));
            list.add(new Buddy("Bethany", "Chicago, IL", R.drawable.hipster10));
            list.add(new Buddy("Brody", "Chicago, IL", R.drawable.hipster11));
            list.add(new Buddy("Chloe", "Chicago, IL", R.drawable.hipster12));
            list.add(new Buddy("Carson", "Chicago, IL", R.drawable.hipster15));

            return list;
        }
}