package com.example.and07_activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class TestActivity extends AppCompatActivity {
    final String TAG="스트레스";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Intent intent = getIntent();
        String str = intent.getStringExtra("strstr");
        Log.d(TAG, "onCreate: "+str);
        int in = intent.getIntExtra("intint", -1);
        Log.d(TAG, "onCreate: "+in);
        TestDTO dto = (TestDTO) intent.getSerializableExtra("dto");
        Log.d(TAG, "onCreate: "+dto.getStr()+dto.getI());
        ArrayList<TestDTO> li = (ArrayList<TestDTO>) intent.getSerializableExtra("li");
        Log.d(TAG, "onCreate: "+li.size());

    }
}