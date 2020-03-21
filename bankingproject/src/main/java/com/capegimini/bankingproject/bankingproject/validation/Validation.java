package com.capegimini.bankingproject.bankingproject.validation;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

import com.capegimini.bankingproject.bankingproject.beans.BeneficiaryDetails;
import com.capegimini.bankingproject.bankingproject.beans.CustomerDetails;
import com.capegimini.bankingproject.bankingproject.exception.EmailAlreadyExistException;
import com.capegimini.bankingproject.bankingproject.repository.Repository;
public class Validation {


		static LinkedList<String> cusEmailList = new LinkedList<String>();
		static LinkedList<String> benEmailList = new LinkedList<String>();

		public static boolean isStringAlphabet(String str) {
			return ((str != null) && (!str.equals("")) && (str.matches("^[a-zA-Z0-9]*$")));
		}

		public static boolean isEmail(String email) {
			String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";

			Pattern pat = Pattern.compile(emailRegex);
			if (email == null) {
				return false;
			} else {
				return pat.matcher(email).matches();
			}
		}

		public static boolean isNumber(String num) {
			if (num.matches("[0-9]+")) {
				return true;
			}
			return false;
		}

		public static boolean phoneValidation(String num) {

			String phoneRegex = "^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$";

			Pattern pattern = Pattern.compile(phoneRegex);
			if (num == null) {
				return false;
			}
			return pattern.matcher(num).matches();
		}

		public static boolean customervalidateExistingEmail(String email) throws EmailAlreadyExistException {
			for (CustomerDetails customerDetails : Repository.CUSTOMER_DETAILS) {
				cusEmailList.add(customerDetails.getEmailId());
			}
			for (String eml : cusEmailList) {
				if (eml.equals(email)) {
					throw new EmailAlreadyExistException();
				}
			}
			cusEmailList.add(email);
			return true;
		}

		public static boolean beneficiryValidateExistingEmail(String email) {
			for (BeneficiaryDetails beneficiaryDetails : Repository.BENEFICIARY_DETAILS) {
				benEmailList.add(beneficiaryDetails.getEmailId());
			}
			for (String eml : cusEmailList) {
				if (eml.equals(email)) {
					return false;
				}
			}
			cusEmailList.add(email);
			return true;
		}

		public static boolean validateDate(String date) {
			DateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			sdf.setLenient(false);
			try {
				sdf.parse(date);
			} catch (ParseException e) {
				return false;
			}
			return true;
		}

		public static boolean validCustmerAccountNumber(double accountNo) {
			List<CustomerDetails> customerDetails = Repository.CUSTOMER_DETAILS;
			for (CustomerDetails cusInfo :customerDetails ) {
				if (cusInfo.getAccountNo() == accountNo) {
					return true;
				}
			}
			return false;
		}
		public static boolean validBeneficiryAccountNumber(double accountNo) {
			List<BeneficiaryDetails> beneficiaryDetails = Repository.BENEFICIARY_DETAILS;
			for (BeneficiaryDetails ben :beneficiaryDetails ) {
				if (ben.getAccountNo() == accountNo) {
					return true;
				}
			}
			return false;
		}
		
		public static boolean validTime(String time) {
			TimeValidation td = new TimeValidation();
			return td.validateTime(time);
		}
		
		

	}



