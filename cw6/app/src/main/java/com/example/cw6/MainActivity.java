package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movie m = new movie("death note", "nat wolff", "4.5", "16", "horror");
        movie m2 = new movie("it", "bill", "4.8", "16", "horror");

    }
}