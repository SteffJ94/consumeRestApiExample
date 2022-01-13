package com.consumeRestApiExample.model.dto;

import javax.annotation.Generated;
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
public class ResultsList {

    @JsonProperty("Result")
    private Result result;


    public Result getResult() {
        return result;
    }
    public void setResult(Result result) {
        this.result = result;
    }

}

