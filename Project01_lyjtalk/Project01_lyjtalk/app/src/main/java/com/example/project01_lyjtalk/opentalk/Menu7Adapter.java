package com.example.project01_lyjtalk.opentalk;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_lyjtalk.databinding.ItemOpenchatBinding;

public class Menu7Adapter extends RecyclerView.Adapter<Menu7Adapter.ViewHolder> {
    ItemOpenchatBinding binding;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemOpenchatBinding.inflate(inflater, parent,false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.tvOpenTitle.setText("창원동네수영");
        h.binding.tvOpenCnt.setText("33명");

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemOpenchatBinding binding;

        public ViewHolder(ItemOpenchatBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }

}
