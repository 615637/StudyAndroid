package com.example.project01_lyjtalk.opentalk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_lyjtalk.R;
import com.example.project01_lyjtalk.databinding.FragmentOpenSub1Binding;

import java.util.ArrayList;


public class OpenSub1Fragment extends Fragment {

    FragmentOpenSub1Binding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentOpenSub1Binding.inflate(inflater, container, false);
        binding.openRecv.setAdapter(new OpenSub1Adapter(menu7()));
        binding.openRecv.setLayoutManager(new LinearLayoutManager(getContext()));


        return binding.getRoot();
    }
    
    public ArrayList<OpenDTO> menu7(){
        ArrayList<OpenDTO> list = new ArrayList<>();
        list.add(new OpenDTO("'Life is Jazz' 인생은 재즈다", "147명"));
        list.add(new OpenDTO("Vinyl Cafeteria 바이닐 카페테리아", "52명"));
        list.add(new OpenDTO("그루브한 흑인음악을 연주하는 방", "39명"));
        return list;
    }
    
}