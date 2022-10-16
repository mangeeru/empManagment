package com.immortal.sol.employee.mangt.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpIdGenRepository extends JpaRepository<EmpIdGenerator, Long>{

}
