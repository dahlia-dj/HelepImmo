package com.djoumessi.progmobile.helepimmo.presentationbien;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.djoumessi.progmobile.helepimmo.common.Product;
import com.djoumessi.progmobile.helepimmo.databinding.ActivityPresentationBienBinding;

public class PresentationBien extends AppCompatActivity {
    private ActivityPresentationBienBinding binding;
    private ProductInfoViewModel viewModel;
    private Product product;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPresentationBienBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        viewModel = new ViewModelProvider(this).get(ProductInfoViewModel.class);
        product = (Product)getIntent().getSerializableExtra("product");
        viewModel.setProduct(product);

    }

    public void finish(View view) {
        finish();
    }
}
