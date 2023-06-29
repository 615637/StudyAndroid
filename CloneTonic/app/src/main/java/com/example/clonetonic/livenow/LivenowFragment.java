package com.example.clonetonic.livenow;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clonetonic.R;
import com.example.clonetonic.databinding.FragmentLivenowBinding;

public class LivenowFragment extends Fragment {
    FragmentLivenowBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentLivenowBinding.inflate(inflater, container, false);
        binding.recvLivenow.setAdapter(new LivenowAdapter());
        binding.recvLivenow.setLayoutManager(new GridLayoutManager(getContext(), 3));
        return binding.getRoot();
    }
}