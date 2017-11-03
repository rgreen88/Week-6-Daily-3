package com.example.rynel.googleplaces;


import android.net.wifi.WifiConfiguration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceSelectionListener;

import static android.content.ContentValues.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlaceAutocompleteFragment extends Fragment {


    private PlaceSelectionListener onPlaceSelectedListener;

    public PlaceAutocompleteFragment() {
        // Required empty public constructor
    }

    PlaceAutocompleteFragment autocompleteFragment = (PlaceAutocompleteFragment)
            getFragmentManager().findFragmentById(R.id.place_autocomplete_fragment);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_place_autocomplete, container, false);



        autocompleteFragment.setOnPlaceSelectedListener(new PlaceSelectionListener() {
            @Override
            public void onPlaceSelected(Place place) {
                // TODO: Get info about the selected place.
                Log.i(TAG, "Place: " + place.getName());
            }

            @Override
            public void onError(Status status) {

                Log.i(TAG, "An error occurred: " + status);

            }
        });
    }
    //Setter for setOnPlaceSelectedListener
//    public void setOnPlaceSelectedListener(PlaceSelectionListener onPlaceSelectedListener) {
//        this.onPlaceSelectedListener = onPlaceSelectedListener;
//    }



}
