<<<<<<< HEAD
<<<<<<< HEAD
package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="MainActivity";

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"CALL onResume");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"CALL onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"CALL onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"CALL onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"CALL onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"CALL onDestroy");

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"CALL onCreate");
        setContentView(R.layout.main_layout);



        Button normalBtn = findViewById(R.id.start_normal_activity);
        normalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent1);
            }
        });
        Button dialogBtn = findViewById(R.id.start_dialog_activity);
        dialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent2);


            }
        });



    }
}
=======
=======
>>>>>>> f173405ede714da93af9ff830d4ea51bc578b80d
package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="MainActivity";

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"CALL onResume");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"CALL onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"CALL onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"CALL onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"CALL onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"CALL onDestroy");

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"CALL onCreate");
        setContentView(R.layout.main_layout);



        Button normalBtn = findViewById(R.id.start_normal_activity);
        normalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, NormalActivity.class);
                startActivity(intent1);
            }
        });
        Button dialogBtn = findViewById(R.id.start_dialog_activity);
        dialogBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this, DialogActivity.class);
                startActivity(intent2);


            }
        });



    }
}
<<<<<<< HEAD
>>>>>>> f173405ede714da93af9ff830d4ea51bc578b80d
=======
>>>>>>> f173405ede714da93af9ff830d4ea51bc578b80d
