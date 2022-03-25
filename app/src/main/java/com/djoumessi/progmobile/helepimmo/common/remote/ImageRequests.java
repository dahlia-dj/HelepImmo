package com.djoumessi.progmobile.helepimmo.common.remote;

import com.djoumessi.progmobile.helepimmo.common.ApiImage;
import com.djoumessi.progmobile.helepimmo.common.ApiImageUpload;
import com.djoumessi.progmobile.helepimmo.common.Category;
import com.djoumessi.progmobile.helepimmo.common.EcmFilesInfo;
import com.djoumessi.progmobile.helepimmo.common.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ImageRequests {
    @Headers({
            "Accept: application/json",
            "DOLAPIKEY: BZrYbf453vn46SR3zAjJpx4V6P17cIiI"
    })
    @GET("documents")
    Call<EcmFilesInfo> getImages(
            @Query(value = "modulepart") String modulepart,
            @Query(value = "id") String id

    );

    @Headers({
            "Accept: application/json",
            "DOLAPIKEY: BZrYbf453vn46SR3zAjJpx4V6P17cIiI"
    })
    @GET("documents/download")
    Call<ApiImage> getImage(
            @Query(value = "modulepart") String modulepart,
            @Query(value = "original_file") String original_file
    );

    @Headers({
            "Accept: application/json",
            "DOLAPIKEY: BZrYbf453vn46SR3zAjJpx4V6P17cIiI"
    })
    @POST("documents/upload")
    Call<Object> uploadImage(
            @Body ApiImageUpload apiImageUpload
            );
}
