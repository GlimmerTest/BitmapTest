package com.glimmer.bitmaptest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 读取位图的尺寸与类型
         */
        Toast.makeText(MainActivity.this, "我是丸子", Toast.LENGTH_SHORT).show();
    }
}
