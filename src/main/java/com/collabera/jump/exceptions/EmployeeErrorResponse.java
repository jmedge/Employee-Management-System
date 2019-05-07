package com.collabera.jump.exceptions;

import java.util.Date;

public class EmployeeErrorResponse {
	
	private String errorStatus;
	
	private String message;
	
	private Date timeStamp;

	
	public EmployeeErrorResponse() {
		
		
	}


	public EmployeeErrorResponse(String errorStatus, String message, Date timeStamp) {
		super();
		this.errorStatus = errorStatus;
		this.message = message;
		this.timeStamp = timeStamp;
	}


	public String geterrorStatus() {
		return errorStatus;
	}


	public void seterrorStatus(String errorStatus) {
		this.errorStatus = errorStatus;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Date getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	
	
	
	
	
	
}
