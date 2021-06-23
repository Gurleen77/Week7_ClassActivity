package com.example.week7_classactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.fruits_content);
        tv= findViewById(R.id.fruitText);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Life Cycle", "Main Activity is Paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Life Cycle", "Main Activity is Resumed");
    }


    public void choose (View view){
        tv.setText(sp.getSelectedItem().toString());
    }

    public void order (View view) {
        Log.d("Test","Button is pressed");
        Intent intent = new Intent(this, Activity2.class);
        intent.putExtra("fruit", sp.getSelectedItem().toString());
        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Life cycle", "Main activity started!!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Life Cycle", "Main Activity stopped!!");
    }


}