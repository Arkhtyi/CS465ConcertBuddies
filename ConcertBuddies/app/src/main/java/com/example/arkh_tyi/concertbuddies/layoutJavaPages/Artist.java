package com.example.arkh_tyi.concertbuddies.layoutJavaPages;

import java.util.ArrayList;

/**
 * Created by antlerros95 on 26/11/2017.
 */
public class Artist extends Item {
        private int mImgSrc;
        private ArrayList<String> mTourDates;

        public Artist(String name, int imgSrc) {
            super(name);
            mImgSrc = imgSrc;
        }
        public Artist(String name, ArrayList<String> tourDates) {
            super(name);
            mTourDates = tourDates;

        }

    public int getImgSrc() {
        return mImgSrc;
    }

    public ArrayList<String> getTourDates() {
            return mTourDates;
    }

}
