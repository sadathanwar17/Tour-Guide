package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.Arrays;

public class AmusementParks extends AppCompatActivity {

    customObjectAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amusement_parks);
        CustomObject[] customObjects = {
                new CustomObject(getString(R.string.lumbinigarden), getString(R.string.lumbinigardenDesc), R.drawable.lumbinigarden),
                new CustomObject(getString(R.string.wonderla), getString(R.string.wonderlaDesc), R.drawable.wonderlabangalore)
        };

        adapter = new customObjectAdapter(this, Arrays.asList(customObjects));
        ListView amusementPark = (ListView) findViewById(R.id.AmusementPark);
        amusementPark.setAdapter(adapter);
    }
}
