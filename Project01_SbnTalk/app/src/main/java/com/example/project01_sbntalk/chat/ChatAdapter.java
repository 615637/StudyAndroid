package com.example.project01_sbntalk.chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_sbntalk.databinding.ItemChatRecvBinding;
import com.example.project01_sbntalk.friend.FriendDTO;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.VeiwHolder>{

    ItemChatRecvBinding binding;
    ArrayList<ChatDTO> list;


    public ChatAdapter(ArrayList<ChatDTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public VeiwHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemChatRecvBinding.inflate(inflater, parent, false);
        return new VeiwHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull VeiwHolder holder, int position) {
        holder.binding.imgvProfile.setImageResource(list.get(position).getResImgId());
        holder.binding.tvName.setText(list.get(position).getName());
        holder.binding.tvMessage.setText(list.get(position).getMsg());
        holder.binding.tvChatCnt.setText(""+list.get(position).getChatCnt());
        if(list.get(position).getChatCnt()==0) {
            holder.binding.chatCnt.removeAllViews();
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class VeiwHolder extends RecyclerView.ViewHolder{
        ItemChatRecvBinding binding;

        public VeiwHolder(@NonNull ItemChatRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
