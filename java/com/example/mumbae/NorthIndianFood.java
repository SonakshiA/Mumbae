package com.example.mumbae;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NorthIndianFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_north_indian_food);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Lotus Cafe","JW Marriott Juhu"));
        items.add(new Item("Sigree Global Grill","Powai"));
        items.add(new Item("Masala Bay","Taj Lands End"));
        items.add(new Item("Indian Bistro","Chembur"));
        items.add(new Item("Punjab Grill","Bandra Kurla Complex (BKC)"));
        items.add(new Item("Taftoon Bar and Kitchen","Bandra Kurla Complex (BKC)"));
        items.add(new Item("Butterfly High","Bnadra Kurla Complex (BKC)"));
        items.add(new Item("Ishaara","Lower Parel"));
        items.add(new Item("Kebabs and Kurries","ITC Grand Central"));
        items.add(new Item("Mahesh Lunch Home","Vashi"));
        items.add(new Item("Sigree","Vashi"));
        items.add(new Item("Made In Punjab","Malad West"));
        items.add(new Item("Peshawari Grill","The Hub Mall, Goregaon East"));
        items.add(new Item("Baluchi","The Lalit, Mumbai"));

        ListAdapter adapter = new ListAdapter(this, items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}