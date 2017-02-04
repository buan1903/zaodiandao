package com.zaodiancan.zaodiancan.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.zaodiancan.zaodiancan.Fragment.MyFragment1;
import com.zaodiancan.zaodiancan.Fragment.MyFragment2;
import com.zaodiancan.zaodiancan.Fragment.MyFragment3;
import com.zaodiancan.zaodiancan.Fragment.MyFragment4;

import java.util.ArrayList;

/**
 * Created by charles on 4/19/15.
 */
public class MyPagerAdatper extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragmentArrayList;
    private MyFragment1 fragment1;
    private MyFragment2 fragment2;
    private MyFragment3 fragment3;
    private MyFragment4 fragment4;


    public MyPagerAdatper(FragmentManager fm) {

        super(fm);
     testInit();
    }

    private void testInit() {
        fragment1 = new MyFragment1();
        fragment2 = new MyFragment2();
        fragment3 = new MyFragment3();
        fragment4 = new MyFragment4();
        fragmentArrayList = new ArrayList<Fragment>();
        fragmentArrayList.add(fragment1);
        fragmentArrayList.add(fragment2);
        fragmentArrayList.add(fragment3);
        fragmentArrayList.add(fragment4);


    }

    @Override
    public Fragment getItem(int i) {
        return fragmentArrayList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }
}
