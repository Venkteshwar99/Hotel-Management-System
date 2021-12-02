package com.Manager.Repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.Manager.Models.Inventory;




@Repository
public interface InventoryRepo extends MongoRepository<Inventory, Long>{

}