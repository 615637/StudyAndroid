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

    private HashMap<String, Object> paramMap; //파라미터 전송용
    private Context context; //화면 위에 토스트, ProgressDialog를 보여주기 위한 용도
    private String mapping; //list.cu, login, member 등의 맵핑을 받아오기 위한 것.
    private ProgressDialog dialog; //모양이 다양하게 커스텀 가능함.
    private LyjCallBack callBack;


    //생성자는 context랑 mapping만 만들고
    public CommonConn(Context context, String mapping) {
        this.context = context;
        this.mapping = mapping;
        this.paramMap = new HashMap<>(); //해시맵 추가
        Log.d("결과", "콜백(인터페이스의 메모리: "+callBack);
    }

    public void addParamMap(String key, Object value){
        if(key == null){
            Log.d(TAG, "파라미터 key 값이 null이 들어와서 추가 안함" );
        } else if (value == null) {
            Log.d(TAG, "파라미터 key 값이 null이 들어와서 추가 안함 : 경우에 따라 커스텀 해야 함");
        }else {
            paramMap.put(key, value);
        }
    }
    //enque(전송 실행 전 해야 할 코드를 넣어줄 메소드 구현 (ProgressDialog보이게 처리)
    private void onPreExcute(){
        if(context != null && dialog == null){
            dialog = new ProgressDialog(context);
            dialog.setProgress(ProgressDialog.STYLE_SPINNER);
            dialog.setTitle("Common");
            dialog.setMessage("로딩중입니다");
            dialog.setCancelable(false);
            dialog.show();
        }
    }

    //enque가 실제로 되어야 하는 부분(파라메터 등을 이용해서 실제로 Spring에 전송한다)
    public void onExcute(LyjCallBack callBack){
        onPreExcute();
        //2. 옵저버2
        Log.d("콜백", "콜백(인터페이스의 메모리: "+this.callBack);
        this.callBack = callBack;
        Log.d("콜백", "콜백(인터페이스의 메모리: "+this.callBack+ "받아온것" + callBack);
        RetrofitInterface api = new RetrofitClient().postRetrofit().create(RetrofitInterface.class);
        //GET 방식인지 POST 방식인지를 받아와서 처리 가능함.(현재는 POST로 고정시켜놓음)
        api.clientPostMethod(mapping, paramMap).enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.d(TAG, "onExcute . onResponse: " + response.body());
                onPostExcute(true, response.body());
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.d(TAG, "onExcute . onFailure: " + t.getMessage());
                Toast.makeText(context, "서버와의 연결에 실패했습니다.(개발자 문의하든가)", Toast.LENGTH_SHORT).show();
                onPostExcute(false, null);
            }
        });

    }

    private void onPostExcute(boolean isResult, String data){
        if(dialog != null){
            dialog.dismiss();
        }
        //3. 옵저버 3
        callBack.onResult(isResult, data);
    }

    // 옵저버 패턴 . 감시하다가 어떤 작업이 끝나면 특정 메소드를 실행함 : View.OnClickListener
    // 1.
    public interface LyjCallBack{
        public void onResult(boolean isResult, String data);
    }

}
