package com.juan.mobil;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvmobil;
    private ArrayList<mobilProduct> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvmobil = findViewById(R.id.rv_mobil);
        rvmobil.setHasFixedSize(true);

        list.addAll(mobilData.getListEco());
        showDesainRecyclerList();
    }
    private void showDesainRecyclerList() {
        rvmobil.setLayoutManager(new LinearLayoutManager(this));
        mobilAdapter mobilAdapter = new mobilAdapter(list);
        rvmobil.setAdapter(mobilAdapter);

        mobilAdapter.setOnItemClickCallback(new mobilAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(mobilProduct data) {
                showSelectedData(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent identity = new Intent(MainActivity.this, juan.class);
        startActivity(identity);
        return super.onOptionsItemSelected(item);
    }

    public void showSelectedData(mobilProduct ep) {
        Intent detailmobil = new Intent(MainActivity.this, mobilDetail.class);
        detailmobil.putExtra(mobilDetail.EXTRA_NAMA, ep.getNamamobil());
        detailmobil.putExtra(mobilDetail.EXTRA_KETERANGAN, ep.getKeteranganmobil());
        detailmobil.putExtra(mobilDetail.EXTRA_FOTO, ep.getFotomobil());
        startActivity(detailmobil);
    }
}