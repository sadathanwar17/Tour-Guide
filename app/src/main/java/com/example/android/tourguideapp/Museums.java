package com.example.android.tourguideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.Arrays;

public class Museums extends AppCompatActivity {

    customObjectAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museums);
        CustomObject customObject[] = {
                new CustomObject(getString(R.string.kempegowdamuseum), getString(R.string.kempegowdamuseumDesc), R.drawable.kempegowda),
                new CustomObject(getString(R.string.HALmuseum), getString(R.string.HALmuseumDesc), R.drawable.halaerospacemuseum)
        };

        adapter = new customObjectAdapter(this, Arrays.asList(customObject));
        ListView museums = (ListView) findViewById(R.id.museums);
        museums.setAdapter(adapter);
    }
}
