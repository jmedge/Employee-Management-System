package com.collabera.jump.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "Address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ApiModelProperty(notes = "The database created Employee's Street Number")
	@Digits(integer = 6, fraction = 0, message = "Street Number can only be 5 digits")
	private int street_number;
	
	@ApiModelProperty(notes = "The database created Employee's Street Name")
	@Size(min = 2, max = 100, message = "This Street can only be 2-100 characters long!")
	private String street_name;
	
	@ApiModelProperty(notes = "The database created Employee's City")
	@Size(min = 2, max = 100, message = "This City can only be 2-100 characters long!")
	private String city;
	
	@ApiModelProperty(notes = "The database created Employee's State")
	@Size(min = 2, max = 2, message = "This State can only be 2 characters long! Ex: NY")
	private String state;
	
	@ApiModelProperty(notes = "The database created Employee's Zipcode ")
	@Digits(integer = 5, fraction = 0, message = "Zipcode can only be 5 digits")
	private int zip_code;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStreet_number() {
		return street_number;
	}

	public void setStreet_number(int street_number) {
		this.street_number = street_number;
	}

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip_code() {
		return zip_code;
	}

	public void setZip_code(int zip_code) {
		this.zip_code = zip_code;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", street_number=" + street_number + ", street_name=" + street_name + ", city="
				+ city + ", state=" + state + ", zip_code=" + zip_code + "]";
	}

	
	
	
	
	
	
	

}
