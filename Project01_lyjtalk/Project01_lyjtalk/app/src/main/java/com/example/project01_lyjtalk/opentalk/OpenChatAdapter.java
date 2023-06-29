package com.example.project01_lyjtalk.opentalk;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_lyjtalk.databinding.ItemOpenchat1Binding;

public class OpenChatAdapter extends RecyclerView.Adapter<OpenChatAdapter.ViewHolder> {
    ItemOpenchat1Binding binding;

    public OpenChatAdapter(ItemOpenchat1Binding binding) {
        this.binding = binding;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemOpenchat1Binding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemOpenchat1Binding binding;

        public ViewHolder(ItemOpenchat1Binding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }
}
