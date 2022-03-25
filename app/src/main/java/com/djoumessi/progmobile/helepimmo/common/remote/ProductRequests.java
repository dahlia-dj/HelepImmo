package com.djoumessi.progmobile.helepimmo.common.remote;

import com.djoumessi.progmobile.helepimmo.common.Category;
import com.djoumessi.progmobile.helepimmo.common.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ProductRequests {

    @Headers({
            "Accept: application/json",
            "DOLAPIKEY: BZrYbf453vn46SR3zAjJpx4V6P17cIiI"
    })
    @GET("agendaevents/checketable/{id}")
    Call<Object> ping(
            @Path("id") int id
    );

    @Headers({
            "Accept: application/json",
            "DOLAPIKEY: BZrYbf453vn46SR3zAjJpx4V6P17cIiI"
    })
    @GET("products")
    Call<List<Product>> getProducts(
            @Query(value = "sortfield") String sortfield,
            @Query(value = "sortorder") String sortorder,
            @Query(value = "limit") String limit
    );

    @Headers({
            "Accept: application/json",
            "DOLAPIKEY: BZrYbf453vn46SR3zAjJpx4V6P17cIiI"
    })
    @GET("products")
    Call<List<Product>> getProducts(
            @Query(value = "sortfield") String sortfield,
            @Query(value = "sortorder") String sortorder,
            @Query(value = "limit") String limit,
            @Query(value = "sqlfilters") String sqlfilters,
            @Query(value = "ids_only") String ids_only

    );

    @Headers({
            "Accept: application/json",
            "DOLAPIKEY: BZrYbf453vn46SR3zAjJpx4V6P17cIiI"
    })
    @GET("products/{id}")
    Call<Product> getProduct(
            @Path(value = "id") String id
    );

    @Headers({
            "Accept: application/json",
            "DOLAPIKEY: BZrYbf453vn46SR3zAjJpx4V6P17cIiI"
    })
    @GET("products/{id}/categories")
    Call<List<Category>> getCategories(
            @Path(value = "id") String id,
            @Query(value = "sortfield") String sortfield,
            @Query(value = "sortorder") String sortorder
    );
}
