package com.consumeRestApiExample.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Generated("jsonschema2pojo")
public class Race {

    @JsonProperty("round")
    private int round;
    
    
    @JsonProperty("season")
    private int season;
    
    @JsonProperty("Circuit")
    private Circuit circuit;
    
    @JsonProperty("Time")
    private String time;
    
    @JsonProperty("ResultsList")
    private ResultsList resultsList;
    
    @JsonProperty("RaceName")
    private String raceName;
    
    @JsonProperty("url")
    private String url;
    
    @JsonProperty("Date")
    private String date;


    public int getRound() {
        return round;
    }


    public void setRound(int round) {
        this.round = round;
    }


    public int getSeason() {
        return season;
    }


    public void setSeason(int season) {
        this.season = season;
    }


    public Circuit getCircuit() {
        return circuit;
    }


    public void setCircuit(Circuit circuit) {
        this.circuit = circuit;
    }


    public String getTime() {
        return time;
    }


    public void setTime(String time) {
        this.time = time;
    }


    public ResultsList getResultsList() {
        return resultsList;
    }


    public void setResultsList(ResultsList resultsList) {
        this.resultsList = resultsList;
    }


    public String getRaceName() {
        return raceName;
    }


    public void setRaceName(String raceName) {
        this.raceName = raceName;
    }


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


}

