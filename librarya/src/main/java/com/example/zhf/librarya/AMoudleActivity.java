package com.example.zhf.librarya;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.zhf.baselibrary.LinkConstant;

/**
 * @ author guiyun.li
 * @ Email xyz_6776.@163.com
 * @ date 25/04/2019.
 * description:
 */
public class AMoudleActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_moudle);
        TextView tvGoMian = findViewById(R.id.tvGoMain);
        TextView tvGoBMoudle = findViewById(R.id.tvGoBMoudle);
        tvGoMian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(LinkConstant.main_link)));
            }
        });
        tvGoBMoudle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(LinkConstant.moudle_b_link)));
            }
        });
    }
}
