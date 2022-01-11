package com.consumeRestApiExample.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Generated("jsonschema2pojo")
public class Circuit {

    @JsonProperty("CircuitName")
    private String circuitName;
    
    @JsonProperty("circuitId")
    private String circuitId;
    
    @JsonProperty("url")
    private String url;
    
    @JsonProperty("Location")
    private Location location;


    public String getCircuitName() {
        return circuitName;
    }


    public void setCircuitName(String circuitName) {
        this.circuitName = circuitName;
    }


    public String getCircuitId() {
        return circuitId;
    }


    public void setCircuitId(String circuitId) {
        this.circuitId = circuitId;
    }


    public String getUrl() {
        return url;
    }

 
    public void setUrl(String url) {
        this.url = url;
    }


    public Location getLocation() {
        return location;
    }


    public void setLocation(Location location) {
        this.location = location;
    }

}
