package com.example.nim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.nim.databinding.ActivityDashboardBinding;
import com.example.nim.databinding.ActivitySearchVehicleBinding;

public class SearchVehicle extends AppCompatActivity {
    private ActivitySearchVehicleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchVehicleBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }
}