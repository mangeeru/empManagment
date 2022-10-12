package com.immortal.sol.employee.mangt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.immortal.sol.employee.mangt.entity.AddressDetails;

@Repository
public interface AddressRepository extends JpaRepository<AddressDetails, Long>{

}
