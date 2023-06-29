package com.example.clonetonic.livenow;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clonetonic.R;
import com.example.clonetonic.databinding.ItemLivenowBinding;

public class LivenowAdapter extends RecyclerView.Adapter<LivenowAdapter.ViewHolder> {
    ItemLivenowBinding binding;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemLivenowBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.exImg.setImageResource(R.drawable.plus);

    }

    @Override
    public int getItemCount() {
        return 12;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemLivenowBinding binding;

        public ViewHolder(ItemLivenowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
