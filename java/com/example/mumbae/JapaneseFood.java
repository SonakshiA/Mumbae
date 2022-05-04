package com.example.mumbae;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class JapaneseFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japanese_food);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("East Asian Spice Trail","Vile Parle East"));
        items.add(new Item("Pa Pa Ya","Palladium Mall, Lower Parel"));
        items.add(new Item("The Fatty Bao","Linking Road Junction of 14th and 33th Road"));
        items.add(new Item("Global Fusion","Saki Naka"));
        items.add(new Item("Wasabi by Morimoto","The Taj Mahal Palace and Tower"));
        items.add(new Item("Umame","Churchgate Mumbai"));
        items.add(new Item("Kuai Kitchen","Colaba"));
        items.add(new Item("Hello Guppy","Bandra Kurla Complex (BKC)"));
        items.add(new Item("Joss","Kala Ghoda, Santacruz West"));
        items.add(new Item("Asian Town","Kala Ghoda, Fort"));
        items.add(new Item("Yuuka","Lower Parel"));
        items.add(new Item("Shiro","Lower Parel"));
        items.add(new Item("Sushi Koi","Bandra West"));
        items.add(new Item("Happy Thai","Worli"));

        ListAdapter adapter = new ListAdapter(this,items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}