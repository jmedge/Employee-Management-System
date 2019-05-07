package com.collabera.jump.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.collabera.jump.enums.GENDER;

import io.swagger.annotations.ApiModelProperty;

@MappedSuperclass
public class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull(message="Please enter First Name")
	@Size(min = 2, max = 100, message ="Name should be between 2 - 100 Characters")
	@ApiModelProperty(notes = "The database created Employee's First Name")
	private String first_name;
	
	@NotNull(message="Please enter Last Name")
	@Size(min = 2, max = 100, message ="Name should be between 2 - 100 Characters")
	@ApiModelProperty(notes = "The database created Employee's Last Name")
	private String last_name;
		
	@NotNull(message="Please enter an SSN")
	@Pattern(regexp = "^[0-9][0-9]{2}-[0-9]{2}-[0-9]{4}$", message="SSN must use numbers in this format: XXX-YY-ZZZZ")
    @ApiModelProperty(notes = "The database created Employee's SSN number")
	private String ssn;
	
	@NotNull(message="Please enter an Date of Birth")
	@DateTimeFormat(pattern="MM/dd/yyyy")
    @ApiModelProperty(notes = "The database created Employee's Date of Birth")
    private String dob;
	
	@ApiModelProperty(notes = "The database created Employee's gender")
    private GENDER gender;
	
	@Valid
	@OneToOne(cascade=CascadeType.ALL, orphanRemoval=true)
	private Address address;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public GENDER getGender() {
		return gender;
	}

	public void setGender(GENDER gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Person [first_name=" + first_name + ", last_name=" + last_name + ", ssn=" + ssn + ", dob=" + dob
				+ ", gender=" + gender + ", address=" + address + "]";
	}

	
	

}
