package com.Owner.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


import com.Owner.Models.Staff;


@RestController
@RequestMapping("/owner/manager")
public class OwnerStaffController {
	@Autowired
	private RestTemplate restTemplate;
	

	@PostMapping("/addEmp")
	public Staff addEmp(@RequestBody Staff Emp) 
	{
		return restTemplate.postForObject("http://localhost:8082/manager/addEmp", Emp, Staff.class);
	}

	@PutMapping("/updateEmp")
	public Staff updateEmp(@RequestBody Staff emp) 
	{
		restTemplate.put("http://localhost:8082/manager/updateEmp/",emp);
		return emp;
		
	}
	
	@DeleteMapping("deleteEmp/{id}")
	public String deleteEmp(@PathVariable("id") String id)
	{
		restTemplate.delete("http://localhost:8082/manager/deleteEmp/"+id);
		return "Deleted Employee "+id;
	}

	@GetMapping("/getEmp/{id}")
	public Staff getEmp(@PathVariable("id") String id)
	{
		return restTemplate.getForObject("http://localhost:8082/manager/getEmp/"+id,Staff.class);
	}
}

	