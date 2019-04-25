package com.example.zhf.route;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.zhf.librarya.AMoudleActivity;
import com.example.zhf.libraryb.BMoudleActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvGoAMouble = findViewById(R.id.tvGoAMouble);
        TextView tvGoBMoudle = findViewById(R.id.tvGoBMoudle);
        tvGoAMouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AMoudleActivity.class));
            }
        });
        tvGoBMoudle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BMoudleActivity.class));
            }
        });
    }
}
