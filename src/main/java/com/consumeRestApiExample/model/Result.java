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
public class Result {

    @JsonProperty("Status")
    private Status status;
    
    @JsonProperty("number")
    private int number;
    
    @JsonProperty("positionText")
    private int positionText;
    
    @JsonProperty("FastestLap")
    private FastestLap fastestLap;
    
    @JsonProperty("Constructor")
    private Constructor constructor;
    
    @JsonProperty("Grid")
    private int grid;
    
    @JsonProperty("Driver")
    private Driver driver;
    
    @JsonProperty("Time")
    private Time time;
    
    @JsonProperty("position")
    private int position;
    
    @JsonProperty("Laps")
    private int laps;
    
    @JsonProperty("points")
    private int points;


    public Status getStatus() {
        return status;
    }


    public void setStatus(Status status) {
        this.status = status;
    }


    public int getNumber() {
        return number;
    }


    public void setNumber(int number) {
        this.number = number;
    }


    public int getPositionText() {
        return positionText;
    }


    public void setPositionText(int positionText) {
        this.positionText = positionText;
    }


    public FastestLap getFastestLap() {
        return fastestLap;
    }


    public void setFastestLap(FastestLap fastestLap) {
        this.fastestLap = fastestLap;
    }


    public Constructor getConstructor() {
        return constructor;
    }


    public void setConstructor(Constructor constructor) {
        this.constructor = constructor;
    }


    public int getGrid() {
        return grid;
    }


    public void setGrid(int grid) {
        this.grid = grid;
    }


    public Driver getDriver() {
        return driver;
    }


    public void setDriver(Driver driver) {
        this.driver = driver;
    }


    public Time getTime() {
        return time;
    }


    public void setTime(Time time) {
        this.time = time;
    }


    public int getPosition() {
        return position;
    }


    public void setPosition(int position) {
        this.position = position;
    }


    public int getLaps() {
        return laps;
    }


    public void setLaps(int laps) {
        this.laps = laps;
    }


    public int getPoints() {
        return points;
    }


    public void setPoints(int points) {
        this.points = points;
    }

}

