package com.consumeRestApiExample.model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Winners")
public class Winner {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "Season")
	private String season;
	
	@Column(name = "RaceName")
	private String raceName;
	
	@Column(name = "DriverName")
	private String driverName;
	
	@Column(name = "FastestLapTime")
	private String fastestLapTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String string) {
		this.season = string;
	}

	public String getRaceName() {
		return raceName;
	}

	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getFastestLapTime() {
		return fastestLapTime;
	}

	public void setFastestLapTime(String fastestLapTime) {
		this.fastestLapTime = fastestLapTime;
	}
	
	
	
	
	

}
