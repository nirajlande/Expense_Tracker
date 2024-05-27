package com.niraj.demo.repository;

import com.niraj.demo.model.expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface expenseRepository extends MongoRepository<expense,String> {
    @Query("{'name': ?0}")
    Optional<expense> findByName(String name);
}
