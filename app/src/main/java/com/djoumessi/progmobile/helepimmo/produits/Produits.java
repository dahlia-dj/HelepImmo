package com.djoumessi.progmobile.helepimmo.produits;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class Produits extends AppCompatActivity {
    private ProductsViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(this ,new ProductsViewModelFactory(getIntent().getStringExtra("category_id"))).get(ProductsViewModel.class);


        viewModel.getProducts().observe(this, products -> {
            if (products!=null){

            }
        });
    }
}
