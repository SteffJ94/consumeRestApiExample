package com.consumeRestApiExample.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.consumeRestApiExample.model.domain.Winner;
import com.consumeRestApiExample.model.dto.Driver;
import com.consumeRestApiExample.model.dto.Example;
import com.consumeRestApiExample.model.dto.Race;
import com.consumeRestApiExample.service.CallRestService;

@RestController
public class ApiController {
	
	@Autowired
	private CallRestService callRestService;
	
	@GetMapping("/winners")
	public Example getExample() throws IOException, InterruptedException {
		return callRestService.httpCallTo3dPartApi();
	}
	
	
	@GetMapping("/races")
	public List<Race> getRaces() {
		return callRestService.getRaces();
	}
	
	
	@GetMapping("/raceWinningDrivers")
	public List<Winner> getWinners(@RequestParam(value = "season") int season) {
		return callRestService.getWinners();
	}
	
	@GetMapping("/winnersFromDb")
	public List<Winner> getWinnersFromDb() {
		return callRestService.getWinnersFromDb();
	}

}
