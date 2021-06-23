package com.example.week7_classactivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        tv = findViewById(R.id.order_view);

        Intent intent = getIntent();


        tv.setText("You have ordered the fruit \n "+intent.getExtras().getString("fruit"));

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life cycle", "Activity2 has started");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Life cycle", "Activity2 has destroyed!!");
    }
}
