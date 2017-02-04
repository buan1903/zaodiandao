package com.zaodiancan.zaodiancan.Activity;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

import com.zaodiancan.zaodiancan.Adapter.StoreListAdatper;
import com.zaodiancan.zaodiancan.R;

/**
 * Created by charles on 4/20/15.
 */
public class StoreActivity extends Activity {
    private ListView listView;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private int lastitem;
    private StoreListAdatper storeListAdatper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        findView();
        initView();

    }

    private void findView() {
        button0 = (Button) findViewById(R.id.store_left_bt0);
        button1 = (Button) findViewById(R.id.store_left_bt1);
        button2 = (Button) findViewById(R.id.store_left_bt2);
        button3 = (Button) findViewById(R.id.store_left_bt3);
        button4 = (Button) findViewById(R.id.store_left_bt4);
        button5 = (Button) findViewById(R.id.store_left_bt5);
        listView = (ListView) findViewById(R.id.store_right_list);
        storeListAdatper = new StoreListAdatper(this.getLayoutInflater());

        listView.setAdapter(storeListAdatper);
    }

    private void initView() {
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setBackgroundColor(Color.WHITE);
                itemSelect(0);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setBackgroundColor(Color.WHITE);
                itemSelect(1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setBackgroundColor(Color.WHITE);
                itemSelect(2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setBackgroundColor(Color.WHITE);
                itemSelect(3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setBackgroundColor(Color.WHITE);
                itemSelect(4);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemSelect(5);

            }
        });
//        backbt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                StoreActivity.this.finish();
//            }
//        });

    }

    private void itemSelect(int item) {
        switch (item) {
            case 0:
                button0.setBackgroundColor(Color.WHITE);
                button1.setBackgroundColor(getResources().getColor(R.color.grey));
                button2.setBackgroundColor(getResources().getColor(R.color.grey));
                button3.setBackgroundColor(getResources().getColor(R.color.grey));
                button4.setBackgroundColor(getResources().getColor(R.color.grey));
                button5.setBackgroundColor(getResources().getColor(R.color.grey));
                listSelect(1);
                break;
            case 1:
                button0.setBackgroundColor(getResources().getColor(R.color.grey));
                button1.setBackgroundColor(Color.WHITE);
                button2.setBackgroundColor(getResources().getColor(R.color.grey));
                button3.setBackgroundColor(getResources().getColor(R.color.grey));
                button4.setBackgroundColor(getResources().getColor(R.color.grey));
                button5.setBackgroundColor(getResources().getColor(R.color.grey));
                listSelect(1);
                break;
            case 2:
                button0.setBackgroundColor(getResources().getColor(R.color.grey));
                button1.setBackgroundColor(getResources().getColor(R.color.grey));
                button2.setBackgroundColor(Color.WHITE);
                button3.setBackgroundColor(getResources().getColor(R.color.grey));
                button4.setBackgroundColor(getResources().getColor(R.color.grey));
                button5.setBackgroundColor(getResources().getColor(R.color.grey));
                listSelect(2);
                break;
            case 3:
                listSelect(3);
                button0.setBackgroundColor(getResources().getColor(R.color.grey));
                button1.setBackgroundColor(getResources().getColor(R.color.grey));
                button2.setBackgroundColor(getResources().getColor(R.color.grey));
                button3.setBackgroundColor(Color.WHITE);
                button4.setBackgroundColor(getResources().getColor(R.color.grey));
                button5.setBackgroundColor(getResources().getColor(R.color.grey));
                break;
            case 4:
                listSelect(4);
                button0.setBackgroundColor(getResources().getColor(R.color.grey));
                button1.setBackgroundColor(getResources().getColor(R.color.grey));
                button2.setBackgroundColor(getResources().getColor(R.color.grey));
                button3.setBackgroundColor(getResources().getColor(R.color.grey));
                button4.setBackgroundColor(Color.WHITE);
                button5.setBackgroundColor(getResources().getColor(R.color.grey));
                break;
            case 5:
                listSelect(5);
                button0.setBackgroundColor(getResources().getColor(R.color.grey));
                button1.setBackgroundColor(getResources().getColor(R.color.grey));
                button2.setBackgroundColor(getResources().getColor(R.color.grey));
                button3.setBackgroundColor(getResources().getColor(R.color.grey));
                button4.setBackgroundColor(getResources().getColor(R.color.grey));
                button5.setBackgroundColor(Color.WHITE);
                break;

        }
    }

    private void listSelect(int item) {
        switch (item) {
            case 1:
                listView.setSelection(1);
                break;
            case 2:
                listView.setSelection(2);
                break;

            case 3:
                listView.setSelection(7);
                break;

            case 4:
                listView.setSelection(9);
                break;

            case 5:
                break;


        }
    }
}
