package com.example.project01_lyjtalk;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.project01_lyjtalk.Chat.ChatFragment;
import com.example.project01_lyjtalk.Friend.FriendFragment;
import com.example.project01_lyjtalk.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ActionBar actionBar;
    FragmentManager manager = getSupportFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        actionBar = getSupportActionBar();
        actionBar.setElevation(0f); //그림자 효과
        actionBar.setTitle("친구");

        manager.beginTransaction().replace(R.id.container, new FriendFragment()).commit();
        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            if(item.getItemId()==R.id.page_1){
                fragment = new FriendFragment();
                actionBar.setTitle("친구");
            }else if(item.getItemId()==R.id.page_2){
                fragment = new ChatFragment();
                actionBar.setTitle("채팅");
            }else if(item.getItemId()==R.id.page_3){
                actionBar.setTitle("오픈채팅");
            }else if(item.getItemId()==R.id.page_4){
                actionBar.setTitle("쇼핑");
            }else if(item.getItemId()==R.id.page_5){
                actionBar.setTitle("더보기");
            }else{
                return false;
            }
            if(fragment == null){
                Toast.makeText(this, "아직 메뉴가 준비되지 않았습니다.", Toast.LENGTH_SHORT).show();
            }
            manager.beginTransaction().replace(R.id.container, fragment).commit();
            return true;
        });

    }
}