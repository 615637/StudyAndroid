package com.example.and09_fragmentadaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    FrameLayout container;
    Button btn_menu1, btn_menu2, btn_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Fragment를 붙이려면(붙일 공간, Fragment, FragmentManager) 3요소 필요
//        container=findViewById(R.id.container); FragmentManager에서는 객체로 초기화 된 위젯이 필요 없음. 디자인 파일의 id만 명시하면 됨.
        btn_menu1=findViewById(R.id.btn_menu1);
        btn_menu2=findViewById(R.id.btn_menu2);
        btn_adapter=findViewById(R.id.btn_adapter);

        FragmentManager manager = getSupportFragmentManager(); //프래스먼트 매니저의 초기화 식.

        btn_menu1.setOnClickListener(v -> {
            Log.d("버튼", "onCreate: "+"메뉴1");
            //트랜잭션 : Oracle 작업 최소 단위        세트 : Commit & Rollback
//            manager.beginTransaction().add(R.id.container, new HomeFragment(), "A").commit();
            manager.beginTransaction().replace(R.id.container, new HomeFragment()).commit();
        });
        btn_menu2.setOnClickListener(v -> {
            Log.d("버튼", "onCreate: "+"메뉴2");
//            manager.beginTransaction().remove()
            manager.beginTransaction().replace(R.id.container, new SubFragment()).commit();
        });
        btn_adapter.setOnClickListener(v -> {
            Intent intent = new Intent(this, AdapterActivity.class);
            startActivity(intent);
        });


    }

}