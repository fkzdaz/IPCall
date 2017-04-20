package com.example.fang.ipcall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * IP拨号器
 * Created by Fkz on 2017/4/20.
 */

public class CallReciver extends BroadcastReceiver {
    private static final String TAG = "CallReciver";
    @Override
    public void onReceive(Context context, Intent intent) {

        call();


    }

    private void call() {
        Log.i("CallReciver", "打电话");
        String phone=getResultData();
        Log.i(TAG, "电话号码:"+phone);
        String newPhone="+86"+phone;
        setResultData(newPhone);
    }
}
