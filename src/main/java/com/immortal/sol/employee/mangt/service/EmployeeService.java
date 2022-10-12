package com.immortal.sol.employee.mangt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immortal.sol.employee.mangt.entity.Employee;
import com.immortal.sol.employee.mangt.repository.EmployeeRepository;

@Service(value = "employeeService")
public class EmployeeService implements EmployeeServiceInt{
	
	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return repository.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return repository.save(employee);
	}

	@Override
	public Optional<Employee> fetchEmployee(Long seqId) {
		// TODO Auto-generated method stub
		return repository.findById(seqId);
	}

	@Override
	public Employee fetchEMployee(String empId) {
		// TODO Auto-generated method stub
		return repository.findByEmpId(empId);
	}

	@Override
	public List<Employee> fetchEmployees() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<Employee> fetchEmpByReportTo(String empId) {
		// TODO Auto-generated method stub
		return repository.findByReportTo(empId);
	}

	@Override
	public void deleteEmployee(String empId){
		Employee emp = repository.findByEmpId(empId);
		repository.delete(emp);
	}

	@Override
	public void deleteEmployee(Long empId) {
		// TODO Auto-generated method stub
		repository.deleteById(empId);
	}

}
