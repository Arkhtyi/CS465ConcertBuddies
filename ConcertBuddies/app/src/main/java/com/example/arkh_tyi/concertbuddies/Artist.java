package com.example.arkh_tyi.concertbuddies;

import java.util.ArrayList;

/**
 * Created by antlerros95 on 26/11/2017.
 */
public class Artist extends Item {
        private String mImgSrc;
        private ArrayList<String> mTourDates;

        public Artist(String name) {
            super(name);
        }
        public Artist(String name, ArrayList<String> tourDates) {
            super(name);
            mTourDates = tourDates;
        }


    public ArrayList<String> getTourDates() {
            return mTourDates;
    }

}
