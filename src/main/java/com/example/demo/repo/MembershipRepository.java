package com.example.demo.repo;

import com.example.demo.Membership;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MembershipRepository extends MongoRepository<Membership, String> {
}

