package com.consumeRestApiExample.model.dto;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated("jsonschema2pojo")
public class AverageSpeed {

    @JsonProperty("units")
    private String units;
    @JsonProperty("speed")
    private String speed;


    public String getUnits() {
        return units;
    }


    public void setUnits(String units) {
        this.units = units;
    }


    public String getSpeed() {
        return speed;
    }


    public void setSpeed(String speed) {
        this.speed = speed;
    }

}


