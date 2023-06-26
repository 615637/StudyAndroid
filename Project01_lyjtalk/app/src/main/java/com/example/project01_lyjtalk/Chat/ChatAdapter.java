package com.example.project01_lyjtalk.Chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_lyjtalk.Friend.FriendDTO;
import com.example.project01_lyjtalk.databinding.ItemChatRecvBinding;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder> {
    ItemChatRecvBinding binding;
    ArrayList<ChatDTO> list;

    public ChatAdapter(ArrayList<ChatDTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemChatRecvBinding.inflate(inflater,parent,false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvProfile.setImageResource(list.get(i).getResImgId());
        h.binding.tvName.setText(list.get(i).getName());
        h.binding.tvMsg.setText(list.get(i).getMsg());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemChatRecvBinding binding;

        public ViewHolder(ItemChatRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }
}
