package com.example.fishquarium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PengaturanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengaturan);

        Button kembaliPengaturanButton = (Button) findViewById(R.id.kembaliPengaturanButton);
        kembaliPengaturanButton.setBackgroundColor(Color.TRANSPARENT);
        kembaliPengaturanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startIntent.putExtra("TRUE", "ntah");
                startActivity(startIntent);
            }
        });
    }
}
