package com.example.mumbae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FireDepartment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fire_department);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Fire Services","101",R.drawable.baseline_phone_24));
        items.add(new Item("Thane","25391600",R.drawable.baseline_phone_24));
        items.add(new Item("Vashi","27660101",R.drawable.baseline_phone_24));
        items.add(new Item("Belapur","27572111",R.drawable.baseline_phone_24));
        items.add(new Item("New Panvel","27452337",R.drawable.baseline_phone_24));
        items.add(new Item("Kalamboli","27420138",R.drawable.baseline_phone_24));

        ListAdapter2 adapter = new ListAdapter2(this,items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"101"));
                    startActivity(dialIntent);
                } else if (position==1){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"25391600"));
                    startActivity(dialIntent);
                } else if (position==2){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"27660101"));
                    startActivity(dialIntent);
                } else if (position==3){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"27572111"));
                    startActivity(dialIntent);
                } else if (position==4){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"27452337"));
                    startActivity(dialIntent);
                } else if (position==5){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"27420138"));
                    startActivity(dialIntent);
                }
            }
        });
    }
}