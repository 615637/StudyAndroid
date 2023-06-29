package com.example.project01_sbntalk.friend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.project01_sbntalk.R;
import com.example.project01_sbntalk.databinding.ActivityFriendDetailBinding;
import com.example.project01_sbntalk.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class FriendDetailActivity extends AppCompatActivity {

    ActivityFriendDetailBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFriendDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();//액션바를 안보이게 처리한다.
        //==스테이터스바를 투명하게 만들기, 현재 액티비티를 조금 더 크게 보이게 하는 것. 외우거나 따로 공부 x ==//
        Window window =getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        window.setStatusBarColor(Color.TRANSPARENT);
        View view = getWindow().getDecorView();
        view.setSystemUiVisibility(view.getSystemUiVisibility() & ~View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        // ==================================================================================================== //

        Intent intent = getIntent();
        FriendDTO dto = (FriendDTO) intent.getSerializableExtra("dto");
        binding.tvName.setText(dto.getName());
        binding.tvMessage.setText(dto.getMsg());
        binding.imgvBackground.setImageResource(dto.getResImgId());
        binding.imgvProfile.setImageResource(dto.getResImgId());

        binding.imgvClose.setOnClickListener(v -> {
            finish();//액티비티 종료
        });


    }
}