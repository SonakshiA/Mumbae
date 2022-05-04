package com.example.mumbae;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SouthIndianFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south_indian_food);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Mani’s Lunch Home Veg Restaurant","Chembur"));
        items.add(new Item("Gonguura","Andheri West"));
        items.add(new Item("Madras Cafe","King's Circle, Matunga East"));
        items.add(new Item("Arya Bhavan","Matunga East"));
        items.add(new Item("Cafe Mysore","Matunga East"));
        items.add(new Item("Sharda Bhavan","Matunga East"));
        items.add(new Item("Anand Bhavan","Matunga East"));
        items.add(new Item("Dakshinayan","Gandhigram Road, Juhu"));
        items.add(new Item("Banana Leaf","Khopat, Thane West"));
        items.add(new Item("Simbly South","Mahakali, Andheri East"));
        items.add(new Item("Poornima Restaurant","Fort, Mumbai"));
        items.add(new Item("Mahesh Lunch Home","Vashi/Fort"));
        items.add(new Item("Kerala House","Vashi"));

        ListAdapter adapter = new ListAdapter(this,items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}