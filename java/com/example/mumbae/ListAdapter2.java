package com.example.mumbae;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter2 extends ArrayAdapter<Item> {
    public ListAdapter2(Activity context, ArrayList<Item> items){
        super(context,0,items);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_2,parent,false);
        }

        Item currentItem = getItem(position);
        TextView textView_1 = (TextView) listItemView.findViewById(R.id.textview_1);
        textView_1.setText(currentItem.getName());

        TextView textView_2 = (TextView) listItemView.findViewById(R.id.textview_2);
        textView_2.setText(currentItem.getSubText());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.item_image);

        if (currentItem.hasImage()){
            imageView.setImageResource(currentItem.getImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        } else{
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
