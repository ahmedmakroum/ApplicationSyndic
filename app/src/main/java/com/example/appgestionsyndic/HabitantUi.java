package com.example.appgestionsyndic;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class HabitantUi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_habitant_ui);

            // Find the ListView by its ID
            ListView listView = findViewById(R.id.listView);

            // Create an array of items
            String[] items = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};

            // Create an ArrayAdapter
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                    android.R.layout.simple_list_item_1, android.R.id.text1, items);

            // Set the adapter to the ListView
            listView.setAdapter(adapter);

    }
}