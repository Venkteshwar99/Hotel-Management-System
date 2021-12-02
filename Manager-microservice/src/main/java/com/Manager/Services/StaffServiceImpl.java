package com.Manager.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Manager.Models.Room;
import com.Manager.Models.Staff;
import com.Manager.Repo.StaffRepo;





@Service
public class StaffServiceImpl implements StaffService {
	@Autowired
	private StaffRepo repo;

	@Override
	public Staff addEmp(Staff emp) {
		return repo.insert(emp);
	}

	@Override
	public Staff updateEmp(Staff emp) {
		return repo.save(emp);
	}

	@Override
	public String deleteEmp(long id) {
		repo.deleteById(id);
		return "Deleted employee with ID :"+id;
	}

	@Override
	public Optional<Staff> getEmp(long id) {
		return repo.findById(id);
	}
	@Override
	public List<Staff> getAllEmployees() {
		return repo.findAll();
	}
	
}
