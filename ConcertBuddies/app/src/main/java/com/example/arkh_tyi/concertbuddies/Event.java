package com.example.arkh_tyi.concertbuddies;

/**
 * Created by antlerros95 on 27/11/2017.
 */

public class Event extends Item {
        private String mLocation;
        private String mDate;
    public Event(String title, String location, String date) {
        super(title);
        mLocation = location;
        mDate = date;
    }

    public String getDate() {
        return mDate;
    }

    public String getLocation() {
        return mLocation;
    }
}
