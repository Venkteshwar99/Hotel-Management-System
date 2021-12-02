package com.Receptionist.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Receptionist.Models.Guest;

public interface GuestRepo extends MongoRepository<Guest, Integer> {

}
