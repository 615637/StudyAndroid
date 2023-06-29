package com.example.project01_sbntalk.geoji;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_sbntalk.databinding.ItemGeoji1RecvBinding;

import java.util.ArrayList;

public class OpenTalkGeoji1Adapter extends RecyclerView.Adapter<OpenTalkGeoji1Adapter.ViewHolder> {

     ItemGeoji1RecvBinding binding;

     ArrayList<Geoji1DTO> list;

    public OpenTalkGeoji1Adapter(ArrayList<Geoji1DTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemGeoji1RecvBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.tvGeoji1Id.setText(list.get(i).getTv_geoji1_id());
        h.binding.tvGeoji1Content.setText(list.get(i).getTv_geoji1_content());
        h.binding.tvGeoji1Update.setText(list.get(i).getTv_geoji1_update());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ItemGeoji1RecvBinding binding;

        public ViewHolder(@NonNull ItemGeoji1RecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
