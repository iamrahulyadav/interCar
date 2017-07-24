package com.apreciasoft.admin.asremis.Services;
import com.apreciasoft.admin.asremis.Entity.InfoTravelEntity;
import com.apreciasoft.admin.asremis.Entity.RemisSocketInfo;
import com.apreciasoft.admin.asremis.Entity.TraveInfoSendEntity;
import com.apreciasoft.admin.asremis.Entity.TravelEntity;
import com.apreciasoft.admin.asremis.Entity.resp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by Admin on 05/01/2017.
 */

public interface ServicesTravel {

    @Headers("Content-Type: application/json")
    @POST("travel/add")
    Call<resp> addTravel(@Body TravelEntity user);

    @Headers("Content-Type: application/json")
    @POST("travel/sendPosition")
    Call<RemisSocketInfo> sendPosition(@Body TraveInfoSendEntity travel);

    @Headers("Content-Type: application/json")
    @POST("travel/infoTravelByDriver")
    Call<List<InfoTravelEntity>> infoTravelByDriver(@Body TraveInfoSendEntity filter);

    @Headers("Content-Type: application/json")
    @GET("travel/isRoundTrip/{id}")
    Call<Boolean> isRoundTrip(@Path("id")  int id);

    @Headers("Content-Type: application/json")
    @POST("travel/finishMobil")
    Call<InfoTravelEntity> finishPost(@Body  TraveInfoSendEntity travel);

    @Headers("Content-Type: application/json")
    @GET("travel/accept/{id}")
    Call<InfoTravelEntity> accept(@Path("id") int id);

    @Headers("Content-Type: application/json")
    @GET("travel/refuse/{id}")
    Call<InfoTravelEntity> refuse(@Path("id") int id);

    @Headers("Content-Type: application/json")
    @GET("travel/init/{id}")
    Call<InfoTravelEntity> init(@Path("id") int id);


    @Headers("Content-Type: application/json")
    @GET("travel/rservations/{idDriver}")
    Call<List<InfoTravelEntity>> getReservations(@Path("idDriver") int id);

    @Headers("Content-Type: application/json")
    @GET("travel/readrservations/{id}/{idDriver}")
    Call<List<InfoTravelEntity>> readReservation(@Path("id") int id,@Path("idDriver") int idDriver);


    @Headers("Content-Type: application/json")
    @GET("travel/cacelReservation/{id}/{idDriver}")
    Call<List<InfoTravelEntity>> cacelReservation(@Path("id") int id,@Path("idDriver") int idDriver);

    @Headers("Content-Type: application/json")
    @GET("travel/cancelByClient/{id}")
    Call<Boolean> cancelByClient(@Path("id") int id);
}
