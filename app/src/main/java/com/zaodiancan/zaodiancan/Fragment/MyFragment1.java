package com.zaodiancan.zaodiancan.Fragment;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.hardware.input.InputManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;

import com.zaodiancan.zaodiancan.Activity.HotSearchActivity;
import com.zaodiancan.zaodiancan.Activity.StoreActivity;
import com.zaodiancan.zaodiancan.Activity.StoreListActivity;
import com.zaodiancan.zaodiancan.Adapter.MyListAdatper;
import com.zaodiancan.zaodiancan.MainActivity;
import com.zaodiancan.zaodiancan.R;
import com.zaodiancan.zaodiancan.View.CircleImageButton;

import java.util.Timer;
import java.util.TimerTask;
import java.util.zip.Inflater;

/**
 * Created by charles on 4/19/15.
 */
public class MyFragment1 extends android.support.v4.app.Fragment {
    private MyListAdatper myListAdatper;
    private ImageButton search;
    private Button selectbt1;
    private Button selectbt2;

    public MyFragment1() {
    }

    private void findView() {

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_1, null);
        ListView listView = (ListView) linearLayout.findViewById(R.id.fragment1_listview);
        selectbt1 = (Button) linearLayout.findViewById(R.id.fragment1_bt_select1);
        selectbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectbt2.setCompoundDrawablesWithIntrinsicBounds(null,null,null,null);
                selectbt1.setCompoundDrawablesWithIntrinsicBounds(null, null, null, getResources().getDrawable(R.drawable.main_select_bg_bottom));
            }
        });
        selectbt2 = (Button) linearLayout.findViewById(R.id.fragment1_bt_select2);
        selectbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectbt1.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                selectbt2.setCompoundDrawablesWithIntrinsicBounds(null, null, null, getResources().getDrawable(R.drawable.main_select_bg_bottom));
            }
        });
        CircleImageButton bt = (CircleImageButton) linearLayout.findViewById(R.id.top_bt_1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(inflater.getContext(), StoreListActivity.class);
                startActivity(intent);
            }
        });
        MyListAdatper myListAdatper = new MyListAdatper(inflater);
        listView.setAdapter(myListAdatper);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent1 = new Intent(inflater.getContext(), StoreActivity.class);
                    startActivity(intent1);
                }

            }
        });


//        View view = View.inflate(inflater.getContext(), R.layout.view_hotsearch, null);
//        final EditText editText = (EditText) view.findViewById(R.id.hotsearch_et);
//        final PopupWindow popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//        popupWindow.setFocusable(true);
//        popupWindow.setBackgroundDrawable(getResources().getDrawable(R.drawable.hotsearch_pop_bg));
//        popupWindow.setOutsideTouchable(true);
//        final InputMethodManager inputManager = (InputMethodManager) inflater.getContext().getSystemService(inflater.getContext().INPUT_METHOD_SERVICE);
//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                popupWindow.dismiss();
//            }
//        });

//        initSearchBt(imageButton);

//        ImageView imageButton = (ImageView) linearLayout.findViewById(R.id.hotsearch_search);
//        search = (ImageButton) linearLayout.findViewById(R.id.fragment1_search);
//        search.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                 Intent intent = new Intent(inflater.getContext(), HotSearchActivity.class);
////                 startActivity(intent);
//                popupWindow.showAtLocation(linearLayout, Gravity.TOP, 0, 0);
//                Timer timer = new Timer();
//                timer.schedule(new TimerTask() {
//                    @Override
//                    public void run() {
//                        editText.requestFocus();
//                        inputManager.showSoftInput(editText, 0);
//                    }
//                }, 400);
//
//
//            }
//        });

        return linearLayout;
    }

//    private void initSearchBt(ImageView imageButton) {
//        imageButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

//    }
}
