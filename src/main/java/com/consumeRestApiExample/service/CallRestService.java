package com.consumeRestApiExample.service;


import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.consumeRestApiExample.model.Driver;
import com.consumeRestApiExample.model.Example;
import com.consumeRestApiExample.model.Race;
import com.consumeRestApiExample.model.Winner;
import com.consumeRestApiExample.repository.WinnerRepository;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class CallRestService {
	
	@Autowired
	private WinnerServiceImpl winnerServiceImpl;
	
	private static final String API_URL_STRING = "https://ergast.com/api/f1/2009/results/1";
	Example example = new Example();
	
	public Example httpCall() {
		HttpClient client = new DefaultHttpClient();
		HttpGet request = new HttpGet(API_URL_STRING);
		HttpResponse response;
		StringBuffer responseContent = new StringBuffer();
		String jsonString = "";
		JSONObject json;
		
		try {
			response = client.execute(request);
			
			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			
			String line = "";
			while ((line = rd.readLine()) != null) {
				responseContent.append(line);
			}
			
			json = XML.toJSONObject(responseContent.toString());   
	        jsonString = json.toString(4);
	        
	        ObjectMapper mapper = new ObjectMapper();
	        
	        example = mapper.readValue(jsonString, Example.class);
			
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			e.printStackTrace();
		} 
		
		return example;
		
	}
	
	
	public List<Race> getRaces() {
		List<Race> races = new ArrayList<Race>();
		
		races = this.example.getMRData().getRaceTable().getRace();
		
		return races;
	}


	public List<Winner> getWinners() {
		List<Winner> winners = new ArrayList<Winner>();
		List<Race> races = this.getRaces();
		
		for (Race race : races) {
			Winner winner = new Winner();
			winner.setSeason(race.getSeason());
			winner.setRaceName(race.getRaceName());
			winner.setDriverName(race.getResultsList().getResult().getDriver().getGivenName() + race.getResultsList().getResult().getDriver().getFamilyName());
			winner.setFastestLapTime(race.getResultsList().getResult().getFastestLap().getTime());
			winnerServiceImpl.save(winner);
			winners.add(winner);
		}
		
		return winners;
	}


	public List<Winner> getWinnersFromDb() {
		return winnerServiceImpl.findAll();
	}
	
}
