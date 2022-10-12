package com.suvidhabank.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
public class Collateral {
	@Id
	private String collateralId;
	private String collateralType;
	private String loanId;

	public String getCollateralId() {
		return collateralId;
	}

	public void setCollateralId(String collateralId) {
		this.collateralId = collateralId;
	}

	public String getCollateralType() {
		return collateralType;
	}

	public void setCollateralType(String collateralType) {
		this.collateralType = collateralType;
	}

	public String getLoanId() {
		return loanId;
	}

	public void setLoanId(String loanId) {
		this.loanId = loanId;
	}

	@Override
	public String toString() {
		return "Collateral [collateralId=" + collateralId + ", collateralType=" + collateralType + ", loanId=" + loanId
				+ "]";
	}

	public Collateral(String collateralId, String collateralType, String loanId) {
		super();
		this.collateralId = collateralId;
		this.collateralType = collateralType;
		this.loanId = loanId;
	}

	public Collateral() {
		super();
		// TODO Auto-generated constructor stub
	}

}
