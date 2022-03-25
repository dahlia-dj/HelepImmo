package com.djoumessi.progmobile.helepimmo.common.remote;

public class ApiUtil {
    private ApiUtil(){

    };
    private static final String API_URL = "https://helepimmo.commeduc.com/api/index.php/explorer/";
    private static final String GOOGLE_URL = "https://google.com";
    public static final String DEFAULT_SORT_FIELD = "t.rowid";
    public static final String DEFAULT_SORT_FIELD_ALT = "t.id";
    public static final String DEFAULT_SORT_ORDER = "ASC";
    public static final String DEFAULT_LIMIT = "100";
    public static final String ALWAYS_TRUE_FILTER = "1=1";

    public static CategoryRequests getCategoryService(){
        return RetrofitClient.getClient(API_URL).create(CategoryRequests.class);
    }

    public static ProductRequests getProductService(){
        return RetrofitClient.getClient(API_URL).create(ProductRequests.class);
    }

    public static ThirdPartyRequests getThirdPartyService(){
        return RetrofitClient.getClient(API_URL).create(ThirdPartyRequests.class);
    }

    public static ImageRequests getImageService(){
        return RetrofitClient.getClient(API_URL).create(ImageRequests.class);
    }
}
