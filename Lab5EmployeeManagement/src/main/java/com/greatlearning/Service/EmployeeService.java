package com.greatlearning.Service;


import java.util.List;

import com.greatlearning.entity.Employee;

public interface EmployeeService {

		List<Employee> getAllEmployee();
	    void save(Employee employee);
	    Employee getById(int id);
	    void deleteViaId(int id);
	}

