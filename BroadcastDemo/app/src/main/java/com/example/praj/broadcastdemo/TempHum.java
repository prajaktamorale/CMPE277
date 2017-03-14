package com.example.praj.broadcastdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TempHum extends AppCompatActivity {

    public static String fan_status;
    public static String sprinkler_status;

    public static boolean flag = false;
    Button set;
    Button cancel;
    EditText temperature;
    EditText humidity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_hum);

        temperature = (EditText)findViewById(R.id.temp_input);
        humidity = (EditText) findViewById(R.id.humidity_input);

        set=(Button)findViewById(R.id.button1);
        cancel=(Button)findViewById(R.id.Cancel);

        temperature = (EditText)findViewById(R.id.temp_input);
        humidity = (EditText) findViewById(R.id.humidity_input);

        set.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("android.intent.MY_INTENT_REQUEST");

                intent.putExtra("Temperature",temperature.getText().toString());
                intent.putExtra("Humidity",humidity.getText().toString());

                sendBroadcast(intent);
            }
        });

    }
}
