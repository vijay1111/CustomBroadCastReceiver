package com.example.vijay.custombroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by vijay on 23/10/17.
 */

public class CustomBroadCastReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "custom broad cast triggerd", Toast.LENGTH_SHORT).show();
    }
}
