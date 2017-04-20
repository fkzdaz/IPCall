package com.example.fang.ipcall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/**
 * 应用安装卸载监听
 * Created by Fkz on 2017/4/20.
 */

public class APPReceiver extends BroadcastReceiver {
    private static final String TAG = "APPReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        //判断广播类型
        String action=intent.getAction();
        //获取包名
        Uri appName=intent.getData();

        if (Intent.ACTION_PACKAGE_ADDED.equals(action)){
            Log.i(TAG, "安装"+appName);
        }else if (Intent.ACTION_PACKAGE_REPLACED.equals(action)){
            Log.i(TAG, "更新"+appName);
        }else if (Intent.ACTION_PACKAGE_REMOVED.equals(action)){
            Log.i(TAG, "卸载"+appName);
        }
    }
}
