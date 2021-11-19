package com.example.trafficlights;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity{
    public LinearLayoutCompat layout;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layout = findViewById(R.id.layout);
    }
    public void redColor(View view){
        layout.setBackgroundColor(Color.RED);
    }
    public void yellowColor(View view){
        layout.setBackgroundColor(Color.YELLOW);
    }
    public void greenColor(View view){
        layout.setBackgroundColor(Color.GREEN);
    }
}