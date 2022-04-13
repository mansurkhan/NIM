package com.example.nim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Toast;

import com.example.nim.databinding.ActivityDashboardBinding;

public class Dashboard extends AppCompatActivity {
   private ActivityDashboardBinding binding;
    static final int REQUEST_IMAGE_CAPTURE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDashboardBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //BUY Button
                Intent intent = new Intent(getApplicationContext(),BuyVehicle.class);
                startActivity(intent);
                finish();
            }
        });

        binding.btSell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),SellVehicle.class);
                startActivity(intent);
                finish();
            }
        });

        binding.btSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (1==1){
                    dispatchTakePictureIntent();
//                    Intent intent = new Intent(getApplicationContext(),SearchVehicle.class);
//                    startActivity(intent);
//                    finish();
                }else {
                    Toast.makeText(Dashboard.this, "No Vehicle", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        try {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        } catch (ActivityNotFoundException e) {
            // display error state to the user
        }
    }
}