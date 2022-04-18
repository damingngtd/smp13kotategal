package com.example.smp13kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PerpusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpus);
    }

    public void buku7(View view) {
        Intent intent = new Intent(PerpusActivity.this, Buku7Activity.class);
        startActivity(intent);
    }

    public void buku8(View view) {
        Intent intent = new Intent(PerpusActivity.this, Buku8Activity.class);
        startActivity(intent);
    }

    public void buku9(View view) {
        Intent intent = new Intent(PerpusActivity.this, Buku9Activity.class);
        startActivity(intent);
    }

    public void buku72(View view) {
        Intent intent = new Intent(PerpusActivity.this, Buku72Activity.class);
        startActivity(intent);
    }

    public void buku82(View view) {
        Intent intent = new Intent(PerpusActivity.this, Buku82Activity.class);
        startActivity(intent);
    }

    public void buku92(View view) {
        Intent intent = new Intent(PerpusActivity.this, Buku92Activity.class);
        startActivity(intent);
    }
}