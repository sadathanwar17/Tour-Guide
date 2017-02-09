package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.Arrays;

public class HistoricalMonuments extends AppCompatActivity {

    customObjectAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_monuments);
        CustomObject customObjects[] = {
                new CustomObject(getString(R.string.bangalorefort), getString(R.string.bangalorefortDesc), R.drawable.bangalorefort),
                new CustomObject(getString(R.string.tipusultanpalace), getString(R.string.tipusultanpalaceDesc), R.drawable.tipusultansummerplace),
                new CustomObject(getString(R.string.bangalorepalace), getString(R.string.bangalorepalaceDesc), R.drawable.bangalorepalace)
        };

        adapter = new customObjectAdapter(this, Arrays.asList(customObjects));
        ListView hMonuments = (ListView) findViewById(R.id.hMonuments);
        hMonuments.setAdapter(adapter);
    }
}
