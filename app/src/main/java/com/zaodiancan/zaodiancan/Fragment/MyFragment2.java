package com.zaodiancan.zaodiancan.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zaodiancan.zaodiancan.R;

import java.math.BigDecimal;

/**
 * Created by charles on 4/22/15.
 */
public class MyFragment2 extends Fragment {
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private EditText editText;
    private TextView textView;
    private TextView textView2;
    //        private BigDecimal price = new BigDecimal("0");
    private double price1 = 0;
    private double diprice = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout linearLayout = (LinearLayout) inflater.inflate(R.layout.fragment_2, null);
        checkBox1 = (CheckBox) linearLayout.findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) linearLayout.findViewById(R.id.checkBox2);
        editText = (EditText) linearLayout.findViewById(R.id.fragment2_edittext);
        textView = (TextView) linearLayout.findViewById(R.id.fragment2_price);
        textView2 = (TextView) linearLayout.findViewById(R.id.fragment2_dimoney);
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    price1 = price1 + 6 + diprice;
                } else {
                    price1 = price1 - 6 + diprice;
                }
                textView.setText(Double.toString(price1));
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    price1 = price1 + 10 + diprice;
                } else {
                    price1 = price1 - 10 + diprice;
                }
                textView.setText(Double.toString(price1));
            }
        });
        editText.addTextChangedListener(new TextWatcher() {
            BigDecimal dibd = new BigDecimal(Double.toString(0));
            int dibefore = 0;
            double beforedouble;

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                if (s != null && s.length() != 0) {
                    dibefore = Integer.parseInt(s.toString());
                    beforedouble = new BigDecimal(Integer.toString(dibefore)).multiply(new BigDecimal(Double.toString(0.01))).doubleValue();

                } else {
                    dibefore = 0;
                    beforedouble = 0;
                }
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (s != null && s.length() != 0) {
                    int diafter = Integer.parseInt(s.toString());
//                    BigDecimal diafterbd;
//                    textView2.setText("-￥" + (double)(diafter*0.01d));
//                    price1 = price1 + dibefore * 0.01d - diafter * 0.01d;
                    double afterdouble = new BigDecimal(Integer.toString(diafter)).multiply(new BigDecimal(Double.toString(0.01))).doubleValue();
                    textView2.setText("-￥" + afterdouble);
//                    dibd.add(dibeforebd);
//                    Log.w("dibd is", " " +dibd);
//                    dibd.subtract(diafterbd);
//                    Log.w("dibd is", " " +dibd);

                    price1 = price1 + beforedouble - afterdouble;
                    textView.setText(Double.toString(price1));


                } else {
                    textView2.setText("-￥" + 0);
//                    price1 = price1 + dibefore + 0.01d;
//                    dibd.add(new BigDecimal(Integer.toString(dibefore)));
//                    diprice += dibd.doubleValue();
                    price1 = price1 + beforedouble;
                    textView.setText(Double.toString(price1));

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        return linearLayout;
    }
}
