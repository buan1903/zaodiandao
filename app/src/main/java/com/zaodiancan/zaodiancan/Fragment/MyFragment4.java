package com.zaodiancan.zaodiancan.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.zaodiancan.zaodiancan.Adapter.MyListAdatper;
import com.zaodiancan.zaodiancan.R;

/**
 * Created by charles on 4/19/15.
 */
public class MyFragment4 extends android.support.v4.app.Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LinearLayout linearLayout= (LinearLayout) inflater.inflate(R.layout.fragment_4, null);
//        ImageButton imageButton=linearLayout.findViewById(R.id.back)
        return linearLayout;
    }
}
