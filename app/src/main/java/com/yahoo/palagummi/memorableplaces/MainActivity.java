package com.yahoo.palagummi.memorableplaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;
    static ArrayList<String> places = new ArrayList<String>();
    static ArrayList<LatLng> location = new ArrayList<LatLng>();
    static ArrayAdapter arrayAdapter;


    public void addNewPlace(View view) {
        Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
        System.out.println("\n\n\n\n\n\n\nPLACES SIZE\n\n\n\n\n" + places.size());
        int size = places.size();
        intent.putExtra("placeNumber", 0);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        arrayAdapter = new ArrayAdapter(getApplicationContext(), R.layout.custom_textview, places);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}
