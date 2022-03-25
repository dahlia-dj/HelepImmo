package com.djoumessi.progmobile.helepimmo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.djoumessi.progmobile.helepimmo.acceuil.Acceuil;
import com.djoumessi.progmobile.helepimmo.databinding.ActivityAcceuilBinding;
import com.djoumessi.progmobile.helepimmo.databinding.ActivityChooseProfileBinding;

public class ChooseProfileType extends AppCompatActivity {

    private ActivityChooseProfileBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChooseProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.appCompatButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChooseProfileType.this, Acceuil.class);
                finish();
                startActivity(intent);
            }
        });
    }
}