package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Approve_peminjaman extends AppCompatActivity {

    Button update_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approve_peminjaman);
        update_data=findViewById(R.id.update_car);
        update_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Approve_peminjaman.this, Verifikasi_lanjut.class);
                startActivity(intent);
            }
        });

    }
}