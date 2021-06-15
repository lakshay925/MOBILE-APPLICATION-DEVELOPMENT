package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText age;
    Button send_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.editTextTextPersonName3);
        age = findViewById(R.id.editTextage);
        send_button = findViewById(R.id.button);

        send_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_name = name.getText().toString();
                String user_age = age.getText().toString();
                Intent intent = new Intent(MainActivity.this,DisplayActivity.class);
                intent.putExtra("name",user_name);
                intent.putExtra("age",user_age);
                startActivity(intent);
            }
        });
    }
}