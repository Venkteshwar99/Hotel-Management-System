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

import com.Manager.Models.Room;
import com.Manager.Models.Staff;
import com.Manager.Services.StaffService;



@RestController
@RequestMapping("/manager")
public class StaffController {
	@Autowired
	private StaffService service;
	
	@PostMapping("/addEmp")
	public Staff addEmployee(@RequestBody Staff emp)
	{
		return this.service.addEmp(emp);
	}
	
	@PutMapping("/updateEmp")
	public Staff updateEmployee(@RequestBody Staff emp)
	{
		return this.service.updateEmp(emp);
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public String deleteEmployee(@PathVariable("id") String id)
	{
		return this.service.deleteEmp(Long.parseLong(id));
	}
	
	@GetMapping("/getEmp/{id}")
	public Optional<Staff> getEmployee(@PathVariable("id") String id)
	{
		return this.service.getEmp(Long.parseLong(id));
	}


	@GetMapping("/ShowAllEmp")
	public List<Staff> getAllEmployees()
	{
		return this.service.getAllEmployees();
	}
}
