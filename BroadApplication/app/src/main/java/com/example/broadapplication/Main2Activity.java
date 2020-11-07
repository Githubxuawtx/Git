<<<<<<< HEAD
package com.example.broadapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG="Main2Activity";
    private NetworkChangeReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter filter=new IntentFilter();
        filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        receiver =new NetworkChangeReceiver();
        registerReceiver(receiver,filter);
        

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }

    class NetworkChangeReceiver extends BroadcastReceiver{

            @Override
            public void onReceive(Context context, Intent intent) {
                Log.d(TAG,"network changes");

            }
        }
    }
=======
package com.example.broadapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceFragmentCompat;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG="Main2Activity";
    private NetworkChangeReceiver receiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter filter=new IntentFilter();
        filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        receiver =new NetworkChangeReceiver();
        registerReceiver(receiver,filter);
        

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }

    class NetworkChangeReceiver extends BroadcastReceiver{

            @Override
            public void onReceive(Context context, Intent intent) {
                Log.d(TAG,"network changes");

            }
        }
    }
>>>>>>> f173405ede714da93af9ff830d4ea51bc578b80d
