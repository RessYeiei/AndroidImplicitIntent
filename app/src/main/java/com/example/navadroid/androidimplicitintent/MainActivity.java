package com.example.navadroid.androidimplicitintent;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

// Ideas from https://www.formget.com/android-intent/
// and https://developer.android.com/guide/components/intents-common.html

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        findViewById(R.id.btn_intent_1).setOnClickListener(this);
        findViewById(R.id.btn_intent_2).setOnClickListener(this);
        findViewById(R.id.btn_intent_3).setOnClickListener(this);
        findViewById(R.id.btn_intent_4).setOnClickListener(this);
        findViewById(R.id.btn_intent_5).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch (v.getId()) {
            case R.id.btn_intent_1:
                // TODO: Open media gallery
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("content://media/external/images/media/"));
                startActivity(intent);
                break;
            case R.id.btn_intent_2:
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0911434584"));
                startActivity(intent);
                // TODO: Call phone
                break;
            case R.id.btn_intent_3:
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.google.co.th/maps/place/Dara+Academy/@18.7992441,99.0099283,17z/data=!3m1!4b1!4m5!3m4!1s0x30da3ab4ce4e63c9:0xe3ff6b0d9af52459!8m2!3d18.799239!4d99.012117"));
                startActivity(intent);
                // TODO: Go to google map
                break;
            case R.id.btn_intent_4:
                intent.setAction(MediaStore.ACTION_IMAGE_CAPTURE);

                startActivity(intent);
                // TODO: go to camera
                break;
            case R.id.btn_intent_5:
                intent.setAction(Intent.ACTION_VOICE_COMMAND);
                startActivity(intent);
                // TODO: voice command
                break;

        }
    }
}
