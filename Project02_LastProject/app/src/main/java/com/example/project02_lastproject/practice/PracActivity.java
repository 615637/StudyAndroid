package com.example.project02_lastproject.practice;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.project02_lastproject.common.RetrofitClient;
import com.example.project02_lastproject.common.RetrofitInterface;
import com.example.project02_lastproject.databinding.ActivityPracBinding;

import java.util.HashMap;
import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PracActivity extends AppCompatActivity {
    ActivityPracBinding binding;
//    CallbackLyj callback ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPracBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        callback = new CallbackLyj() {
//            @Override
//            public void onResult(String data) {
//                binding.tvResult.setText("응답 : " + data);
//            }
//        };




        binding.btnSelect.setOnClickListener(v->{
            //RetroiftClient : 접속 방법 , 컨버터 등 통신에 대한 전반적인 방법이 있는 객체.
            //RetrofitInterface : 접속 후 데이터 전송 방식 , 파라메터 타입 등등의 기능에 가까운 객체.
            commonExcute(binding.edtUrl.getText().toString(), new HashMap<>(), new CallbackLyj() {
                @Override
                public void onResult(String data) {
                    binding.tvResult.setText("SELECT 결과 후 처리: " + data);
                }
            });
//            api.clientPostMethod(binding.edtUrl.getText().toString(), new HashMap<>()).enqueue(new Callback<String>() {
//                @Override
//                public void onResponse(Call<String> call, Response<String> response) {
//                    callback.onResult( response.body() );
//                }
//
//                @Override
//                public void onFailure(Call<String> call, Throwable t) {
//                    callback.onResult( t.getMessage() );
//                }
//            });
        });


        //3.
        binding.btnInsert.setOnClickListener(v->{
            //col_no=3&col1=a&col2=b
            HashMap<String , Object> params = new HashMap<>();
            params.put("col1" , "random값1:"+new Random().nextInt(100));
            params.put("col2" , "random값2:"+new Random().nextInt(100));

            commonExcute("retrofit/insert" , params, data -> {
                binding.tvResult.setText("INSERT결과 1은 성공: " + data);
            });
//            api.clientPostMethod("retrofit/insert" , params).enqueue(new Callback<String>() {
//                @Override
//                public void onResponse(Call<String> call, Response<String> response) {
//                    callback.onResult( response.body() );
//                }
//
//                @Override
//                public void onFailure(Call<String> call, Throwable t) {
//                    callback.onResult( t.getMessage() );
//                }
//            });
        });

        binding.btnUpdate.setOnClickListener(v->{

        });

    }


    //2.
    public void commonExcute(String url ,HashMap<String , Object > map, CallbackLyj callback){
        RetrofitInterface api = new RetrofitClient().getRetrofit().create(RetrofitInterface.class);
        api.clientPostMethod(url,map).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                callback.onResult(response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                callback.onResult(t.getMessage());
            }
        });
    }




    public void method(CallbackLyj callback){
        Toast.makeText(this, "메소드가 호출되었습니다.", Toast.LENGTH_SHORT).show();
        callback.onResult("dd");
    }


    //1.
    public interface CallbackLyj{
        public void onResult(String data);
    }



}