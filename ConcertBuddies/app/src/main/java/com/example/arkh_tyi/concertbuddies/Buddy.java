package com.example.arkh_tyi.concertbuddies;

import java.util.ArrayList;

/**
 * Created by antlerros95 on 01/12/2017.
 */

public class Buddy extends Item {
    private String mLocation;
    private String mImgSrc;

    public Buddy(String name) {
        super(name);
    }
    public Buddy(String name, String location) {
        super(name);
        mLocation = location;
    }


    public String getLocation() {
        return mLocation;
    }
}
