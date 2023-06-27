package com.example.project01_lyjtalk.opentalk;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_lyjtalk.databinding.ItemOpenchatBinding;

import java.util.ArrayList;

public class OpenSub1Adapter extends RecyclerView.Adapter<OpenSub1Adapter.ViewHolder> {
    ItemOpenchatBinding binding;
    ArrayList<OpenDTO> list;

    public OpenSub1Adapter(ArrayList<OpenDTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemOpenchatBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.tvOpenTitle.setText(list.get(i).getTitle());
        h.binding.tvOpenCnt.setText(list.get(i).getCnt());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemOpenchatBinding binding;

        public ViewHolder(ItemOpenchatBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }
}