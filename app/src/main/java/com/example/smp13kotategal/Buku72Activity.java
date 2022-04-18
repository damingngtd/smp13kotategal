package com.example.smp13kotategal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Buku72Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku72);
    }
    public void mat7s2(View view) {
        goToUrl("https://drive.google.com/file/d/1R5h8H9nmJU72m9WITVZmBLdqwdnie0eV/view?usp=sharing");
    }

    public void ipa2kls7(View view) {
        goToUrl("https://drive.google.com/file/d/1QNjkCap3sIVcqhwax4sjU6tJJdrNNi4I/view?usp=sharing");
    }

    public void pra2kls7(View view) {
        goToUrl("https://drive.google.com/file/d/1Qi51Er20t455i5hlLUDs91e6r8L1OW3L/view?usp=sharing");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}