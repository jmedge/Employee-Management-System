package com.collabera.jump.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;




@ControllerAdvice
public class EmployeeExceptionHandler {
	
    @ExceptionHandler(EmployeeNotFoundException.class)	
    public ResponseEntity<EmployeeErrorResponse> employeeNotFoundException(EmployeeNotFoundException e){
    	
    	EmployeeErrorResponse response = new EmployeeErrorResponse("errorStatus","This Employee does not exist in the database", new Date());
    	
    	return ResponseEntity.badRequest().body(response);
    	
    }
	
	
	
	

}
