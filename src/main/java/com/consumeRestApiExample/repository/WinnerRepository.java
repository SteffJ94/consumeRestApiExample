package com.consumeRestApiExample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.consumeRestApiExample.model.Winner;

@Repository
public interface WinnerRepository extends CrudRepository<Winner, Long> {

}
