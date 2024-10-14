package com.example.prac_03;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CountryAdapter countryAdapter;
    private List<Country> countryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Liên kết MainActivity với file activity_main.xml

        recyclerView = findViewById(R.id.recyclerView);  // Tham chiếu RecyclerView trong XML
        recyclerView.setLayoutManager(new LinearLayoutManager(this));  // Cài đặt LayoutManager

        // Tạo danh sách quốc gia và cài đặt adapter
        countryList = CountryData.getTopCountries();
        countryAdapter = new CountryAdapter(this, countryList);
        recyclerView.setAdapter(countryAdapter);
    }
}
