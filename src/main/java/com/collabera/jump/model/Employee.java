package com.collabera.jump.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import com.collabera.jump.enums.DEPARTMENT;
import com.collabera.jump.enums.GENDER;
import com.collabera.jump.enums.JOBTITLE;

import io.swagger.annotations.ApiModelProperty;

@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@Entity
@Table(name="employees")
public class Employee extends Person {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@ApiModelProperty(notes = "The database generated Employee ID")
	private int emp_id;	
    
	@NotNull
    @Email(message = "This must be a proper email format: efgh@gmail.com")
    @ApiModelProperty(notes = "The database created Employee's Email")
    private String emp_email;
	
	@ApiModelProperty(notes = "The database created Employee's job title")
    private JOBTITLE emp_jobtitle;
	
	@ApiModelProperty(notes = "The database created Employee's department")
    private DEPARTMENT emp_department;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	public JOBTITLE getEmp_jobtitle() {
		return emp_jobtitle;
	}

	public void setEmp_jobtitle(JOBTITLE emp_jobtitle) {
		this.emp_jobtitle = emp_jobtitle;
	}

	public DEPARTMENT getEmp_department() {
		return emp_department;
	}

	public void setEmp_department(DEPARTMENT emp_department) {
		this.emp_department = emp_department;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_email=" + emp_email + ", emp_jobtitle=" + emp_jobtitle
				+ ", emp_department=" + emp_department + "]";
	}

	
	

















}