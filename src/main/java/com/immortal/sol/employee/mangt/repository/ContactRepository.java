package com.immortal.sol.employee.mangt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.immortal.sol.employee.mangt.entity.ContactDetails;

@Repository
public interface ContactRepository extends JpaRepository<ContactDetails, Long>{

}
