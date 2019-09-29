package com.example.gk_customlistiewadapter_1;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class detailFragment extends Fragment {
    private TextView tvName,tvMau,tvMota,tvSoLuong;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_detail, container, false);

        tvName= view.findViewById(R.id.tvName);
        tvMau= view.findViewById(R.id.tvMau);
        tvMota= view.findViewById(R.id.tvMota);
        tvSoLuong= view.findViewById(R.id.tvSoLuong);

        return view;
    }
    public void applyData(HoaQua hoaQua){
        tvName.setText("Ten: "+hoaQua.getName()+"");
        tvMau.setText("mau: "+hoaQua.getMau()+"");
        tvMota.setText("mo ta: "+hoaQua.getMota()+"");
        tvSoLuong.setText("so luong: "+hoaQua.getSoluong()+"");
    }

}
