
package com.example.rynel.googleplaces.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Geometry implements Serializable
{

    @SerializedName("location")
    @Expose
    private Location location;
    private final static long serialVersionUID = 8949779739156063202L;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

}
