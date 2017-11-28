package com.example.arkh_tyi.concertbuddies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import de.halfbit.pinnedsection.PinnedSectionListView;
import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by antlerros95 on 26/11/2017.
 */

public class PinnedListAdapter extends ArrayAdapter<Item> implements PinnedSectionListView.PinnedSectionListAdapter {

    private static ArrayList<Item> mItems;

    public PinnedListAdapter(Context context, ArrayList<Item> items) {
        super(context, 0, items);
        mItems = items;
    }

    @Override
    public boolean isItemViewTypePinned(int viewType) {
        return viewType == 0;
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Item getItem(int i) {
        return mItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public int getViewTypeCount() {
        return 3;
    }

    @Override
    public int getItemViewType(int position) {
        Item item = getItem(position);
        if(item instanceof Artist) {
            return 1;
        } else if (item instanceof Event)
            return 2;
        return 0;
    }


    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Item item = getItem(position);

        if (item instanceof Artist) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.item_artist, viewGroup, false);
            CircleImageView img = (CircleImageView) view.findViewById(R.id.artist_img);
            TextView textView = (TextView) view.findViewById(R.id.artist_name);
            textView.setText(item.getTitle());
            img.setImageResource(R.drawable.adele1);

        } else if (item instanceof Event) {
           view = LayoutInflater.from(getContext()).inflate(R.layout.item_event, viewGroup, false);
           TextView location  = (TextView) view.findViewById(R.id.location);
           TextView date = (TextView) view.findViewById(R.id.date);
           location.setText(((Event) item).getLocation());
           date.setText(((Event) item).getDate());
        } else {
            view = LayoutInflater.from(getContext()).inflate(R.layout.item_header, viewGroup, false);
            TextView textView = (TextView) view.findViewById(R.id.section_header);
            textView.setText(item.getTitle());
        }

        return view;
    }
}

