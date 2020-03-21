package com.capegimini.bankingproject.bankingproject.services;

import com.capegimini.bankingproject.bankingproject.beans.BeneficiaryDetails;
import com.capegimini.bankingproject.bankingproject.beans.CustomerDetails;

public interface CustomerServices {
	CustomerDetails viewAccount(double AccountNo);
	public boolean requestToChangeMobileNo(double AccountNo,long mobileNo);
	public boolean changePassword(double AccountNo,String password);
	public boolean requestForCheackBook(double AccountNo);
	public boolean addBeneficiary(BeneficiaryDetails beneficiaryDetails);
	public boolean deleteBeneficiary(double AccountNo);
}
