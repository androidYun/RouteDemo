package com.example.zhf.route;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.zhf.librarya.AMoudleActivity;
import com.example.zhf.libraryb.BMoudleActivity;

/**
 * @ author guiyun.li
 * @ Email xyz_6776.@163.com
 * @ date 25/04/2019.
 * description:
 */
public class NativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Uri data = getIntent().getData();
        String activityParam = data.getQueryParameter("activity");
        switch (activityParam) {
            case "AMoudleActivity":
                startActivity(new Intent(this, AMoudleActivity.class));
                break;
            case "BMoudleActivity":
                startActivity(new Intent(this,
                        BMoudleActivity.class));
                break;
            case "MainActivity":
                startActivity(new Intent(this,
                        MainActivity.class));
                break;
        }
        finish();
    }
}
