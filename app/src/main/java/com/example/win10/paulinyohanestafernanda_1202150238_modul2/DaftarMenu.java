package com.example.win10.paulinyohanestafernanda_1202150238_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class DaftarMenu extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("Ramyeon");
            foods.add("Sate Bakso Bakar");
            foods.add("Sate Kulit");
            foods.add("Sate Mozzarella");
            foods.add("Sate Paha");
            foods.add("Sate Udang");
            foods.add("Sate Pisang Nugget");


            // mamanggil harga
            priceses.add(35000);
            priceses.add(25000);
            priceses.add(34500);
            priceses.add(50000);
            priceses.add(34500);
            priceses.add(34500);
            priceses.add(30000);


            // memanggil foto yang ada di drawable
            photos.add(R.drawable.ramyeon);
            photos.add(R.drawable.sate_bakso_bakar);
            photos.add(R.drawable.sate_kulit);
            photos.add(R.drawable.sate_mozarella);
            photos.add(R.drawable.sate_paha);
            photos.add(R.drawable.sate_udang);
            photos.add(R.drawable.sate_pisang_nugget);

        }
    }
}
