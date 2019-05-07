package com.collabera.jump.controller;

import java.net.URI;
import java.net.URISyntaxException;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.jump.model.Address;

//@RestController
//@RequestMapping("/addresss")
//public class AddressController {
//	
//	@GetMapping(path="/address",produces = {MediaType.APPLICATION_JSON_VALUE})
//	public ResponseEntity<Address> getAddress(Address address) {
//		
//		return ResponseEntity.ok(address);
//		
//	}
//		
//	@PostMapping(path="/address", 
//			produces = {MediaType.APPLICATION_JSON_VALUE},
//			consumes = {MediaType.APPLICATION_JSON_VALUE})
//	public ResponseEntity<?> addAddress(@RequestBody @Valid Address address){
//		
//		try {
//			return ResponseEntity.created(new URI("/address")).body(address);
//		} catch (URISyntaxException a) {
//			// TUDO Auto-generated catch block
//		
//			a.printStackTrace();
//		}
//		
//		return ResponseEntity.badRequest().build();
//	}
//			
//	
//	@PutMapping(path="/address", 
//			produces = {MediaType.APPLICATION_JSON_VALUE},
//			consumes = {MediaType.APPLICATION_JSON_VALUE})
//	public ResponseEntity<?> updateAddress(@RequestBody @Valid Address address){
//		
//		try {
//			return ResponseEntity.created(new URI("/address")).body(address);
//		} catch (URISyntaxException a) {
//			// TUDO Auto-generated catch block
//		
//			a.printStackTrace();
//		}
//		
//		return ResponseEntity.badRequest().build();
//	}
//		
//	
//	@DeleteMapping
//	public ResponseEntity<?> deleteAddress(Address address){
//		
//		return null;
//		
//
//	}
//	
//	
//	
//}


