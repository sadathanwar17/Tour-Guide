package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.Arrays;

public class ITParks extends AppCompatActivity {

    customObjectAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itparks);
        CustomObject customObject[] = {
                new CustomObject(getString(R.string.electronicscity), getString(R.string.electronicscityDesc), R.drawable.wipro)
        };

        adapter = new customObjectAdapter(this, Arrays.asList(customObject));

        ListView itParks = (ListView) findViewById(R.id.itparks);
        itParks.setAdapter(adapter);
    }
}
