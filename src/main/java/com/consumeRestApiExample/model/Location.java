package com.consumeRestApiExample.model;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;


@Generated("jsonschema2pojo")
public class Location {

    @JsonProperty("lat")
    private String lat;
    @JsonProperty("long")
    private String longg;
    @JsonProperty("locality")
    private String locality;
    @JsonProperty("country")
    private String country;
    
    
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
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
	public String getLongg() {
		return longg;
	}
	public void setLongg(String longg) {
		this.longg = longg;
	}
    
    

}
