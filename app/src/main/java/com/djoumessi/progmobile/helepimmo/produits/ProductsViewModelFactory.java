package com.djoumessi.progmobile.helepimmo.produits;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class ProductsViewModelFactory implements ViewModelProvider.Factory {
    private final String category_id;

    public ProductsViewModelFactory(String category_id) {
        this.category_id = category_id;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> aClass) {
        return (T) new ProductsViewModel( category_id);
    }
}
