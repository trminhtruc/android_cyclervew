package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rclName;
    private NameListAdapter nameListAdapter;
    private ArrayList<String> nameArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rclName = findViewById(R.id.rcvName);

        nameArrayList = new ArrayList<>();
        for(int i = 1 ; i < 20; i++){
            nameArrayList.add("thuong chipenho"+i);
        }
//        nameArrayList.add("truc");
//        nameArrayList.add("truc");
//        nameArrayList.add("truc");
//        nameArrayList.add("truc");

        nameListAdapter = new NameListAdapter(this, nameArrayList);

        rclName.setAdapter(nameListAdapter);
        rclName.setLayoutManager(new LinearLayoutManager(this));
    }
}