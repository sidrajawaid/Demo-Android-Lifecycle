package com.example.androidlifecycleexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    @Override
    protected void onPause() {
        Toast.makeText(this, "Activity paused", Toast.LENGTH_SHORT).show();

        super.onPause();
    }

    @Override
    protected void onStop() {
        Toast.makeText(this, "Activity stopped", Toast.LENGTH_SHORT).show();

        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(this, "Activity destroyed", Toast.LENGTH_SHORT).show();

        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Toast.makeText(this, "Activity Restarted", Toast.LENGTH_SHORT).show();

        super.onRestart();
    }

}
