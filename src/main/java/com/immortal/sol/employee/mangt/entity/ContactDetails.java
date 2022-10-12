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
@Table(name = "contact_details")
public class ContactDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seqId;
	@Column(name = "emp_id")
	private String empId;
	@Column(name = "phone_primary")
	private String phonePrimary;
	@Column(name = "phone_secondary")
	private String phoneSecondary;
	@Column(name = "email_primary")
	private String emailPrimary;
	@Column(name = "email_secondary")
	private String emailSecondary;
	@Column(name = "contact_type")
	private String contactType;
	
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
	public String getPhonePrimary() {
		return phonePrimary;
	}
	public void setPhonePrimary(String phonePrimary) {
		this.phonePrimary = phonePrimary;
	}
	public String getPhoneSecondary() {
		return phoneSecondary;
	}
	public void setPhoneSecondary(String phoneSecondary) {
		this.phoneSecondary = phoneSecondary;
	}
	public String getEmailPrimary() {
		return emailPrimary;
	}
	public void setEmailPrimary(String emailPrimary) {
		this.emailPrimary = emailPrimary;
	}
	public String getEmailSecondary() {
		return emailSecondary;
	}
	public void setEmailSecondary(String emailSecondary) {
		this.emailSecondary = emailSecondary;
	}
	public String getContactType() {
		return contactType;
	}
	public void setContactType(String contactType) {
		this.contactType = contactType;
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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContactDetails [seqId=");
		builder.append(seqId);
		builder.append(", empId=");
		builder.append(empId);
		builder.append(", phonePrimary=");
		builder.append(phonePrimary);
		builder.append(", phoneSecondary=");
		builder.append(phoneSecondary);
		builder.append(", emailPrimary=");
		builder.append(emailPrimary);
		builder.append(", emailSecondary=");
		builder.append(emailSecondary);
		builder.append(", contactType=");
		builder.append(contactType);
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
