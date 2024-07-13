package com.surendramaran.yolov8tflite;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnStart = findViewById(R.id.btnStart);
        btnStart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.btnStart:
//                Intent m = new Intent(this, MainActivity.class);
//                startActivity(m);
//                break;
//        }

        if (v.getId() == R.id.btnStart) {
            Intent m = new Intent(this, MainActivity.class);
            startActivity(m);
        }
    }


    public void keterangan(View view) {
        Intent intent = new Intent(HomeActivity.this,KeteranganActivity.class);
        startActivity(intent);
    }


}

