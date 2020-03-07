package com.deshantt.javabasiclistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
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
        list_color.setOnItemClickListener(this);
    }

    public void onItemClick(AdapterView<?> arg0, View arg1, int pos, long args3){
        Toast.makeText(this, "This toast shows the "+colors[pos]+ " value.", Toast.LENGTH_SHORT).show();
    }
}