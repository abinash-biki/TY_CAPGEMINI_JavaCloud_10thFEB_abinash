package com.capegimini.bankingproject.bankingproject.beans;

import lombok.Data;

@Data
public class CustomerDetails {

	private String Gender;
	private String Dob;
	private double AddharNo;
	private String EmailId;
	private long PhnNo;
	private String Address;
	private String BankBranch;
	private double AccountNo;
	private int OpeningBalance;
	private int Pin;
	private String UserName;
	private String Password;
	
	@Override
	public String toString() {
		return "Gender=" + Gender + ""
				+ ", Dob=" + Dob + ", "
				+ "AddharNo=" + AddharNo + ", "
				+ "EmailId=" + EmailId
				+ ", PhnNo=" + PhnNo + ", "
				+ "Address=" + Address + ", "
				+ "BankBranch=" + BankBranch + ","
				+ " AccountNo="+ AccountNo + ","
				+ " OpeningBalance=" + OpeningBalance + ","
				+ " Pin=" + Pin + ","
				+ " UserName=" + UserName
				+ ", Password=" + Password + "";
	}

}
