package com.example.jxls.model;

import java.math.BigDecimal;

public class Client {

	private String firstName;

	private String lastName;

	private String documentType;
	
	private String documentNumber;
	
	private BigDecimal total;
	
	private boolean active;

	public Client(String firstName, String lastName, boolean active, String documentType, String documentNumber, BigDecimal total) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.documentType = documentType;
		this.documentNumber = documentNumber;
		this.total = total;
		this.active = active;
	}

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}


}
