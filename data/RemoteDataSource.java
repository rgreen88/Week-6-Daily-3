package com.example.rynel.googleplaces.data;

import com.example.rynel.googleplaces.model.Result;

import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by rynel on 11/2/2017.
 */

public class RemoteDataSource {

    public static final String BASE_URL = "https://maps.googleapis.com/";


    //Retrofit construct
    public static Retrofit create() {

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public static Observable<Result> getResults(String location, int radius, int key ) {
        Retrofit retrofit = create();
        RemoteService remoteService = retrofit.create( RemoteService.class );

        return remoteService.getResults( location, radius, key );
    }
}
