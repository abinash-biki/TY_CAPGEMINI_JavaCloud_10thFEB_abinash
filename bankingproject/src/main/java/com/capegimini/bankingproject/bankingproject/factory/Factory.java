package com.capegimini.bankingproject.bankingproject.factory;

import com.capegimini.bankingproject.bankingproject.dao.CustomerDao;
import com.capegimini.bankingproject.bankingproject.dao.CustomerDaoImpl;
import com.capegimini.bankingproject.bankingproject.services.CustomerServices;
import com.capegimini.bankingproject.bankingproject.services.CustomerServicesImpl;

public class Factory {
	public static CustomerDao getCustomerDao() {
		return new CustomerDaoImpl();
	}
	public static CustomerServices getCustomerServices()
	{
		return new CustomerServicesImpl();
	}
}
