package com.djoumessi.progmobile.helepimmo.produits;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.djoumessi.progmobile.helepimmo.common.Category;
import com.djoumessi.progmobile.helepimmo.databinding.ActivityProduitsBinding;

public class Produits extends AppCompatActivity {
    private ProductsViewModel viewModel;
    private ActivityProduitsBinding binding;
    private ProductsAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProduitsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Category category = (Category)getIntent().getSerializableExtra("category_id");
        viewModel = new ViewModelProvider(this ,new ProductsViewModelFactory(category.getId())).get(ProductsViewModel.class);

        binding.toolbarName.setText(category.getLabel());

        viewModel.getProducts().observe(this, products -> {
            if (products!=null){
                adapter = new ProductsAdapter(products);
                binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
                binding.recyclerView.setAdapter(adapter);
            }
        });
    }

    public void finish(View view) {
        finish();
    }
}
