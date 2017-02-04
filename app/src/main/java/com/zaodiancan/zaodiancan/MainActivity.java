package com.zaodiancan.zaodiancan;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.zaodiancan.zaodiancan.Adapter.MyPagerAdatper;
import com.zaodiancan.zaodiancan.View.MyViewPager;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends FragmentActivity {
    private ImageView buttom_bt1;
    private ImageView buttom_bt2;
    private ImageView buttom_bt3;
    private ImageView buttom_bt4;
    private ImageButton actionbarleftback;
    private ImageButton actionbarleftlocaltion;
    private ImageButton actionbarrightsearch;
    private TextView actionbartv;
    private MyViewPager myViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findView();
        initViewPager();
        initBottomBar();
        initSearchBt();
    }



    private void findView() {
        buttom_bt1 = (ImageView) findViewById(R.id.bt_bottom_1);
        buttom_bt2 = (ImageView) findViewById(R.id.bt_bottom_2);
        buttom_bt3 = (ImageView) findViewById(R.id.bt_bottom_3);
        buttom_bt4 = (ImageView) findViewById(R.id.bt_bottom_4);
        actionbarleftback = (ImageButton) findViewById(R.id.actionbar_leftback);
        actionbarrightsearch = (ImageButton) findViewById(R.id.actionbar_rightbt);
        actionbartv = (TextView) findViewById(R.id.actionbar_text);
        actionbarleftlocaltion = (ImageButton) findViewById(R.id.actionbar_leftlocation);
        myViewPager = (MyViewPager) findViewById(R.id.main_viewpager);

    }

    private void initViewPager() {
        MyPagerAdatper myPagerAdatper = new MyPagerAdatper(getSupportFragmentManager());
        myViewPager.setAdapter(myPagerAdatper);

        ViewPager.OnPageChangeListener onPageChangeListener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i2) {

            }

            @Override
            public void onPageSelected(int i) {
                switch (i) {
                    case 0:
                        buttom_bt2.setImageDrawable(getResources().getDrawable(R.drawable.zaodiandai_normal));
                        buttom_bt3.setImageDrawable(getResources().getDrawable(R.drawable.zaofenxiang_normal));
                        buttom_bt4.setImageDrawable(getResources().getDrawable(R.drawable.wode_normal));
                        buttom_bt1.setImageDrawable(getResources().getDrawable(R.drawable.zaodiantan_select));
                        actionbarleftlocaltion.setVisibility(View.VISIBLE);
                        actionbarleftlocaltion.setImageDrawable(getResources().getDrawable(R.drawable.location_normal));
                        actionbarleftback.setVisibility(View.GONE);
                        actionbarrightsearch.setVisibility(View.VISIBLE);
                        actionbarrightsearch.setImageDrawable(getResources().getDrawable(R.drawable.search));
                        actionbartv.setText("南昌大学（前湖校区）");
                        break;
                    case 1:
                        actionbarleftlocaltion.setVisibility(View.GONE);
                        buttom_bt1.setImageDrawable(getResources().getDrawable(R.drawable.zaodiantan_normal));
                        buttom_bt3.setImageDrawable(getResources().getDrawable(R.drawable.zaofenxiang_normal));
                        buttom_bt4.setImageDrawable(getResources().getDrawable(R.drawable.wode_normal));
                        buttom_bt2.setImageDrawable(getResources().getDrawable(R.drawable.zaodiandai_select));
                        actionbarleftback.setVisibility(View.INVISIBLE);
                        actionbarleftback.setImageDrawable(getResources().getDrawable(R.drawable.back));
                        actionbarrightsearch.setVisibility(View.GONE);
                        actionbartv.setText("早餐袋");
                        break;
                    case 2:
                        buttom_bt2.setImageDrawable(getResources().getDrawable(R.drawable.zaodiandai_normal));
                        buttom_bt1.setImageDrawable(getResources().getDrawable(R.drawable.zaodiantan_normal));
                        buttom_bt4.setImageDrawable(getResources().getDrawable(R.drawable.wode_normal));
                        actionbarleftback.setVisibility(View.INVISIBLE);
                        actionbarleftlocaltion.setVisibility(View.GONE);
                        buttom_bt3.setImageDrawable(getResources().getDrawable(R.drawable.zaofenxiang_select));
                        actionbarleftback.setImageDrawable(getResources().getDrawable(R.drawable.back));
                        actionbarrightsearch.setVisibility(View.GONE);
                        actionbartv.setText("早分享");
                        break;
                    case 3:
                        buttom_bt2.setImageDrawable(getResources().getDrawable(R.drawable.zaodiandai_normal));
                        buttom_bt3.setImageDrawable(getResources().getDrawable(R.drawable.zaofenxiang_normal));
                        buttom_bt1.setImageDrawable(getResources().getDrawable(R.drawable.zaodiantan_normal));
                        actionbarleftback.setVisibility(View.INVISIBLE);
                        actionbarleftlocaltion.setVisibility(View.GONE);
                        buttom_bt4.setImageDrawable(getResources().getDrawable(R.drawable.wode_select));
                        actionbarleftback.setImageDrawable(getResources().getDrawable(R.drawable.back));
                        actionbarrightsearch.setVisibility(View.GONE);
                        actionbartv.setText("我的");
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        };

     myViewPager.setOnPageChangeListener(onPageChangeListener);

    }

    private void initBottomBar() {
        buttom_bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewPager.setCurrentItem(0);
                buttom_bt2.setImageDrawable(getResources().getDrawable(R.drawable.zaodiandai_normal));
                buttom_bt3.setImageDrawable(getResources().getDrawable(R.drawable.zaofenxiang_normal));
                buttom_bt4.setImageDrawable(getResources().getDrawable(R.drawable.wode_normal));
                buttom_bt1.setImageDrawable(getResources().getDrawable(R.drawable.zaodiantan_select));
            }
        });
        buttom_bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewPager.setCurrentItem(1);
                buttom_bt1.setImageDrawable(getResources().getDrawable(R.drawable.zaodiantan_normal));
                buttom_bt3.setImageDrawable(getResources().getDrawable(R.drawable.zaofenxiang_normal));
                buttom_bt4.setImageDrawable(getResources().getDrawable(R.drawable.wode_normal));
                buttom_bt2.setImageDrawable(getResources().getDrawable(R.drawable.zaodiandai_select));
            }
        });
        buttom_bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewPager.setCurrentItem(2);
                buttom_bt2.setImageDrawable(getResources().getDrawable(R.drawable.zaodiandai_normal));
                buttom_bt1.setImageDrawable(getResources().getDrawable(R.drawable.zaodiantan_normal));
                buttom_bt4.setImageDrawable(getResources().getDrawable(R.drawable.wode_normal));
                buttom_bt3.setImageDrawable(getResources().getDrawable(R.drawable.zaofenxiang_select));
            }
        });
        buttom_bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myViewPager.setCurrentItem(3);
                buttom_bt2.setImageDrawable(getResources().getDrawable(R.drawable.zaodiandai_normal));
                buttom_bt3.setImageDrawable(getResources().getDrawable(R.drawable.zaofenxiang_normal));
                buttom_bt1.setImageDrawable(getResources().getDrawable(R.drawable.zaodiantan_normal));
                buttom_bt4.setImageDrawable(getResources().getDrawable(R.drawable.wode_select));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initSearchBt() {
        View view = View.inflate(MainActivity.this, R.layout.view_hotsearch, null);
        final EditText editText = (EditText) view.findViewById(R.id.hotsearch_et);
        final LinearLayout mainll = (LinearLayout) findViewById(R.id.main_ll);
        final float density = MainActivity.this.getResources().getDisplayMetrics().density;
        final PopupWindow popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(getResources().getDrawable(R.drawable.hotsearch_pop_bg));
        popupWindow.setOutsideTouchable(true);
        final InputMethodManager inputManager = (InputMethodManager) MainActivity.this.getSystemService(MainActivity.this.INPUT_METHOD_SERVICE);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });
        actionbarrightsearch = (ImageButton) findViewById(R.id.actionbar_rightbt);
        actionbarrightsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                 Intent intent = new Intent(inflater.getContext(), HotSearchActivity.class);
//                 startActivity(intent);
//                popupWindow.showAsDropDown(actionbarfl,0,(int) (-density*50));
                popupWindow.showAtLocation(mainll, Gravity.TOP,0,0);
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {

                        editText.requestFocus();
                        inputManager.showSoftInput(editText, 0);
                    }
                }, 350);


            }
        });
    }
}
