package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
    TextView name_text;
    TextView age_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        name_text = findViewById(R.id.textView_name);
        age_text = findViewById(R.id.textView_age);

        Intent i = getIntent();

        name_text.setText(i.getStringExtra("name"));
        age_text.setText(i.getStringExtra("age"));
    }
}