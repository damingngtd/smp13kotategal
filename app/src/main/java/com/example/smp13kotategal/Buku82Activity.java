package com.example.smp13kotategal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Buku82Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buku82);
    }
    public void mat8s2(View view) {
        goToUrl("https://drive.google.com/file/d/1U6Vgwdb_Xiglv3Pxn6OsWaTuiXUi4ffl/view?usp=sharing");
    }

    public void ipa2kls8(View view) {
        goToUrl("https://drive.google.com/file/d/1U-MMg75uBOYIOmRc77Bepxr9riIrwXz1/view?usp=sharing");
    }
    public void pra2kls8(View view) {
        goToUrl("https://drive.google.com/file/d/1Vlq9oo8qaQkNzACCgUNcmKfJRxm-oWrA/view?usp=sharing");
    }
    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);

    }
}