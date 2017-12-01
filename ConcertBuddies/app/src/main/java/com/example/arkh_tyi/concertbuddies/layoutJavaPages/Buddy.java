package com.example.arkh_tyi.concertbuddies.layoutJavaPages;

/**
 * Created by antlerros95 on 01/12/2017.
 */

public class Buddy extends Item {
    private String mLocation;
    private int mImgSrc;

//    public Buddy(String name) {
//        super(name);
//    }
//    public Buddy(String name, String location) {
//        super(name);
//        mLocation = location;
//    }
    public Buddy(String name, String location, int imgSrc) {
        super(name);
        mLocation = location;
        mImgSrc = imgSrc;
    }


    public String getLocation() {
        return mLocation;
    }
    public int getImgSrc() {
        return mImgSrc;
    }
}
