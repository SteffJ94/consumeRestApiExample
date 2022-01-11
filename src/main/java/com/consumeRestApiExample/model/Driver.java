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
public class Driver {
	
    @JsonProperty("DateOfBirth")
    private String dateOfBirth;
    
    @JsonProperty("PermanentNumber")
    private int permanentNumber;
    
    @JsonProperty("code")
    private String code;
    
    @JsonProperty("driverId")
    private String driverId;
    
    @JsonProperty("FamilyName")
    private String familyName;
    
    @JsonProperty("GivenName")
    private String givenName;
    
    @JsonProperty("url")
    private String url;
    
    @JsonProperty("Nationality")
    private String nationality;


    public String getDateOfBirth() {
        return dateOfBirth;
    }


    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

  
    public int getPermanentNumber() {
        return permanentNumber;
    }


    public void setPermanentNumber(int permanentNumber) {
        this.permanentNumber = permanentNumber;
    }


    public String getCode() {
        return code;
    }


    public void setCode(String code) {
        this.code = code;
    }


    public String getDriverId() {
        return driverId;
    }


    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }


    public String getFamilyName() {
        return familyName;
    }


    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }


    public String getGivenName() {
        return givenName;
    }


    public void setGivenName(String givenName) {
        this.givenName = givenName;
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

    
}

