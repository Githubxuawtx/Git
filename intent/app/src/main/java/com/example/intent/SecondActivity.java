<<<<<<< HEAD
<<<<<<< HEAD
package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button button=findViewById(R.id.Button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("msg","data from SecondActivity");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
=======
=======
>>>>>>> f173405ede714da93af9ff830d4ea51bc578b80d
package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Button button=findViewById(R.id.Button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.putExtra("msg","data from SecondActivity");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
<<<<<<< HEAD
>>>>>>> f173405ede714da93af9ff830d4ea51bc578b80d
=======
>>>>>>> f173405ede714da93af9ff830d4ea51bc578b80d
