package com.example.arkh_tyi.concertbuddies.layoutJavaPages;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.arkh_tyi.concertbuddies.R;

import java.util.ArrayList;

/**
 * Created by antlerros95 on 26/11/2017.
 */

public class UserPageContentFragment extends Fragment {

    private static final String ARG_PAGE_NUMBER = "page_number";

    public UserPageContentFragment() {}

    public static UserPageContentFragment newInstance(int page) {
        UserPageContentFragment fragment = new UserPageContentFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE_NUMBER, page);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup rootView;
        int page = getArguments().getInt(ARG_PAGE_NUMBER, 0);
        if(page == 0) {
            rootView = (ViewGroup) inflater.inflate(
                    R.layout.fragment_user_description, container, false);
        } else {
            rootView = (ViewGroup) inflater.inflate(
                    R.layout.fragment_artist_list, container, false);

            PinnedListAdapter listAdapter = new PinnedListAdapter(getContext(), getArtists());
            ListView listView = rootView.findViewById(R.id.artists_list);
            listView.setAdapter(listAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?>adapter, View v, int position, long id){
                    Item item = (Item) adapter.getItemAtPosition(position);

                    Intent intent = new Intent(getContext(), ArtistPageActivity.class);
                    //based on item add info to intent
                    intent.putExtra("artist", item.getTitle());
                    startActivity(intent);
                }
            });
        }

        return rootView;
    }

    private ArrayList<Item> getArtists(){
        ArrayList<Item> list = new ArrayList<>();

        list.add(new SectionHeader("COMMON"));
        list.add(new Artist("Adele", R.drawable.adele1));
        list.add(new Artist("Beach House", R.drawable.beachhouse));
        list.add(new Artist("Chance The Rapper", R.drawable.chancetherapper));
        list.add(new SectionHeader("A"));
        list.add(new Artist("Amy Winehouse", R.drawable.amywinehouse));
        list.add(new Artist("Arcade Fire", R.drawable.arcadefire));
        list.add(new SectionHeader("B"));
        list.add(new Artist("Bad Suns", R.drawable.badsuns));
        list.add(new Artist("Beirut", R.drawable.beirut));
        list.add(new SectionHeader("C"));
        list.add(new Artist("Circa Waves", R.drawable.circawaves));

        return list;
    }
}

