package com.collabera.jump.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.jump.exceptions.EmployeeErrorResponse;
import com.collabera.jump.model.Employee;
import com.collabera.jump.service.EmployeeHelper;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@Api(value="Employee Management System", 
description ="Operations pertaining to employees in Employee Management System")
@RequestMapping("/employees")

public class EmployeeController {
	
	@Autowired
	private EmployeeHelper helper;
	
	//Gets the employee by ID
	@CrossOrigin(origins = "*")
	@ApiOperation(value = "Search a Employee with an ID", response = Employee.class)
	@ApiResponses({@ApiResponse(code = 400, message= "Employee not found", response=EmployeeErrorResponse.class)})
	
	@GetMapping(path = "/{emp_id}", produces = {MediaType.APPLICATION_JSON_VALUE})
	public List<Employee> getEmployeeById(@PathVariable(name = "emp_id") int id) {
		
		return helper.getEmployeeById(id);
		
	}
		
	//Gets all employees
		@ApiOperation(value = "Search all Employees", response = Employee.class)
		@ApiResponses({@ApiResponse(code = 400, message= "Employee not found", response=EmployeeErrorResponse.class)})
		
		@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
		public Iterable<Employee> getAllEmployee() {
			
			return helper.getEmployee();
			
		}
			
	//Adds Employee
	@ApiOperation(value = "Add an Employee")
	@ApiResponses({@ApiResponse(code = 400, message= "Employee not found", response=EmployeeErrorResponse.class)})
	@PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> addEmployee(@RequestBody Employee emp){
		
		if (helper.createEmployee(emp)) {
			return ResponseEntity.status(HttpStatus.CREATED).build();
		
		} else {
			
			return ResponseEntity.noContent().build();
		}
		
	}
			
	
	//Update Employee
	@ApiOperation(value = "Update an Employee")
	@ApiResponses({@ApiResponse(code = 400, message= "Employee not found", response=EmployeeErrorResponse.class)})
	@PutMapping(path="/{emp_id}", consumes = { MediaType.APPLICATION_JSON_VALUE })
	public boolean updateEmployee(@PathVariable(name = "emp_id") int id, @RequestBody Employee emp) {
		
		return helper.updateEmployee(id, emp);
	}
		
	//Delete Employee
	@ApiOperation(value = "Delete an Employee")
	@ApiResponses({@ApiResponse(code = 400, message= "Employee not found", response=EmployeeErrorResponse.class)})
	@DeleteMapping("/{emp_id}")
	public boolean deleteEmployee( @PathVariable(name = "emp_id") int id) {
		
		return helper.deleteEmployee(id);
	}
		
}



