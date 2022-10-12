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
@Table(name = "address_details")
public class AddressDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seqId;
	
	@Column(name = "address_type")
	private int addrType;//personal/office/current/permanent
	
	@Column(name = "emp_id")
	private String empId;
	@Column(name = "door_no")
	private String doorNo;
	@Column(name = "address_line1")
	private String addrLine1;//street
	@Column(name = "address_line2")
	private String addrLine2;//village
	@Column(name = "address_line3")
	private String addrLine3;//mandal
	@Column(name = "address_line4")
	private String addrLine4;//city
	@Column(name = "address_line5")
	private String addrLine5;//dist
	@Column(name = "address_line6")
	private String addrLine6;//state
	@Column(name = "country")
	private String country;
	@Column(name = "landmark")
	private String landmark;
	@Column(name = "pincode")
	private String pincode;
	
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
	public int getAddrType() {
		return addrType;
	}
	public void setAddrType(int addrType) {
		this.addrType = addrType;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getAddrLine1() {
		return addrLine1;
	}
	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}
	public String getAddrLine2() {
		return addrLine2;
	}
	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}
	public String getAddrLine3() {
		return addrLine3;
	}
	public void setAddrLine3(String addrLine3) {
		this.addrLine3 = addrLine3;
	}
	public String getAddrLine4() {
		return addrLine4;
	}
	public void setAddrLine4(String addrLine4) {
		this.addrLine4 = addrLine4;
	}
	public String getAddrLine5() {
		return addrLine5;
	}
	public void setAddrLine5(String addrLine5) {
		this.addrLine5 = addrLine5;
	}
	public String getAddrLine6() {
		return addrLine6;
	}
	public void setAddrLine6(String addrLine6) {
		this.addrLine6 = addrLine6;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
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
		builder.append("AddressDetails [seqId=");
		builder.append(seqId);
		builder.append(", addrType=");
		builder.append(addrType);
		builder.append(", empId=");
		builder.append(empId);
		builder.append(", doorNo=");
		builder.append(doorNo);
		builder.append(", addrLine1=");
		builder.append(addrLine1);
		builder.append(", addrLine2=");
		builder.append(addrLine2);
		builder.append(", addrLine3=");
		builder.append(addrLine3);
		builder.append(", addrLine4=");
		builder.append(addrLine4);
		builder.append(", addrLine5=");
		builder.append(addrLine5);
		builder.append(", addrLine6=");
		builder.append(addrLine6);
		builder.append(", country=");
		builder.append(country);
		builder.append(", landmark=");
		builder.append(landmark);
		builder.append(", pincode=");
		builder.append(pincode);
		builder.append("]");
		return builder.toString();
	}

}
