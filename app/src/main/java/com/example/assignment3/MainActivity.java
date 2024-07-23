package com.example.assignment3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupButtonClick(R.id.button1, Assignment1Activity.class);
        setupButtonClick(R.id.button2, Assignment2Activity.class);
        setupButtonClick(R.id.button3, Assignment3Activity.class);
        setupButtonClick(R.id.button4, Assignment4Activity.class);
        setupButtonClick(R.id.button5, Assignment5Activity.class);
        setupButtonClick(R.id.button6, Assignment6Activity.class);
        setupButtonClick(R.id.button7, Assignment7Activity.class);
        setupButtonClick(R.id.button8, Assignment8Activity.class);
        setupButtonClick(R.id.button9, Assignment9Activity.class);
        setupButtonClick(R.id.button10, Assignment10Activity.class);
    }

    private void setupButtonClick(int buttonId, Class<?> activityClass) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, activityClass);
            startActivity(intent);
        });
    }
}
