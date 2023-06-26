package com.example.project01_lyjtalk.Chat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_lyjtalk.Friend.FriendDTO;
import com.example.project01_lyjtalk.Friend.FriendFragment;
import com.example.project01_lyjtalk.R;
import com.example.project01_lyjtalk.databinding.FragmentChatBinding;

import java.util.ArrayList;

public class ChatFragment extends Fragment {
    FragmentChatBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentChatBinding.inflate(inflater, container, false);
        binding.recvChat.setAdapter(new ChatAdapter(getList()));
        binding.recvChat.setLayoutManager(new LinearLayoutManager(getContext()));
        return binding.getRoot();
    }

    public ArrayList<ChatDTO> getList(){
        ArrayList<ChatDTO> list = new ArrayList<>();
        FriendFragment f = new FriendFragment();
        list.add(new ChatDTO(f.getList().get(0).getResImgId(), f.getList().get(0).getName() , "전화 좀 받아 도일아"));
        list.add(new ChatDTO(f.getList().get(1).getResImgId(), f.getList().get(1).getName() , "미란이가 울고 있다!"));
        list.add(new ChatDTO(f.getList().get(2).getResImgId(), f.getList().get(2).getName() , "살아 있긴 한거냐?"));
        list.add(new ChatDTO(f.getList().get(3).getResImgId(), f.getList().get(3).getName() , "사건이 일어났어!"));
        list.add(new ChatDTO(f.getList().get(4).getResImgId(), f.getList().get(4).getName() , ""));
        list.add(new ChatDTO(f.getList().get(5).getResImgId(), f.getList().get(5).getName(), ""));
        list.add(new ChatDTO(f.getList().get(6).getResImgId(), f.getList().get(6).getName(), ""));
        list.add(new ChatDTO(f.getList().get(7).getResImgId(), f.getList().get(7).getName(), ""));

        return list;
    }

}