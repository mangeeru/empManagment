package com.immortal.sol.employee.mangt.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "APP_CONSTANTS")
public class AppConstants {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long seqId;
	@Column(name = "app_key")
	private String appKey;
	@Column(name = "app_value")
	private String appValue;
	@Column(name = "description")
	private String description;
	
	public Long getSeqId() {
		return seqId;
	}
	public void setSeqId(Long seqId) {
		this.seqId = seqId;
	}
	public String getAppKey() {
		return appKey;
	}
	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}
	public String getAppValue() {
		return appValue;
	}
	public void setAppValue(String appValue) {
		this.appValue = appValue;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
