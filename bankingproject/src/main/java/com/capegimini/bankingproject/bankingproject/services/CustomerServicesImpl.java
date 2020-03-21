package com.capegimini.bankingproject.bankingproject.services;

import com.capegimini.bankingproject.bankingproject.beans.BeneficiaryDetails;
import com.capegimini.bankingproject.bankingproject.beans.CustomerDetails;
import com.capegimini.bankingproject.bankingproject.dao.CustomerDao;
import com.capegimini.bankingproject.bankingproject.factory.Factory;

public class CustomerServicesImpl implements CustomerServices {
	private CustomerDao dao = Factory.getCustomerDao();
	@Override
	public CustomerDetails viewAccount(double AccountNo) {
		return dao.viewAccount(AccountNo);
	}

	

	

	@Override
	public boolean requestForCheackBook(double AccountNo) {
		// TODO Auto-generated method stub
		return dao.requestForCheackBook(AccountNo);
	}

	@Override
	public boolean addBeneficiary(BeneficiaryDetails beneficiaryDetails) {
		// TODO Auto-generated method stub
		return dao.addBeneficiary(beneficiaryDetails);
	}

	@Override
	public boolean deleteBeneficiary(double AccountNo) {
		// TODO Auto-generated method stub
		return dao.deleteBeneficiary(AccountNo);
	}



	@Override
	public boolean requestToChangeMobileNo(double AccountNo, long mobileNo) {
		// TODO Auto-generated method stub
		return dao.requestToChangeMobileNo(AccountNo, mobileNo);
	}





	@Override
	public boolean changePassword(double AccountNo,String password) {
		// TODO Auto-generated method stub
		return dao.changePassword(AccountNo,password);
	}

	

}
