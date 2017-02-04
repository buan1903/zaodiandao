package com.zaodiancan.zaodiancan.Activity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.zaodiancan.zaodiancan.R;
import com.zaodiancan.zaodiancan.View.MyViewPager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengeng on 15/5/11.
 */
public class WelecomFirstActivity extends Activity {
    private        ArrayList<ImageView> arrayList=new ArrayList<>();
    private MyViewPager viewpager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityfirst_welecom);
          viewpager= (MyViewPager) findViewById(R.id.first_viewpager);
        ImageView imageView1=new ImageView(this);
        imageView1.setImageResource(R.drawable.jiazai1);
        imageView1.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        imageView1.setScaleType(ImageView.ScaleType.FIT_XY);

        ImageView imageView2=new ImageView(this);
        imageView2.setImageResource(R.drawable.zaijia2);
        imageView2.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);


        ImageView imageView3=new ImageView(this);
        imageView3.setImageResource(R.drawable.jiazai3);
        imageView3.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        imageView3.setScaleType(ImageView.ScaleType.FIT_XY);


        final ImageView imageView4=new ImageView(this);
        imageView4.setImageResource(R.drawable.jiazai4);
        imageView4.setLayoutParams(new ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));
        imageView4.setScaleType(ImageView.ScaleType.FIT_XY);


        final ArrayList<ImageView> arrayList=new ArrayList<>();
        arrayList.add(imageView1);
        arrayList.add(imageView2);
        arrayList.add(imageView3);
        arrayList.add(imageView4);

        PagerAdapter pagerAdapter=new PagerAdapter() {
            @Override
            public int getCount() {
                return arrayList.size();
            }

            @Override
            public boolean isViewFromObject(View view, Object object) {
                return view==object;
            }

            @Override
            public void destroyItem(ViewGroup container, int position, Object object) {
                  container.removeView(arrayList.get(position));
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
               container.addView(arrayList.get(position));
                return arrayList.get(position);
            }
        };
        viewpager.setAdapter(pagerAdapter);
        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
             if (position ==3){
                 viewpager.setScrollble(false);
                 Thread thread=new Thread(new Runnable() {
                     @Override
                     public void run() {
                         try {

                             Thread.sleep(3000);
                             Intent intent = new Intent(WelecomFirstActivity.this, LoginActivity.class);
                             startActivity(intent);
                             WelecomFirstActivity.this.finish();
                         } catch (InterruptedException e) {
                             e.printStackTrace();
                         }



                     }
                 });
                 thread.start();

             }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
