package com.example.androiduitesting; // change to your package name

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.androiduitesting.R;

public class ShowActivity extends AppCompatActivity {

    public static final String EXTRA_CITY_NAME = "city_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        String cityName = getIntent().getStringExtra(EXTRA_CITY_NAME);

        TextView tvCityName = findViewById(R.id.tvCityName);
        tvCityName.setText(cityName);

        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());
    }
}