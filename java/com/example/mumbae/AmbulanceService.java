package com.example.mumbae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class AmbulanceService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ambulance_service);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Fort","2024545",R.drawable.baseline_phone_24));
        items.add(new Item("Navi Mumbai","27572111",R.drawable.baseline_phone_24));
        items.add(new Item("Andheri","8320021",R.drawable.baseline_phone_24));
        items.add(new Item("Mulund East","25645385",R.drawable.baseline_phone_24));
        items.add(new Item("Mulund West","25675995",R.drawable.baseline_phone_24));
        items.add(new Item("Goregaon","28721061",R.drawable.baseline_phone_24));
        items.add(new Item("Shivaji Park, Dadar","24305847",R.drawable.baseline_phone_24));
        items.add(new Item("St. John Ambulance Services","22621666",R.drawable.baseline_phone_24));
        items.add(new Item("Bombay Hospital Ambulance Services","22067676",R.drawable.baseline_phone_24));

        ListAdapter2 adapter = new ListAdapter2(this,items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"2024545"));
                    startActivity(dialIntent);
                } else if (position==1){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"27572111"));
                    startActivity(dialIntent);
                } else if (position==2){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"25645385"));
                    startActivity(dialIntent);
                }  else if (position==3){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"25675995"));
                    startActivity(dialIntent);
                } else if (position==4){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"28721061"));
                    startActivity(dialIntent);
                } else if (position==5){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"24305847"));
                    startActivity(dialIntent);
                } else if (position==6){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"22621666"));
                    startActivity(dialIntent);
                } else if (position==7){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL);
                    dialIntent.setData(Uri.parse("tel:"+"22067676"));
                    startActivity(dialIntent);
                }
            }
        });
    }
}