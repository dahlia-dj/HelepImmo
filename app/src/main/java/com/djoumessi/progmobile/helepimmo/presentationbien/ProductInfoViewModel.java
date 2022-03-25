package com.djoumessi.progmobile.helepimmo.presentationbien;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.djoumessi.progmobile.helepimmo.common.Product;

public class ProductInfoViewModel extends ViewModel {
    private MutableLiveData<Product> product = new MutableLiveData<>();

    public LiveData<Product> getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product.setValue(product);
    }
}
