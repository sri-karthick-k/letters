package com.example.demo.repo;

import com.example.demo.Letter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LetterRepository extends MongoRepository<Letter, String> {
}