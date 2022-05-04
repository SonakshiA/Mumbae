package com.example.mumbae;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Dessert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Le 15 Patisserie","Palladium Mall, Lower Parel"));
        items.add(new Item("Theobroma","Vashi/ Andheri West/ Lokhandwala Market"));
        items.add(new Item("Suzette Creperie & Cafe","Hiranandani Gardens, Powai"));
        items.add(new Item("La Folie Lab"," Hill Road, Bandra West"));
        items.add(new Item("K Rustom's Ice Cream","Churchgate, Mumbai"));
        items.add(new Item("Indigo Delicatessen","Ghatkopar West, Mumbai"));
        items.add(new Item("The Boston Cafe & Patisserie","Mindspace, Mumbai"));
        items.add(new Item("Toshin","Chembur, Mumbai"));
        items.add(new Item("Naturals Icecream","Vashi/Marine Lines/ Juhu"));
        items.add(new Item("Daniel Patissier","Bandra West, Mumbai"));

        ListAdapter adapter = new ListAdapter(this,items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}