
package com.example.rynel.googleplaces.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AltId implements Serializable
{

    @SerializedName("place_id")
    @Expose
    private String placeId;
    @SerializedName("scope")
    @Expose
    private String scope;
    private final static long serialVersionUID = -9033895030105656120L;

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

}
