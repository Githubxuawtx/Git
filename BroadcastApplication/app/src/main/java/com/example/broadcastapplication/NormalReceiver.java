<<<<<<< HEAD
package com.example.broadcastapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class NormalReceiver extends BroadcastReceiver {
    private static final String TAG = "NormalReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Mytest","test3");
        String msg = intent.getStringExtra("Msg");
        Log.d(TAG, msg);
    }
}
=======
package com.example.broadcastapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class NormalReceiver extends BroadcastReceiver {
    private static final String TAG = "NormalReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Mytest","test3");
        String msg = intent.getStringExtra("Msg");
        Log.d(TAG, msg);
    }
}
>>>>>>> f173405ede714da93af9ff830d4ea51bc578b80d
