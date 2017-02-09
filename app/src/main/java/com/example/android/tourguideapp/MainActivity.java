package com.example.android.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void HistoricalMonuments(View v) {
        Intent intent = new Intent(this, HistoricalMonuments.class);
        startActivity(intent);
    }

    public void Museums(View v) {
        Intent intent = new Intent(this, Museums.class);
        startActivity(intent);
    }

    public void ITParks(View v) {
        Intent intent = new Intent(this, ITParks.class);
        startActivity(intent);
    }

    public void AmusementParks(View v) {
        Intent intent = new Intent(this, AmusementParks.class);
        startActivity(intent);
    }
}
