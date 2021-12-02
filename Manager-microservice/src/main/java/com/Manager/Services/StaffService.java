package com.Manager.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Manager.Models.Room;
import com.Manager.Models.Staff;


import java.util.Optional;

@Service
public interface StaffService {

	public Staff addEmp(Staff emp);

public	Staff updateEmp(Staff emp);

public	String deleteEmp(long id);

public	Optional<Staff> getEmp(long id);

  public List<Staff> getAllEmployees();

}
