package com.example.android.rizkyalamsyah_1202154185_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

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
        setContentView(R.layout.activity_menu);
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
            foods.add("Burger");
            foods.add("Chicken Hot");
            foods.add("Chicken Burger");
            foods.add("Paket Makmur 1");
            foods.add("Paket Makmur 2");
            foods.add("Paket Semur 1");
            foods.add("Paket Semur 2");
            foods.add("Shilky Pudding");
            foods.add("Silky Pudding");

            // mamanggil harga
            priceses.add(20000);
            priceses.add(20000);
            priceses.add(30000);
            priceses.add(25000);
            priceses.add(25000);
            priceses.add(20000);
            priceses.add(20000);
            priceses.add(10000);
            priceses.add(10000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.burger);
            photos.add(R.drawable.hot);
            photos.add(R.drawable.chickenburger);
            photos.add(R.drawable.makmur1);
            photos.add(R.drawable.makmur2);
            photos.add(R.drawable.semur1);
            photos.add(R.drawable.semur2);
            photos.add(R.drawable.shilkypudding);
            photos.add(R.drawable.silkypudding);
        }
    }
}
