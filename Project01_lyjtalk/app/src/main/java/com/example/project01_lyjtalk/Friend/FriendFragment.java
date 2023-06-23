package com.example.project01_lyjtalk.Friend;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_lyjtalk.R;
import com.example.project01_lyjtalk.databinding.FragmentFriendBinding;

import java.util.ArrayList;


public class FriendFragment extends Fragment {
    FragmentFriendBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentFriendBinding.inflate(inflater, container, false);

        binding.recvFriend.setAdapter(new FriendAdapter(getList()));
        binding.recvFriend.setLayoutManager(new LinearLayoutManager(getContext()));

        return binding.getRoot(); //최상위 레이아웃
    }
    public ArrayList<FriendDTO> getList(){
        ArrayList<FriendDTO> list = new ArrayList<>();
        list.add(new FriendDTO(R.drawable.yumiran, "유미란" , ""));
        list.add(new FriendDTO(R.drawable.bora, "정보라" , ""));
        list.add(new FriendDTO(R.drawable.yumyunghan, "유명한" , ""));
        list.add(new FriendDTO(R.drawable.hainsung, "하인성" , ""));
        list.add(new FriendDTO(R.drawable.jangmi, "홍장미" , ""));


        return list;
    }
}