package com.zaodiancan.zaodiancan.Adapter;

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

/**
 * Created by charles on 4/19/15.
 */
public class ZaofenxiangAdatper extends BaseAdapter {
    private ArrayList<viewText> textArrayList;
    private LayoutInflater minflater;


    public ZaofenxiangAdatper() {
    }

    public ZaofenxiangAdatper(LayoutInflater inflater) {
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
            convertView = minflater.inflate(R.layout.share_listview_item, null);
            viewHolder.title = (TextView) convertView.findViewById(R.id.share_title);
            viewHolder.diancanshu = (TextView) convertView.findViewById(R.id.share_dianzanshu);
            viewHolder.pinlunshu = (TextView) convertView.findViewById(R.id.share_pinglunshu);
            viewHolder.mingzi = (TextView) convertView.findViewById(R.id.share_name);
            viewHolder.shijian = (TextView) convertView.findViewById(R.id.share_time);
            viewHolder.text = (TextView) convertView.findViewById(R.id.share_text);
            viewHolder.img0 = (ImageView) convertView.findViewById(R.id.user);
            viewHolder.img1 = (ImageView) convertView.findViewById(R.id.share_img1);
            viewHolder.img2 = (ImageView) convertView.findViewById(R.id.share_img2);
            viewHolder.img3 = (ImageView) convertView.findViewById(R.id.share_img3);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ZaofenxiangAdatper.ViewHolder) convertView.getTag();
        }
        viewHolder.title.setText(textArrayList.get(position).getTitle());
        viewHolder.text.setText(textArrayList.get(position).getText());
        viewHolder.diancanshu.setText(textArrayList.get(position).getDianzanshu());
        viewHolder.pinlunshu.setText(textArrayList.get(position).getPinlunshu());
        viewHolder.shijian.setText(textArrayList.get(position).getShijian());
        viewHolder.mingzi.setText(textArrayList.get(position).getMingzi());
        viewHolder.img0.setImageDrawable(textArrayList.get(position).getImg0());
        viewHolder.img1.setImageDrawable(textArrayList.get(position).getImg1());
        viewHolder.img2.setImageDrawable(textArrayList.get(position).getImg2());
        viewHolder.img3.setImageDrawable(textArrayList.get(position).getImg3());


        return convertView;
    }


    class ViewHolder {
        public TextView title;
        public TextView text;
        public TextView diancanshu;
        public TextView pinlunshu;
        public TextView mingzi;
        public TextView shijian;
        public ImageView img0;
        public ImageView img1;
        public ImageView img2;
        public ImageView img3;


    }

    class viewText {
        String title;
        String text;
        String dianzanshu;
        String pinlunshu;
        String mingzi;
        String shijian;
        Drawable img0;
        Drawable img1;
        Drawable img2;
        Drawable img3;


        public String getDianzanshu() {
            return dianzanshu;
        }

        public String getPinlunshu() {
            return pinlunshu;
        }

        public String getMingzi() {
            return mingzi;
        }

        public String getShijian() {
            return shijian;
        }

        viewText(String title,
                 String text,
                 String dianzanshu,
                 String pinlunshu,
                 String mingzi,

                 String shijian,
                 Drawable img0,
                 Drawable img1,
                 Drawable img2,
                 Drawable img3

                 ) {
            this.title = title;
            this.text = text;
            this.dianzanshu = dianzanshu;
            this.pinlunshu = pinlunshu;
            this.mingzi = mingzi;
            this.shijian = shijian;
            this.img0 = img0;
            this.img1 = img1;
            this.img2 = img2;
            this.img3 = img3;


        }

        public String getTitle() {
            return title;
        }

        public String getText() {
            return text;
        }



        public Drawable getImg0() {
            return img0;
        }

        public Drawable getImg1() {
            return img1;
        }

        public Drawable getImg2() {
            return img2;
        }

        public Drawable getImg3() {
            return img3;
        }
    }

    private void initArrayList() {
        viewText viewText1 = new viewText("春饼卷菜","    烙饼卷菜式几乎所有东北人都爱吃的主食。烙几张饼，做个豆芽菜或者土豆丝，再来一碗小米粥，实在是享受。"
                ,"64","31","重口味的小清新","2分钟前",minflater.getContext().getResources().getDrawable(R.drawable.zaofenxiang1),
                minflater.getContext().getResources().getDrawable(R.drawable.zaofenxiang11),minflater.getContext().getResources().getDrawable(R.drawable.zaofenxiang12),
                minflater.getContext().getResources().getDrawable(R.drawable.zaofenxiang13));
        viewText viewText2 = new viewText("鸡肉蔬菜沙拉","   分享一款又好吃有健康又能帮助瘦身的肌肉蔬菜沙拉，夏天就要到来了，要赶紧瘦瘦瘦～好吃..."
                ,"64","31","草莓味的布丁少爷","6分钟前",minflater.getContext().getResources().getDrawable(R.drawable.zaofenxiang2),
                minflater.getContext().getResources().getDrawable(R.drawable.zaofenxiang21),minflater.getContext().getResources().getDrawable(R.drawable.zaofenxiang22),
                minflater.getContext().getResources().getDrawable(R.drawable.zaofenxiang23));
        viewText viewText3 = new viewText("橙香鸡蛋软","    橙汁牛奶与面粉的我没结合，使得饼的味道及其清新，不经意间就唤醒美好的清晨啦～精致生..."
                ,"64","31","芒果味的皮卡丘","18分钟前",minflater.getContext().getResources().getDrawable(R.drawable.zaofenxiang3),
                minflater.getContext().getResources().getDrawable(R.drawable.zaofenxiang31),minflater.getContext().getResources().getDrawable(R.drawable.zaofenxiang32),
                minflater.getContext().getResources().getDrawable(R.drawable.zaofenxiang33));
        textArrayList = new ArrayList<viewText>();
        textArrayList.add(viewText1);
        textArrayList.add(viewText2);
        textArrayList.add(viewText3);





    }

}
