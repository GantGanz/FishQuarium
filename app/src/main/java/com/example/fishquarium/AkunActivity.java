package com.example.fishquarium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AkunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);

        Button xAkunButton = (Button) findViewById(R.id.xAkunButton);
        xAkunButton.setBackgroundColor(Color.TRANSPARENT);
        xAkunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startIntent.putExtra("TRUE", "ntah");
                startActivity(startIntent);
            }
        });

        Button ubahAkunButton = (Button) findViewById(R.id.ubahAkunButton);
        ubahAkunButton.setBackgroundColor(Color.TRANSPARENT);
        ubahAkunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), UbahKeluarAkunActivity.class);
                startIntent.putExtra("TRUE", "ntah");
                startActivity(startIntent);
            }
        });

        Button keluarAkunButton = (Button) findViewById(R.id.keluarAkunButton);
        keluarAkunButton.setBackgroundColor(Color.TRANSPARENT);
        keluarAkunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), UbahKeluarAkunActivity.class);
                startIntent.putExtra("TRUE", "ntah");
                startActivity(startIntent);
            }
        });
    }
}
