package com.adex.app;

import android.app.*;
import android.os.*;
import android.graphics.Color;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {

    LinearLayout layout;

    @Override
    public void onCreate(Bundle b) {
        super.onCreate(b);

        layout = new LinearLayout(this);
        layout.setOrientation(1);
        layout.setPadding(25, 35, 25, 25);
        layout.setBackgroundColor(Color.rgb(12,12,12));

        TextView title = new TextView(this);
        title.setText("ADEX V1");
        title.setTextColor(Color.RED);
        title.setTextSize(32);
        title.setGravity(Gravity.CENTER);
        layout.addView(title);

        TextView subtitle = new TextView(this);
        subtitle.setText("ANDROID CONTROL PANEL");
        subtitle.setTextColor(Color.WHITE);
        subtitle.setGravity(Gravity.CENTER);
        layout.addView(subtitle);

        addSwitch("AIM TRAINING");
        addSwitch("ESP TRAINING");
        addSwitch("RADAR DISPLAY");
        addSwitch("PERFORMANCE MODE");

        setContentView(layout);
    }

    void addSwitch(String name) {
        Switch sw = new Switch(this);
        sw.setText(name);
        sw.setTextColor(Color.WHITE);
        sw.setPadding(10,25,10,25);
        layout.addView(sw);
    }
}
