package com.example.demo.repo;


import com.example.demo.Rule;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RuleRepository extends MongoRepository<Rule, String> {
}

