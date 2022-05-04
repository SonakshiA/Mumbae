package com.example.mumbae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PoliceDepartment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_department);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Mumbai Police","100",R.drawable.baseline_phone_24));
        items.add(new Item("Commissioner of Police, Mumbai","22620826",R.drawable.baseline_phone_24));
        items.add(new Item("Police Control Room (Mumbai City)","22621855",R.drawable.baseline_phone_24));


        ListAdapter2 adapter = new ListAdapter2(this,items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"100"));
                    startActivity(dialIntent);
                } else if (position==1){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"22620826"));
                    startActivity(dialIntent);
                } else if (position==2){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"22621855"));
                    startActivity(dialIntent);
                }
            }
        });
    }
}