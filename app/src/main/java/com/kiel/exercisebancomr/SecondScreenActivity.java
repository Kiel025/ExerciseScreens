package com.kiel.exercisebancomr;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kiel.exercisebancomr.databinding.ActivitySecondScreenBinding;

public class SecondScreenActivity extends AppCompatActivity {

    private ActivitySecondScreenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.btBackScreen1.setOnClickListener(v -> {
            finish();
        });
        binding.toolbarSecondScreen.setNavigationOnClickListener(v -> {
            finish();
        });

    }
}