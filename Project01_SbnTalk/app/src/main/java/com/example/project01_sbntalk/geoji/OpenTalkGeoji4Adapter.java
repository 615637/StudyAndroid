package com.example.project01_sbntalk.geoji;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_sbntalk.databinding.ItemGeoji4RecvBinding;

import java.util.ArrayList;

public class OpenTalkGeoji4Adapter extends RecyclerView.Adapter<OpenTalkGeoji4Adapter.ViewHolder>{

    ArrayList<Geoji4DTO> list;

    ItemGeoji4RecvBinding binding;

    public OpenTalkGeoji4Adapter(ArrayList<Geoji4DTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemGeoji4RecvBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvMain.setImageResource(list.get(i).getImvg_main());
        h.binding.imgvProfile.setImageResource(list.get(i).getImgv_profile());
        h.binding.tvTitle.setText(list.get(i).getTv_title());
        h.binding.tvHashtag.setText(list.get(i).getTv_hashtag());
        h.binding.tvCnt.setText(list.get(i).getTv_cnt());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemGeoji4RecvBinding binding;

        public ViewHolder(@NonNull ItemGeoji4RecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
