package com.immortal.sol.employee.mangt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.immortal.sol.employee.mangt.entity.base.BaseEntity;

@Entity
@Table(name = "personal_details")
public class PersonalDetails extends BaseEntity{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seqId;
	@Column(name = "emp_id")
	private String empId;
	@Column(name = "adheer_no")
	private String adheerNo;
	@Column(name = "pan_no")
	private String panNo;
	@Column(name = "passport_no")
	private String passportNo;
	@Column(name = "date_of_birth")
	@Temporal(TemporalType.DATE)
	private Date dob;
	@Column(name = "blood_group")
	private String bloodGroup;
	@Column(name = "marital_status")
	private String maritalStatus;
	@Column(name = "status")
	private String status;
	@Column(name = "gender")
	private String gender;
	
	
	public Long getSeqId() {
		return seqId;
	}
	public void setSeqId(Long seqId) {
		this.seqId = seqId;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getAdheerNo() {
		return adheerNo;
	}
	public void setAdheerNo(String adheerNo) {
		this.adheerNo = adheerNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
