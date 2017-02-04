package com.zaodiancan.zaodiancan.Adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.zaodiancan.zaodiancan.Fragment.MyFragment1;
import com.zaodiancan.zaodiancan.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.zip.Inflater;

/**
 * Created by charles on 4/19/15.
 */
public class StoreListAdatper extends BaseAdapter {
    //    private ArrayList<View> viewArrayList;
    private HashMap<String, Object> hashMap;
    private ArrayList<ViewText> textArrayList;
    private LayoutInflater minflater;


    public StoreListAdatper() {
    }

    public StoreListAdatper(LayoutInflater inflater) {
        this.minflater = inflater;
        initArrayList();
    }


    @Override
    public int getCount() {
        return textArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = minflater.inflate(R.layout.store_list_item, null);
            viewHolder.title = (TextView) convertView.findViewById(R.id.store_title);
            viewHolder.jiage = (TextView) convertView.findViewById(R.id.store_jiage);
            viewHolder.xiaoliangshu = (TextView) convertView.findViewById(R.id.store_xiaoliang);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (StoreListAdatper.ViewHolder) convertView.getTag();
        }
        viewHolder.title.setText(textArrayList.get(position).getTitle());
        viewHolder.jiage.setText(textArrayList.get(position).getJiage());
        viewHolder.xiaoliangshu.setText(textArrayList.get(position).getXiaoliangshu());
        return convertView;
    }


    class ViewHolder {
        TextView title;
        TextView jiage;
        TextView xiaoliangshu;

    }

    class ViewText {
        String title;

        public String getJiage() {
            return jiage;
        }

        String xiaoliangshu;
        String jiage;


        ViewText(String title,
                 String jiage,
                 String xiaoliangshu) {
            this.title = title;
            this.xiaoliangshu = xiaoliangshu;
            this.jiage = jiage;


        }

        public String getTitle() {
            return title;
        }


        public String getXiaoliangshu() {
            return xiaoliangshu;
        }


    }

    private void initArrayList() {
        ViewText viewText1 = new ViewText("A套餐（牛肉包*2+鸡蛋+豆浆）", "(14) 月售34单", "￥5");
        ViewText viewText2 = new ViewText("牛肉包", "（10）月售20单", "￥1.5");
        ViewText viewText3 = new ViewText("猪肉包", "(9) 月售19单", "￥1.5");
        ViewText viewText4 = new ViewText("茄子包", "(7) 月售16单", "￥1");
        ViewText viewText5 = new ViewText("烧麦", "（5）月售12单", "￥1");
        ViewText viewText6 = new ViewText("馒头", "(2) 月售5单", "￥0.5");
        ViewText viewText7 = new ViewText("面条", "（13）月售24单", "￥2");
        ViewText viewText8 = new ViewText("炒饭", "(15) 月售49单", "￥4");
        ViewText viewText9 = new ViewText("豆浆", "(9) 月售36单", "￥2");
        ViewText viewText10 = new ViewText("南昌扮粉", "（42）月售12单", "￥3");
        ViewText viewText11 = new ViewText("小笼包", "(23) 月售5单", "￥4");
        textArrayList = new ArrayList<ViewText>();
        textArrayList.add(viewText1);
        textArrayList.add(viewText2);
        textArrayList.add(viewText3);
        textArrayList.add(viewText4);
        textArrayList.add(viewText5);
        textArrayList.add(viewText6);
        textArrayList.add(viewText7);
        textArrayList.add(viewText8);
        textArrayList.add(viewText9);
        textArrayList.add(viewText10);
        textArrayList.add(viewText11);

    }

}
