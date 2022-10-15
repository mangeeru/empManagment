package com.immortal.sol.employee.mangt.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "employee")
public class Employee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "seq_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seqId;
	@Column(name = "emp_id")
	private String empId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "middle_name")
	private String middleName;
	@Column(name = "report_to")
	private String reportTo;//manager id
	@Column(name = "join_date")
	@Temporal(TemporalType.DATE)
	private Date joinDate;
	@Column(name = "gender")
	private String gender;
	@Column(name = "status")
	private int status;
	@Column(name = "designation")
	private String designation;
	@Column(name = "experience_level")
	private String experiencedLevel;
	
	@Column(name = "dept_no")
	private Long deptNo;
	@Column(name = "project_id")
	private String projectId;
	
	@Column(name = "create_by")
	private String createdBy;
	@Column(name = "modify_by")
	private String modifyBy;
	@Column(name = "create_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modify_date")
	private Date modifyDate;
	@Column(name = "entity_id")
	private String entityId;//client id or entity id to belongs
	
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getReportTo() {
		return reportTo;
	}
	public void setReportTo(String reportTo) {
		this.reportTo = reportTo;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Long getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Long deptNo) {
		this.deptNo = deptNo;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getExperiencedLevel() {
		return experiencedLevel;
	}
	public void setExperiencedLevel(String experiencedLevel) {
		this.experiencedLevel = experiencedLevel;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [seqId=");
		builder.append(seqId);
		builder.append(", empId=");
		builder.append(empId);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", reportTo=");
		builder.append(reportTo);
		builder.append(", joinDate=");
		builder.append(joinDate);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", status=");
		builder.append(status);
		builder.append(", deptNo=");
		builder.append(deptNo);
		builder.append(", projectId=");
		builder.append(projectId);
		builder.append(", createdBy=");
		builder.append(createdBy);
		builder.append(", modifyBy=");
		builder.append(modifyBy);
		builder.append(", createDate=");
		builder.append(createDate);
		builder.append(", modifyDate=");
		builder.append(modifyDate);
		builder.append(", entityId=");
		builder.append(entityId);
		builder.append("]");
		return builder.toString();
	}

}
