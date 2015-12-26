package com.glimmer.bitmaptest;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 读取位图的尺寸与类型
         */

        Button btn_wanzi = (Button) findViewById(R.id.btn_wanzi);

        btn_wanzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "我是丸子", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btn_show_tip).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(new TextView(MainActivity.this), R.string.toast_tip,
                        Snackbar.LENGTH_LONG).show();
            }
        });

    }
}
