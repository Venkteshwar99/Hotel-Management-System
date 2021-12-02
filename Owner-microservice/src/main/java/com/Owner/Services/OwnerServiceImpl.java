package com.Owner.Services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Owner.Models.Department;
import com.Owner.Repo.OwnerRepo;


@Service
public class OwnerServiceImpl implements OwnerService {

	@Autowired
	private OwnerRepo repo;
	
	@Override
	public Department addDepartment(Department dept) {
		return repo.insert(dept);
	}

	@Override
	public String deleteDepartment(long id) {
		repo.deleteById(id);
		return "Department Deleted";
	}

	@Override
	public Department updateDepartment(Department dept) {
		return repo.save(dept);
	}

	@Override
	public Optional<Department> getDepartment(long id) {
		return repo.findById(id);
	}

	@Override
	public List<Department> getAllDepartments() {
		return repo.findAll();
	}

}
