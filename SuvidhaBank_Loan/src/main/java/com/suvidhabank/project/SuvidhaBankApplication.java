package com.suvidhabank.project;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.suvidhabank.project.entity.Collateral;
import com.suvidhabank.project.entity.Customer;
import com.suvidhabank.project.entity.Employee;
import com.suvidhabank.project.entity.Loan;
import com.suvidhabank.project.repository.LoanRepository;
import com.suvidhabank.project.service.EmployeeService;

@SpringBootApplication
public class SuvidhaBankApplication {
	@Autowired
	LoanRepository loanRepository;

	@Autowired
	EmployeeService employeeService;

	public static void main(String[] args)
	{
		SpringApplication.run(SuvidhaBankApplication.class, args);
	}

//	@Bean
	public void initialize() {
		Customer c1 = new Customer();
		c1.setCustomerIdentity("512");
		c1.setCustomerName("Tushar");
		c1.setCustomerAddress("Mumbai");
		c1.setEmailId("tushar@123");
		c1.setAnnualIncome(100000.0);
		c1.setIncomeTaxReturnAttached(true);

		Loan l1 = new Loan();
		System.out.println("tushar");
		l1.setLoanId("1001");
		l1.setLoanType("Buying House");
		l1.setLoanAmount(200000.0);
		l1.setInterestRate(4000.0);
		l1.setPeriod(3.0);
		l1.setRemarks("Well Cooperated");
		l1.setCustomer(c1);

		for (int p= 110; p<120; p++) {
			Employee e=new Employee();
			e.setEmployeeId("" + p);
			e.setEmployeeName("Employee" + (p-100));
			this.employeeService.addEmployee(e);
		}

		Collateral co=new Collateral();
		co.setCollateralId("2001");
		co.setCollateralType("Vehicle");
//		co.setLoan(l1);

		Collateral co1=new Collateral();
		co1.setCollateralId("2002");
		co1.setCollateralType("Fixed Deposit");
//		co1.setLoan(l1;

		List<Collateral> list = Arrays.asList(co,co1);

		this.loanRepository.save(l1);
	}

}
