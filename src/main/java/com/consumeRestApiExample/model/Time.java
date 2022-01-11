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
public class Time {

    @JsonProperty("millis")
    private int millis;
    
    @JsonProperty("content")
    private String content;


    public int getMillis() {
        return millis;
    }


    public void setMillis(int millis) {
        this.millis = millis;
    }


    public String getContent() {
        return content;
    }


    public void setContent(String content) {
        this.content = content;
    }

}

