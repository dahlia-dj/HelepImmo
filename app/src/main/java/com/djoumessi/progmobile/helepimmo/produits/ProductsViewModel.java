package com.djoumessi.progmobile.helepimmo.produits;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.djoumessi.progmobile.helepimmo.common.Product;
import com.djoumessi.progmobile.helepimmo.common.remote.ApiUtil;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductsViewModel extends ViewModel {
    private final String  category_id;
    private MutableLiveData<List<Product>> products = new MutableLiveData<>();

    public ProductsViewModel( String category_id) {
        this.category_id = category_id;
    }

    public LiveData<List<Product>> getProducts() {
        loadProducts();
        return products;
    }

    private void loadProducts() {
        Call<List<Product>> requestForProducts = ApiUtil.getCategoryService().getProducts(""+category_id, "product");
        Callback<List<Product>> onRequestComplete = new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                if (response.isSuccessful()){
                    products.postValue(response.body());
                } else {
                    Log.e("J-Purple", "ProductsViewModel::onResponse: is not successful with error ={"+response.errorBody()+"}");
                }
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                Log.e("J-Purple", "ProductsViewModel::onFailure: ",t );
            }
        };
        requestForProducts.enqueue(onRequestComplete);
    }

}
