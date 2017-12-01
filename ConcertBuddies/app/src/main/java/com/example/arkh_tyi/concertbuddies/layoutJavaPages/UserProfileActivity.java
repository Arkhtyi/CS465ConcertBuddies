package com.example.arkh_tyi.concertbuddies.layoutJavaPages;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.arkh_tyi.concertbuddies.ContentFragment;
import com.example.arkh_tyi.concertbuddies.R;

public class UserProfileActivity extends AppCompatActivity {

    private static final int NUM_PAGES = 2;
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());

        mPager.setAdapter(mPagerAdapter);
        tabs.setupWithViewPager(mPager);
    }

    private class ContentPagerAdapter extends FragmentStatePagerAdapter {
        public ContentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return ContentFragment.newInstance(position);
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if(position == 0) {
                return "Description";
            } else {
                return "Artists";
            }
        }
    }

}
