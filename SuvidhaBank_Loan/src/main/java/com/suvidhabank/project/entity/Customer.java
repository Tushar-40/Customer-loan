package com.suvidhabank.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
public class Customer {

	@Id
	private String customerIdentity;
	private String customerName;
	private String customerAddress;
	private String emailId;
	private double annualIncome;
	private boolean incomeTaxReturnAttached;
	@JsonIgnore
	@OneToOne(mappedBy = "customer")
	private Loan loan;

	public String getCustomerIdentity() {
		return customerIdentity;
	}

	public void setCustomerIdentity(String customerIdentity) {
		this.customerIdentity = customerIdentity;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public boolean isIncomeTaxReturnAttached() {
		return incomeTaxReturnAttached;
	}

	public void setIncomeTaxReturnAttached(boolean incomeTaxReturnAttached) {
		this.incomeTaxReturnAttached = incomeTaxReturnAttached;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public Customer(String customerIdentity, String customerName, String customerAddress, String emailId,
			double annualIncome, boolean incomeTaxReturnAttached, Loan loan) {
		super();
		this.customerIdentity = customerIdentity;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.emailId = emailId;
		this.annualIncome = annualIncome;
		this.incomeTaxReturnAttached = incomeTaxReturnAttached;
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "Customer [customerIdentity=" + customerIdentity + ", customerName=" + customerName
				+ ", customerAddress=" + customerAddress + ", emailId=" + emailId + ", annualIncome=" + annualIncome
				+ ", incomeTaxReturnAttached=" + incomeTaxReturnAttached + ", loan=" + loan + "]";
	}

	public Customer() {
		super();
		
	}

}
