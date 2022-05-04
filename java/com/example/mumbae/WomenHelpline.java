package com.example.mumbae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class WomenHelpline extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women_helpline);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("National Commison For Women (NCW)","7827170170",R.drawable.baseline_phone_24));
        items.add(new Item("Women's Centre","26140403",R.drawable.baseline_phone_24));
        items.add(new Item("Eve-Teasing Helpline","103",R.drawable.baseline_phone_24));
        items.add(new Item("Women Helpline","22633333",R.drawable.baseline_phone_24));
        items.add(new Item("Women Helpline","22620111",R.drawable.baseline_phone_24));

        ListAdapter2 adapter = new ListAdapter2(this,items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"7827170170"));
                    startActivity(dialIntent);
                } else if (position==1){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"26140403"));
                    startActivity(dialIntent);
                } else if (position==2) {
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:" + "103"));
                    startActivity(dialIntent);
                } else if (position==3) {
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:" + "22633333"));
                    startActivity(dialIntent);
                } else if (position==4) {
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:" + "22620111"));
                    startActivity(dialIntent);
                }
            }
        });
    }
}