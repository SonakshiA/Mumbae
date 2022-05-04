package com.example.mumbae;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ChineseFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese_food);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Mainland China","Vashi/Andheri West"));
        items.add(new Item("China Bistro","Chembur/Worli/Thane"));
        items.add(new Item("Yauatcha","BKC"));
        items.add(new Item("Hakkasan","Bandra"));
        items.add(new Item("House of Mandarin","Bandra"));
        items.add(new Item("Ming Yang","Taj Lands End, Bandra"));
        items.add(new Item("Mamagoto","Bandra"));
        items.add(new Item("Khow Chow","Bandra"));
        items.add(new Item("Lemon Leaf","Bandra Talao"));
        items.add(new Item("Jia – The Oriental Kitchen","Colaba"));
        items.add(new Item("Kuai Kitchen","Colaba"));
        items.add(new Item("Golden Dragon","The Taj Mahal Palace, Colaba"));
        items.add(new Item("Stir Fry Grill","Malad"));
        items.add(new Item("Uncle’s Kitchen","Malad"));
        items.add(new Item("The Red Turtle","Malad"));
        items.add(new Item("By The Mekong, St Regis","Lower Parel"));
        items.add(new Item("Royal China","Fort"));
        items.add(new Item("Dynasty","Santacruz"));
        items.add(new Item("Soy Street","Vashi"));
        items.add(new Item("Ling's Pavillion","Fort"));
        items.add(new Item("Asian Town","Fort"));
        items.add(new Item("Ài Shiwū","Goregaon East"));
        items.add(new Item("China Xpress","Thane"));
        items.add(new Item("East Asia – The Asian Fanfare","Borivali"));
        items.add(new Item("February 30","Oshiwara"));
        items.add(new Item("Gypsy Chinese","Dadar"));
        items.add(new Item("Shaolin Temple","CBD Belapur"));

        ListAdapter adapter = new ListAdapter(this,items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}