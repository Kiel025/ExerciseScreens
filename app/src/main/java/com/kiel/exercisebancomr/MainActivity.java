package com.kiel.exercisebancomr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.kiel.exercisebancomr.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.title.setText("Primeira Tela");

        binding.btNavScreen.setOnClickListener(v -> {
            startActivity(new Intent(this, SecondScreenActivity.class));
        });
    }
}