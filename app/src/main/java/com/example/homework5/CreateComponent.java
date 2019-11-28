package com.example.homework5;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CreateComponent {
    public static void create(String list, LinearLayout layout, AppCompatActivity activity) {
        for (int i=0; i<list.length(); i++) {
            ImageView iv = new ImageView(activity);

            if (list.charAt(i) == '1') {
                iv.setImageResource(R.drawable.number1);
            }
            else if (list.charAt(i) == '2') {
                iv.setImageResource(R.drawable.number2);
            }
            else if (list.charAt(i) == '3') {
                iv.setImageResource(R.drawable.number3);
            }
            RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(100, 100);
            iv.setLayoutParams(params);
            layout.addView(iv);

            if (i != list.length()-1) {
                TextView txv = new TextView(activity);
                txv.setText("->");
                layout.addView(txv);
            }
        }
    }
}
