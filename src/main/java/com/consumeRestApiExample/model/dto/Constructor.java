package com.consumeRestApiExample.model.dto;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated("jsonschema2pojo")
public class Constructor {

    @JsonProperty("constructorId")
    private String constructorId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("name")
    private String name;
    @JsonProperty("nationality")
    private String nationality;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
    
    

}
