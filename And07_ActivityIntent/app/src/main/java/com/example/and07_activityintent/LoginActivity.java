package com.example.and07_activityintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class LoginActivity extends AppCompatActivity {
    EditText text_id, text_pw;
    Button btn_login;
    String id, pw;

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
                id = text_id.getText().toString();
                pw = text_pw.getText().toString();
                if (id.equals("a") && pw.equals("a1")) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("strkey", text_id.getText().toString()+"intent");
                    //intKey 숫자를 다음액티비티로 전송해보기 (int)
                    intent.putExtra("intkey", 10);

                    LoginDTO dto = new LoginDTO(text_id.getText().toString() + "1", text_pw.getText().toString() + "1");
                    intent.putExtra("dtokey", dto);

                    //LoginDTO를 5개 아무 데이터나 넣고 ArrayList만들기
                    ArrayList<LoginDTO> list = new ArrayList<>();
                    list.add(new LoginDTO("a1", "b1"));
                    list.add(new LoginDTO("a2", "b2"));
                    list.add(new LoginDTO("a3", "b3"));
                    list.add(new LoginDTO("a4", "b4"));
                    list.add(new LoginDTO("a5", "b5"));

                    intent.putExtra("list", list);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "로그인 실패", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }

    public class LyjClass implements Serializable {

    }

    public class LyjClass2 implements Serializable{

    }

    public void method(Serializable l){
        //역직렬화 : LyjClass l2 = (LyjClass) l;
    }


}