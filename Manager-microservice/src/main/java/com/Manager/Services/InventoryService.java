package com.Manager.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Manager.Models.Inventory;


@Service
public interface InventoryService {
	public Inventory addInventory(Inventory inventory);

	public String deleteInventory(long id);

	public Inventory updateInventory(Inventory inventory);

	public Optional<Inventory> getInventory(long id);

	public List<Inventory> getAllInventories();
}
