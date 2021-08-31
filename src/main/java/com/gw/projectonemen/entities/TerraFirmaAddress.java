package com.gw.projectonemen.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Embeddable
public class TerraFirmaAddress implements Serializable {

    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String addressTown;
    private String addressRegion;
    private String addressCountry;
    @Embedded
    private GeoLocation geoLocation;

}

@Data
@Embeddable
@NoArgsConstructor
class GeoLocation implements Serializable {

//    Attributes......
    private double latitude;
    private double longitude;

//    To String......


    @Override
    public String toString() {
        return "Latitude: " + latitude +
                "\nLongitude: " + longitude;
    }
}
