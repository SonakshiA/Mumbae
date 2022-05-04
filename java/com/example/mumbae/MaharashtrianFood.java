package com.example.mumbae;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MaharashtrianFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maharashtrian_food);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Chaitanya","Dadar West"));
        items.add(new Item("Diva Maharashtracha","Mahim"));
        items.add(new Item("Highway Gomantak","Bandra East"));
        items.add(new Item("Mee Marathi","Vile Parle"));
        items.add(new Item("Satkar Rice Plate House","Goregaon"));
        items.add(new Item("MH-09 Shetkari","Thane"));
        items.add(new Item("Konkani Haus Restaurant & Bar","Thane"));
        items.add(new Item("Naiv Chaitanya","Versova"));
        items.add(new Item("Kokani Katta","Mira Road"));
        items.add(new Item("Ceremonial Kitchen & Co","Ghodbunder"));
        items.add(new Item("Rajmanya","Vashi"));
        items.add(new Item("Aaswad","Dadar"));
        items.add(new Item("Vinay Health Home","Charni Road"));

        ListAdapter adapter = new ListAdapter(this,items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}