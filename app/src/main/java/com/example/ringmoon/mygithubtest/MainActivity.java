package com.example.ringmoon.mygithubtest;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("brad","onCreate");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 475){
            int key1 = data.getIntExtra("key1",-1);
            String key2 = data.getStringExtra("key2");
            Log.v("brad","key1: "+key1+" , key2: "+key2);
        }
        Log.v("brad","onActivityResult "+"requestCode: "+requestCode+" resultCode: "+resultCode);
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.v("brad","onStart");
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.v("brad","onResume");
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.v("brad","onPause");
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.v("brad","onStop");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.v("brad","onDestroy");
//    }
//
//    @Override
//    protected void onRestart() {
//        super.onRestart();
//        Log.v("brad","onRestart");
//    }

    public void test1(View view) {
        Intent intent = new Intent(this,Page2Activity.class);
//        startActivity(intent);
        startActivityForResult(intent,475);
    }

    public void test2(View view){
        Intent intent = new Intent(this,Page3Activity.class);
//        startActivity(intent);
        startActivityForResult(intent,444);
    }

    @Override
    public void finish() {
        super.finish();
//        Toast.makeText(this,"One More",Toast.LENGTH_LONG).show();
    }

//    public void test3(View view) {
//        String name = inputName.getText().toString();
//        Intent intent = new Intent(this,Page2Activity.class);
//        intent.putExtra("name",name);
//        startActivity(intent);
//    }
}