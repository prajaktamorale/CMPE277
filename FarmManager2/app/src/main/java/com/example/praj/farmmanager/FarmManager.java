package com.example.praj.farmmanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by praj on 3/13/17.
 */

public class FarmManager extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals("android.intent.MY_INTENT_REQUEST")) {

            MainActivity.temperature = intent.getStringExtra("Temperature");
            MainActivity.humidity = intent.getStringExtra("Humidity");
        }

    }

}
