package com.Manager.Repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.Manager.Models.Room;



@Repository
public interface RoomRepo extends MongoRepository<Room, Long>{

@Query	("{ isAvailable:true }")
	List<Room> findAvailable();

}