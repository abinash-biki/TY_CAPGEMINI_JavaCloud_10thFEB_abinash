package com.capegimini.bankingproject.bankingproject.repository;

import java.util.LinkedList;

import com.capegimini.bankingproject.bankingproject.beans.AtmSimulator;
import com.capegimini.bankingproject.bankingproject.beans.BeneficiaryDetails;
import com.capegimini.bankingproject.bankingproject.beans.CustomerDetails;

public class Repository {
	public static final LinkedList<CustomerDetails> CUSTOMER_DETAILS = new LinkedList<CustomerDetails>();
	public static final LinkedList<BeneficiaryDetails> BENEFICIARY_DETAILS = new LinkedList<BeneficiaryDetails>();
	public static final LinkedList<AtmSimulator> ATM_SIMULATORS = new LinkedList<AtmSimulator>();
	static {
		
		  CustomerDetails customerDetails=new CustomerDetails();
		  customerDetails.setAccountNo(123456); customerDetails.setBankBranch("bbsr");
		  customerDetails.setDob("17/06/1997");
		  customerDetails.setEmailId("swainabinash97@gmail.com");
		  customerDetails.setGender("male"); customerDetails.setOpeningBalance(3000);
		  customerDetails.setPassword("abinash@2");
		  customerDetails.setPhnNo(9937872343l); customerDetails.setPin(2217);
		  customerDetails.setUserName("abinash");
		  CUSTOMER_DETAILS.add(customerDetails);
		  
		  
		  BeneficiaryDetails beneficiaryDetails=new BeneficiaryDetails();
		  beneficiaryDetails.setAccountNo(11002);
		  beneficiaryDetails.setEmailId("monaj@gmail.com");
		  beneficiaryDetails.setFirstname("manoj");
		  beneficiaryDetails.setLastname("swain");
		  beneficiaryDetails.setPhnNo(7895354783l);
		  BENEFICIARY_DETAILS.add(beneficiaryDetails);
		 
		 
		 
	}

	public String add(BeneficiaryDetails ben) {
		BeneficiaryDetails beneficiaryDetails = new BeneficiaryDetails();
		beneficiaryDetails.setAccountNo(ben.getAccountNo());
		beneficiaryDetails.setEmailId(ben.getEmailId());
		beneficiaryDetails.setFirstname(ben.getFirstname());
		beneficiaryDetails.setLastname(ben.getLastname());
		beneficiaryDetails.setPhnNo(ben.getPhnNo());
	
		BENEFICIARY_DETAILS.add(beneficiaryDetails);
		return "True";
	}
}
