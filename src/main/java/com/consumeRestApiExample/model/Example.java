package com.consumeRestApiExample.model;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;


@Generated("jsonschema2pojo")
public class Example {

    @JsonProperty("MRData")
    private MRData mRData;

	public MRData getmRData() {
		return mRData;
	}

	public void setmRData(MRData mRData) {
		this.mRData = mRData;
	}
    
    

}

