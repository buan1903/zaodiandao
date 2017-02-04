package com.zaodiancan.zaodiancan.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import com.zaodiancan.zaodiancan.Adapter.MyListAdatper;
import com.zaodiancan.zaodiancan.Adapter.TopBtAdatper;
import com.zaodiancan.zaodiancan.R;

/**
 * Created by charles on 4/23/15.
 */
public class StoreListActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shop1_3);
        ListView listView = (ListView) findViewById(R.id.storelist_listview);
        TopBtAdatper listAdatper = new TopBtAdatper(this.getLayoutInflater());
        listView.setAdapter(listAdatper);
        ImageButton imageButton = (ImageButton) findViewById(R.id.actionbar_shop_leftback);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               StoreListActivity.this.finish();
            }
        });
          listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                  if (position == 0) {
                      Intent intent = new Intent(StoreListActivity.this, StoreActivity.class);
                      startActivity(intent);

                  }
              }
          });
    }
}
