package com.example.fang.ipcall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * 流氓软件
 * Created by Fkz on 2017/4/20.
 */

public class RebootReceiver extends BroadcastReceiver{
    private static final String TAG = "RebootReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "开机");
        Intent intent1=new Intent(context,MainActivity.class);
        //在Activity之外启动需要设置Flags
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
