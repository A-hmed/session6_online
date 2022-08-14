package com.route.recyclerview_online;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class SettingsActivity extends AppCompatActivity {
    RecyclerView settingsRecyclerView ;
    SettingsAdapter adapter;
    ArrayList<SettingsItem> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        fillList();

        settingsRecyclerView = findViewById(R.id.settings_recycler_view);
       // RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL, false );
        adapter = new SettingsAdapter(list);

       // settingsRecyclerView.setLayoutManager(layoutManager);
        settingsRecyclerView.setAdapter(adapter);
    }
    void fillList(){
        list =new ArrayList<SettingsItem>();
        list.add(new SettingsItem("Wifi", "Wifi , mobile and data usages", R.drawable.ic_wifi));
        list.add(new SettingsItem("Battery", "100%", R.drawable.ic_battery));
        for(int i =3 ;i< 100; i++){
            list.add(new SettingsItem("item "+ i, "subtitle "+i, R.drawable.ic_battery));
        }
    }
}