package com.example.fishquarium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tukarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tukar);

        Button kembaliTukarButton = (Button) findViewById(R.id.kembaliTukarButton);
        kembaliTukarButton.setBackgroundColor(Color.TRANSPARENT);
        kembaliTukarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), MainActivity.class);
                startIntent.putExtra("TRUE", "ntah");
                startActivity(startIntent);
            }
        });

        Button xTukarButton = (Button) findViewById(R.id.xTukarButton);
        xTukarButton.setBackgroundColor(Color.TRANSPARENT);
        xTukarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), AquariumActivity.class);
                startIntent.putExtra("TRUE", "ntah");
                startActivity(startIntent);
            }
        });

        Button tukarUangButton = (Button) findViewById(R.id.tukarUangButton);
        tukarUangButton.setBackgroundColor(Color.TRANSPARENT);
        tukarUangButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), UbahKeluarAkunActivity.class);
                startIntent.putExtra("TRUE", "ntah");
                startActivity(startIntent);
            }
        });
    }
}
