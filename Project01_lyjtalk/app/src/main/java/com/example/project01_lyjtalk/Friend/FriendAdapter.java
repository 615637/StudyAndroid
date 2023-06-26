package com.example.project01_lyjtalk.Friend;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.project01_lyjtalk.MainActivity;
import com.example.project01_lyjtalk.databinding.ItemFriendRecvBinding;

import java.util.ArrayList;

//2.만들어 둔 뷰홀더를 이용해서 어댑터 상속 받기
public class FriendAdapter extends RecyclerView.Adapter<FriendAdapter.ViewHolder> {

    ItemFriendRecvBinding binding;
    ArrayList<FriendDTO> list;
    Context context;

    public FriendAdapter(ArrayList<FriendDTO> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemFriendRecvBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }

    //리사이클러뷰와 칸마다 데이터 연결이나 이벤트 연결을 하는 메소드
    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.imgvProfile.setImageResource(list.get(i).getResImgId());
        h.binding.tvName.setText(list.get(i).getName());
        h.binding.lnFriend.setOnClickListener(v -> {

            Intent intent = new Intent(context, FriendDetailActivity.class);
            //인텐트 객체를 통해서 선택 된 아이템을 FriendDetailActivity로 전송처리
            intent.putExtra("dto", list.get(i));
            context.startActivity(intent);
        });

        String[] dialogItems = {"즐겨찾기에 추가", "이름 변경", "숨김", "차단"};
        h.binding.lnFriend.setOnLongClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle(list.get(i).getName()); //제목
            builder.setItems(dialogItems, ((dialog, idx) -> {
                if(dialogItems[idx].equals("차단")){
                    list.remove(i);
                    notifyDataSetChanged();
                    dialog.dismiss();
                }

            }));
            builder.create().show();
            return true;
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    //1.위젯들을 묶어 저장할 객체(ViewHolder) 만들기
    public class ViewHolder extends RecyclerView.ViewHolder{
        ItemFriendRecvBinding binding;

        public ViewHolder(@NonNull ItemFriendRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
