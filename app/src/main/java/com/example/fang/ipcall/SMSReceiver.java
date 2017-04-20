package com.example.fang.ipcall;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;

/**
 * 短信拦截
 * Created by Fkz on 2017/4/20.
 */

public class SMSReceiver extends BroadcastReceiver {
    private static final String TAG = "SMSReceiver";
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "收到短信");
        //获取短信内容
        Bundle bundle=intent.getExtras();
        //返回的是一个Object数组
        Object[] objects= (Object[]) bundle.get("pdus");
        //遍历数组得到短信内容
        for (Object object:objects){
            //把数组元素转换成短信对象
            SmsMessage sms = SmsMessage.createFromPdu((byte[]) object);
            //获取发件人号码
            String toPhone = sms.getOriginatingAddress();
            //获取短信内容
            String smsContent = sms.getMessageBody();
            Log.i("SMSReceiver", "发件人号码:" + toPhone + "短信内容" + smsContent);

            //判断是否是拦截的号码
            if (toPhone.equals("12345678910")) {
                //拦截广播
                abortBroadcast();
            }
        }



    }
}
