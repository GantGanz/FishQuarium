package com.example.fishquarium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AquariumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aquarium);

        Button daftarIkanButton = (Button) findViewById(R.id.daftarIkanButton);
        daftarIkanButton.setBackgroundColor(Color.TRANSPARENT);
        daftarIkanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), daftarIkanActivity.class);
                startIntent.putExtra("TRUE", "ntah");
                startActivity(startIntent);
            }
        });

        Button tukarButton= (Button) findViewById(R.id.tukarButton);
        tukarButton.setBackgroundColor(Color.TRANSPARENT);
        tukarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), tukarActivity.class);
                startIntent.putExtra("TRUE", "ntah");
                startActivity(startIntent);
            }
        });
    }
}
