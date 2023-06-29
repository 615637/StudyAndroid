package com.example.project01_sbntalk.geoji;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_sbntalk.databinding.ItemGeoji3RecvBinding;

import java.util.ArrayList;

public class OpenTalkGeoji3Adapter extends RecyclerView.Adapter<OpenTalkGeoji3Adapter.ViewHolder>{

    ArrayList<Geoji3DTO> list;

    public OpenTalkGeoji3Adapter(ArrayList<Geoji3DTO> list) {
        this.list = list;
    }

    ItemGeoji3RecvBinding binding;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemGeoji3RecvBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvMain.setImageResource(list.get(i).getImgv_main());
        h.binding.tvTitle.setText(list.get(i).getTv_title());
        h.binding.tvContent1.setText(list.get(i).getTv_content1());
        h.binding.tvContent2.setText(list.get(i).getTv_content2());
        h.binding.tvContent3.setText(list.get(i).getTv_content3());
        h.binding.imgvProfile1.setImageResource(list.get(i).getImgv_profile1());
        h.binding.imgvProfile2.setImageResource(list.get(i).getImgv_profile2());
        h.binding.imgvProfile3.setImageResource(list.get(i).getImgv_profile3());
        h.binding.tvCnt1.setText(list.get(i).tv_cnt1);
        h.binding.tvCnt2.setText(list.get(i).tv_cnt2);
        h.binding.tvCnt3.setText(list.get(i).tv_cnt3);
        h.binding.imgvSub1.setImageResource(list.get(i).getImgv_sub1());
        h.binding.imgvSub2.setImageResource(list.get(i).getImgv_sub2());
        h.binding.imgvSub3.setImageResource(list.get(i).getImgv_sub3());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemGeoji3RecvBinding binding;

        public ViewHolder(@NonNull ItemGeoji3RecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
