package com.example.project01_lyjtalk.opentalk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.project01_lyjtalk.R;
import com.example.project01_lyjtalk.databinding.FragmentOpenSub4Binding;

public class OpenSub4Fragment extends Fragment {

    FragmentOpenSub4Binding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOpenSub4Binding.inflate(inflater, container, false);
        binding.recv1Opensub.setAdapter(new OpenSub1Adapter1(geojiImgArr, geojiChatArr, geojiCntArr));
        binding.recv2Opensub.setAdapter(new OpenSub1Adapter2());
        binding.recv3Opensub.setAdapter(new OpenSub1Adapter3());
        binding.recv4Opensub.setAdapter(new OpenSub1Adapter4(geojiImgArr2, geojiChatArr2, geojiCntArr2));

        binding.recv1Opensub.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.recv2Opensub.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.recv3Opensub.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.recv4Opensub.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        return binding.getRoot();
    }

    int[] geojiImgArr = {R.drawable.geoji1, R.drawable.geoji2, R.drawable.geoji3, R.drawable.geoji4, R.drawable.geoji5, R.drawable.geoji6};
    String[] geojiChatArr = {"올드&클래식바이크", "당신을 기다리는 제페토...", "PSVITA, 닌텐도스위치...", "커스텀 배우고 싶은 사람들 모여랏", "커스텀 키보드 스튜디오", "디자인방"};
    String[] geojiCntArr = {"144명 | 방금 대화", "999명 | 방금 대화", "50명 | 방금 대화", "59명 | 30분 전", "1498명 | 방금 대화", "16명 | 30분 전"};

    int[] geojiImgArr2 = {R.drawable.geoji7, R.drawable.geoji8, R.drawable.geoji9, R.drawable.geoji10, R.drawable.geoji11, R.drawable.geoji12};
    String[] geojiChatArr2 = {"학생 거지방", "초딩 거지방", "잼민이 거지방", "10대들의 거지방", "학생 수다방", "초딩 거지방"};
    String[] geojiCntArr2 = {"8명", "9명", "90명 | 30분 전", "198명 | 30분 전", "11명", "76명 | 한시간 전"};
}