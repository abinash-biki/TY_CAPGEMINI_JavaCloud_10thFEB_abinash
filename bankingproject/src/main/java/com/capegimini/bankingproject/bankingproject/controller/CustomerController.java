package com.capegimini.bankingproject.bankingproject.controller;

import java.util.Scanner;

import javax.security.auth.login.LoginException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capegimini.bankingproject.bankingproject.beans.BeneficiaryDetails;
import com.capegimini.bankingproject.bankingproject.beans.CustomerDetails;
import com.capegimini.bankingproject.bankingproject.factory.Factory;
import com.capegimini.bankingproject.bankingproject.repository.Repository;
import com.capegimini.bankingproject.bankingproject.services.CustomerServices;
import com.capegimini.bankingproject.bankingproject.services.CustomerServicesImpl;
import com.capegimini.bankingproject.bankingproject.validation.Validation;

public class CustomerController {
	static Logger log=LogManager.getLogger(CustomerController.class);
	Scanner s = new Scanner(System.in);
	private CustomerServices customerServices=Factory.getCustomerServices();
	static double Acountno=0;
	public  boolean login() {
		int count = 0;
		String UserName;
		String Password;
		while (true) {
			while (true) {
				log.info("Enter UserName");
				UserName= s.nextLine();
				if (Validation.isStringAlphabet(UserName) ){
					break;
				}else {
					log.info("enter valid username");
				}
				
				
			
			}
			while (true) {
				log.info("Enter password");
				Password = s.nextLine();
				if (Validation.isStringAlphabet(Password)) {
					break;
				} else {
					log.info("Enter Valid Password");
				}
					
				
			}
			for (CustomerDetails customerDetails : Repository.CUSTOMER_DETAILS) {
				if (UserName.equals(customerDetails.getUserName()) && (Password.equals(customerDetails.getPassword()))) {
					Acountno = customerDetails.getAccountNo();
					log.info("Login Successful...");
					return true;
				}
			}
			count++;
			log.info("Invalid Credentials!!!");
			if (count == 5) {
				break;
			}
		}
		return false;
	}
	
	public void viewAccount()
	{
		
		Double AccountNo;
		while (true) {
			
			
		
			log.info("Enter account no :-");
			 AccountNo = s.nextDouble();
			if (Validation.validCustmerAccountNumber(AccountNo)) {
				
				break;
			} else {
				log.info("Enter Numbers Only!!!");
			}
		
		
		}
		
		CustomerDetails  detail = customerServices.viewAccount(AccountNo);
		log.info(detail);
	
	}
	public void requestForCheackBook()
	{
		Double AccountNo;
		while (true) {
			
			
		
			log.info("Enter account no :-");
			 AccountNo = s.nextDouble();
			if (Validation.validCustmerAccountNumber(AccountNo)) {
				
				break;
			} else {
				log.info("Enter Numbers Only!!!");
			}
			boolean b=customerServices.requestForCheackBook(AccountNo);
			log.info("request sent to admin");
			if (!b) {
				log.info("invalid credential");
			}
		
		}
		
		
	}
	public void requestToChangeMobileNo()
	{
		Double AccountNo;
		String MobileNo;
		while (true) {
			
			
		
			log.info("Enter account no :-");
			 AccountNo = s.nextDouble();
			if (Validation.validCustmerAccountNumber(Acountno)) {
				
				break;
			} else {
				log.info("Enter Numbers Only!!!");
			}
			while (true) {
				log.info("Enter enter new mobile number");
				MobileNo = s.next();
				if (Validation.phoneValidation(MobileNo)) {
					break;
				} else {
					log.info("Enter Valid Password");
				}
			}
			boolean b=customerServices.requestToChangeMobileNo(AccountNo, Integer.parseInt(MobileNo));
			log.info("request sent to admin");
			if (!b) {
				log.info("invalid credential");
			}
			}
	}
	public void deleteBeneficiary()
	{
		Double AccountNo;
		while (true) {
			
			
		
			log.info("Enter account no :-");
			 AccountNo = s.nextDouble();
			if (Validation.validBeneficiryAccountNumber(AccountNo)) {
				
				break;
			} else {
				log.info("Enter Numbers Only!!!");
			}
		
		
		}
		boolean b=customerServices.deleteBeneficiary(AccountNo);
		log.info("details deleted sucessfully");
		if (!b) {
			log.info("invalid credential");
		}
	}
	public void changePassword()
	{
		Double AccountNo;
		String Password;
		while (true) {
			
			
		
			log.info("Enter account no :-");
			 AccountNo = s.nextDouble();
			if (Validation.validCustmerAccountNumber(Acountno)) {
				
				break;
			} else {
				log.info("Enter Numbers Only!!!");
			}
			while (true) {
				log.info("Enter newpassword");
				Password = s.nextLine();
				if (Validation.isStringAlphabet(Password)) {
					break;
				} else {
					log.info("Enter Valid Password");
				}
			}
		
		boolean b=customerServices.changePassword(AccountNo, Password);
		log.info("password changed");
		if (!b) {
			log.info("invalid credential");
		}
		}
	}
	public void addBeneficiary() {
		
		
		BeneficiaryDetails beneficiary=new BeneficiaryDetails();
		while(true) {
		log.info("enter first name");
		String firstName=s.next();
		if (Validation.isStringAlphabet(firstName)) {
			beneficiary.setFirstname(firstName);
			break;
		}else {
			log.info("enter valid name");
		}
		}
		while(true) {
			log.info("enter last name");
			String lastName=s.next();
			if (Validation.isStringAlphabet(lastName)) {
				beneficiary.setLastname(lastName);
				break;
			}else {
				log.info("enter valid name");
			}
			}
		
		
		while(true)
		{
			log.info("enter account number");
			double accountNo=s.nextDouble();
			if (Validation.validCustmerAccountNumber(accountNo)) {
				beneficiary.setAccountNo(accountNo);
				break;
			}else {
				log.info("enter valid accountnumber");
			}
		}
		while(true)
		{
			log.info("enter email id");
			String email=s.next();
			if (Validation.beneficiryValidateExistingEmail(email)) {
				beneficiary.setEmailId(email);
				break;
			}else {
				log.info("enter valid emilid");
			}
		}
		
		
		while(true)
		{
			log.info("enter mobileno number");
			String mobileNo=s.next();
			if (Validation.phoneValidation(mobileNo)) {
				beneficiary.setPhnNo(Integer.parseInt(mobileNo));
				break;
			}else {
				log.info("enter valid emilid");
			}
		}
	
		
		CustomerServices customerServices =Factory.getCustomerServices();
		boolean success=customerServices.addBeneficiary(beneficiary);
		log.info("details added sucessfully"+success);
		if(!success) {
			
		log.info("invalid credentials");
		}
	}
	
	public void option()
	{
		int option = 0;
		CustomerController customerController= new CustomerController();
		while (true) {
			while (true) {
				log.info("------------------------------------------------");
				log.info("             choose an option:- ");
				log.info("             1- View account");
				log.info("             2- add beneficiry");
				log.info("             3- delete Beneficiary");
				log.info("             4- change password");
				log.info("             5- request for cheackbook");
				log.info("             6- request to change mobileNo");
				log.info("------------------------------------------------");
				String op = s.nextLine();
				if (Validation.isNumber(op)) {
					option = Integer.parseInt(op);
					break;
				} else {
					log.info("Enter Number Only!!!");
				}
			}

			switch (option) {
			case 1:
				customerController.viewAccount();
				break;
			case 2:
			customerController.addBeneficiary();
				break;
			case 3:
				customerController.deleteBeneficiary();
				break;
			case 4:
				customerController.changePassword();
				break;
			case 5:
				customerController.requestForCheackBook();
				break;
			case 6:
				customerController.requestToChangeMobileNo();
				break;
			default:
				log.info("Enter Proper Choice!!!");
			}
	}
	}
}


