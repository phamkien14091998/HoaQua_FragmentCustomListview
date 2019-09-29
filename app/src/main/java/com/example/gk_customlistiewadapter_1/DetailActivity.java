package com.example.gk_customlistiewadapter_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent= getIntent();
        Bundle bundle= intent.getBundleExtra("data");

        HoaQua hoaQua=(HoaQua) bundle.getSerializable("hoaqua");

        FragmentManager fragmentManager= getSupportFragmentManager();
        detailFragment detailFragment= (detailFragment) fragmentManager.findFragmentById(R.id.fragDetail);
        detailFragment.applyData(hoaQua);

    }
}
