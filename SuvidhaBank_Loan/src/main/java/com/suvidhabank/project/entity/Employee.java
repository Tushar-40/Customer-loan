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
public class Employee {
	@Id
	private String employeeId;
	private String employeeName;
	@JsonIgnore
	@OneToOne(mappedBy = "employee")
	private Loan loan;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Loan getLoan() {
		return loan;
	}

	public void setLoan(Loan loan) {
		this.loan = loan;
	}

	public Employee(String employeeId, String employeeName, Loan loan) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.loan = loan;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}

	public Employee() {
		super();
		
	}

}
