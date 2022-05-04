package com.example.mumbae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class OxygenCentreContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oxygen_centre_contact);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Capron Agencies","8342439",R.drawable.baseline_phone_24));
        items.add(new Item("Prakash Oxygen","6493865",R.drawable.baseline_phone_24));
        items.add(new Item("Vile Parle Medical Club","6206581",R.drawable.baseline_phone_24));

        ListAdapter2 adapter = new ListAdapter2(this,items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"8342439"));
                    startActivity(dialIntent);
                } else if (position==1){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"6493865"));
                    startActivity(dialIntent);
                } else if (position==2) {
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:" + "6206581"));
                    startActivity(dialIntent);
                }
            }
        });
    }
}