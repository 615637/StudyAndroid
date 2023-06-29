package com.example.project01_sbntalk.chat;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_sbntalk.R;
import com.example.project01_sbntalk.databinding.FragmentChatBinding;
import com.example.project01_sbntalk.friend.FriendFragment;

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
        FriendFragment ff = new FriendFragment();
        list.add(new ChatDTO(ff.getList().get(0).getResImgId(), 0, ff.getList().get(0).getName(), "안녕?"));
        list.add(new ChatDTO(ff.getList().get(1).getResImgId(), 999, ff.getList().get(1).getName(), "안녕"));
        list.add(new ChatDTO(ff.getList().get(2).getResImgId(), 1, ff.getList().get(2).getName(), "안녕"));
        list.add(new ChatDTO(ff.getList().get(3).getResImgId(), 4, ff.getList().get(3).getName(), "안녕"));
        list.add(new ChatDTO(ff.getList().get(4).getResImgId(), 10, ff.getList().get(4).getName(), "안녕"));
        list.add(new ChatDTO(ff.getList().get(5).getResImgId(), 0, ff.getList().get(5).getName(), "안녕"));
        list.add(new ChatDTO(ff.getList().get(6).getResImgId(), 2, ff.getList().get(6).getName(), "안녕"));
        list.add(new ChatDTO(ff.getList().get(7).getResImgId(), 1, ff.getList().get(7).getName(), "안녕"));
        list.add(new ChatDTO(ff.getList().get(8).getResImgId(), 0, ff.getList().get(8).getName(), "안녕"));
        list.add(new ChatDTO(ff.getList().get(9).getResImgId(), 15, ff.getList().get(9).getName(), "안녕"));
        return list;
    }

}