package com.example.arkh_tyi.concertbuddies.layoutJavaPages;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.arkh_tyi.concertbuddies.R;

import java.util.ArrayList;

/**
 * Created by antlerros95 on 01/12/2017.
 */

public class SearchPageContentFragment extends Fragment {
    private static final String ARG_PAGE_NUMBER = "page_number";

    public SearchPageContentFragment() {}

    public static SearchPageContentFragment newInstance(int page) {
        SearchPageContentFragment fragment = new SearchPageContentFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE_NUMBER, page);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        int page = getArguments().getInt(ARG_PAGE_NUMBER, 0);
        PinnedListAdapter listAdapter;
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_search_list,
                container, false);
        ListView listView = rootView.findViewById(R.id.search_list);

        if(page == 0) {

            listAdapter = new PinnedListAdapter(getActivity(), getBuddies());

        } else {
            listAdapter = new PinnedListAdapter(getActivity(), getArtists());
        }
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>adapter, View v, int position, long id) {
                Item item = (Item) adapter.getItemAtPosition(position);
                Intent intent;
                if (item instanceof Buddy)
                    intent = new Intent(getContext(), UserProfileActivity.class);
                else
                    intent = new Intent(getContext(), ArtistPageActivity.class);
                startActivity(intent);
            }
        });
        return rootView;

//        listView.setAdapter(listAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?>adapter, View v, int position, long id){
//                Item item = (Item) adapter.getItemAtPosition(position);
//                Intent intent;
//                if (item instanceof Buddy) {
//                    intent = new Intent(getContext(), UserProfileActivity.class);
//                } else {
//                    intent = new Intent(getContext(), ArtistPageActivity.class);
//                }
//                //based on item add info to intent
//                startActivity(intent);
//            }
//        });
//
//        return rootView;
    }

    private ArrayList<Item> getBuddies() {
        ArrayList<Item> list = new ArrayList<>();

        list.add(new Buddy("Amy Anderson", "Chicago, IL", R.drawable.hipster1));
        list.add(new Buddy("Arthur Clark", "Chicago, IL", R.drawable.hipster2));
        list.add(new Buddy("Audrey White", "Chicago, IL", R.drawable.hipster3));
        list.add(new Buddy("Dennis Rosen", "Chicago, IL", R.drawable.hipster4));
        list.add(new Buddy("Liz Birch", "Chicago, IL", R.drawable.hipster12));
        list.add(new Buddy("Matt Hemming", "Chicago, IL", R.drawable.hipster14));
        list.add(new Buddy("Parker Miranda", "Chicago, IL", R.drawable.hipster7));
        list.add(new Buddy("Quinn Bezel", "Chicago, IL", R.drawable.hipster15));
        list.add(new Buddy("Roger Macina", "Chicago, IL", R.drawable.hipster9));
        list.add(new Buddy("Andrew Jackson", "Chicago, IL", R.drawable.hipster10));
        list.add(new Buddy("Lisa Huff", "Chicago, IL", R.drawable.hipster11));

        return list;
    }

    private ArrayList<Item> getArtists(){
        ArrayList<Item> list = new ArrayList<>();

        list.add(new Artist("Adele", R.drawable.adele1));
        list.add(new Artist("Beach House", R.drawable.beachhouse));
        list.add(new Artist("Chance The Rapper", R.drawable.chancetherapper));
        list.add(new Artist("Amy Winehouse", R.drawable.amywinehouse));
        list.add(new Artist("Arcade Fire", R.drawable.arcadefire));
        list.add(new Artist("Bad Suns", R.drawable.badsuns));
        list.add(new Artist("Beirut", R.drawable.beirut));
        list.add(new Artist("Circa Waves", R.drawable.circawaves));

        return list;
    }
}
