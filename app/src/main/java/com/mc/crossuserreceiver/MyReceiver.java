package com.mc.crossuserreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String pkg = intent.getData().getSchemeSpecificPart();
        Log.d(getClass().toString(), intent.getAction() + " pkg = " + pkg);
    }
}
