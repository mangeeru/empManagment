package com.immortal.sol.employee.mangt.service;

import java.util.List;
import java.util.Optional;

import com.immortal.sol.employee.mangt.entity.Employee;
import com.immortal.sol.employee.mangt.exception.ApplicationServiceException;

public interface EmployeeServiceInt {
	
	public Employee saveEmployee(Employee employee) throws ApplicationServiceException;
	
	public Employee updateEmployee(Employee employee);
	
	public Optional<Employee> fetchEmployee(Long seqId);
	
	public Employee fetchEMployee(String empId);
	
	public List<Employee> fetchEmployees();
	
	public List<Employee> fetchEmpByReportTo(String empId);
	
	public void deleteEmployee(String empId);
	
	public void deleteEmployee(Long empId);

}
