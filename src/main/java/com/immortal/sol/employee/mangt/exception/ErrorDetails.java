package com.immortal.sol.employee.mangt.exception;

import java.util.Date;

public class ErrorDetails {
	
	private Date timestamp;
	private String message;
	private String details;
	private String error_code;

	public ErrorDetails(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public ErrorDetails(Date timestamp, String message, String details, String error_code) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
		this.error_code = error_code;
	}



	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

	public String getError_code() {
		return error_code;
	}

}
