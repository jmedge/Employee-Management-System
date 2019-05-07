package com.collabera.jump.controller;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.jump.enums.DEPARTMENT;
import com.collabera.jump.enums.GENDER;
import com.collabera.jump.enums.JOBTITLE;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("master")
@Api(description ="Operations pertaining to emuns in Employee Management System")
public class MasterController {
	
	@GetMapping("departments")
	public ResponseEntity<DEPARTMENT[]>getDepartments(){
		return ResponseEntity.ok(DEPARTMENT.values());
	}
	
	@GetMapping("jobtitles")
	public ResponseEntity<JOBTITLE[]>getJobTitle(){
		return ResponseEntity.ok(JOBTITLE.values());
	}
	
	@GetMapping("gender")
	public ResponseEntity<GENDER[]>getGender(){
		return ResponseEntity.ok(GENDER.values());
	}
	
	@GetMapping("all")
	public ResponseEntity<?> getAll(){
		HashMap<String, Object> allMaster = new HashMap<String, Object>();
		allMaster.put("department", DEPARTMENT.values());
		allMaster.put("gender", GENDER.values());
		allMaster.put("jobtitles", JOBTITLE.values());
		return ResponseEntity.ok(allMaster);
		
	}
	
	
	

}
