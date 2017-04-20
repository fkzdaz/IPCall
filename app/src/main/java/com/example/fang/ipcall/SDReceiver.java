package com.example.fang.ipcall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * 监听SD卡
 * Created by Fkz on 2017/4/20.
 */
public class SDReceiver extends BroadcastReceiver {
    private static final String TAG = "SDReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        String action=intent.getAction();
        if (action.equals(Intent.ACTION_MEDIA_MOUNTED)){
            Log.i(TAG, "SD卡就绪");
        }
        else if (action.equals(Intent.ACTION_MEDIA_REMOVED)){
            Log.i(TAG, "SD卡拔出");
        }else if (action.equals(Intent.ACTION_MEDIA_UNMOUNTED)){
            Log.i(TAG, "SD卡卸载");
        }
    }
}
