package com.example.smp13kotategal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Buku92Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku92);
    }

    public void ipa2kls9(View view) {
        goToUrl("https://drive.google.com/file/d/1W5l5DT3coLDPr8EpLCb0AmogF3fztWjB/view?usp=sharing");
    }

    public void pra2kls9(View view) {
        goToUrl("https://drive.google.com/file/d/1WZ8ZK5q72ypgyZe5PiW5Y0ClEmDdchtc/view?usp=sharing");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
