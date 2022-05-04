package com.example.footprint;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuideActivity extends AppCompatActivity {

    //声明控件
    private Button mBtnMap,mBtnHistory,mBtnInformation,mBtnCommunity,mBtnPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        //找到控件
        mBtnMap = findViewById(R.id.bt_Map);

        //跳转
        mBtnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(GuideActivity.this, MapActivity.class);
                startActivity(intent);
            }
        });

        //找到控件
        mBtnHistory = findViewById(R.id.bt_History);

        //跳转
        mBtnHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(GuideActivity.this, HistoryActivity.class);
                startActivity(intent);
            }
        });

        //找到控件
        mBtnCommunity = findViewById(R.id.bt_Community);

        //跳转
        mBtnCommunity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(GuideActivity.this, CommunityActivity.class);
                startActivity(intent);
            }
        });

        //找到控件
        mBtnInformation = findViewById(R.id.bt_Information);

        //跳转
        mBtnInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(GuideActivity.this, InformationActivity.class);
                startActivity(intent);
            }
        });

        //找到控件
        mBtnPhoto = findViewById(R.id.bt_Photo);

        //跳转
        mBtnPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(GuideActivity.this, PhotoActivity.class);
                startActivity(intent);
            }
        });
    }
}