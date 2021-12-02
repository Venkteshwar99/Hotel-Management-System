package com.Manager.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Manager.Models.Inventory;
import com.Manager.Repo.InventoryRepo;


@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryRepo repo;
	
	@Override
	public Inventory addInventory(Inventory inventory) {
		return repo.insert(inventory);
	}

	@Override
	public String deleteInventory(long id) {
		repo.deleteById(id);
		return "Inventory Deleted";
	}

	@Override
	public Inventory updateInventory(Inventory inventory) {
		return repo.save(inventory);
	}

	@Override
	public Optional<Inventory> getInventory(long id) {
		return repo.findById(id);
	}

	@Override
	public List<Inventory> getAllInventories() {
		return repo.findAll();
	}



}
