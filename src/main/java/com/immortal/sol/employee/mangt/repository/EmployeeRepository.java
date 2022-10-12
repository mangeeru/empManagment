package com.immortal.sol.employee.mangt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.immortal.sol.employee.mangt.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
	public List<Employee> findByReportTo(String reportTo);
	
	public Employee findByEmpId(String empId);

}
