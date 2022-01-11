package com.consumeRestApiExample.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consumeRestApiExample.model.Race;
import com.consumeRestApiExample.model.Winner;
import com.consumeRestApiExample.repository.WinnerRepository;

@Service
public class WinnerServiceImpl implements WinnerService {

	@Autowired
	private WinnerRepository winnerRepository;
	
	
	@Override
	@Transactional
	public Winner save(Winner winner) {
		return winnerRepository.save(winner);
	}
	
	public List<Winner> findAll() {
		List<Winner> winners = (List<Winner>) winnerRepository.findAll();
		return winners;
	}


}
