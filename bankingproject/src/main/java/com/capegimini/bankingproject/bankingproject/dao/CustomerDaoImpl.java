package com.capegimini.bankingproject.bankingproject.dao;

import com.capegimini.bankingproject.bankingproject.beans.BeneficiaryDetails;
import com.capegimini.bankingproject.bankingproject.beans.CustomerDetails;
import com.capegimini.bankingproject.bankingproject.repository.Repository;

public class CustomerDaoImpl implements CustomerDao{

	private static final CustomerDetails cu = null;
	@Override
	public CustomerDetails viewAccount(double AccountNo) {
		CustomerDetails bean=null;
		for (CustomerDetails customerDetails : Repository.CUSTOMER_DETAILS) {
			if (customerDetails.getAccountNo()==AccountNo) {
				bean=customerDetails;
				return bean;
			}
			
		}
		return null;
	}

	@Override
	public boolean requestToChangeMobileNo(double AccountNo,long mobileNo) {
		for (CustomerDetails  customerDetails : Repository.CUSTOMER_DETAILS) {
			if (customerDetails.getAccountNo()==AccountNo) {
				return true;
			}
		}
		return false;
	}

	
	@Override
	public boolean requestForCheackBook(double AccountNo) {
		for (CustomerDetails  customerDetails : Repository.CUSTOMER_DETAILS) {
			if (customerDetails.getAccountNo()==AccountNo) {
				
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addBeneficiary(BeneficiaryDetails beneficiaryDetails) {
		for (BeneficiaryDetails ben : Repository.BENEFICIARY_DETAILS) {
			if (ben.getAccountNo()==beneficiaryDetails.getAccountNo()) {
				return false;
			}
		}
		Repository.BENEFICIARY_DETAILS.add(beneficiaryDetails);
		return true;
	}

	@Override
	public boolean deleteBeneficiary(double AccountNo) {
		BeneficiaryDetails beneficiaryDetails=null;
		for (BeneficiaryDetails ben : Repository.BENEFICIARY_DETAILS) {
			if (ben.getAccountNo()==AccountNo) {
				beneficiaryDetails=ben;
				Repository.BENEFICIARY_DETAILS.remove(beneficiaryDetails);
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean changePassword(double AccountNo,String password) {
		for (CustomerDetails bean : Repository.CUSTOMER_DETAILS) {
			if (bean.getAccountNo()== AccountNo) {
				bean.setPassword(password);
				return true;
			}
		
	}
		return false;
	}
	
}
