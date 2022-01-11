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
public class Constructor {

    @JsonProperty("constructorId")
    private String constructorId;
    
    @JsonProperty("url")
    private String url;
    
    @JsonProperty("Nationality")
    private String nationality;
    
    @JsonProperty("Name")
    private String name;


    public String getConstructorId() {
        return constructorId;
    }


    public void setConstructorId(String constructorId) {
        this.constructorId = constructorId;
    }


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }


    public String getNationality() {
        return nationality;
    }


    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

}
