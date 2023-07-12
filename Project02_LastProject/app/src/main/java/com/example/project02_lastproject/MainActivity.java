package com.example.project02_lastproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.project02_lastproject.customer.CustomerFragment;
import com.example.project02_lastproject.databinding.ActivityMainBinding;

import me.ibrahimsn.lib.OnItemSelectedListener;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    FragmentManager manager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        manager.beginTransaction().replace(R.id.container, new CustomerFragment()).commit();

        binding.bottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {
                if(i==0){
                    manager.beginTransaction().replace(R.id.container, new CustomerFragment()).commit();

                } else if (i==1) {
                    
                } else if (i==2) {
                    
                } else if (i==3) {
                    
                }

                return true;
            }
        });


    }
}