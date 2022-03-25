package com.djoumessi.progmobile.helepimmo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.djoumessi.progmobile.helepimmo.common.Product;

public class InfoSurProduit extends AppCompatActivity {

    private Product product;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        product = (Product)getIntent().getSerializableExtra("product");
    }
}
