package com.consumeRestApiExample.model.dto;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated("jsonschema2pojo")
public class Time {

    @JsonProperty("millis")
    private String millis;
    @JsonProperty("time")
    private String time;
    
    
	public String getMillis() {
		return millis;
	}
	public void setMillis(String millis) {
		this.millis = millis;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
    
    

}
