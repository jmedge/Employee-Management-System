package com.collabera.jump.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabera.jump.exceptions.EmployeeNotFoundException;
import com.collabera.jump.model.Employee;
import com.collabera.jump.repository.EmployeeRepository;

@Service
public class EmployeeHelper {
	
	@Autowired
	private EmployeeRepository repository;

	public List<Employee> getEmployeeById(int id){
		
		if (repository.findById(id) != null) {
			
			return repository.findById(id);
		}
		else {
			throw new EmployeeNotFoundException("Employee Not Found!");
			
		}
	}
	
	public Iterable<Employee> getEmployee() {
		return repository.findAll();
	}

	public boolean createEmployee(Employee employee) {

		Employee savedEmployee = repository.save(employee);
		if (savedEmployee != null) {
			return true;
		
		} else {
			
			throw new EmployeeNotFoundException("Employee Not Created!");
			
		}

	}

	public boolean updateEmployee( int id, Employee employee) {

		if (repository.existsById(id) && employee.getEmp_id() == id) {
			return createEmployee(employee);
			
		} else {
			
			 throw new EmployeeNotFoundException("Employee Not Found!");
		}

	}

	public boolean deleteEmployee(int id) {

		if (repository.existsById(id)) {
			repository.deleteById(id);
			return true;
		
		} else {
			
			throw new EmployeeNotFoundException("Employee Not Found!");
		}

	}
	
}

