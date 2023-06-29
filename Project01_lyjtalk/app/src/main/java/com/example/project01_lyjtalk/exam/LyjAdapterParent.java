package com.example.project01_lyjtalk.exam;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

public class LyjAdapterParent {

    public abstract static class LyjAdapter<LVH extends LyjViewHolder>{
        public abstract LVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType);
        public abstract void onBindViewHolder();
        public abstract int getItemCount();
    }


    public abstract static class LyjViewHolder{
        //디자인 파일을 묶어 놓은 객체 ==> View
        @NonNull
        final View view; //상수의 규칙 (1. 상수를 선언과 동시에 값 할당 ==> 초기화 하는 방법)
                        //              2. 생성자를 이용해서 초기화 하는 방법


        public LyjViewHolder(@NonNull View view) {
            this.view = view;
        }
    }

}
