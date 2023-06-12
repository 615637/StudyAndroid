package com.example.and06_resource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.values_layout);

        Log.d("Values/String 값 :", R.string.lyj_version + "");
        Log.d("Values/String 값 :", getString(R.string.lyj_version));


    }
}