package com.juan.mobil;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class mobilDetail extends AppCompatActivity {
    public static final String EXTRA_NAMA = "extra_nama";
    public static final String EXTRA_KETERANGAN = "extra_keterangan";
    public static final String EXTRA_FOTO = "extra_foto";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobildetail);
        ImageView imgmobil = findViewById(R.id.tv_mobil_foto);
        TextView txtNama = findViewById(R.id.tv_mobil_nama),
                txtKeterangan = findViewById(R.id.tv_keterangan);

        int foto = getIntent().getIntExtra(EXTRA_FOTO, 0);
        Bitmap bmp = BitmapFactory.decodeResource(getResources(), foto);
        imgmobil.setImageBitmap(bmp);
        String namanya = getIntent().getStringExtra(EXTRA_NAMA);
        Toast.makeText(getBaseContext(), namanya, Toast.LENGTH_LONG);
        Log.d("ini", namanya);
        txtNama.setText(namanya);
        String keterangan = getIntent().getStringExtra(EXTRA_KETERANGAN);
        Log.d("itu", keterangan);
        txtKeterangan.setText(keterangan);
    }
}