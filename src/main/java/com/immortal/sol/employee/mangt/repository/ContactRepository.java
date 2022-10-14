package com.immortal.sol.employee.mangt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.immortal.sol.employee.mangt.entity.ContactDetails;

@Repository
public interface ContactRepository extends JpaRepository<ContactDetails, Long>{
	
	public List<ContactDetails> findByEmpId(String empId);

}
