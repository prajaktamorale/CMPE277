package com.example.praj.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by praj on 3/13/17.
 */

public class FarmManager extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals("android.intent.MY_INTENT_RESPONSE")) {

            TempHum.flag = true;
            TempHum.fan_status = intent.getExtras().getString("fan");
            TempHum.sprinkler_status = intent.getExtras().getString("sprinkler");

        }

    }

}
