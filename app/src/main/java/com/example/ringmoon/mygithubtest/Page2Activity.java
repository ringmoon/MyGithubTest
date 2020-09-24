package com.example.ringmoon.mygithubtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.Random;

public class Page2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Log.v("brad","Page2: name = "+name);
    }

    public void test1(View view) {
        finish();
    }

    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("key1",123);
        intent.putExtra("key2","456");
        setResult((int)(Math.random()*100),intent);
        super.finish();
    }
}