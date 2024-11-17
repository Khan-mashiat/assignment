package com.example.assigment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.os.Bundle;
import android.widget.ExpandableListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ExpandableListView expandableListView;
    private CustomExpandableListAdapter adapter;
    private List<String> listGroupTitles;
    private HashMap<String, List<String>> listChildData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        expandableListView = findViewById(R.id.expandableListView);

        // Preparing data
        listGroupTitles = new ArrayList<>();
        listChildData = new HashMap<>();

        // Add group titles
        listGroupTitles.add("Fruits");
        listGroupTitles.add("Vegetables");

        // Add child items
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        List<String> vegetables = new ArrayList<>();
        vegetables.add("Carrot");
        vegetables.add("Broccoli");
        vegetables.add("Spinach");

        listChildData.put(listGroupTitles.get(0), fruits);
        listChildData.put(listGroupTitles.get(1), vegetables);

        // Setting adapter
        adapter = new CustomExpandableListAdapter(this, listGroupTitles, listChildData);
        expandableListView.setAdapter(adapter);
    }
}


