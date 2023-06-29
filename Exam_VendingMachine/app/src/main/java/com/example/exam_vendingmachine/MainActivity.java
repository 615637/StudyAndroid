package com.example.exam_vendingmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //ArrayList에 담았기 때문에 필요 없음.
//    TextView tv_name1, tv_name2, tv_name3, tv_name4, tv_cnt1, tv_cnt2, tv_cnt3, tv_cnt4;
//    Button btn_order1, btn_order2, btn_order3, btn_order4;

    //int cola=1000, cider=1100, fanta=1200, sol=1300;
    //int cntCola=10, cntCider=11, cntFanta=12, cntSol=13;
    int userMoney = 999999999;
    ArrayList<DrinkDTO> list = new ArrayList<>();

    ArrayList<ViewHolder> viewList = new ArrayList<>();

//    ArrayList<TextView> nameList = new ArrayList<>();
//    ArrayList<TextView> cntList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.add(new DrinkDTO("콜라", 1000, 10));
        list.add(new DrinkDTO("사이다", 1100, 11));
        list.add(new DrinkDTO("환타", 1200, 12));
        list.add(new DrinkDTO("솔", 1300, 13));

        viewList.add(new ViewHolder(findViewById(R.id.tv_name1), findViewById(R.id.tv_cnt1), findViewById(R.id.btn_order1)));
        viewList.add(new ViewHolder(findViewById(R.id.tv_name2), findViewById(R.id.tv_cnt2), findViewById(R.id.btn_order2)));
        viewList.add(new ViewHolder(findViewById(R.id.tv_name3), findViewById(R.id.tv_cnt3), findViewById(R.id.btn_order3)));
        viewList.add(new ViewHolder(findViewById(R.id.tv_name4), findViewById(R.id.tv_cnt4), findViewById(R.id.btn_order4)));


        for(int i=0; i<viewList.size(); i++) {
            final int idx = i;
            viewList.get(i).getBtn_order().setOnClickListener(v -> {
                viewList.get(idx).getTv_cnt().setText("aaaaaa");
            });
        }
//        for(int i=0; i<viewList.size(); i++) {
//            final int idx = i;
//            viewList.get(i).getBtn_order().setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    viewList.get(idx).getTv_cnt().setText("aaaaaa");
//                }
//            });
//        }


//        nameList.add(findViewById(R.id.tv_name1));
//        nameList.add(findViewById(R.id.tv_name2));
//        nameList.add(findViewById(R.id.tv_name3));
//        nameList.add(findViewById(R.id.tv_name4));
//        tv_name1 = findViewById(R.id.tv_name1);
//        tv_name2 = findViewById(R.id.tv_name2);
//        tv_name3 = findViewById(R.id.tv_name3);
//        tv_name4 = findViewById(R.id.tv_name4);


//        cntList.add(findViewById(R.id.tv_cnt1));
//        cntList.add(findViewById(R.id.tv_cnt2));
//        cntList.add(findViewById(R.id.tv_cnt3));
//        cntList.add(findViewById(R.id.tv_cnt4));
//        tv_cnt1 = findViewById(R.id.tv_cnt1);
//        tv_cnt2 = findViewById(R.id.tv_cnt2);
//        tv_cnt3 = findViewById(R.id.tv_cnt3);
//        tv_cnt4 = findViewById(R.id.tv_cnt4);

//        btn_order1 = findViewById(R.id.btn_order1);
//        btn_order2 = findViewById(R.id.btn_order2);
//        btn_order3 = findViewById(R.id.btn_order3);
//        btn_order4 = findViewById(R.id.btn_order4);
//
//        btn_order1.setOnClickListener(new LyjOnClickListener(0));
//        btn_order2.setOnClickListener(new LyjOnClickListener(1));
//        btn_order3.setOnClickListener(new LyjOnClickListener(2));
//        btn_order4.setOnClickListener(new LyjOnClickListener(3));

    }

    public interface Test{
        public int idx=0; //인턴페이스에서 변수의 규칙 ( 변수는 반드시 final로 변하지 않을 것)
    }

    //list = 데이터 묶어놓은 자료구조(버튼 1번이 눌렸을 떄, 자료구조의 인덱스 0번 주소값 필요)
//    public class LyjOnClickListener implements View.OnClickListener{
//
//        private int index;
//
//        public LyjOnClickListener(int index) {
//            this.index = index;
//        }
//
//        @Override
//        public void onClick(View v) {
//            userMoney -= list.get(index).getPrice();
//            list.get(index).setCnt(list.get(index).getCnt()-1);
//            nameList.get(index).setText(list.get(index).getName()+"("+list.get(index).getPrice()+")원");
//            cntList.get(index).setText(list.get(index).getCnt()+"개 남음");
//        }
//    }

}