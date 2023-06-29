package com.example.project01_sbntalk.geoji;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_sbntalk.databinding.ItemGeoji2RecvBinding;

import java.util.ArrayList;

public class OpenTalkGeoji2Adapter extends RecyclerView.Adapter<OpenTalkGeoji2Adapter.ViewHolder>{

    ArrayList<Geoji2DTO> list;

    ItemGeoji2RecvBinding binding;

    public OpenTalkGeoji2Adapter(ArrayList<Geoji2DTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemGeoji2RecvBinding.inflate(inflater, parent, false);
        return new OpenTalkGeoji2Adapter.ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvGeoji2.setImageResource(list.get(i).getImgv_geoji2());
        h.binding.tvGeoji2Title.setText(list.get(i).getTv_geoji2_title());
        h.binding.tvGeoji2Cnt.setText(list.get(i).getTv_geoji2_cnt());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemGeoji2RecvBinding binding;

        public ViewHolder(@NonNull ItemGeoji2RecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
