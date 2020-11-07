<<<<<<< HEAD
package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FristActivity extends AppCompatActivity {
    private final static String TAG = "FirstActivity";

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (requestCode == RESULT_OK) {
                String msg = data.getStringExtra("msg");
                Log.d(TAG, "msg" + msg);
            }
        }
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("","");
        setContentView(R.layout.first_layout);
        Button button=findViewById(R.id.Button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FristActivity.this,SecondActivity.class);
                startActivityForResult(intent,1);

    }
});
    }
=======
package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FristActivity extends AppCompatActivity {
    private final static String TAG = "FirstActivity";

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (requestCode == RESULT_OK) {
                String msg = data.getStringExtra("msg");
                Log.d(TAG, "msg" + msg);
            }
        }
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("","");
        setContentView(R.layout.first_layout);
        Button button=findViewById(R.id.Button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FristActivity.this,SecondActivity.class);
                startActivityForResult(intent,1);

    }
});
    }
>>>>>>> f173405ede714da93af9ff830d4ea51bc578b80d
}