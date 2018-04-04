package dev_pc.testunsplashapi.api;

import java.util.List;

import dev_pc.testunsplashapi.responseModel.AccessToken;
import dev_pc.testunsplashapi.responseModel.UnsplashModel;
import dev_pc.testunsplashapi.responseModel.User;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;



public interface UserAuthorizationApi {




    @POST("oauth/token")
    @FormUrlEncoded
    Call<AccessToken> getAccesToken(
            @Field("client_id") String clientId,
            @Field("client_secret") String clientSecret,
            @Field("redirect_uri") String redirectUri,
            @Field("code") String code,
            @Field("grant_type") String grantType
    );

    @GET("photos/")
    Call<List<UnsplashModel>> getPhotos(@Query("client_id") String client_id);





    @GET("me")
    Call<User> getUserProfile(
//            @Header("authorization:" + "bearer") String token
    );
}