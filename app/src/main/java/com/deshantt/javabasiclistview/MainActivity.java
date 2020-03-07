package com.deshantt.javabasiclistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView list_color;
    private String[] colors =   {"red", "blue", "yellow", "green", "purple",
                                "red", "blue", "yellow", "green", "purple",
                                "red", "blue", "yellow", "green", "purple",
                                "red", "blue", "yellow", "green", "purple"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_color = findViewById(R.id.lv_color);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, colors);
        list_color.setAdapter(myAdapter);
    }
}