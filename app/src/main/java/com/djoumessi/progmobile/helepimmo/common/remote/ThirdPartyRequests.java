package com.djoumessi.progmobile.helepimmo.common.remote;

import com.djoumessi.progmobile.helepimmo.common.Category;
import com.djoumessi.progmobile.helepimmo.common.ThirdParty;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ThirdPartyRequests {

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
    @GET("thirdparties")
    Call<List<ThirdParty>> getThirdParties(
            @Query(value = "sortfield") String sortfield,
            @Query(value = "sortorder") String sortorder,
            @Query(value = "limit") String limit

    );

    @Headers({
            "Accept: application/json",
            "DOLAPIKEY: BZrYbf453vn46SR3zAjJpx4V6P17cIiI"
    })
    @GET("thirdparties/{id}")
    Call<ThirdParty> getThirdParty(
            @Path(value = "id") String id
    );
}
