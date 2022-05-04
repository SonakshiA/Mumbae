package com.example.mumbae;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ParsiFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parsi_food);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Café Excelsior","Fort"));
        items.add(new Item("Yazdani Bakery","Fort"));
        items.add(new Item("Ideal Corner","Fort"));
        items.add(new Item("Café Military","Fort"));
        items.add(new Item("Jimmy Boy","Fort"));
        items.add(new Item("Sassanian Boulangerie","Grant Road East"));
        items.add(new Item("Paradise","Colaba"));
        items.add(new Item("Britannia and Co","Ballard Estate"));
        items.add(new Item("Cafe Irani Chai","Mahim"));
        items.add(new Item("Koolar & Co.","Matunga"));
        items.add(new Item("Soda Bottle Openerwala","Lower Parel/BKC"));
        items.add(new Item("Kayani Bakery","Marine Lines"));

        ListAdapter adapter = new ListAdapter(this,items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}