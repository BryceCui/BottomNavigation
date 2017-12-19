package com.example.mingren.bottomnavigation;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mMain_first, mMain_second, mMin_third, mMin_four;
private Fragment mFragment_first;
private Fragment mFragment_second;
private Fragment mFragment_third;
private Fragment mFragment_four;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mMain_first = findViewById(R.id.main_first);
        mMain_second = findViewById(R.id.main_second);
        mMin_third = findViewById(R.id.main_third);
        mMin_four = findViewById(R.id.main_four);
        mMain_first.setOnClickListener(MainActivity.this);
        mMain_second.setOnClickListener(MainActivity.this);
        mMin_third.setOnClickListener(MainActivity.this);
        mMin_four.setOnClickListener(MainActivity.this);
        mMain_first.setSelected(true);
        mMain_second.setSelected(false);
        mMin_third.setSelected(false);
        mMin_four.setSelected(false);
        mFragment_first=new First_Fragment();
        mFragment_second=new Second_Fragment();
        mFragment_third=new Third_Fragment();
        mFragment_four=new Four_Fragment();
        getFragmentManager().beginTransaction().replace(R.id.fragment_main,mFragment_first).commit();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_first:
                mMain_first.setSelected(true);
                mMain_second.setSelected(false);
                mMin_third.setSelected(false);
                mMin_four.setSelected(false);
                getFragmentManager().beginTransaction().replace(R.id.fragment_main,mFragment_first).commit();
                break;
            case R.id.main_second:
                mMain_first.setSelected(false);
                mMain_second.setSelected(true);
                mMin_third.setSelected(false);
                mMin_four.setSelected(false);
                getFragmentManager().beginTransaction().replace(R.id.fragment_main,mFragment_second).commit();
                break;
            case R.id.main_third:
                mMain_first.setSelected(false);
                mMain_second.setSelected(false);
                mMin_third.setSelected(true);
                mMin_four.setSelected(false);
                getFragmentManager().beginTransaction().replace(R.id.fragment_main,mFragment_third).commit();
                break;
            case R.id.main_four:
                mMain_first.setSelected(false);
                mMain_second.setSelected(false);
                mMin_third.setSelected(false);
                mMin_four.setSelected(true);
                getFragmentManager().beginTransaction().replace(R.id.fragment_main,mFragment_four).commit();
                break;
        }

    }

}
