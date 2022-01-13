package com.consumeRestApiExample.model.dto;

import java.util.List;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;


@Generated("jsonschema2pojo")
public class RaceTable {

    @JsonProperty("season")
    private String season;
    @JsonProperty("position")
    private String position;
    @JsonProperty("Races")
    private List<Race> races = null;
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		this.season = season;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public List<Race> getRaces() {
		return races;
	}
	public void setRaces(List<Race> races) {
		this.races = races;
	}
  
    

}
