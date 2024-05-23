package com.example.colaborapp;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button_is);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this,huelladactilar_pantalla2.class);
            startActivity(intent);
        });
    }
}