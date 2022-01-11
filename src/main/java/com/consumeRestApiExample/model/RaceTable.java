package com.consumeRestApiExample.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Generated("jsonschema2pojo")
public class RaceTable {

    @JsonProperty("Race")
    private List<Race> race = null;
    @JsonProperty("season")
    private int season;
    @JsonProperty("position")
    private int position;

    @JsonProperty("Race")
    public List<Race> getRace() {
        return race;
    }

    @JsonProperty("Race")
    public void setRace(List<Race> race) {
        this.race = race;
    }

    @JsonProperty("season")
    public int getSeason() {
        return season;
    }

    @JsonProperty("season")
    public void setSeason(int season) {
        this.season = season;
    }

    @JsonProperty("position")
    public int getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(int position) {
        this.position = position;
    }

}

