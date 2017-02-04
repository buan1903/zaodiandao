package com.zaodiancan.zaodiancan.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.zaodiancan.zaodiancan.Adapter.ZaofenxiangAdatper;
import com.zaodiancan.zaodiancan.R;

/**
 * Created by charles on 4/22/15.
 */
public class MyFragment3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_3, null);
        ListView listview = (ListView) linearLayout.findViewById(R.id.zaofenxiang_lisview);
        ZaofenxiangAdatper adatper=new ZaofenxiangAdatper(inflater);

        listview.setAdapter(adatper);

        return linearLayout;
    }
}
