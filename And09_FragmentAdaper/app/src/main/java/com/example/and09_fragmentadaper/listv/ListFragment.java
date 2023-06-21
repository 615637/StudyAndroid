package com.example.and09_fragmentadaper.listv;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.and09_fragmentadaper.R;

import java.util.ArrayList;

public class ListFragment extends Fragment {
    ListView listv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_list, container, false);

        ArrayList<ListDTO> list = new ArrayList<>();
        list.add(new ListDTO(R.drawable.cat_baby, "고양이", "고양이야 안녕"));
        list.add(new ListDTO(R.drawable.coffee, "커피", "커피야 안녕"));
        list.add(new ListDTO(R.drawable.dog, "강아지", "강아지야 안녕"));
        list.add(new ListDTO(R.drawable.fox1, "여우", "여우야 안녕"));
        list.add(new ListDTO(R.drawable.icon, "사람", "사람아 안녕"));

        listv = v.findViewById(R.id.listv);
        AdapterListView adapter = new AdapterListView(inflater, list);
        listv.setAdapter(adapter);


        return v;
    }
}