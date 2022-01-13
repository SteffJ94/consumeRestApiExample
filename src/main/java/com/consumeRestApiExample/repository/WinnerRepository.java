package com.consumeRestApiExample.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.consumeRestApiExample.model.domain.Winner;

@Repository
public interface WinnerRepository extends CrudRepository<Winner, Long> {

}
