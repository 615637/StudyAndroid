package com.example.project01_sbntalk.main;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_sbntalk.R;
import com.example.project01_sbntalk.databinding.ItemOpenRecv1Binding;
import com.example.project01_sbntalk.friend.FriendDetailActivity;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class OpenRecv1Adapter extends RecyclerView.Adapter<OpenRecv1Adapter.ViewHolder> {

    ItemOpenRecv1Binding binding;



    LayoutInflater inflater;

    ArrayList<OpenDTO> list;



    public OpenRecv1Adapter(ArrayList<OpenDTO> list, LayoutInflater inflater) {
        this.list = list;
        this.inflater = inflater;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       // binding= ItemOpenRecv1Binding.inflate(inflater, parent, false);
        binding = ItemOpenRecv1Binding.inflate(inflater , parent ,false);


        return  new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {
        holder.binding.imgvChip1.setImageResource(list.get(i).getImgv_chip1());
        holder.binding.tv1Chip1.setText(list.get(i).getTv1_chip1());
        holder.binding.tv2Chip1.setText(list.get(i).getTv2_chip1());




    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemOpenRecv1Binding binding;
        public ViewHolder(@NonNull ItemOpenRecv1Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
