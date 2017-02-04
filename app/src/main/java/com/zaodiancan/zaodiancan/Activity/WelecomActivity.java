package com.zaodiancan.zaodiancan.Activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.zaodiancan.zaodiancan.Fragment.MyFragment1;
import com.zaodiancan.zaodiancan.Fragment.MyFragment4;
import com.zaodiancan.zaodiancan.MainActivity;
import com.zaodiancan.zaodiancan.R;

/**
 * Created by charles on 4/19/15.
 */
public class WelecomActivity extends Activity {
    private SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welecom);
      sp=getSharedPreferences("isFirst", Context.MODE_PRIVATE);
        String s=sp.getString("isFirst","YES");
        if(s.equals("NO")) {

            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Intent intent = new Intent(WelecomActivity.this, MainActivity.class);
                    startActivity(intent);
                    WelecomActivity.this.finish();
                }
            });
            thread.start();


        }else{
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    Intent intent = new Intent(WelecomActivity.this, WelecomFirstActivity.class);
                    startActivity(intent);
                    WelecomActivity.this.finish();

                }
            });

            thread.start();
        }


        SharedPreferences.Editor editor=sp.edit();
        editor.putString("isFirst","NO");
        editor.commit();
    }
}
