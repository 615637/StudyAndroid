package com.example.project01_sbntalk;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import com.example.project01_sbntalk.chat.ChatFragment;
import com.example.project01_sbntalk.databinding.ActivityMainBinding;
import com.example.project01_sbntalk.friend.FriendFragment;
import com.example.project01_sbntalk.opentalk.OpenTalkMainFragment;


public class MainActivity extends AppCompatActivity {

    // MainActivity 바인딩(뷰결합) 처리하기.
    ActivityMainBinding binding;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        actionBar = getSupportActionBar();
        actionBar.setElevation(0f);
        actionBar.setTitle("친구");

        getSupportFragmentManager().beginTransaction().replace(R.id.container, new FriendFragment()).commit();

        binding.bottomNavigation.setOnItemSelectedListener(item -> {
            Fragment fragment = null;
            if(item.getItemId()==R.id.tab1){
                fragment = new FriendFragment();
                actionBar.setTitle("친구");
            }else if(item.getItemId()==R.id.tab2){
                fragment = new ChatFragment();
                actionBar.setTitle("채팅");
            }else if(item.getItemId()==R.id.tab3){
                fragment = new OpenTalkMainFragment();
                actionBar.setTitle("오픈채팅");
            }else if(item.getItemId()==R.id.tab4){
                actionBar.setTitle("쇼핑");
            }else if(item.getItemId()==R.id.tab5){
                actionBar.setTitle("더보기");
            }else {
                return false;
            }
            if(fragment==null){
                Toast.makeText(this, "아직 메뉴가 준비가 안되었습니다.", Toast.LENGTH_SHORT).show();
            }else {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
            }
            return true;
        });//람다식의 메소드가 이해가 안간다면 new를 통해서 interface구조를 먼저 확인해볼 것

    }
}
