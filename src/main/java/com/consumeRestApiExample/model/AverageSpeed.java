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
public class AverageSpeed {

    @JsonProperty("units")
    private String units;
    
    @JsonProperty("content")
    private double content;


    public String getUnits() {
        return units;
    }


    public void setUnits(String units) {
        this.units = units;
    }


    public double getContent() {
        return content;
    }

    public void setContent(double content) {
        this.content = content;
    }
    
    

}

