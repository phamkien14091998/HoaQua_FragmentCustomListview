package com.example.gk_customlistiewadapter_1;


import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;

import java.util.ArrayList;


public class ListFragment extends androidx.fragment.app.ListFragment {
    private ArrayList<HoaQua> hoaQuas;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_list, container, false);

        hoaQuas= new ArrayList<>();
        hoaQuas.add(new HoaQua("tao","vang","abc",1));
        hoaQuas.add(new HoaQua("cam","vang","abc",2));
        hoaQuas.add(new HoaQua("chanh","vang","abc",3));
        hoaQuas.add(new HoaQua("mit","vang","abc",8));

        CustomAdapter customAdapter= new CustomAdapter(getActivity(),R.layout.customlistview,hoaQuas);
        setListAdapter(customAdapter);


        return view;
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        int orient= getResources().getConfiguration().orientation;

        if(orient == Configuration.ORIENTATION_PORTRAIT){
            openDetaiActivity(hoaQuas.get(position));
        }else{
            landScapeMode(hoaQuas.get(position));
        }

    }
    public void openDetaiActivity(HoaQua hoaQua){
        Intent intent= new Intent(getActivity(),DetailActivity.class);
        Bundle bundle= new Bundle();
        bundle.putSerializable("hoaqua",hoaQua);
        intent.putExtra("data",bundle);
        startActivity(intent);


    }

    public void landScapeMode(HoaQua hoaQua){
        FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
        detailFragment detailFragment= (detailFragment ) fragmentManager.findFragmentById(R.id.fragDetail);
        detailFragment.applyData(hoaQua);
    }
}
