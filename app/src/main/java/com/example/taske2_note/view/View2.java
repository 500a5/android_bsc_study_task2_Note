package com.example.taske2_note.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.taske2_note.R;

import static android.content.ContentValues.TAG;

public class View2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view2);
        Log.d(TAG,"onCreate");
    }
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }
}