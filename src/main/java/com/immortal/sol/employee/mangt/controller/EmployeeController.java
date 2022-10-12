package com.immortal.sol.employee.mangt.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.immortal.sol.employee.mangt.entity.Employee;
import com.immortal.sol.employee.mangt.exception.NoRecordFoundException;
import com.immortal.sol.employee.mangt.service.EmployeeServiceInt;

@CrossOrigin
@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceInt employeeService;
	
	@PostMapping("/add")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		final Employee emp = employeeService.saveEmployee(employee);
		return ResponseEntity.ok(emp);
	}
	
	@SuppressWarnings("rawtypes")
	@PutMapping("/update")
	public ResponseEntity updateEmployee(@RequestBody Employee employee) throws NoRecordFoundException{
		Optional<Employee> emp = employeeService.fetchEmployee(employee.getSeqId());
		if(emp.isEmpty()) {
			throw new NoRecordFoundException("Employee Not Found");
		}
		
		final Employee updateemp = employeeService.updateEmployee(employee);
		return ResponseEntity.ok(updateemp);
	}
	
	@GetMapping("/fetch/{empId}")
	public ResponseEntity<Employee> getEmployee(@PathVariable(value = "empId") String empId) throws NoRecordFoundException{
		Employee emp = employeeService.fetchEMployee(empId);
		if(null == emp) {
			throw new NoRecordFoundException("No Employee Not Found For EMPID:"+empId);
		}
		return ResponseEntity.ok(emp);
	}
	
	@GetMapping("/fetch/all")
	public ResponseEntity<List<Employee>> getAllEmployees(){
		List<Employee> allemps = employeeService.fetchEmployees();
		return ResponseEntity.ok(allemps);
	}

}
