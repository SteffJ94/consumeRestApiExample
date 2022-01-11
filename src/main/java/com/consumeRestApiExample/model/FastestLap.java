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
public class FastestLap {
	
    @JsonProperty("AverageSpeed")
    private AverageSpeed averageSpeed;
    
    @JsonProperty("rank")
    private int rank;
    
    @JsonProperty("lap")
    private int lap;
    
    @JsonProperty("Time")
    private String time;


    public AverageSpeed getAverageSpeed() {
        return averageSpeed;
    }


    public void setAverageSpeed(AverageSpeed averageSpeed) {
        this.averageSpeed = averageSpeed;
    }


    public int getRank() {
        return rank;
    }


    public void setRank(int rank) {
        this.rank = rank;
    }


    public int getLap() {
        return lap;
    }


    public void setLap(int lap) {
        this.lap = lap;
    }


    public String getTime() {
        return time;
    }


    public void setTime(String time) {
        this.time = time;
    }
    
    

}

