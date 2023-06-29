package com.example.project01_lyjtalk.Friend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.project01_lyjtalk.R;
import com.example.project01_lyjtalk.databinding.ActivityFriendDetailBinding;
import com.example.project01_lyjtalk.databinding.FragmentFriendBinding;

public class FriendDetailActivity extends AppCompatActivity {
    ActivityFriendDetailBinding binding;
    FriendDTO dto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFriendDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        dto = (FriendDTO) getIntent().getSerializableExtra("dto");

        getSupportActionBar().hide(); //액션바를 안보이게


        //스테이터스바를 투명하게 만들기, 현재 액티비티를 조금 더 크게 보이게 하는 것. 외울 필요 없음.
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        window.setStatusBarColor(Color.TRANSPARENT);
        View view = getWindow().getDecorView();
        view.setSystemUiVisibility(view.getSystemUiVisibility() & ~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        //-----------------------------------------------------------------------------------------------

        binding.imgvBackground.setImageResource(dto.getResImgId());
        binding.imgvProfile.setImageResource(dto.getResImgId());
        binding.tvName.setText(dto.getName());
        binding.tvMsg.setText(dto.getMsg());

        binding.imgvClose.setOnClickListener(v -> {
            finish();
        });
    }
}