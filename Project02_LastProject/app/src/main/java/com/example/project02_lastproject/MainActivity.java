package com.example.project02_lastproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.project02_lastproject.common.CommonConn;
import com.example.project02_lastproject.customer.CustomerFragment;
import com.example.project02_lastproject.databinding.ActivityMainBinding;

import java.util.HashMap;

import me.ibrahimsn.lib.OnItemSelectedListener;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().replace(R.id.container , new CustomerFragment()).commit();
        binding.bottomBar.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public boolean onItemSelect(int i) {
                if(i==0){
                    //customer패키지 내부에 CustomerFragment를 만들고 i가 0일때 해당하는 Fragment가 Container에 붙게 처리하기.
                    getSupportFragmentManager().beginTransaction().replace(R.id.container , new CustomerFragment()).commit();
                }else if(i==1){

                }else if(i==2){

                }else if(i==3){

                }

                return true;
            }
        });


    }
}