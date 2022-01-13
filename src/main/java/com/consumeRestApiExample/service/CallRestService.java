package com.consumeRestApiExample.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Service;

import com.consumeRestApiExample.model.domain.Winner;
import com.consumeRestApiExample.model.dto.Example;
import com.consumeRestApiExample.model.dto.Race;
import com.consumeRestApiExample.model.dto.Result;
import com.consumeRestApiExample.service.db.impl.WinnerServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class CallRestService {
	
	@Autowired
	private WinnerServiceImpl winnerServiceImpl;
	
	@Value("${app.http.url}")
	private String API_URL_STRING;
	
	Example example = new Example();
	
	public Example httpCallTo3dPartApi() {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.GET()
				.header("Accept", "application/json")
				.uri(URI.create(API_URL_STRING))
				.build();
		
		HttpResponse<String> response;
		try {
			response = client.send(request, HttpResponse.BodyHandlers.ofString());
			ObjectMapper mapper = new ObjectMapper();
			example = mapper.readValue(response.body(), Example.class);
		} catch (IOException e) {
			System.out.println("Failed! InputOutputException occured!");
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("Failed! InterruptedException occured!");
			e.printStackTrace();
		}
		
		return example;
		
	}
	
	public List<Race> getRaces() {
		List<Race> races = new ArrayList<Race>();
		
		races = this.example.getmRData().getRaceTable().getRaces();
		
		return races;
	}


	public List<Winner> getWinners() {
		List<Winner> winners = new ArrayList<Winner>();
		List<Race> races = this.getRaces();
		List<Result> results = new ArrayList<Result>();
		
		for (Race race : races) {
			Winner winner = new Winner();
			winner.setSeason(race.getSeason());
			winner.setRaceName(race.getRaceName());
			results = race.getResults();
			for (Result result: results) {
				winner.setDriverName(result.getDriver().getGivenName() + " " + result.getDriver().getFamilyName());
				winner.setFastestLapTime(result.getFastestLap().getTime().getTime());
			}
			
			winnerServiceImpl.save(winner);
			winners.add(winner);
		}
		
		return winners;
	}


	public List<Winner> getWinnersFromDb() {
		return winnerServiceImpl.findAll();
	}
	
}
