package com.example.and09_fragmentadaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.and09_fragmentadaper.listv.ListFragment;

public class AdapterActivity extends AppCompatActivity {
//    ListView listv;

    FrameLayout container;
    Button btn_list, btn_grid, btn_recy, btn_practice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter);

        btn_list = findViewById(R.id.btn_list);
        btn_grid = findViewById(R.id.btn_grid);
        btn_recy = findViewById(R.id.btn_recy);
        btn_practice = findViewById(R.id.btn_practice);

        FragmentManager manager = getSupportFragmentManager();

        btn_list.setOnClickListener(v -> {
                manager.beginTransaction().replace(R.id.container, new ListFragment()).commit();
                });

        //용도나 형태에 따라서 어댑터 종류 많음.
        //사용빈도 가장 낮은 방식 : ArrayAdapter(기본적으로 안드로이드에서 제공해주는 어댑터)

        //Context(맥락) : 현재 모은 앱의 상태, 화면에 떠 있는 객체의 상태 등 모든 상태를 알 수 있는 변수

        //ArrayAdapter ( context, 반복될 모양의 xml, 내용이 바뀌어야 한다면 사용될 데이터 );
        //기본 템플릿 :  android.R.layout.simple_list_item_1
        //기본 템플릿 만으로 모든 모양을 만들 수 없어 custom필요
//        String[] arrItem = new String[10];
//        for (int i = 0; i < 10; i++) {
//            arrItem[i] = " LYJ " + UUID.randomUUID().toString();
//        }
//        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrItem);
//
//        listv = findViewById(R.id.listv);
//        listv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.d("리스트뷰", "onItemClick: " + position);
////                Toast.makeText(AdapterActivity.this, arrItem[position], Toast.LENGTH_SHORT).show();
//                TextView tv = (TextView) view;
//                Toast.makeText(AdapterActivity.this, tv.getText(), Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        listv.setAdapter(adapter);
//    }
    }
}