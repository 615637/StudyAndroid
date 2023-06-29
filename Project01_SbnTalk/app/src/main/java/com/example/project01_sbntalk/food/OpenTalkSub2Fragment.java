package com.example.project01_sbntalk.food;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_sbntalk.R;
import com.example.project01_sbntalk.databinding.FragmentOpenTalkSub2Binding;

import java.util.ArrayList;

public class OpenTalkSub2Fragment extends Fragment {

    FragmentOpenTalkSub2Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOpenTalkSub2Binding.inflate(inflater, container, false);
        ArrayList<ChinaDTO> list = getlist();
        binding.recvSub2China.setAdapter(new ChinaAdapter(list));
        binding.recvSub2China.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.recvSub2China.scrollToPosition(list.size() - 1);
        binding.recvSub2Homefood.setAdapter(new HomeFoodAdapter());
        binding.recvSub2Homefood.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.recvSub2Lonely.setAdapter(new ChinaAdapter(list));
        binding.recvSub2Lonely.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        binding.recvSub2Law.setAdapter(new HomeFoodAdapter());
        binding.recvSub2Law.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        return binding.getRoot();
    }


    ArrayList<ChinaDTO> getlist() {
        ArrayList<ChinaDTO> list = new ArrayList<>();

        list.add(new ChinaDTO(R.drawable.pepe1, "비빔사 자격증 준비반", "9명"));
        list.add(new ChinaDTO(R.drawable.pepe2, "중국에서 살다온 사람들의 수다방", "7명"));
        list.add(new ChinaDTO(R.drawable.pepe3, "리즈시대 뭐시기", "21명"));
        list.add(new ChinaDTO(R.drawable.pepe4, "단톡방 이름1", "91명"));
        list.add(new ChinaDTO(R.drawable.pepe5, "단톡방 이름2", "19명"));
        list.add(new ChinaDTO(R.drawable.pepe6, "단톡방 이름3", "29명"));
        list.add(new ChinaDTO(R.drawable.pepe7, "단톡방 이름4", "39명"));


        return list;
    }
}