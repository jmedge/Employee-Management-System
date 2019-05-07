//package com.collabera.jump.exceptions;
//
//import java.io.StringWriter;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//public class EmployeeGlobalExceptionHandler {
//	
//	@ExceptionHandler(EmployeeNotFoundException.class)
//	public ResponseEntity<EmployeeErrorResponse> handleEmployeeNotFound(EmployeeNotFoundException.class){
//	   StringWriter errors = new StringWriter();
//	   
//	   ExceptionResponse er = new ExceptionResponse(e.getMessage(),errors.toString());
//
//}
