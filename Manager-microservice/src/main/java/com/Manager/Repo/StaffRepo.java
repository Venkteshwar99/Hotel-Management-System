package com.Manager.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Manager.Models.Staff;



@Repository
public interface StaffRepo extends MongoRepository<Staff, Long>{
	

}