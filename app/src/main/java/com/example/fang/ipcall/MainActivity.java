package com.example.fang.ipcall;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnReceiver,btnHaveOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnReceiver= (Button) findViewById(R.id.btn_receiver);
        btnReceiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendBroadcast(new Intent().setAction("fangdazhen"));
            }
        });
        btnHaveOrder= (Button) findViewById(R.id.btn_haveorder);
        btnHaveOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendOrderedBroadcast(new Intent().setAction("com.lgl.good"),null,null,null,0,"自定义广播内容",null);
            }
        });
        //        getPermission();
    }

//    private void getPermission() {
//        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.PROCESS_OUTGOING_CALLS)!= PackageManager.PERMISSION_GRANTED){
//            requestPermissions(new String[]{Manifest.permission.PROCESS_OUTGOING_CALLS},1001);
//        }
//    }

    @Override
    public void onBackPressed() {
        //禁止返回键
        super.onBackPressed();
    }
}
