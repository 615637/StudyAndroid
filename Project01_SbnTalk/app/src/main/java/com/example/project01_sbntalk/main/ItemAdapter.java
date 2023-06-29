package com.example.project01_sbntalk.main;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_sbntalk.databinding.ItemSub3subBinding;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    ItemSub3subBinding binding;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemSub3subBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.subsub.getContext();
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

            ItemSub3subBinding binding;

            public ViewHolder(ItemSub3subBinding binding) {
                super(binding.getRoot());
                this.binding = binding;
            }

        }
    }