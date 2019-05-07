package com.collabera.jump.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.jump.model.Employee;

@Repository
public interface EmployeeRepository extends  JpaRepository <Employee, Integer> {
	
	List<Employee> findById(int id);
	


	      
}
