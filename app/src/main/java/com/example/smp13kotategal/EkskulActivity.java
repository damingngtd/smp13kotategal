package com.example.smp13kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class EkskulActivity extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {
            R.drawable.bacaca,
            R.drawable.baca,
            R.drawable.bacaca,
            R.drawable.baca};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekskul);
        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }

    public void orgpram(View view) {
        Intent intent = new Intent(EkskulActivity.this, AlbumPramukaActivity.class);
        startActivity(intent);
    }

    public void orgpmr(View view) {
        Intent intent = new Intent(EkskulActivity.this, AlbumPmrActivity.class);
        startActivity(intent);
    }

    public void orgfut(View view) {
        Intent intent = new Intent(EkskulActivity.this, AlbumBolaActivity.class);
        startActivity(intent);
    }

    public void orgton(View view) {
        Intent intent = new Intent(EkskulActivity.this, AlbumBadmintonActivity.class);
        startActivity(intent);
    }
}