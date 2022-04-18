package com.example.smp13kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GaleriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);
    }

    public void futsal(View view) {
        Intent intent = new Intent(GaleriActivity.this, AlbumOlahragaActivity.class);
        startActivity(intent);
    }

    public void albumdorganisasi(View view) {
        Intent intent = new Intent(GaleriActivity.this, AlbumUpacaraActivity.class);
        startActivity(intent);
    }

    public void albumkegiatan(View view) {
        Intent intent = new Intent(GaleriActivity.this, AlbumSosialActivity.class);
        startActivity(intent);
    }
}