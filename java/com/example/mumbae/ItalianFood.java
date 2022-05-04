package com.example.mumbae;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ItalianFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian_food);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Gustoso","Khar"));
        items.add(new Item("Mia Cunica","Powai"));
        items.add(new Item("Celini","Santacruz"));
        items.add(new Item("Woodside All Day Bar & Eatery","Colaba/Andheri"));
        items.add(new Item("Cafe Basilio","Pali Hill/Colaba"));
        items.add(new Item("Little Italy","Juhu"));
        items.add(new Item("Hoppipola","Khar/Powai"));
        items.add(new Item("Salt Water Cafe","Churchgate/Bandra"));
        items.add(new Item("Quattro Ristorante","Nariman Point/Lower Parel"));
        items.add(new Item("Corniche","Waterfront, Bandra"));

        ListAdapter adapter = new ListAdapter(this,items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}