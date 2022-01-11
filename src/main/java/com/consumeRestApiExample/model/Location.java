package com.consumeRestApiExample.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Generated("jsonschema2pojo")
public class Location {

    @JsonProperty("Locality")
    private String locality;
    
    @JsonProperty("Country")
    private String country;
    
    @JsonProperty("lat")
    private double lat;
    
    @JsonProperty("long")
    private double longg;


    public String getLocality() {
        return locality;
    }
    public void setLocality(String locality) {
        this.locality = locality;
    }
    
    public String getCountry() {
        return country;
    } 
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public double getLat() {
        return lat;
    }
    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLong() {
        return longg;
    }
    
    public void setLong(double longg) {
        this.longg = longg;
    }
    
    

}

