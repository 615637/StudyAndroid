package com.example.and01_constlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //res하위에 id를 부여하거나 파일을 만들게 되면 모두 R.java라는 한 개 클래스에 관리가 됨.(리소스 클래스)
    //레이아웃에서 만든 모든 위젯(뷰)들은 자바 클래스로 존재함.(객체)
    //클래스는 대문자로 시작(upper casing) : 'I'mageView, 'B'utton
    ImageView imgv; //전역변수 초기화상태 null

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //context는 화면에 보이는 기능을 사용할 때 현재 화면에 보이는 클래스인지를
        //판단한다라고 생각하고 Activity의 경우 무조건 화면에 보이기 때문에
        //this를 써줌.
        ConstraintLayout layout = new ConstraintLayout(this);
        ConstraintLayout.LayoutParams params = new ConstraintLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT
        );
        layout.setLayoutParams(params);

        ConstraintLayout.LayoutParams tvParams = new ConstraintLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT , ViewGroup.LayoutParams.MATCH_PARENT
        );


        tvParams.endToEnd = ConstraintLayout.LayoutParams.PARENT_ID;
        tvParams.startToStart = ConstraintLayout.LayoutParams.PARENT_ID;
        tvParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;

        TextView tv = new TextView(this);
        tv.setLayoutParams(tvParams);
        tv.setText("글자 추가되었습니까?");
        layout.addView(tv);


        setContentView(layout); //R클래스로 존재하는 layout 내부에 있는 모든 것들을 java에서 사용할 수 있게 연결
        //new로 초기화는 새로 인스턴스화x
        //디자인 파일에 이미 존재하는 객체 ImageView를 내가 선언한 변수와 연결, 대입(초기화식)
        //태그에 있는 것을 아이디로 찾을 때 썼던 자바스크립트 함수 ==>
//        imgv = findViewById(R.id.imagev); //@IdRes==R클래스에서 내용을 찾아서 넣어주세요. ctrl+p

        //인터페이스 옵저버 패턴
//        imgv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "글자글자", Toast.LENGTH_SHORT).show();
//            }
//        });
        //Interface사용 : 클래스의 설계도 개념 : Spring MVC interface->Serviceimp->DAO->...
        //옵저버 패턴 : 인턴페이스는 내부에 만들어 둔 메소드를 반드시 구현해야하는 속성이 있음.
        //인터페이스를 파라메터로 입력 받게 만들고, 특정한 처리가 일어나면 내부에 구현해놓은 메소드를 대신 실행함.

//        LyjOnClickListener onClickListener = new LyjOnClickListener() {
//            @Override
//            public void onClick(String data) {
//                Toast.makeText(MainActivity.this, "메소드 실행되었습니다. LYJ", Toast.LENGTH_SHORT).show();
//            }
//        };
//        //메소드는 언제 실행되는가? 메소드는 호출되어야 실행이 됨.
//        setOnclickListener(new KymOnClickListener() {
//            @Override
//            public void onClick(String data) {
//
//            }
//        });
    }
//    public interface LyjOnClickListener{
//        public void onClick(String data);
//    }

}