package com.example.praj.farmmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Farmmaintenance extends AppCompatActivity {
    Button fan;
    Button sprinkler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farmmaintenance);

        Intent i = getIntent();

        fan = (Button) findViewById(R.id.fan_state);
        sprinkler = (Button) findViewById(R.id.sprinkler_state);


        fan.setText("Fan "+i.getStringExtra("fan"));
        sprinkler.setText("Sprinkler "+i.getStringExtra("sprinkler"));
    }
}
