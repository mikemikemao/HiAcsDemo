package com.example.hiacsdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hik.common.HiAcs;

public class MainActivity extends AppCompatActivity {
    HiAcs hiAcs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hiAcs = new HiAcs();
        hiAcs.native_helloWorld();
    }
}