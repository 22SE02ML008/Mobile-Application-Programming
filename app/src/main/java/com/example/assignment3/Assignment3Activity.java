// Assignment3Activity.java
package com.example.assignment3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Assignment3Activity extends AppCompatActivity {

    private EditText etName, etEmail, etPassword;
    private RadioGroup rgGender;
    private Spinner spCountry;
    private Button btnRegister;
    private TextView tvAlreadyRegistered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assignment3);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        rgGender = findViewById(R.id.rgGender);
        spCountry = findViewById(R.id.spCountry);
        btnRegister = findViewById(R.id.btnRegister);
        tvAlreadyRegistered = findViewById(R.id.tvAlreadyRegistered);

        // Populate the Spinner with a list of countries
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.countries_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spCountry.setAdapter(adapter);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerUser();
            }
        });

        tvAlreadyRegistered.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Redirect to login activity
                Intent intent = new Intent(Assignment3Activity.this, Assignment2Activity.class);
                startActivity(intent);
            }
        });
    }

    private void registerUser() {
        String name = etName.getText().toString();
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();
        int selectedGenderId = rgGender.getCheckedRadioButtonId();
        RadioButton selectedGender = findViewById(selectedGenderId);
        String gender = selectedGender == null ? "" : selectedGender.getText().toString();
        String country = spCountry.getSelectedItem().toString();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty() || gender.isEmpty() || country.isEmpty()) {
            Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show();
            // You can add code here to save the user data or perform any other necessary actions
        }
    }
}
