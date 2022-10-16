package com.immortal.sol.employee.mangt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.immortal.sol.employee.mangt.app.EmpIdGenRepository;
import com.immortal.sol.employee.mangt.app.EmpIdGenerator;
import com.immortal.sol.employee.mangt.entity.Employee;
import com.immortal.sol.employee.mangt.exception.ApplicationServiceException;
import com.immortal.sol.employee.mangt.exception.PropertyNotFoundException;
import com.immortal.sol.employee.mangt.repository.EmployeeRepository;
import com.immortal.sol.employee.mangt.util.AppCache;
import com.immortal.sol.employee.mangt.util.IDGenerator;

@Service(value = "employeeService")
public class EmployeeService implements EmployeeServiceInt{
	
	@Autowired
	private EmployeeRepository repository;
	
	@Autowired
	EmpIdGenRepository idGenRepository;

	@Override
	public Employee saveEmployee(Employee employee) throws ApplicationServiceException {
		EmpIdGenerator idGenerator = idGenRepository.save(new EmpIdGenerator());
		try {
			String empId = IDGenerator.getEmpId(idGenerator.getEmpIDSeq());
			String idprefix = AppCache.getValue("EMP_ID_PREFIX");
			if(null != idprefix && !idprefix.isEmpty()) {
				empId = idprefix+empId;
			}
			employee.setEmpId(empId);
			return repository.save(employee);
		} catch (PropertyNotFoundException e) {
			throw new ApplicationServiceException(e.getMessage());
		}
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
