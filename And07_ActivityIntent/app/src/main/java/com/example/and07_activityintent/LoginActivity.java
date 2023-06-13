package com.example.and07_activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText text_id, text_pw;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        text_id = findViewById(R.id.text_id);
        text_pw = findViewById(R.id.text_pw);
        btn_login = findViewById(R.id.btn_login);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent를 이용하면 화면 전환 => Intent객체(안드로이드의 4대 컴포넌트의 통신 담당) Act=>'Intent'=>Act
                //Context(맥락, 상태정보 확인) : 현재 화면에 떠 있는 객체인지?
                //ex)DAO, DTO, VO => 화면에 떠 있는 객체가 아니기 때문에 그래픽 작업을 하면 오류 발생 => 일반 클래스

                Toast.makeText(LoginActivity.this, "버튼 눌렸다", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                startActivity(intent);

            }
        });
    }

}