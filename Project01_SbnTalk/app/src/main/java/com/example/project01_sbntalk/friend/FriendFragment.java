package com.example.project01_sbntalk.friend;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.project01_sbntalk.MainActivity;
import com.example.project01_sbntalk.R;
import com.example.project01_sbntalk.databinding.FragmentFriendBinding;
import com.example.project01_sbntalk.friend.FriendAdapter;
import com.example.project01_sbntalk.friend.FriendDTO;

import java.util.ArrayList;


public class FriendFragment extends Fragment {
    FragmentFriendBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFriendBinding.inflate(inflater , container , false);

        binding.recvFriend.setAdapter(new FriendAdapter(getList() , getContext() ));
        binding.recvFriend.setLayoutManager(new LinearLayoutManager(getContext()));

        //Intent intent = new Intent(getContext() , MainActivity.class);
        //startActivity(intent);
        return binding.getRoot();
    }
    public ArrayList<FriendDTO> getList(){
        ArrayList<FriendDTO> list = new ArrayList<>();
        list.add(new FriendDTO(R.drawable.img1 , "이름 1" , ""));
        list.add(new FriendDTO(R.drawable.img2 , "이름 2" , ""));
        list.add(new FriendDTO(R.drawable.img3 , "이름 3" , ""));
        list.add(new FriendDTO(R.drawable.img4 , "이름 4" , ""));
        list.add(new FriendDTO(R.drawable.img5 , "이름 5" , ""));
        list.add(new FriendDTO(R.drawable.img1 , "이름 6" , ""));
        list.add(new FriendDTO(R.drawable.img2 , "이름 7" , ""));
        list.add(new FriendDTO(R.drawable.img3 , "이름 8" , ""));
        list.add(new FriendDTO(R.drawable.img4 , "이름 9" , ""));
        list.add(new FriendDTO(R.drawable.img5 , "이름 10" , ""));
        return list;
    }
}