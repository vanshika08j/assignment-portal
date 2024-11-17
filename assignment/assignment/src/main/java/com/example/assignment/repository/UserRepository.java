package com.example.assignment.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.assignment.model.User;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);
}
