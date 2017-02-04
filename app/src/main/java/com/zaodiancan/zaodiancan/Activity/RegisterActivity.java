package com.zaodiancan.zaodiancan.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.zaodiancan.zaodiancan.R;

/**
 * Created by chengeng on 15/5/11.
 */
public class RegisterActivity extends Activity

{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        ImageButton back = (ImageButton) findViewById(R.id.actionbar_shop_leftback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RegisterActivity.this.finish();
            }
        });
    }
}
