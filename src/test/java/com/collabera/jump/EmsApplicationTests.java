package com.collabera.jump;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.collabera.jump.enums.DEPARTMENT;
import com.collabera.jump.enums.GENDER;
import com.collabera.jump.enums.JOBTITLE;
import com.collabera.jump.model.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmsApplicationTests {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void addTodo() throws JsonProcessingException, Exception
	{
		Employee emp = new Employee();
		
		emp.setEmp_id(1);
		emp.setFirst_name("John");
		emp.setLast_name("Doe");
		emp.setSsn("123-55-6789");
		emp.setDob("02181994");
		emp.setGender(GENDER.MALE);
		emp.setEmp_department(DEPARTMENT.SALES);
		emp.setEmp_jobtitle(JOBTITLE.ACCOUNTANT);
		
		ObjectMapper objMapper = new ObjectMapper();
		
		mockMvc.perform(post("/employees/John")
				.contentType(MediaType.APPLICATION_JSON_UTF8)
				.content(objMapper.writeValueAsString(emp))).andExpect(status().isCreated());
		
		mockMvc.perform(get("/employees")).andExpect(status().is5xxServerError());

	}

}
