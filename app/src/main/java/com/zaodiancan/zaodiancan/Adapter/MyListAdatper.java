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
public class MyListAdatper extends BaseAdapter {
//    private ArrayList<View> viewArrayList;
    private HashMap<String, Object> hashMap;
    private ArrayList<viewText> textArrayList;
    private LayoutInflater minflater;


    public MyListAdatper() {
    }

    public MyListAdatper(LayoutInflater inflater) {
//        AbsListView.LayoutParams lp = new AbsListView.LayoutParams(AbsListView.LayoutParams.WRAP_CONTENT, AbsListView.LayoutParams.WRAP_CONTENT);
//        RelativeLayout ll1 = (RelativeLayout) inflater.inflate(R.layout.main_listview_item, null);
//        RelativeLayout ll2 = (RelativeLayout) inflater.inflate(R.layout.main_listview_item, null);
//        RelativeLayout ll3 = (RelativeLayout) inflater.inflate(R.layout.main_listview_item, null);
//        RelativeLayout ll4 = (RelativeLayout) inflater.inflate(R.layout.main_listview_item, null);
//        viewArrayList = new ArrayList<View>();
//        viewArrayList.add(ll1);
//        viewArrayList.add(ll2);
//        viewArrayList.add(ll3);
//        viewArrayList.add(ll4);
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
            convertView = minflater.inflate(R.layout.main_listview_item, null);
            viewHolder.title = (TextView) convertView.findViewById(R.id.main_listitem_title);
            viewHolder.haopinshu = (TextView) convertView.findViewById(R.id.main_listitem_haoping);
            viewHolder.xiaoliangshu = (TextView) convertView.findViewById(R.id.main_listitem_xiaoliang);
            viewHolder.qidongjia = (TextView) convertView.findViewById(R.id.main_listitem_qisongjia);
            viewHolder.songdashijian = (TextView) convertView.findViewById(R.id.main_listitem_songdashijian);
            viewHolder.juli = (TextView) convertView.findViewById(R.id.main_listitem_juli);
            viewHolder.jianll = (LinearLayout) convertView.findViewById(R.id.main_listitem_jianll);
            viewHolder.jian = (TextView) convertView.findViewById(R.id.main_listitem_jiantext);
            viewHolder.di = (TextView) convertView.findViewById(R.id.main_listitem_ditext);
            viewHolder.img = (ImageView) convertView.findViewById(R.id.main_listitem_img);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (MyListAdatper.ViewHolder) convertView.getTag();
        }
        viewHolder.title.setText(textArrayList.get(position).getTitle());
        viewHolder.haopinshu.setText(textArrayList.get(position).getHaopinshu());
        viewHolder.xiaoliangshu.setText(textArrayList.get(position).getXiaoliangshu());
        viewHolder.qidongjia.setText(textArrayList.get(position).getQidongjia());
        viewHolder.songdashijian.setText(textArrayList.get(position).getSongdashijian());
        viewHolder.juli.setText(textArrayList.get(position).getJuli());
        viewHolder.jian.setText(textArrayList.get(position).getJian());
        viewHolder.di.setText(textArrayList.get(position).getDi());
        viewHolder.img.setImageDrawable(textArrayList.get(position).getImg());
        if (!textArrayList.get(position).isTaocan()) {
            viewHolder.jianll.setVisibility(View.INVISIBLE);
        }

        return convertView;
    }


    class ViewHolder {
        TextView title;
        TextView haopinshu;
        TextView xiaoliangshu;
        TextView qidongjia;
        TextView songdashijian;
        TextView juli;
        LinearLayout jianll;
        TextView jian;
        TextView di;
        ImageView img;
    }

    class viewText {
        String title;
        String haopinshu;
        String xiaoliangshu;
        String qidongjia;
        String songdashijian;
        String juli;
        String jian;
        String di;
        boolean taocan;
        Drawable img;

        public Drawable getImg() {
            return img;
        }

        viewText(String title,
                 String haopinshu,
                 String xiaoliangshu,
                 String qidongjia,
                 String songdashijian,
                 String juli,
                 String jian,
                 String di,
                 boolean taocan,
                 Drawable imgname) {
            this.title = title;
            this.haopinshu = haopinshu;
            this.xiaoliangshu = xiaoliangshu;
            this.qidongjia = qidongjia;
            this.songdashijian = songdashijian;
            this.juli = juli;
            this.jian = jian;
            this.di = di;
            this.taocan = taocan;
            this.img = imgname;

        }

        public String getTitle() {
            return title;
        }

        public String getHaopinshu() {
            return haopinshu;
        }

        public String getXiaoliangshu() {
            return xiaoliangshu;
        }

        public String getQidongjia() {
            return qidongjia;
        }

        public String getSongdashijian() {
            return songdashijian;
        }

        public String getJuli() {
            return juli;
        }

        public String getJian() {
            return jian;
        }

        public String getDi() {
            return di;
        }

        public boolean isTaocan() {
            return taocan;
        }
    }

    private void initArrayList() {
        viewText viewText1 = new viewText("老头包子铺", "(29)", "月售67单", "6元起送",
                "11分钟送达", "1200米", "满15减2", "打赏金币可以抵10%",false,minflater.getContext().getResources().getDrawable(R.drawable.pu_laotou));
        viewText viewText2 = new viewText("好利来面包店（商业街店）", "(16)", "月售34单", "10元起送",
                "20分钟送达", "3200", "满15减3", "打赏金币可以抵20%",true,minflater.getContext().getResources().getDrawable(R.drawable.pu_haolilai));
        viewText viewText3 = new viewText("华莱士炸鸡（天健园店）", "(45)", "月售99单", "10元起送",
                "15分钟送达", "1400米", "满15减3", "打赏金币可以抵10%",true,minflater.getContext().getResources().getDrawable(R.drawable.hualaishi));
         textArrayList = new ArrayList<viewText>();
        textArrayList.add(viewText1);
        textArrayList.add(viewText2);
        textArrayList.add(viewText3);



    }

}
