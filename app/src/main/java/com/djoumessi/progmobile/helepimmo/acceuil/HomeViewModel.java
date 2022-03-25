package com.djoumessi.progmobile.helepimmo.acceuil;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.djoumessi.progmobile.helepimmo.common.Category;
import com.djoumessi.progmobile.helepimmo.common.remote.ApiUtil;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeViewModel extends ViewModel {
    private MutableLiveData<List<Category>> categories = new MutableLiveData<>();

    public LiveData<List<Category>> getCategories() {
        return categories;
    }

    public void setType(String type){
        loadCategories(type);
    }

    private void loadCategories(String type) {
        String sql_filter = "t.fk_parent="+type;
        Call<List<Category>> requestForCategories = ApiUtil.getCategoryService().getCategories("t.rowid", "ASC", "100", ""+sql_filter);
        Callback<List<Category>> onReturnedCategories = new Callback<List<Category>>() {
            @Override
            public void onResponse(Call<List<Category>> call, Response<List<Category>> response) {
                if (response.isSuccessful()){
                    categories.postValue(response.body());
                } else {
                    Log.e("J-Purple", "HomeViewModel::onResponse: not successful with error ={"+response.errorBody()+"}");
                }
            }

            @Override
            public void onFailure(Call<List<Category>> call, Throwable t) {
                Log.e("J-Purple", "HomeViewModel::onFailure: ", t);
            }
        };
        requestForCategories.enqueue(onReturnedCategories);
    }
}
