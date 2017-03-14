package com.example.praj.farmmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button fan;
    Button sprinkler;
    TextView text;

    public static String temperature;
    public static String humidity;
    public static float return_text;
    public static boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fan = (Button) findViewById(R.id.button1);
        sprinkler = (Button) findViewById(R.id.button2);

        text = (TextView) findViewById(R.id.textview2);

        text.setText("Temperature : "+temperature+" & Humidity : "+humidity);

        fan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Farmmaintenance.class);

                intent.putExtra("fan","ON");
                intent.putExtra("sprinkler","OFF");

                startActivity(intent);
            }
        });

        sprinkler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_i = new Intent(getApplicationContext(),Farmmaintenance.class);

                intent.putExtra("fan","ON");
                intent.putExtra("sprinkler","ON");

                startActivity(intent_i);
            }
        });


    }
}
