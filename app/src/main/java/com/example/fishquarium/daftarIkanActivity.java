package com.example.fishquarium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class daftarIkanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_ikan);

        Button kembaliDaftarButton = (Button) findViewById(R.id.kembaliDaftarButton);
        kembaliDaftarButton.setBackgroundColor(Color.TRANSPARENT);
        kembaliDaftarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startIntent.putExtra("TRUE", "ntah");
                startActivity(startIntent);
            }
        });

        Button xDaftarButton = (Button) findViewById(R.id.xDaftarButton);
        xDaftarButton.setBackgroundColor(Color.TRANSPARENT);
        xDaftarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), AquariumActivity.class);
                startIntent.putExtra("TRUE", "ntah");
                startActivity(startIntent);
            }
        });
    }
}
