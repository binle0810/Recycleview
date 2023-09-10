package com.example.buoi6_recyclerv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rclview);
        List<item> items= new ArrayList<item>();
        items.add(new item("Tiêu đề","Tóm tắt", R.drawable.a));
        items.add(new item("Tiêu đề","Tóm tắt", R.drawable.a));
        items.add(new item("Tiêu đề","Tóm tắt", R.drawable.a));
        items.add(new item("Tiêu đề","Tóm tắt", R.drawable.a));
        items.add(new item("Tiêu đề","Tóm tắt", R.drawable.a));
        items.add(new item("Tiêu đề","Tóm tắt", R.drawable.a));
        items.add(new item("Tiêu đề","Tóm tắt", R.drawable.a));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}