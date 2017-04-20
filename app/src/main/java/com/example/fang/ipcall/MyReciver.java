package com.example.fang.ipcall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Fkz on 2017/4/20.
 */

public class MyReciver extends BroadcastReceiver {
    private static final String TAG = "MyReciver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "收到了自定义广播");
    }
}
