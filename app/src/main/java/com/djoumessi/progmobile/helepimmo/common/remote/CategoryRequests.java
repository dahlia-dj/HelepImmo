package com.djoumessi.progmobile.helepimmo.common.remote;

import com.djoumessi.progmobile.helepimmo.common.Category;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CategoryRequests {

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
    @GET("categories")
    Call<List<Category>> getCategories(
            @Query(value = "sortfield") String sortfield,
            @Query(value = "sortorder") String sortorder,
            @Query(value = "limit") String limit,
            @Query(value = "sqlfilters") String sqlFilter

    );

    @Headers({
            "Accept: application/json",
            "DOLAPIKEY: BZrYbf453vn46SR3zAjJpx4V6P17cIiI"
    })
    @GET("categories/{id}")
    Call<Category> getCategory(
            @Path(value = "id") String id
    );
}
