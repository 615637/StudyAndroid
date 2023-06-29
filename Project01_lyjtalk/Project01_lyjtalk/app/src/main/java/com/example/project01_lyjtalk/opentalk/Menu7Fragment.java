package com.example.project01_lyjtalk.opentalk;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_lyjtalk.databinding.FragmentMenu7Binding;


public class Menu7Fragment extends Fragment {
    FragmentMenu7Binding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMenu7Binding.inflate(inflater, container, false);
        binding.recvOpenDive.setAdapter(new Menu7Adapter());
        binding.recvOpenDive.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }
}