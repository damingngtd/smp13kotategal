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
        Intent intent = new Intent(GaleriActivity.this, AlbumfutsalActivity.class);
        startActivity(intent);
    }

    public void albumdorganisasi(View view) {
        Intent intent = new Intent(GaleriActivity.this, AlbumOrganisasiActivity.class);
        startActivity(intent);
    }

    public void albumkegiatan(View view) {
        Intent intent = new Intent(GaleriActivity.this, AlbumKegiatanActivity.class);
        startActivity(intent);
    }
}