package com.djoumessi.progmobile.helepimmo.acceuil;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.widget.GridLayout;

import com.djoumessi.progmobile.helepimmo.R;
import com.djoumessi.progmobile.helepimmo.databinding.ActivityAcceuilBinding;
import com.google.android.material.button.MaterialButtonToggleGroup;

public class Acceuil extends AppCompatActivity {

    private HomeViewModel viewModel;
    private ActivityAcceuilBinding binding;
    private HomeAdapter homeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAcceuilBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewModel = new ViewModelProvider(this).get(HomeViewModel.class);

        binding.toggleButton.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() {
            @Override
            public void onButtonChecked(MaterialButtonToggleGroup group, int checkedId, boolean isChecked) {
                if (isChecked){
                    String selected = "2";
                    selected  = binding.getRoot().findViewById(checkedId).getTag().toString();
                    viewModel.setType(selected);
//                    Log.e("J-Purple", "onButtonChecked: "+binding.getRoot().findViewById(checkedId).getTag().toString() );
                }
            }
        });

        viewModel.getCategories().observe(this, categories -> {
            if (categories!=null){
                homeAdapter = new HomeAdapter(categories);
                binding.gridLayout.setLayoutManager(new GridLayoutManager(this, 3 ));
                binding.gridLayout.setAdapter(homeAdapter);
            }
        });
    }
}