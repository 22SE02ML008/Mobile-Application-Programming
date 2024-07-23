// LoginActivity.java
package com.example.assignment3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Assignment2Activity extends AppCompatActivity {

    private EditText editTextUsername, editTextPassword;
    private Button buttonSignIn;
    private TextView tvAlreadyLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment2);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonSignIn = findViewById(R.id.buttonSignIn);
        tvAlreadyLogin = findViewById(R.id.tvAlreadyLogin);

        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });

        tvAlreadyLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to registration activity
                Intent intent = new Intent(Assignment2Activity.this, Assignment3Activity.class);
                startActivity(intent);
            }
        });
    }

    private void signIn() {
        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();

        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please enter both username and password", Toast.LENGTH_SHORT).show();
        } else {
            // Here you can add code to check the credentials from a database or an API
            if (username.equals("admin") && password.equals("admin")) {
                Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
                // Proceed to the next activity or main page
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
