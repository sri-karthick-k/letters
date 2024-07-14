package com.example.demo.repo;

import com.example.demo.Region;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RegionRepository extends MongoRepository<Region, String> {
}