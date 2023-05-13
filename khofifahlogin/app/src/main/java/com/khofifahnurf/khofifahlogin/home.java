package com.khofifahnurf.khofifahlogin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class home extends AppCompatActivity {
    ListView listView;
    Button btnList;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Context context = getApplicationContext();
        CharSequence text = "Selamat Datang (Guest!)";
        int duration = Toast.LENGTH_SHORT;

        Toast.makeText(context, text, duration).show();

        btnList = (Button) findViewById(R.id.invent);

        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this, list_inventory.class));
                finish();
            }
        });
    }
}
