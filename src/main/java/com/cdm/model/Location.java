package com.cdm.model;

import org.springframework.stereotype.Repository;

@Repository
public class Location {
    private Integer locationId;

    private String locationAddress;

    private Float locationCost;

    private String locationDesc;

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress == null ? null : locationAddress.trim();
    }

    public Float getLocationCost() {
        return locationCost;
    }

    public void setLocationCost(Float locationCost) {
        this.locationCost = locationCost;
    }

    public String getLocationDesc() {
        return locationDesc;
    }

    public void setLocationDesc(String locationDesc) {
        this.locationDesc = locationDesc == null ? null : locationDesc.trim();
    }
}