package com.example.nim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.nim.HelperClasses.VehicleBuyDataModel;
import com.example.nim.databinding.ActivityBuyVehicleBinding;
import com.example.nim.databinding.ActivityDashboardBinding;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BuyVehicle extends AppCompatActivity {
    private ActivityBuyVehicleBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBuyVehicleBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("Vehicle");

        String ownerName = binding.etOwnerName.getText().toString().trim();
        String ownerMobile = binding.etOwnerMobile.getText().toString().trim();
        String ownerAddress = binding.etOwnerAddress.getText().toString().trim();
        String vehicleType = binding.etVehicleType.getText().toString().trim();
        String vehicleModelYear = binding.etVehicleYear.getText().toString().trim();
        String vehicleNumber = binding.etVehicleNumber.getText().toString().trim();
        String chassisNumber = binding.etChassisNumber.getText().toString().trim();
        String engineNumber = binding.etEngineNumber.getText().toString().trim();
        String totalAmount = binding.etTotalAmount.getText().toString().trim();
        String advanceAmount = binding.etAdvanceAmount.getText().toString().trim();
        String remainingAMount = binding.etRemainingAmount.getText().toString().trim();




        binding.tvCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Dashboard.class);    
                startActivity(intent);
                finish();
            }
        });
        
        
        binding.tvDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ownerName = binding.etOwnerName.getText().toString().trim();
                String ownerMobile = binding.etOwnerMobile.getText().toString().trim();
                String ownerAddress = binding.etOwnerAddress.getText().toString().trim();
                String vehicleType = binding.etVehicleType.getText().toString().trim();
                String vehicleModelYear = binding.etVehicleYear.getText().toString().trim();
                String vehicleNumber = binding.etVehicleNumber.getText().toString().trim();
                String chassisNumber = binding.etChassisNumber.getText().toString().trim();
                String engineNumber = binding.etEngineNumber.getText().toString().trim();
                String totalAmount = binding.etTotalAmount.getText().toString().trim();
                String advanceAmount = binding.etAdvanceAmount.getText().toString().trim();
                String remainingAMount = binding.etRemainingAmount.getText().toString().trim();

                VehicleBuyDataModel vehicleBuyDataModel = new VehicleBuyDataModel(
                        ownerName,ownerMobile,ownerAddress,vehicleType,vehicleModelYear,vehicleNumber,
                        chassisNumber,engineNumber,totalAmount,remainingAMount,advanceAmount);
                myRef.child(vehicleNumber).setValue(vehicleBuyDataModel);
                Intent intent = new Intent(getApplicationContext(),Dashboard.class);
                startActivity(intent);
                Toast.makeText(BuyVehicle.this, "Done", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}