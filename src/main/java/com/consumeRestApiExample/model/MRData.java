package com.consumeRestApiExample.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Generated("jsonschema2pojo")
public class MRData {

    @JsonProperty("RaceTable")
    private RaceTable raceTable;
    @JsonProperty("xmlns")
    private String xmlns;
    @JsonProperty("total")
    private int total;
    @JsonProperty("offset")
    private int offset;
    @JsonProperty("series")
    private String series;
    @JsonProperty("limit")
    private int limit;
    @JsonProperty("url")
    private String url;


    public RaceTable getRaceTable() {
        return raceTable;
    }


    public void setRaceTable(RaceTable raceTable) {
        this.raceTable = raceTable;
    }


    public String getXmlns() {
        return xmlns;
    }


    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }


    public int getTotal() {
        return total;
    }


    public void setTotal(int total) {
        this.total = total;
    }


    public int getOffset() {
        return offset;
    }


    public void setOffset(int offset) {
        this.offset = offset;
    }


    public String getSeries() {
        return series;
    }


    public void setSeries(String series) {
        this.series = series;
    }


    public int getLimit() {
        return limit;
    }


    public void setLimit(int limit) {
        this.limit = limit;
    }


    public String getUrl() {
        return url;
    }


    public void setUrl(String url) {
        this.url = url;
    }

}

