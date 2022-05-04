package com.example.mumbae;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BloodBankContact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_bank_contact);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Dr. Patkar Blood Bank (New Mumbai)","7890771",R.drawable.baseline_phone_24));
        items.add(new Item("Tata Memorial Hospital (Parel)","4161716",R.drawable.baseline_phone_24));
        items.add(new Item("Sion Hospital (Sion)","407638189",R.drawable.baseline_phone_24));

        ListAdapter2 adapter = new ListAdapter2(this,items);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position==0){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL ) ;
                    dialIntent.setData(Uri.parse ("tel:" + "7890771" )) ; // has to be only "tel:", no other word
                    startActivity(dialIntent) ;
                } else if (position==1){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL ) ;
                    dialIntent.setData(Uri.parse ("tel:" + "4161716" )) ; // has to be only "tel:", no other word
                    startActivity(dialIntent) ;
                } else if (position==2){
                    Intent dialIntent = new Intent(Intent.ACTION_DIAL ) ;
                    dialIntent.setData(Uri.parse ("tel:" + "407638189" )) ; // has to be only "tel:", no other word
                    startActivity(dialIntent) ;
                }
            }
        });
    }
}