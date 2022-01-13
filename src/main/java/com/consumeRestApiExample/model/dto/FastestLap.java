package com.consumeRestApiExample.model.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;


@Generated("jsonschema2pojo")
public class FastestLap {

    @JsonProperty("rank")
    private String rank;
    @JsonProperty("lap")
    private String lap;
    @JsonProperty("Time")
    private Time1 time;
    @JsonProperty("AverageSpeed")
    private AverageSpeed averageSpeed;
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getLap() {
		return lap;
	}
	public void setLap(String lap) {
		this.lap = lap;
	}
	public Time1 getTime() {
		return time;
	}
	public void setTime(Time1 time) {
		this.time = time;
	}
	public AverageSpeed getAverageSpeed() {
		return averageSpeed;
	}
	public void setAverageSpeed(AverageSpeed averageSpeed) {
		this.averageSpeed = averageSpeed;
	}
    
    

}
