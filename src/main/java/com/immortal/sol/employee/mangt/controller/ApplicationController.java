package com.immortal.sol.employee.mangt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.immortal.sol.employee.mangt.entity.Employee;

@CrossOrigin
@RestController
@RequestMapping("/employee/api")
public class ApplicationController {
	
	private final Logger _logger = LoggerFactory.getLogger(ApplicationController.class);
	
	public ResponseEntity<Employee> saveEmp(@RequestBody Employee employee){
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ResponseEntity.ok(employee);
	}

}
