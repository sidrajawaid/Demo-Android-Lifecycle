package com.example.androidlifecycleexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button butn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        butn =(Button)findViewById(R.id.num);
        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Activity started", Toast.LENGTH_SHORT).show();
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
