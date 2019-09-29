package com.example.gk_customlistiewadapter_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter  extends ArrayAdapter<HoaQua> {
    private Context context;
    private  int resource;
    private ArrayList<HoaQua> hoaQuas;

    public CustomAdapter(Context context, int resource, ArrayList<HoaQua> hoaQuas) {
        super(context, resource, hoaQuas);
        this.context = context;
        this.resource = resource;
        this.hoaQuas = hoaQuas;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView= LayoutInflater.from(context).inflate(R.layout.customlistview,parent,false);

        }
        TextView tvName= convertView.findViewById(R.id.tvName);
        tvName.setText(hoaQuas.get(position).getName());

        return  convertView;
    }
}
