package com.example.android.tourguideapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Anzy on 28-06-2016.
 */
public class customObjectAdapter extends ArrayAdapter<CustomObject> {

    public customObjectAdapter(Activity context, List<CustomObject> customObjects) {
        super(context, 0, customObjects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        CustomObject customObject = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_custom, parent, false);
        }

        TextView title = (TextView) convertView.findViewById(R.id.titleTextView);
        title.setText(customObject.mImageTitle);

        ImageView image = (ImageView) convertView.findViewById(R.id.imageView);
        image.setImageResource(customObject.mImage);

        TextView desc = (TextView) convertView.findViewById(R.id.descTextView);
        desc.setText(customObject.mImageDesc);

        return convertView;
    }
}
