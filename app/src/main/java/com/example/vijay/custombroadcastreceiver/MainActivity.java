package com.example.vijay.custombroadcastreceiver;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
//    BroadcastReceiver broadcastReceiver;
LocalBroadcastManager localBroadcastManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        broadcastReceiver=new CustomBroadCastReceiver();
        localBroadcastManager=LocalBroadcastManager.getInstance(getApplicationContext());
    }

    public void view_click(View view) {
        switch (view.getId())
        {
            case R.id.button1:
                Intent intent=new Intent();
                intent.addCategory(Intent.CATEGORY_DEFAULT);
                intent.setAction("my.custom.action.tag.fordemo");
//                sendBroadcast(intent);
                localBroadcastManager.sendBroadcast(intent);
                break;

        }

    }

}
