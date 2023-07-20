package com.example.project02_lastproject.common;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CommonConn {
    private final String TAG = "CommonConn";
    private HashMap<String , Object> paramMap;
    private Context context;
    private String mapping ;
    private ProgressDialog dialog;
    private KymCallBack callBack;
    public CommonConn(Context context, String mapping) {
        this.context = context;
        this.mapping = mapping;
        this.paramMap = new HashMap<>();
    }
    public void addParamMap(String key , Object value){
        if(key == null){
            Log.e(TAG, "파라메터 key값이 null이 들어와서 추가 안했음." );
        }else if (value == null){
            Log.e(TAG, "파라메터 value값이 null이 들어와서 추가 안했음.<-?경우에따라서 커스텀해야함." );
        }else{
            paramMap.put(key,value);
        }
    }
    // enque ( 전송 실행전 해야할 코드를 넣어줄 메소드 구현 , (ProgressDialog보이게 처리)
    private void onPreExcute(){
        if(context != null && dialog == null){
            dialog = new ProgressDialog(context);
            dialog.setProgress(ProgressDialog.STYLE_SPINNER);
            dialog.setTitle("Common");
            dialog.setMessage("로딩중입니다.");
            dialog.setCancelable(false);
            dialog.show();
        }
    }
    // enque가 실제로 되어야 하는부분. ( 파라메터등을 이용해서 실제로 Spring에 전송한다. )↑
    public void onExcute( KymCallBack callBack){
        onPreExcute();
        this.callBack = callBack;
        RetrofitInterface api = new RetrofitClient().getRetrofit().create(RetrofitInterface.class);
        api.clientPostMethod(mapping , paramMap).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                onPostExcute(true , response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d(TAG, "onExcute . onFailure: "+t.getMessage() );
                Toast.makeText(context, "서버와의 연결에 실패했습니다.(개발자문의하시든가하세요)", Toast.LENGTH_SHORT).show();
                onPostExcute(false , null);
            }
        });

    }
    
    private void onPostExcute(boolean isResult , String data){
        if(dialog != null){
            dialog.dismiss();
        }
        callBack.onResult(isResult, data);
    }
    public interface KymCallBack{
        public void onResult(boolean isResult , String data);
    }


}
