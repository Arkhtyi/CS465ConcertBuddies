package com.example.arkh_tyi.concertbuddies.layoutJavaPages;

/**
 * Created by antlerros95 on 26/11/2017.
 */

public class Item {
    private String mTitle;
    private boolean mChecked = false;

    public Item(String name) {
        mTitle = name;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setChecked(boolean check) {
        mChecked = check;
    }
    public boolean getChecked() {
        return mChecked;
    }
}
