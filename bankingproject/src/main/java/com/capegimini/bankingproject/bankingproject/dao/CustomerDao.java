package com.capegimini.bankingproject.bankingproject.dao;

import com.capegimini.bankingproject.bankingproject.beans.BeneficiaryDetails;
import com.capegimini.bankingproject.bankingproject.beans.CustomerDetails;


public interface CustomerDao {
	CustomerDetails viewAccount(double AccountNo);
	public boolean requestToChangeMobileNo(double AccountNo,long MobileNo);
	public boolean changePassword(double AccountNo,String password);
	public boolean requestForCheackBook(double AccountNo);
	public boolean addBeneficiary(BeneficiaryDetails beneficiaryDetails);
	public boolean deleteBeneficiary(double AccountNo);
}
