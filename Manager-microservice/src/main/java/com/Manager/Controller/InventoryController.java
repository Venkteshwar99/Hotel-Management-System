package com.Manager.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Manager.Models.Inventory;
import com.Manager.Services.InventoryService;



@RestController
@RequestMapping("/manager")
public class InventoryController {
	@Autowired
	private InventoryService service;
	

	@GetMapping("/helloInv")
	public String helloMsgs() {
		return "hello manager from Inventory";
	}
	
	@PostMapping("/addInv")
	public Inventory addInventory(@RequestBody Inventory inventory)
	{
		return this.service.addInventory(inventory);
	}
	
	@PutMapping("/updateInv")
	public Inventory updateInventory(@RequestBody Inventory inventory)
	{
		return this.service.updateInventory(inventory);
	}
	
	@DeleteMapping("/deleteInv/{id}")
	public String deleteInventory(@PathVariable("id") String id)
	{
		return this.service.deleteInventory(Long.parseLong(id));
	}
	
	@GetMapping("/getinv/{id}")
	public Optional<Inventory> getInventory(@PathVariable("id") String id)
	{
		return this.service.getInventory(Long.parseLong(id));
	}


	@GetMapping("/ShowAllInv")
	public List<Inventory> getAllEmployees()
	{
		return this.service.getAllInventories();
	}
}
