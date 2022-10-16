package com.immortal.sol.employee.mangt.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_ID_GENERATOR")
public class EmpIdGenerator {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long empIDSeq;

	public Long getEmpIDSeq() {
		return empIDSeq;
	}

	public void setEmpIDSeq(Long empIDSeq) {
		this.empIDSeq = empIDSeq;
	}

}
