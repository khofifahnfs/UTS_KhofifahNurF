package com.khofifahnurf.khofifahlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.khofifahnurf.khofifahlogin.R;
public class list_inventory extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_inventory);
        listView = (ListView) findViewById(R.id.invent);
        String[] values = new String[]{
                "Saklar", "Kabel", "Sensor", "Tombol", "Kawat"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1, values);

        listView.setAdapter(adapter);
    }
}