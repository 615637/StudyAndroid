package com.example.project01_sbntalk.food;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_sbntalk.databinding.ItemSub2ChinaBinding;

import java.util.ArrayList;

public class ChinaAdapter extends RecyclerView.Adapter<ChinaAdapter.ChinaViewHolder> {

    @NonNull ItemSub2ChinaBinding binding;

    ArrayList<ChinaDTO> list;

    public ChinaAdapter(ArrayList<ChinaDTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ChinaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemSub2ChinaBinding.inflate(inflater, parent, false);
        return new ChinaViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ChinaViewHolder holder, int position) {
        holder.binding.imgvChina.setImageResource(list.get(position).getImgRes());
        holder.binding.tvTitleChina.setText(list.get(position).getTitle());
        holder.binding.tvCntChina.setText(list.get(position).getCnt());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ChinaViewHolder extends RecyclerView.ViewHolder {

        ItemSub2ChinaBinding binding;

        public ChinaViewHolder(@NonNull ItemSub2ChinaBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
