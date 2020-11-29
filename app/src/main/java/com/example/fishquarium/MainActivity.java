package com.example.fishquarium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button akunButton = (Button) findViewById(R.id.akunButton);
        akunButton.setBackgroundColor(Color.TRANSPARENT);
        akunButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), AkunActivity.class);
//              buat if else udah log in atau belum
                startIntent.putExtra("TRUE", "ntah");
                startActivity(startIntent);
            }
        });

        Button mulaiButton = (Button) findViewById(R.id.mulaiButton);
        mulaiButton.setBackgroundColor(Color.TRANSPARENT);
        mulaiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MulaiActivity.class);
//              buat if else waktu
                startIntent.putExtra("TRUE", "ntah");
                startActivity(startIntent);
            }
        });

        Button pengaturanButton = (Button) findViewById(R.id.pengaturanButton);
        pengaturanButton.setBackgroundColor(Color.TRANSPARENT);
        pengaturanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), PengaturanActivity.class);
//              kayaknya nggak buat if else deh
                startIntent.putExtra("TRUE", "ntah");
                startActivity(startIntent);
            }
        });

        Button aquariumButton = (Button) findViewById(R.id.aquariumButton);
        aquariumButton.setBackgroundColor(Color.TRANSPARENT);
        aquariumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), AquariumActivity.class);
//              buat if else udah punya ikan nggak
                startIntent.putExtra("TRUE", "ntah");
                startActivity(startIntent);
            }
        });
    }
}
