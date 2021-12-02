package com.Owner.Repo;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Owner.Models.Department;



@Repository
public interface OwnerRepo extends MongoRepository<Department, Long>{

}
