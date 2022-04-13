package com.example.nim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.nim.databinding.ActivityBuyVehicleBinding;
import com.example.nim.databinding.ActivitySellVehicleBinding;

public class SellVehicle extends AppCompatActivity {
    private ActivitySellVehicleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySellVehicleBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);    }
}