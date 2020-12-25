package com.hieu.apptiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ChiTietSP extends AppCompatActivity {
    TextView chitiet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chitietsp);
        Intent intent=getIntent();
        chitiet=findViewById(R.id.chitiet);
        chitiet.setText(intent.getStringExtra("chitiet"));
    }
}