package com.example.rynel.googleplaces.data;

import com.example.rynel.googleplaces.model.Result;
import com.example.rynel.googleplaces.util.Constants;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by rynel on 11/2/2017.
 */

public interface RemoteService {

    //maps/api/place/nearbysearch/output?parameters
    //Key, Location, and Radius required      Key =  + Constants.VALUES.API_KEY);

    @GET("maps/api/place/nearbysearch/"  + Constants.VALUES.API_KEY)
    Observable<Result> getResults(@Query("location") String query,
                                 @Query("radius") int radius,
                                 @Query("key") int key_API);

}